package hu.pmamico.game.koi.deck;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SubsetTest {

    private DeckFactory deckFactory = DeckFactory.getInstance();

    @Test
    public void deckFactoryFullSizeTest(){
        assertEquals(48, deckFactory.getCards().size());
    }

    @Test
    public void deckFactoryJanSizeTest(){
        assertEquals(4, deckFactory.getCards(HanafudaCardSuit.JAN).size());
    }

    @Test
    public void deckFactoryFebSizeTest(){
        assertEquals(4, deckFactory.getCards(HanafudaCardSuit.FEB).size());
    }

    @Test
    public void deckFactoryMarSizeTest(){
        assertEquals(4, deckFactory.getCards(HanafudaCardSuit.MAR).size());
    }

    @Test
    public void deckFactoryAprSizeTest(){
        assertEquals(4, deckFactory.getCards(HanafudaCardSuit.APR).size());
    }

    @Test
    public void deckFactoryMaySizeTest(){
        assertEquals(4, deckFactory.getCards(HanafudaCardSuit.MAY).size());
    }

    @Test
    public void deckFactoryJunSizeTest(){
        assertEquals(4, deckFactory.getCards(HanafudaCardSuit.JUN).size());
    }

    @Test
    public void deckFactoryJulSizeTest(){
        assertEquals(4, deckFactory.getCards(HanafudaCardSuit.JUL).size());
    }

    @Test
    public void deckFactoryAugSizeTest(){
        assertEquals(4, deckFactory.getCards(HanafudaCardSuit.AUG).size());
    }

    @Test
    public void deckFactorySepSizeTest(){
        assertEquals(4, deckFactory.getCards(HanafudaCardSuit.SEP).size());
    }

    @Test
    public void deckFactoryOctSizeTest(){
        assertEquals(4, deckFactory.getCards(HanafudaCardSuit.OCT).size());
    }

    @Test
    public void deckFactoryNovSizeTest(){
        assertEquals(4, deckFactory.getCards(HanafudaCardSuit.NOV).size());
    }

    @Test
    public void deckFactoryDecSizeTest(){
        assertEquals(4, deckFactory.getCards(HanafudaCardSuit.DEC).size());
    }

    @Test
    public void deckFactoryBrightsSizeTest(){
        assertEquals(4, deckFactory.getCards(HanafudaCardType.BRIGHT).size());
    }

    @Test
    public void deckFactoryRibbonSizeTest(){
        assertEquals(4, deckFactory.getCards(HanafudaCardType.RIBBON).size());
    }

    @Test
    public void deckFactoryPoetryRibbonSizeTest(){
        assertEquals(3, deckFactory.getCards(HanafudaCardType.POETRY_RIBBON).size());
    }

    @Test
    public void deckFactoryBlueRibbonSizeTest(){
        assertEquals(3, deckFactory.getCards(HanafudaCardType.BLUE_RIBBON).size());
    }

    @Test
    public void deckFactoryAnimalSizeTest(){
        assertEquals(10, deckFactory.getCards(HanafudaCardType.ANIMAL).size());
    }

    @Test
    public void deckFactoryPlainSizeTest(){
        assertEquals(24, deckFactory.getCards(HanafudaCardType.PLAIN).size());
    }
}
