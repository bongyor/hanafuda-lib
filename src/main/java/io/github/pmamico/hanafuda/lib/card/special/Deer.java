package io.github.pmamico.hanafuda.lib.card.special;

import io.github.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import io.github.pmamico.hanafuda.lib.card.HanafudaCardType;
import io.github.pmamico.hanafuda.lib.card.PlayingCard;

public class Deer extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Deer and Maple";

    public Deer(){
        super(HanafudaCardSuit.MOMIJI, HanafudaCardType.ANIMAL, NAME);
    }

}
