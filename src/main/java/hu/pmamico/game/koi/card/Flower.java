package hu.pmamico.game.koi.card;

public enum Flower {

    PINE("Pine"),
    PLUM("Plum Blossom"),
    CHERRY("Cherry Blossom"),
    WISTERIA("Wisteria"),
    IRIS("Iris"),
    PEONY("Peony"),
    BUSH_CLOVER("Bush Clover"),
    SUZUKI_GRASS("Susuki Grass"),
    CHRYSANTHEMUM("Chrysanthemum"),
    MAPLE("Maple"),
    WILLOW("Willow"),
    PAULOWNIA("Paulownia");

    private String name;

    private Flower(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
