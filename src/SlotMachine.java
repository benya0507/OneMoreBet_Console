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

    public void spin(){
        int randomNumOne = (int) (Math.random() * this.symbols.size());
        int randomNumTwo = (int) (Math.random() * this.symbols.size());
        int randomNumThree = (int) (Math.random() * this.symbols.size());
        String firstSymbol = symbols.get(randomNumOne);
        String secondSymbol = symbols.get(randomNumTwo);
        String thirdSymbol = symbols.get(randomNumThree);
        if (firstSymbol.equals(secondSymbol) && thirdSymbol.equals(secondSymbol)){

        }
        System.out.println("|" +  firstSymbol + "|" + secondSymbol + "|" + thirdSymbol + "|");
    }
}