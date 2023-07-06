package myPackage;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Show.DisplayMenu();
        Show.Switch();
    }
}
class Ticket{
    static int age;
    static String name;
    static int numberOfSeats;
    static int totalPrice = 0;

}
class Show extends Ticket{
    Scanner input = new Scanner(System.in);
    public static void DisplayMenu(){
        System.out.println("Ticket Purchasing");
        System.out.println();
        System.out.println("Category\n\n");
        System.out.println("1. Diamond");
        System.out.println("2. Gold");
        System.out.println("3. Silver");
    }
    public static void Switch() {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose one option = ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Diamond");
                System.out.println("=============================================");
                System.out.println("Price = 5000");
                System.out.println("Other Professional services are : ");
                System.out.println("Room with Air condition\nMeal\nSnacks\nCold Drink");
                System.out.println();
                System.out.println("For purchasing please press y or n to cancel");
                char chr = input.next().charAt(0);
                if (chr == 'y') {
                    System.out.println("You have purchased Diamond Ticket");
                    System.out.println("Please enter some valid information");
                    System.out.print("Name = ");
                    name = input.next();
                    System.out.print("Age = ");
                    age = input.nextInt();
                    System.out.print("Number of seats = ");
                    numberOfSeats = input.nextInt();
                    totalPrice = 5000 * numberOfSeats;
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Ticket Information");
                    System.out.println("Diamond Category");
                    TicketDownload();
                    System.out.println("Diamond Category Services are also included");
                    break;
                }
            case 2:

                System.out.println("Gold");
                System.out.println("=============================================");
                System.out.println("Price = 2500");
                System.out.println("Other services are : ");
                System.out.println("Cabinet place\nSnacks\nCoffee");
                System.out.println();
                System.out.println("For purchasing please press y or n to cancel");
                char chra = input.next().charAt(0);
                if (chra == 'y') {
                    System.out.println("You have purchased Gold Ticket");
                    System.out.println("Please enter some valid information");
                    System.out.print("Name = ");
                    name = input.next();
                    System.out.print("Age = ");
                    age = input.nextInt();
                    System.out.print("Number of seats = ");
                    numberOfSeats = input.nextInt();
                    totalPrice = 2500 * numberOfSeats;
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Ticket Information");
                    System.out.println("Gold Category");
                    TicketDownload();
                    System.out.println("Gold Category Services are also included");
                    break;


                }

            case 3:

                System.out.println("Silver");
                System.out.println("=============================================");
                System.out.println("Price = 1000");
                System.out.println("Other services are : ");
                System.out.println("Open area\nChair\nWater");
                System.out.println();
                System.out.println("For purchasing please press y or n to cancel");
                char chrat = input.next().charAt(0);
                if (chrat == 'y') {
                    System.out.println("You have purchased Gold Ticket");
                    System.out.println("Please enter some valid information");
                    System.out.print("Name = ");
                    name = input.next();
                    System.out.print("Age = ");
                    age = input.nextInt();
                    System.out.print("Number of seats = ");
                    numberOfSeats = input.nextInt();
                    totalPrice = 1000 * numberOfSeats;
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Ticket Information");
                    System.out.println("Silver Category");
                    TicketDownload();
                    System.out.println("Silver Category Services are also included");

                    break;

                }
            default:
                System.out.println("Invalid Choice");
        }

    }

    public static void TicketDownload() {

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Number of seats = " + numberOfSeats);
        System.out.println("Total Price = " + totalPrice);


    }

}
