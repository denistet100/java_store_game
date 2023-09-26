import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StoreGame {
    private ArrayList<Toy> toys;           //список всех игрушек
    private ArrayList<Toy> prize;          //список призов
    private String prizeFile;              //файл со всеми призами

    public StoreGame(/*String toysFile*/) {
        this.toys = new ArrayList<Toy>();
        this.prize = new ArrayList<Toy>();
        this.prizeFile = "prize.txt";
    }

    public void addToy(Toy toy) {  //записываем в список\массив.
        toys.add(toy);
    }

    public void play() {  //С помощью метода выбора призовой игрушки – мы получаем эту призовую игрушку
        WeightedRandomSelection weightedRandomSelection = new WeightedRandomSelection(toys);
        Toy randomToy = weightedRandomSelection.getRandomToy();
        System.out.println("Выбранный случайный предмет: " + randomToy.getName());
        prize.add(randomToy);
    }

    public void delivery() throws IOException {  //Выдача игрушки
        if (!prize.isEmpty()) {
            Toy giveprize = prize.remove(0);
            giveprize.setQuantity(giveprize.getQuantity() - 1);
            FileWriter writer = new FileWriter(prizeFile, true);
            writer.write(giveprize.getName() + "\n");
            writer.close();
            System.out.println("Выдан предмет: " + giveprize.getName());
        } else{
            System.out.println("Список пуст");
        }
    }


}
