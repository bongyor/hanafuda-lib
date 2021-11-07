package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

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
