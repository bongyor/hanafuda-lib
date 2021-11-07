package io.github.pmamico.hanafuda.lib.card.special;

import io.github.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import io.github.pmamico.hanafuda.lib.card.HanafudaCardType;
import io.github.pmamico.hanafuda.lib.card.PlayingCard;

public class Boar extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Boar";

    public Boar(){
        super(HanafudaCardSuit.HAGI, HanafudaCardType.ANIMAL, NAME);
    }

}
