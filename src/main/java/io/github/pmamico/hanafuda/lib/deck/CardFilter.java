package io.github.pmamico.hanafuda.lib.deck;


public enum CardFilter {
    EQUAL(false),
    NOT_EQUAL(false),
    GREATER(true),
    SMALLER(true),
    NOT_GREATER(true),
    NOT_SMALLER(true);

    private boolean valueDependent;

    private CardFilter(boolean valueDependent){
        this.valueDependent = valueDependent;
    }

    public boolean isValueDependent() {
        return valueDependent;
    }
}
