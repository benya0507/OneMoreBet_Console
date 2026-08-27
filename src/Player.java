import java.util.HashMap;
import java.util.Map;

public class Player {
    private String name;
    private int cashBalance;
    private Map<ChipType, Integer> chips;

    public Player(String name, int cashbalance) {
        this.name = name;
        this.cashBalance = cashbalance;
        this.chips = new HashMap<>();
    }

    public int calculateChipValue(){
        int allChipValue = 0;
        for (Map.Entry<ChipType, Integer> entry : chips.entrySet()) {
            allChipValue += entry.getKey().getValue() * entry.getValue();
        }
        return allChipValue;
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
        return this.cashBalance;
    }

}
