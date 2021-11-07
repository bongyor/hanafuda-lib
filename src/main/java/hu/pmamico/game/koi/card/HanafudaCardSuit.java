package hu.pmamico.game.koi.card;

import java.util.Calendar;

public enum HanafudaCardSuit {
    JAN(Calendar.JANUARY,   Flower.PINE,          Hana.MATSU,   "松"),
    FEB(Calendar.FEBRUARY,  Flower.PLUM,          Hana.UME,     "梅"),
    MAR(Calendar.MARCH,     Flower.CHERRY,        Hana.SAKURA , "桜"),
    APR(Calendar.APRIL,     Flower.WISTERIA,      Hana.FUJI,    "藤"),
    MAY(Calendar.MAY,       Flower.IRIS,          Hana.AYAME,   "菖蒲" ),
    JUN(Calendar.JUNE,      Flower.PEONY,         Hana.BOTAN,   "牡丹"),
    JUL(Calendar.JULY,      Flower.BUSH_CLOVER,   Hana.HAGI,    "萩"),
    AUG(Calendar.AUGUST,    Flower.SUZUKI_GRASS,  Hana.SUZUKI,  "薄"),
    SEP(Calendar.SEPTEMBER, Flower.CHRYSANTHEMUM, Hana.KIKU,    "菊"),
    OCT(Calendar.OCTOBER,   Flower.MAPLE,         Hana.MOMIJI,  "紅葉"),
    NOV(Calendar.NOVEMBER,  Flower.WILLOW,        Hana.YANAGI,  "柳"),
    DEC(Calendar.DECEMBER,  Flower.PAULOWNIA,     Hana.KIRI,    "桐");

    //aliases for english flower names
    public static final HanafudaCardSuit PINE          = JAN;
    public static final HanafudaCardSuit PLUM          = FEB;
    public static final HanafudaCardSuit CHERRY        = MAR;
    public static final HanafudaCardSuit WISTERIA       = APR;
    public static final HanafudaCardSuit IRIS          = MAY;
    public static final HanafudaCardSuit PEONY         = JUN;
    public static final HanafudaCardSuit BUSH_CLOVER   = JUL;
    public static final HanafudaCardSuit SUZUKI_GRASS  = AUG;
    public static final HanafudaCardSuit CHRYSANTHEMUM = SEP;
    public static final HanafudaCardSuit MAPLE         = OCT;
    public static final HanafudaCardSuit WILLOW        = NOV;
    public static final HanafudaCardSuit PAULOWNIA     = DEC;

    //aliases for romaji flower names
    public static final HanafudaCardSuit MATSU         = JAN;
    public static final HanafudaCardSuit UME           = FEB;
    public static final HanafudaCardSuit SAKURA        = MAR;
    public static final HanafudaCardSuit FUJI          = APR;
    public static final HanafudaCardSuit AYAME         = MAY;
    public static final HanafudaCardSuit BOTAN         = JUN;
    public static final HanafudaCardSuit HAGI          = JUL;
    public static final HanafudaCardSuit SUZUKI        = AUG;
    public static final HanafudaCardSuit KIKU          = SEP;
    public static final HanafudaCardSuit MOMIJI        = OCT;
    public static final HanafudaCardSuit YANAGI        = NOV;
    public static final HanafudaCardSuit KIRI          = DEC;

    private int month;
    private Flower flower;
    private Hana romaji;
    private String jp;

    private HanafudaCardSuit(int month, Flower flower, Hana romaji, String jp){
        this.month = month;
        this.flower = flower;
        this.romaji = romaji;
        this.jp = jp;
    }

    public int getMonth() {
        return month;
    }

    public Flower getFlower() {
        return flower;
    }

    public Hana getRomaji() {
        return romaji;
    }

    public String getJp() {
        return jp;
    }
}


