public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lets go!");
        StoreGame store = new StoreGame();

        Toy toy1 = new Toy("Toy_1", 40, 60.0);
        Toy toy2 = new Toy("Toy_2", 20, 20.0);
        Toy toy3 = new Toy("Toy_3", 60, 80.0);
        Toy toy4 = new Toy("Toy_4", 70, 40.0);
        Toy toy5 = new Toy("Toy_5", 5, 15.0);
        Toy toy6 = new Toy("Toy_6", 1, 10.0);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);

        toy3.setQuantity(50);
        System.out.println(toy3.getName() + " " + toy3.getQuantity());

        store.play();
        store.play();
        store.play();
        store.play();
        store.play();

        store.delivery();
        store.delivery();
        store.delivery();
        store.delivery();
        store.delivery();
        store.delivery();
        store.delivery();
    }
}
