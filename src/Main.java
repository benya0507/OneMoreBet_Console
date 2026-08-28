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

        System.out.println("         Welcome, " + player.getName() + "!");
        System.out.println("|-----------------------------------|");
        System.out.println("|           Your balance:           |");
        System.out.println("|                                   |");
        System.out.println("| Cash balance: " + player.getBalance());
        System.out.println("| Chip balance: " + player.calculateChipValue());
        System.out.println("|---------------------------------- |");
    }
    private static void printStoreChipPage(Player player){

        System.out.println("          Welcome, " + player.getName() + "!");
        System.out.println("|-----------------------------------|");
        System.out.println("|               Store               |");
        System.out.println("|-----------------------------------|");
        System.out.println("| 1. Buy chips                      |");
        System.out.println("| 2. Sell chips                     |");
        System.out.println("|-----------------------------------|");




    }

    private static void printBuyChipPage(Player player) {

        System.out.println("           Welcome, " + player.getName() + "!");
        System.out.println("|-----------------------------------|");
        System.out.println("|           Chip buy page           |");
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
        System.out.println("| 9. Exit to main menu              |");
        System.out.println("|-----------------------------------|");
    }

    private static void printSellChipPage(Player player) {
            System.out.println("          Welcome, " + player.getName() + "!");
            System.out.println("|-----------------------------------|");
            System.out.println("|          Chip sell page           |");
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
            System.out.println("| 9. Exit to main menu              |");
            System.out.println("|-----------------------------------|");
    }

    private static void runStorePage(Player player, Scanner scanner) throws InterruptedException {
        boolean storePageIsRunning =  true;
        while (storePageIsRunning) {
            printStoreChipPage(player);
            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        Main.clearScreen();
                        printBuyChipPage(player);
                        int valueOption = scanner.nextInt();
                        System.out.print("Enter the amount of chips you would like to buy: ");
                        int amountOption = scanner.nextInt();
                        switch (valueOption) {
                            case 1:
                                if (player.getBalance() >= amountOption * ChipType.ONE.getValue()) {
                                    player.addChip(ChipType.ONE, amountOption);
                                    player.removeCashFromBalance(amountOption * ChipType.ONE.getValue());
                                } else {
                                    System.out.println("Insufficient balance, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 2:
                                if (player.getBalance() >= amountOption * ChipType.FIVE.getValue()) {
                                    player.addChip(ChipType.FIVE, amountOption);
                                    player.removeCashFromBalance(amountOption * ChipType.FIVE.getValue());
                                } else {
                                    System.out.println("Insufficient balance, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 3:
                                if (player.getBalance() >= amountOption * ChipType.TEN.getValue()) {
                                    player.addChip(ChipType.TEN, amountOption);
                                    player.removeCashFromBalance(amountOption * ChipType.TEN.getValue());
                                } else {
                                    System.out.println("Insufficient balance, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 4:
                                if (player.getBalance() >= amountOption * ChipType.TWENTY_FIVE.getValue()) {
                                    player.addChip(ChipType.TWENTY_FIVE, amountOption);
                                    player.removeCashFromBalance(amountOption * ChipType.TWENTY_FIVE.getValue());
                                } else {
                                    System.out.println("Insufficient balance, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 5:
                                if (player.getBalance() >= amountOption * ChipType.FIFTY.getValue()) {
                                    player.addChip(ChipType.FIFTY, amountOption);
                                    player.removeCashFromBalance(amountOption * ChipType.FIFTY.getValue());
                                } else {
                                    System.out.println("Insufficient balance, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 6:
                                if (player.getBalance() >= amountOption * ChipType.HUNDRED.getValue()) {
                                    player.addChip(ChipType.HUNDRED, amountOption);
                                    player.removeCashFromBalance(amountOption * ChipType.HUNDRED.getValue());
                                } else {
                                    System.out.println("Insufficient balance, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 7:
                                if (player.getBalance() >= amountOption * ChipType.FIVE_HUNDRED.getValue()) {
                                    player.addChip(ChipType.FIVE_HUNDRED, amountOption);
                                    player.removeCashFromBalance(amountOption * ChipType.FIVE_HUNDRED.getValue());
                                } else {
                                    System.out.println("Insufficient balance, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 8:
                                if (player.getBalance() >= amountOption * ChipType.THOUSAND.getValue()) {
                                    player.addChip(ChipType.THOUSAND, amountOption);
                                    player.removeCashFromBalance(amountOption * ChipType.THOUSAND.getValue());
                                } else {
                                    System.out.println("Insufficient balance, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 9:
                                storePageIsRunning = false;
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        break;
                    case 2:
                        Main.clearScreen();
                        printSellChipPage(player);
                        int sellValueOption = scanner.nextInt();
                        System.out.print("Enter the amount of chips you would like to sell: ");
                        int sellAmountOption = scanner.nextInt();
                        switch (sellValueOption) {
                            case 1:
                                if (player.getChipAmount(ChipType.ONE) >= sellAmountOption) {
                                    player.removeChip(ChipType.ONE, sellAmountOption);
                                    player.addCashToBalance(sellAmountOption * ChipType.ONE.getValue());
                                } else {
                                    System.out.println("Not enough chips, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 2:
                                if (player.getChipAmount(ChipType.FIVE) >= sellAmountOption) {
                                    player.removeChip(ChipType.FIVE, sellAmountOption);
                                    player.addCashToBalance(sellAmountOption * ChipType.FIVE.getValue());
                                } else {
                                    System.out.println("Not enough chips, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 3:
                                if (player.getChipAmount(ChipType.TEN) >= sellAmountOption) {
                                    player.removeChip(ChipType.TEN, sellAmountOption);
                                    player.addCashToBalance(sellAmountOption * ChipType.TEN.getValue());
                                } else {
                                    System.out.println("Not enough chips, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 4:
                                if (player.getChipAmount(ChipType.TWENTY_FIVE) >= sellAmountOption) {
                                    player.removeChip(ChipType.TWENTY_FIVE, sellAmountOption);
                                    player.addCashToBalance(sellAmountOption * ChipType.TWENTY_FIVE.getValue());
                                } else {
                                    System.out.println("Not enough chips, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 5:
                                if (player.getChipAmount(ChipType.FIFTY) >= sellAmountOption) {
                                    player.removeChip(ChipType.FIFTY, sellAmountOption);
                                    player.addCashToBalance(sellAmountOption * ChipType.FIFTY.getValue());
                                } else {
                                    System.out.println("Not enough chips, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 6:
                                if (player.getChipAmount(ChipType.HUNDRED) >= sellAmountOption) {
                                    player.removeChip(ChipType.HUNDRED, sellAmountOption);
                                    player.addCashToBalance(sellAmountOption * ChipType.HUNDRED.getValue());
                                } else {
                                    System.out.println("Not enough chips, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 7:
                                if (player.getChipAmount(ChipType.FIVE_HUNDRED) >= sellAmountOption) {
                                    player.removeChip(ChipType.FIVE_HUNDRED, sellAmountOption);
                                    player.addCashToBalance(sellAmountOption * ChipType.FIVE_HUNDRED.getValue());
                                } else {
                                    System.out.println("Not enough chips, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 8:
                                if (player.getChipAmount(ChipType.THOUSAND) >= sellAmountOption) {
                                    player.removeChip(ChipType.THOUSAND, sellAmountOption);
                                    player.addCashToBalance(sellAmountOption * ChipType.THOUSAND.getValue());
                                } else {
                                    System.out.println("Not enough chips, going back to menu.");
                                    Thread.sleep(5000);
                                    storePageIsRunning = false;
                                }
                                break;
                            case 9:
                                storePageIsRunning = false;
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }
        }
    }

    private static void selectChipSizeUI() {
        System.out.println("|-----------------------------------|");
        System.out.println("|                                   |");
        System.out.println("|            OneMoreBet             |");
        System.out.println("|                                   |");
        System.out.println("|-----------------------------------|");
        System.out.println("|            Bet amount:            |");
        System.out.println("|         Select chip size          |");
        System.out.println("|-----------------------------------|");
        System.out.println("| 1. 1$                             |");
        System.out.println("| 2. 5$                             |");
        System.out.println("| 3. 10$                            |");
        System.out.println("| 4. 25$                            |");
        System.out.println("| 5. 50$                            |");
        System.out.println("| 6. 100$                           |");
        System.out.println("| 7. 500$                           |");
        System.out.println("| 8. 1000$                          |");
        System.out.println("| 9. Exit to main menu              |");
        System.out.println("|-----------------------------------|");

    }

    private static void gameInterface(Player player, Scanner scanner, SlotMachine slotmachine) throws InterruptedException {
        boolean gameIsRunning = true;
        while (gameIsRunning) {
            selectChipSizeUI();
            if (scanner.hasNextInt()){
                int option = scanner.nextInt();
                if (option == 9) {
                    gameIsRunning = false;
                }
                else if (option >= 1 && option <= 8) {
                    System.out.println("Write the amount of chips you want to bet of "+ ChipType.values()[option - 1]);
                    int amountOfChips = scanner.nextInt();
                    ChipType selectedChip = ChipType.values()[option - 1];
                    //int totalCost = amountOfChips * selectedChip.getValue();

                    slotmachine.bet(player,selectedChip,amountOfChips);
                    Thread.sleep(5000);
                    gameIsRunning = false;
                }

            }
        }
    }
    public static void main(String[] args) throws InterruptedException {

        Player player = new Player("Bence", 5000);

        SlotMachine sm = new SlotMachine();

        Scanner sc = new Scanner(System.in);
        boolean mainMenuIsRunning = true;

        System.out.println();

        while (mainMenuIsRunning) {
            printMainMenu();

            if (sc.hasNextInt()) {
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        Main.clearScreen();
                        System.out.println("Entering game...");
                        gameInterface(player, sc, sm);
                        break;
                    case 2:
                        Main.clearScreen();
                        System.out.println("Entering balance page...");
                        printBalancePage(player);
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
