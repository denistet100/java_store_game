public class Toy {

    private int id = 0;       //id игрушки
    private String name;      //текстовое название
    private int quantity;     //количество
    private double frequency;    //частота выпадения игрушки (вес в % от 100)


    public Toy(String name, int quantity, double frequency) {
        this.id +=1 ;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public int getQuantity() {
        return quantity;
    }


    public double getFrequency() {
        return frequency;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setFrequency(double frequency) {  //возможность изменения веса (частоты выпадения игрушки)
        this.frequency = frequency;
    }
}
