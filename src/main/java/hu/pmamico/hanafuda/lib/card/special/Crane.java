package hu.pmamico.hanafuda.lib.card.special;

import hu.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import hu.pmamico.hanafuda.lib.card.HanafudaCardType;
import hu.pmamico.hanafuda.lib.card.PlayingCard;

public class Crane extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Crane and Sun";

    public Crane(){
        super(HanafudaCardSuit.MATSU, HanafudaCardType.ANIMAL, NAME);
    }

}
