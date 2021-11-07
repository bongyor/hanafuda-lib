package hu.pmamico.hanafuda.lib.card.special;

import hu.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import hu.pmamico.hanafuda.lib.card.HanafudaCardType;
import hu.pmamico.hanafuda.lib.card.PlayingCard;

public class Swallow extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Swallow";

    public Swallow(){
        super(HanafudaCardSuit.YANAGI, HanafudaCardType.ANIMAL, NAME);
    }
    
}
