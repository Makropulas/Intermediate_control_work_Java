import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        ArrayList<Toy> listToys = new ArrayList<>();
        listToys.add(new Toy(1, "Конструктор", 5, 2));
        listToys.add(new Toy(2, "Робот", 5, 2));
        listToys.add(new Toy(3, "Кукла", 5, 6));
        Queue<Toy> giveawayToys = new RaffleToys(listToys).setQueue();
        System.out.println("Список игрушек на выдачу: " + giveawayToys);

        while (giveawayToys.size() > 0) {
            getToysAndSaveTheFile(giveawayToys);
            System.out.println("Игрушка выдана. Осталось игрушек: " + giveawayToys.size());
        }
    }

    public static void getToysAndSaveTheFile(Queue<Toy> toys) {
        try (FileWriter fw = new FileWriter("Розыгрыш игрушек.txt", true)) {
            fw.write(String.valueOf(toys.poll()));
            fw.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
