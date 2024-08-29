package com.barney.adjustment_v1.service.contestCalculate;

import com.barney.contest.Contest;

public class RubyNormalContestCalculateService implements ContestCalculateService {
    @Override
    public int calculateDueSlipNumber(Contest contest) {
        if (contest.getEntryFee().getFee() <= 20_000L) {
            return Math.abs(contest.getCode().hashCode()) % Math.min(300, contest.getSpots());
        }
        return 0;
    }
}
