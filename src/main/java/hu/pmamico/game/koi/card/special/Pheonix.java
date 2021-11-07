package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

public class Pheonix extends PlayingCard implements IPlayingCardSpecial {
    public static final String name = "Poetry Sake Cup";

    public Pheonix(){
        super(HanafudaCardSuit.KIRI, HanafudaCardType.BRIGHT, name);
    }

}
