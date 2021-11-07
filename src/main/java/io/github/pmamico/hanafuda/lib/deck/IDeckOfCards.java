package io.github.pmamico.hanafuda.lib.deck;

import io.github.pmamico.hanafuda.lib.card.PlayingCard;

//TODO IStackOfCards?
public interface IDeckOfCards {

    void shuffle();
    void cut();
    void init();
    PlayingCard draw();

}
