package io.github.pmamico.hanafuda.lib.deck;


import io.github.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import io.github.pmamico.hanafuda.lib.card.HanafudaCardType;
import io.github.pmamico.hanafuda.lib.card.PlayingCard;

public enum CardFilter {
    EQUAL(false) {
        @Override
        boolean apply(HanafudaCardSuit suit, PlayingCard card) {
            return card.getSuit().equals(suit);
        }

        @Override
        boolean apply(HanafudaCardType type, PlayingCard card) {
            return card.getType().equals(type);
        }
    },
    NOT_EQUAL(false) {
        @Override
        boolean apply(HanafudaCardSuit suit, PlayingCard card) {
            return !card.getSuit().equals(suit);
        }

        @Override
        boolean apply(HanafudaCardType type, PlayingCard card) {
            return !card.getType().equals(type);
        }
    },
    GREATER(true) {
        @Override
        boolean apply(HanafudaCardSuit suit, PlayingCard card) {
            return card.getSuit().compareTo(suit) > 0;
        }

        @Override
        boolean apply(HanafudaCardType type, PlayingCard card) {
            return card.getType().compareTo(type) > 0;
        }
    },
    SMALLER(true) {
        @Override
        boolean apply(HanafudaCardSuit suit, PlayingCard card) {
            return card.getSuit().compareTo(suit) < 0;
        }

        @Override
        boolean apply(HanafudaCardType type, PlayingCard card) {
            return card.getType().compareTo(type) < 0;
        }
    },
    NOT_GREATER(true) {
        @Override
        boolean apply(HanafudaCardSuit suit, PlayingCard card) {
            return card.getSuit().compareTo(suit) < 1;
        }

        @Override
        boolean apply(HanafudaCardType type, PlayingCard card) {
            return card.getType().compareTo(type) < 1;
        }
    },
    NOT_SMALLER(true) {
        @Override
        boolean apply(HanafudaCardSuit suit, PlayingCard card) {
            return card.getSuit().compareTo(suit) > -1;
        }

        @Override
        boolean apply(HanafudaCardType type, PlayingCard card) {
            return card.getType().compareTo(type) > -1;
        }
    };

    private boolean valueDependent;

    CardFilter(boolean valueDependent) {
        this.valueDependent = valueDependent;
    }

    public boolean isValueDependent() {
        return valueDependent;
    }

    abstract boolean apply(HanafudaCardSuit suit, PlayingCard card);

    abstract boolean apply(HanafudaCardType type, PlayingCard card);
}
