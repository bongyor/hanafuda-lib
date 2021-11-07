package io.github.pmamico.hanafuda.lib.card.special;

import io.github.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import io.github.pmamico.hanafuda.lib.card.HanafudaCardType;
import io.github.pmamico.hanafuda.lib.card.PlayingCard;

public class Geese extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Geese in Flight";

    public Geese(){
        super(HanafudaCardSuit.SUZUKI, HanafudaCardType.ANIMAL, NAME);
    }

}
