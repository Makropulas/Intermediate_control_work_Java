public class Toy{
    private int id;
    private String name;
    private int amount;
    private int weight;

    public Toy(int id, String name, int amount, int weigth) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.weight = weigth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("\nID:%s %s", getId(), getName());
    }
}
