import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SlotMachine {
    private List<String> symbols;

    public SlotMachine() {
        this.symbols = new ArrayList<>();
        this.symbols.add("🍒");
        this.symbols.add("🍋");
        this.symbols.add("🔔");
        this.symbols.add("⭐");
        this.symbols.add("💎");
    }

    public void printSymbols(String symbol1,  String symbol2, String symbol3) {
        System.out.println("|" +  symbol1 + "|" + symbol2 + "|" + symbol3 + "|");
    }

    public int spin(){
        int randomNumOne = (int) (Math.random() * this.symbols.size());
        int randomNumTwo = (int) (Math.random() * this.symbols.size());
        int randomNumThree = (int) (Math.random() * this.symbols.size());
        String firstSymbol = symbols.get(randomNumOne);
        String secondSymbol = symbols.get(randomNumTwo);
        String thirdSymbol = symbols.get(randomNumThree);
        boolean twoEqual = firstSymbol.equals(secondSymbol) || thirdSymbol.equals(secondSymbol) || firstSymbol.equals(thirdSymbol);
        boolean threeEqual = firstSymbol.equals(secondSymbol) && thirdSymbol.equals(secondSymbol);
        printSymbols(firstSymbol, secondSymbol, thirdSymbol);
        if(threeEqual){
            switch (firstSymbol) {
                case "💎":
                    return 5;
                case "🔔", "⭐":
                    return 4;
                case "🍋" , "🍒":
                    return 3;
            }
        } else if(twoEqual){
            String pairSymbol;
            if(firstSymbol.equals(secondSymbol) ||  firstSymbol.equals(thirdSymbol)){
                pairSymbol = firstSymbol;
            } else pairSymbol = secondSymbol;

            switch (pairSymbol) {
                case "💎":
                    return 3;
                case "🔔", "⭐", "🍋", "🍒":
                    return 1;
            }
        }
        else {
            if(firstSymbol.equals("💎") || secondSymbol.equals("💎") || thirdSymbol.equals("💎")) {
                return 1;
            }
        }
        return 0;
    }


    public void bet(Player player, ChipType chipType, int amount){
        if (player.removeChip(chipType, amount)){
            System.out.println("Starting spin!");
            player.addChip(chipType, spin()*amount);
        } else {
            System.out.println("Not enough chips");
        }
    }
}