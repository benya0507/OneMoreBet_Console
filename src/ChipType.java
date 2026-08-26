
public enum ChipType{
    ONE(1),
    FIVE(5),
    TEN(10),
    TWENTY_FIVE(25),
    FIFTY(50),
    HUNDRED(100),
    FIVE_HUNDRED(500),
    THOUSAND(1000);

    private int value;

    ChipType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}

