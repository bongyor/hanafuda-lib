package io.github.pmamico.hanafuda.lib.card.special;

import io.github.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import io.github.pmamico.hanafuda.lib.card.HanafudaCardType;
import io.github.pmamico.hanafuda.lib.card.PlayingCard;

public class RainMan extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Ono no Michikaze";

    public RainMan(){
        super(HanafudaCardSuit.YANAGI, HanafudaCardType.BRIGHT, NAME);
    }

    @Override
    public boolean isRainMan() {
        return true;
    }
}
