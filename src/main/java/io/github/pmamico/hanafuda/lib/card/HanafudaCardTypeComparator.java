package io.github.pmamico.hanafuda.lib.card;

import java.util.Comparator;

public class HanafudaCardTypeComparator implements Comparator<HanafudaCardType> {

    @Override
    public int compare(HanafudaCardType o1, HanafudaCardType o2) {
        if(o1.isRibbon() && o2.isRibbon()){
            return o1.getName().compareTo(o2.getName());
        }
        return Integer.compare(o1.getValue(), o2.getValue());
    }
}
