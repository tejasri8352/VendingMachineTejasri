package ezeu.Seller;

import static java.lang.System.exit;

import java.util.Scanner;

import ezeu.buyer.Customer;

class Main {

    public static void main(String[] args) throws Exception {
        int cc;
        System.out.println("***************welcome to vending machine****************");
        do {
            System.out.println("Owner---1\t\t\t\t\tCustomer------2");
            Scanner sc = new Scanner(System.in);
            cc = sc.nextInt();
            if (cc == 1) {
                Owner owner = Owner.getInstance();
                owner.displayOwnerOptions();
                ownerfeaures(owner);
            }
            else if (cc == 2) {
                Customer customer = new Customer();
                customer.getItemFromVendingMachine();
            }
            else
                break;
        }while (true);
    }

    public static void ownerfeaures(Owner owner) {
        int choice;
        do {
            System.out.println("enter ur choice");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    owner.addItemToVendingMachine();
                    break;
                }
                case 2: {
                    owner.deleteItemFromVendingMachine();
                    break;
                }
                case 3: {
                    owner.displayVendingMachineItems();
                    break;
                }
                case 4: {
                	exit(0);
                	break;
                }
                default:
                    System.out.println("enter proper choice:");
                    break;

            }
        } while (choice<5);
    }
}





