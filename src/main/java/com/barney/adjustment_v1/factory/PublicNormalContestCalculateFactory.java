package com.barney.adjustment_v1.factory;

import com.barney.adjustment_v1.service.contestCalculate.ContestCalculateService;
import com.barney.adjustment_v1.service.contestCalculate.DepositNormalContestCalculateService;
import com.barney.adjustment_v1.service.contestCalculate.RubyNormalContestCalculateService;
import com.barney.enums.ContestEntryFeeType;

public class PublicNormalContestCalculateFactory implements ContestTypeCalculateFactory{
    @Override
    public ContestCalculateService buildContestCalculateService(ContestEntryFeeType feeType) {
        return switch (feeType) {
            case RUBY -> new RubyNormalContestCalculateService();
            case DEPOSIT -> new DepositNormalContestCalculateService();
        };
    }
}
