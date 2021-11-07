package hu.pmamico.game.koi.card;

public enum HanafudaCardType {
    PLAIN("Plain", 1),
    RIBBON("Ribbon", 5),
    BLUE_RIBBON("Blue Ribbon", 5),
    POETRY_RIBBON("Poetry Ribbon", 5),
    ANIMAL("Animal", 10),
    BRIGHT("Bright", 20);

    private String name;
    private int value;

    private HanafudaCardType(String name, int value){
        this.name  = name;
        this.value = value;
    }

    public boolean isRibbon(){
        return this.equals(RIBBON) || this.equals(BLUE_RIBBON) || this.equals(POETRY_RIBBON);
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
