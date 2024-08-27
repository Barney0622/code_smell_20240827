package com.barney.adjustment_v1.factory;

import com.barney.enums.ContestType;

public class ContestCalculateFactory {

    public ContestTypeCalculateFactory buildContestTypeCalculateFactory(ContestType contestType) {
        return switch (contestType) {
            case PUBLIC_PRACTICE -> new PublicPracticeContestCalculateFactory();
            case PUBLIC_NORMAL -> new PublicNormalContestCalculateFactory();
        };
    }
}
