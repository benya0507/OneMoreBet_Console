import java.awt.*;
import java.util.Scanner;

public class Main {
    private static void PrintMenu() {
        for (int i = 1; i <= 10; i++) {
            if (i == 1 || i == 10){
                System.out.print("|");
                for (int j = 1; j <= 40; j++) {
                    System.out.print("-");
                }
                System.out.println("|");
            }

            else {
                if (i == 3) {
                    System.out.print("|");
                    System.out.print("         Welcome to OneMoreBet!         ");
                }
                if (i != 3) {
                    System.out.print("|");
                }
                for (int j = 1; j <= 40; j++) {
                    if (i != 3) {
                        System.out.print(" ");
                    }
                }
                if (i != 3) {
                System.out.println("|");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main.PrintMenu();
    }

}
