package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.general.Network;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinsInfo {
    private String coin;
    private Boolean depositAllEnable;
    private Double free;
    private Double freeze;
    private Double ipoable;
    private Double ipoing;
    private Boolean isLegalMoney;
    private Double locked;
    private String name;
    private List<Network> networkList;
    private Double storage;
    private Boolean trading;
    private Boolean withdrawAllEnable;
    private Double withdrawing;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("coin", coin)
                .append("depositAllEnable", depositAllEnable)
                .append("free", free)
                .append("freeze", freeze)
                .append("ipoable", ipoable)
                .append("ipoing", ipoing)
                .append("isLegalMoney", isLegalMoney)
                .append("locked", locked)
                .append("name", name)
                .append("networkList", networkList)
                .append("storage", storage)
                .append("trading", trading)
                .append("withdrawAllEnable", withdrawAllEnable)
                .append("withdrawing", withdrawing)
                .toString();
    }
}
