package hu.pmamico.hanafuda.lib.card.special;

import hu.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import hu.pmamico.hanafuda.lib.card.HanafudaCardType;
import hu.pmamico.hanafuda.lib.card.PlayingCard;

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
