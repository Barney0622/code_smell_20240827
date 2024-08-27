package com.barney.contest;

import com.barney.enums.ContestType;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Contest {
    private List<Long> allowTenants;
    private ContestType type;
    private EntryFee entryFee;
    private String code;
    private int spots;
}
