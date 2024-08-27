package com.barney.adjustment_v1.service.contestCalculate;

import com.barney.contest.Contest;

public class DepositNormalContestCalculateServiceService implements ContestCalculateService {
    @Override
    public int calculateDueSlipNumber(Contest contest) {
        if (contest.getEntryFee().getFee() <= 1_000L) {
            return Math.abs(contest.getCode().hashCode()) % Math.min(5, contest.getSpots());
        }

        return 0;
    }
}
