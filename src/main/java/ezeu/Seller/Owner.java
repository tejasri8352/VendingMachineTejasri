package ezeu.Seller;

import static ezeu.Seller.VendingMachine.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Owner {
    private VendingMachine vendingMachine;

    private Owner() {
        this.vendingMachine = VendingMachine.getInstance();
    }

    private static Owner instance = new Owner();

    public static Owner getInstance()
    {
        return instance;
    }

    public void displayOwnerOptions() {
        System.out.println("1.add item \t 2.remove item \t 3 display item \t 4 exit \t 5 goto home:");
    }

    public void displayVendingMachineItems() {
        System.out.println(vendingMachine);
    }

    public void addItemToVendingMachine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the item u have to add:");
        String itemname = sc.nextLine();
        System.out.println("enter price for that:");
        int price = sc.nextInt();
        System.out.println("quantity to that:");
        int quantity = sc.nextInt();
        this.vendingMachine.addItem(new VendingItem(itemname, price, quantity));
        //System.out.println("item added to the machine");
    }

    public void deleteItemFromVendingMachine() {
        System.out.println("enter the index  u have to delete");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        this.vendingMachine.deleteItem(num);
        System.out.println("u deleted the item");
    }

}







