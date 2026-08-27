import java.awt.*;
import java.util.Scanner;

public class Main {


    public static void clearScreen(){
        for (int i = 1; i <= 50; i++){
            System.out.println();
        }
    }

    private static void printMainMenu() {
        System.out.println("|-----------------------------------|");
        System.out.println("|       Welcome to OneMoreBet!      |");
        System.out.println("|-----------------------------------|");
        System.out.println("|         Choose an option:         |");
        System.out.println("|-----------------------------------|");
        System.out.println("| 1. Start playing                  |");
        System.out.println("| 2. View balance                   |");
        System.out.println("| 3. Open chip store                |");
        System.out.println("| 4. Exit game                      |");
        System.out.println("|-----------------------------------|");
    }

    private static void printBalancePage(Player player){
        System.out.println("|-----------------------------------|");
        System.out.println("|        Welcome, " + player.getName() + "!");
        System.out.println("|-----------------------------------|");
        System.out.println("|           Your balance:           |");
        System.out.println("|                                   |");
        System.out.println("| Cash balance: " + player.getBalance());
        System.out.println("| Chip balance: " + player.calculateChipValue());
        System.out.println("|---------------------------------- |");
    }
    private static void printStoreChipPage(Player player){
        System.out.println("|-----------------------------------|");
        System.out.println("|        Welcome, " + player.getName() + "!");
        System.out.println("|-----------------------------------|");
        System.out.println("|               Store               |");
        System.out.println("|-----------------------------------|");
        System.out.println("| 1. Buy chips                      |");
        System.out.println("| 2. Sell chips                     |");
        System.out.println("|-----------------------------------|");




    }
    public static void main(String[] args) {

        Player player = new Player("Bence", 5000);

        SlotMachine sm = new SlotMachine();

        Scanner sc = new Scanner(System.in);
        boolean mainMenuIsRunning = true;
        boolean balanceMenuIsRunning = true;
        boolean chipMenuIsRunning = true;

        System.out.println();

        while (mainMenuIsRunning) {
            printMainMenu();

            if (sc.hasNextInt()) {
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        Main.clearScreen();
                        System.out.println("Entering game...");
                        //rest of the code
                        break;
                    case 2:
                        Main.clearScreen();
                        System.out.println("Entering balance page...");
                        Main.printBalancePage(player);
                        break;
                    case 3:
                        Main.clearScreen();
                        System.out.println("Entering chip store...");
                        //rest of the code
                        break;
                    case 4:
                        Main.clearScreen();
                        System.out.println("Exiting application...");
                        mainMenuIsRunning = false;
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            } else {
                System.out.println("Invalid option, please enter a number 1-3");
                sc.nextLine();
            }
        }

        while (chipMenuIsRunning) {
            printStoreChipPage(player);

            if (sc.hasNextInt()) {
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        Main.clearScreen();
                        System.out.println("How many chips would you like to buy?");
                        //needs to be finished
                }
            }
        }
        sc.close();
    }

}
