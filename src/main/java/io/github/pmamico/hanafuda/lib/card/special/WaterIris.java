package io.github.pmamico.hanafuda.lib.card.special;

import io.github.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import io.github.pmamico.hanafuda.lib.card.HanafudaCardType;
import io.github.pmamico.hanafuda.lib.card.PlayingCard;

public class WaterIris extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Water Iris and Eight-plank Bridge";

    public WaterIris(){
        super(HanafudaCardSuit.AYAME, HanafudaCardType.ANIMAL, NAME);
    }

}
