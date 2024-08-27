package com.barney.adjustment_v1.factory;

import com.barney.adjustment_v1.service.contestCalculate.ContestCalculateService;
import com.barney.enums.ContestEntryFeeType;

public interface ContestTypeCalculateFactory {
    ContestCalculateService buildContestCalculateService(ContestEntryFeeType feeType);
}
