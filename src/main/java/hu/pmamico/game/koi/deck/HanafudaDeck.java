package hu.pmamico.game.koi.deck;

import hu.pmamico.game.koi.card.PlayingCard;

import java.util.Collections;
import java.util.List;

public class HanafudaDeck implements IDeckOfCards {

    private List<PlayingCard> cards;

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public void cut() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void init() {
        DeckFactory deckFactory = DeckFactory.getInstance();
        cards = deckFactory.getCards();
    }

    @Override
    public PlayingCard draw() {
        PlayingCard card = cards.get(0);
        cards.remove(card);
        return card;
    }
}
