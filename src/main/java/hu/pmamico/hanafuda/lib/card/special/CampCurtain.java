package hu.pmamico.hanafuda.lib.card.special;

import hu.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import hu.pmamico.hanafuda.lib.card.HanafudaCardType;
import hu.pmamico.hanafuda.lib.card.PlayingCard;

public class CampCurtain extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Camp Curtain";

    public CampCurtain(){
        super(HanafudaCardSuit.SAKURA, HanafudaCardType.BRIGHT, NAME);
    }
    
}