import Model.Inventory;
import Model.Item;

import java.util.List;

public class Main {

    private static Inventory inventory = new Inventory();
    private static List<Item> items = inventory.getItems();

    private static Item coins = new Item("dollár");
    private static Item object = new Item("lakás");

    public static void main(String[] args) {

        //Hozzáadni létező itemeket
        inventory.addItem(coins);
        inventory.addItem(object);


        System.out.println("Inventory kezdés adatai:");
        for (Item item : items) {
            System.out.println(item.getName() + "=" + item.getPrice());
        }
        System.out.println("-----------------------------");


        System.out.println("NÖVELÉS:");

        coins.increase(200);
        object.increase(1);
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getPrice() + ")");
        }
        System.out.println("-----------------------------");


        System.out.println("CSÖKENÉS:");

        object.increase(1);  //Csökkentés item
        coins.decrease(100);   //Csökentés coins

        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getPrice() + ")");
        }

    }


}