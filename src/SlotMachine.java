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


    public int spin(){
        int randomNumOne = (int) (Math.random() * this.symbols.size());
        int randomNumTwo = (int) (Math.random() * this.symbols.size());
        int randomNumThree = (int) (Math.random() * this.symbols.size());
        String firstSymbol = symbols.get(randomNumOne);
        String secondSymbol = symbols.get(randomNumTwo);
        String thirdSymbol = symbols.get(randomNumThree);
        boolean twoEqual = firstSymbol.equals(secondSymbol) || thirdSymbol.equals(secondSymbol) || firstSymbol.equals(thirdSymbol);
        boolean threeEqual = firstSymbol.equals(secondSymbol) && thirdSymbol.equals(secondSymbol);
        if(firstSymbol.equals(secondSymbol) && thirdSymbol.equals(secondSymbol) && firstSymbol.equals("🍒") || firstSymbol.equals("🍋")){
            if (threeEqual){
                return 3;
            }
            else if (twoEqual){
                return 2;
            }
            else return 0;
        } else if (firstSymbol.equals(secondSymbol) && thirdSymbol.equals(secondSymbol) && firstSymbol.equals("🔔") || firstSymbol.equals("⭐")){
            if (threeEqual){
                return 4;
            }
            else if (twoEqual){
                return 2;
            }
            else return 0;
        }

        //System.out.println("|" +  firstSymbol + "|" + secondSymbol + "|" + thirdSymbol + "|");
    }
}