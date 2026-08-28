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

    private static void printBuyChipPage(Player player) {
        System.out.println("|-----------------------------------|");
        System.out.println("|        Welcome, " + player.getName() + "!");
        System.out.println("|-----------------------------------|");
        System.out.println("|         Select chip value         |");
        System.out.println("|-----------------------------------|");
        System.out.println("| 1. 1$                             |");
        System.out.println("| 2. 5$                             |");
        System.out.println("| 3. 10$                            |");
        System.out.println("| 4. 25$                            |");
        System.out.println("| 5. 50$                            |");
        System.out.println("| 6. 100$                           |");
        System.out.println("| 7. 500$                           |");
        System.out.println("| 8. 1000$                          |");
        System.out.println("|-----------------------------------|");
    }

    private static void runStorePage(Player player, Scanner scanner){
        printStoreChipPage(player);
        if (scanner.hasNextInt()){
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    Main.clearScreen();
                    printBuyChipPage(player);
                    int valueOption = scanner.nextInt();
                    switch (valueOption) {
                        case 1:
                            System.out.print("Enter the amount of chips you would like to buy: ");
                            int amountOption = scanner.nextInt();
                            if(player.getBalance() > amountOption*ChipType.ONE.getValue()){
                                player.addChip(ChipType.ONE, amountOption);
                                player.
                            }
                    }

            }
        }
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
                        runStorePage(player, sc);
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
        sc.close();
    }

}
