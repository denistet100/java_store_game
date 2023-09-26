import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeightedRandomSelection {
    private ArrayList<Toy> toys;           //список всех игрушек
    private List<String> items;  // Список предметов
    private List<Double> weights;  // Соответствующие веса предметов
    private Random random;

    public WeightedRandomSelection(ArrayList<Toy> toys) {
        this.toys = new ArrayList<Toy>();
        this.toys.addAll(toys);
        items = new ArrayList<>();
        weights = new ArrayList<>();
        random = new Random();
        for (Toy toy : toys) {
            addItem(toy.getName(), toy.getFrequency());
        }
    }

    public void addItem(String item, double weight) {
        items.add(item);
        weights.add(weight);
    }

    public Toy getRandomToy() {
        if (items.isEmpty() || weights.isEmpty() || items.size() != weights.size()) {
            throw new IllegalArgumentException("Items and weights lists must be non-empty and of equal size.");
        }

        double totalWeight = 0;
        for (Double weight : weights) {
            totalWeight += weight;
        }

        double randomValue = random.nextDouble() * totalWeight;
        double cumulativeWeight = 0;

        for (int i = 0; i < items.size(); i++) {
            cumulativeWeight += weights.get(i);
            if (randomValue < cumulativeWeight) {
                return toys.get(i);
            }
        }

        // Этого никогда не должно произойти, если веса правильно нормализованы
        throw new IllegalStateException("Failed to select a random item.");
    }
}