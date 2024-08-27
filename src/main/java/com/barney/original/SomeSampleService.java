package com.barney.original;

import com.barney.contest.Contest;
import com.barney.enums.ContestEntryFeeType;
import com.barney.enums.ContestType;

public class SomeSampleService {

    public int calculateDueSlipNumber(Contest contest, long tenantId) {
        if (!contest.getAllowTenants().contains(tenantId)) {
            return 0;
        }

        // ------- find suitable number, base on contest type and contest entry fee type.

        //todo: 移除多個enum判斷，減少因增加條件改動到原有的程式碼(factory pattern) -> ocp
        if (ContestType.PUBLIC_NORMAL.equals(contest.getType())
                && ContestEntryFeeType.RUBY.equals(contest.getEntryFee().getType())
                //todo:價格習慣在千分位使用底線
                && contest.getEntryFee().getFee() <= 200_00L) {
            return Math.abs(contest.getCode().hashCode()) % Math.min(30, contest.getSpots());
        }

        if (ContestType.PUBLIC_PRACTICE.equals(contest.getType())
                && ContestEntryFeeType.DEPOSIT.equals(contest.getEntryFee().getType())
                //todo:這邊fee使用Long時 此條件永遠為真
                && contest.getEntryFee().getFee() <= Long.MAX_VALUE) {
            return Math.abs(contest.getCode().hashCode()) % Math.min(300, contest.getSpots());
        }

        if (ContestType.PUBLIC_NORMAL.equals(contest.getType())
                && ContestEntryFeeType.DEPOSIT.equals(contest.getEntryFee().getType())
                //todo:價格習慣在千分位使用底線
                && contest.getEntryFee().getFee() <= 10_00L) {
            return Math.abs(contest.getCode().hashCode()) % Math.min(5, contest.getSpots());
        }

        return 0;
    }
}
