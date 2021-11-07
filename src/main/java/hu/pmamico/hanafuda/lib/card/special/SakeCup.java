package hu.pmamico.hanafuda.lib.card.special;

import hu.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import hu.pmamico.hanafuda.lib.card.HanafudaCardType;
import hu.pmamico.hanafuda.lib.card.PlayingCard;

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
