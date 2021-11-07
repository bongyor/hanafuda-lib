package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

public class FullMoon extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Full Moon with Red Sky";

    public FullMoon(){
        super(HanafudaCardSuit.SUZUKI, HanafudaCardType.BRIGHT, NAME);
    }

}
