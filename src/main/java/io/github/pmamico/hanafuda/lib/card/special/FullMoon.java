package io.github.pmamico.hanafuda.lib.card.special;

import io.github.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import io.github.pmamico.hanafuda.lib.card.HanafudaCardType;
import io.github.pmamico.hanafuda.lib.card.PlayingCard;

public class FullMoon extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Full Moon with Red Sky";

    public FullMoon(){
        super(HanafudaCardSuit.SUZUKI, HanafudaCardType.BRIGHT, NAME);
    }

}
