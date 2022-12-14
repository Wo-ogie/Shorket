package com.solmi.shorket.market.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MarketListResponseDto<T> {
    private T markets;
}
