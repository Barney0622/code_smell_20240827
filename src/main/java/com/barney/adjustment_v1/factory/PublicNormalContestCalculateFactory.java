package com.barney.adjustment_v1.factory;

import com.barney.adjustment_v1.service.contestCalculate.ContestCalculateService;
import com.barney.adjustment_v1.service.contestCalculate.DepositNormalContestCalculateServiceService;
import com.barney.adjustment_v1.service.contestCalculate.RubyNormalContestCalculateServiceService;
import com.barney.enums.ContestEntryFeeType;

public class PublicNormalContestCalculateFactory implements ContestTypeCalculateFactory{
    @Override
    public ContestCalculateService buildContestCalculateService(ContestEntryFeeType feeType) {
        return switch (feeType) {
            case RUBY -> new RubyNormalContestCalculateServiceService();
            case DEPOSIT -> new DepositNormalContestCalculateServiceService();
        };
    }
}
