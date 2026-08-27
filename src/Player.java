import java.util.HashMap;
import java.util.Map;

public class Player {
    private String name;
    private int balance;
    private Map<ChipType, Integer> chips;

    public Player(String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.chips = new HashMap<>();
    }

    public int calculateBalance(){
        for(ChipType chipType : chips.keySet()){
            balance += chips.get(chipType);
        }
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addChip(ChipType chipType, int amount) {
        chips.put(chipType, chips.getOrDefault(chipType, 0) + amount);
    }

    public boolean removeChip(ChipType chipType, int amount) {
        boolean successRemoval;
        if (chips.containsKey(chipType) && chips.get(chipType) >= amount) {
            chips.put(chipType, chips.get(chipType) - amount);
            successRemoval = true;
        }
        else  {
            System.out.println("Not enough chips of type: " + chipType);
            successRemoval = false;
        }
        return successRemoval;
    }

    public int getBalance() {
        return this.balance;
    }

}
