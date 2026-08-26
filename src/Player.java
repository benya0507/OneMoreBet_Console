import java.util.Map;

public class Player {
    private String name;
    private int balance;
    private Map<ChipType, Integer> chips;

    public Player(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(this.name);
    }

    private void addChip(ChipType chipType, int amount) {
        chips.put(chipType, amount);
    }

    private void removeChip(ChipType chipType, int amount) {
        if (chips.containsKey(chipType) && chips.get(chipType) >= amount) {
            chips.remove(chipType);
        }
        else  {
            System.out.println("Chip " + chipType + " not found / not enough");
        }
    }

}
