package hu.pmamico.game.koi.deck;

import hu.pmamico.game.koi.card.PlayingCard;

//TODO IStackOfCards?
public interface IDeckOfCards {

    void shuffle();
    void cut();
    void init();
    PlayingCard draw();

}
