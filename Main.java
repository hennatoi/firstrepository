import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

 //   First, the program asks the user what he wants to do and prints the menu. The user can select either 1, 2, 3 or 0.
 //   1 -> add product name and quantity to list.
 //   2 -> prints the added products on the screen.
 //   3 -> removes the last added product from the list.
 //   0 -> program execution ends.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductList list = new ProductList();

        int choice = 0;

        do {
            printMenu();
            choice = readInt();

            switch (choice) {
                case 1:
                    Product item = readProduct();
                    list.addProduct(item);

                    break;

                case 2:
                    if (list.sizeOfList() != 0) {
                        System.out.println("Added products:");
                        list.printProducts();
                    } else {
                        System.out.println("The list is empty!");
                    }
                    break;

                case 3:
                    if (list.sizeOfList() > 0) {
                        list.removeProduct(list.sizeOfList() - 1);
                        System.out.println("The last item is removed");
                    } else {
                        System.out.println("The list is empty!");
                    }
                    break;

                case 0:
                    System.out.print("Program execution ends!");
                    break;
            }
        } while (choice != 0);
    }

    public static void printMenu() {
        System.out.println("\nWhat do you want to do? > ");
        System.out.println("\n 1) Add product");
        System.out.println(" 2) Print products");
        System.out.println(" 3) Remove the last item");
        System.out.println(" 0) Quit");
        System.out.println("\nYour choice > ");
    }

    public static Product readProduct() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Product name: ");
        String name = sc.nextLine();
        System.out.println("Quantity: ");
        int quantity = sc.nextInt();

        Product item = new Product(name, quantity);

        return item;
    }

    public static int readInt() {
        Scanner sc = new Scanner(System.in);
        boolean ok = false;
        int digit = 0;

        do {
            try {
                digit = sc.nextInt();
                sc.nextLine();
                ok = true;
            } catch (InputMismatchException ime) {
                sc.nextLine();
                System.out.print("Error, please try again!");
            }
        } while (!ok);

        return digit;
    }
}