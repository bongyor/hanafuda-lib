package io.github.pmamico.hanafuda.lib.card.special;

import io.github.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import io.github.pmamico.hanafuda.lib.card.HanafudaCardType;
import io.github.pmamico.hanafuda.lib.card.PlayingCard;

public class SakeCup extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Poetry Sake Cup";

    public SakeCup(){
        super(HanafudaCardSuit.KIKU, HanafudaCardType.ANIMAL, NAME);
    }

    @Override
    public boolean isWild() {
        return true;
    }
}
