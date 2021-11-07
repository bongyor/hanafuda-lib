package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

public class Geese extends PlayingCard implements IPlayingCardSpecial {
    public static final String name = "Geese in Flight";

    public Geese(){
        super(HanafudaCardSuit.SUZUKI, HanafudaCardType.ANIMAL, name);
    }

}
