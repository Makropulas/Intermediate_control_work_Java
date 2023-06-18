import java.util.*;

public class RaffleToys {
    ArrayList<Toy> toys;
    Queue<Toy> prizeToys = new LinkedList<>();

    public RaffleToys(ArrayList<Toy> toys) {
        this.toys = toys;
    }

    public static Random random = new Random();

    public Queue<Toy> setQueue() {
        int totalWeight = 0;
        int totalAmount = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
            totalAmount += toy.getAmount();
        }
        while (totalAmount > 0) {
            int randomWeight = random.nextInt(1, totalWeight + 1);
            for (Toy toy : toys) {
                if (toy.getAmount() > 0 && toy.getWeight() > randomWeight) {
                    prizeToys.add(toy);
                    toy.setAmount(toy.getAmount() - 1);
                    totalAmount -= 1;
                }
            }
        }
        return prizeToys;
    }
}
