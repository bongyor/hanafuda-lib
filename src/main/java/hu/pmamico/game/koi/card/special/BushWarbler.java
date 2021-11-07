package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

public class BushWarbler extends PlayingCard implements IPlayingCardSpecial {
    public static final String name = "Bush-warbler in a Tree";

    public BushWarbler(){
        super(HanafudaCardSuit.UME, HanafudaCardType.ANIMAL, name);
    }
    
}
