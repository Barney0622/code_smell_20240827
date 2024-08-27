package com.barney.adjustment_v1.service.contestCalculate;

import com.barney.contest.Contest;

public class DepositPracticeCalculateServiceService implements ContestCalculateService {
    @Override
    public int calculateDueSlipNumber(Contest contest) {
        return Math.abs(contest.getCode().hashCode()) % Math.min(300, contest.getSpots());
    }
}
