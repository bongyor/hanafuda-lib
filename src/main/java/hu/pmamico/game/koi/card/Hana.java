package hu.pmamico.game.koi.card;

public enum Hana {

    MATSU("Matsu"),
    UME("Ume"),
    SAKURA("Sakura"),
    FUJI("Fuji"),
    AYAME("Ayame"),
    BOTAN("Botan"),
    HAGI("Hagi"),
    SUZUKI("Susuki"),
    KIKU("Kiku"),
    MOMIJI("Momiji"),
    YANAGI("Yanagi"),
    KIRI("Kiri");

    private String name;

    private Hana(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
