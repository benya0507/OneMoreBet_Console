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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addChip(ChipType chipType, int amount) {
        chips.put(chipType, chips.getOrDefault(chipType, 0) + amount);
    }

    public void removeChip(ChipType chipType, int amount) {
        if (chips.containsKey(chipType) && chips.get(chipType) >= amount) {
            chips.put(chipType, chips.get(chipType) - amount);
        }
        else  {
            System.out.println("Not enough chips of type: " + chipType);
        }
    }

    public int getBalance() {
        return this.balance;
    }

}
