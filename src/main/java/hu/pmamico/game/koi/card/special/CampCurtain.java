package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

public class CampCurtain extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Camp Curtain";

    public CampCurtain(){
        super(HanafudaCardSuit.SAKURA, HanafudaCardType.BRIGHT, NAME);
    }
    
}
