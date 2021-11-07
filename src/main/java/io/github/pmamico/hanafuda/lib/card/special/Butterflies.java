package io.github.pmamico.hanafuda.lib.card.special;

import io.github.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import io.github.pmamico.hanafuda.lib.card.HanafudaCardType;
import io.github.pmamico.hanafuda.lib.card.PlayingCard;

public class Butterflies extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Butterflies";

    public Butterflies(){
        super(HanafudaCardSuit.BOTAN, HanafudaCardType.ANIMAL, NAME);
    }

}
