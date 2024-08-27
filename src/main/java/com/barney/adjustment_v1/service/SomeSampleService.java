package com.barney.adjustment_v1.service;

import com.barney.adjustment_v1.factory.ContestCalculateFactory;
import com.barney.adjustment_v1.factory.ContestTypeCalculateFactory;
import com.barney.adjustment_v1.service.contestCalculate.ContestCalculateService;
import com.barney.contest.Contest;

public class SomeSampleService {
    public int calculateDueSlimNumber(Contest contest, long tenantId) {
        if (!contest.getAllowTenants().contains(tenantId)) {
            return 0;
        }

        // ------- find suitable number, base on contest type and contest entry fee type.
        ContestCalculateFactory contestCalculateFactory = new ContestCalculateFactory();
        ContestTypeCalculateFactory contestTypeCalculateFactory = contestCalculateFactory.buildContestTypeCalculateFactory(contest.getType());
        ContestCalculateService contestCalculateService = contestTypeCalculateFactory.buildContestCalculateService(contest.getEntryFee().getType());

        return contestCalculateService.calculateDueSlipNumber(contest);
    }
}
