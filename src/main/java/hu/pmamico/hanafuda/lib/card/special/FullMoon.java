package hu.pmamico.hanafuda.lib.card.special;

import hu.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import hu.pmamico.hanafuda.lib.card.HanafudaCardType;
import hu.pmamico.hanafuda.lib.card.PlayingCard;

public class FullMoon extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Full Moon with Red Sky";

    public FullMoon(){
        super(HanafudaCardSuit.SUZUKI, HanafudaCardType.BRIGHT, NAME);
    }

}
