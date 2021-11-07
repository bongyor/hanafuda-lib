package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

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
