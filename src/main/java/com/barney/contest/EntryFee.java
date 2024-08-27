package com.barney.contest;

import com.barney.enums.ContestEntryFeeType;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class EntryFee {
    private ContestEntryFeeType type;
    private Long fee;
}
