package io.github.pmamico.hanafuda.lib.card.special;

import io.github.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import io.github.pmamico.hanafuda.lib.card.HanafudaCardType;
import io.github.pmamico.hanafuda.lib.card.PlayingCard;

public class CampCurtain extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Camp Curtain";

    public CampCurtain(){
        super(HanafudaCardSuit.SAKURA, HanafudaCardType.BRIGHT, NAME);
    }
    
}
