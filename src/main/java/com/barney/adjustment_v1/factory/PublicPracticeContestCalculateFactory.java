package com.barney.adjustment_v1.factory;

import com.barney.adjustment_v1.service.contestCalculate.ContestCalculateService;
import com.barney.adjustment_v1.service.contestCalculate.DepositPracticeCalculateServiceService;
import com.barney.adjustment_v1.service.contestCalculate.RubyPracticeCalculateServiceService;
import com.barney.enums.ContestEntryFeeType;

public class PublicPracticeContestCalculateFactory implements ContestTypeCalculateFactory{

    @Override
    public ContestCalculateService buildContestCalculateService(ContestEntryFeeType feeType) {
        return switch (feeType) {
            case DEPOSIT -> new DepositPracticeCalculateServiceService();
            case RUBY -> new RubyPracticeCalculateServiceService();
        };
    }
}
