package hu.pmamico.hanafuda.lib.deck;

import hu.pmamico.hanafuda.lib.card.PlayingCard;

//TODO IStackOfCards?
public interface IDeckOfCards {

    void shuffle();
    void cut();
    void init();
    PlayingCard draw();

}
