package hu.pmamico.hanafuda.lib.card.special;

import hu.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import hu.pmamico.hanafuda.lib.card.HanafudaCardType;
import hu.pmamico.hanafuda.lib.card.PlayingCard;

public class BushWarbler extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Bush-warbler in a Tree";

    public BushWarbler(){
        super(HanafudaCardSuit.UME, HanafudaCardType.ANIMAL, NAME);
    }
    
}
