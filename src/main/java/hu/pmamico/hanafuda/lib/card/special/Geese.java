package hu.pmamico.hanafuda.lib.card.special;

import hu.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import hu.pmamico.hanafuda.lib.card.HanafudaCardType;
import hu.pmamico.hanafuda.lib.card.PlayingCard;

public class Geese extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Geese in Flight";

    public Geese(){
        super(HanafudaCardSuit.SUZUKI, HanafudaCardType.ANIMAL, NAME);
    }

}
