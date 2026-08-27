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
        System.out.println("| 2. View Balance                   |");
        System.out.println("| 3. Exit game                      |");
        System.out.println("|-----------------------------------|");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println();

        while (isRunning) {
            printMainMenu();

            if (sc.hasNextInt()) {
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        Main.clearScreen();
                        System.out.println("Entering game page...");
                        //rest of the code
                        break;
                    case 2:
                        Main.clearScreen();
                        System.out.println("Entering balance page...");
                        //rest of the code
                        break;
                    case 3:
                        Main.clearScreen();
                        System.out.println("Exiting application...");
                        isRunning = false;
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
