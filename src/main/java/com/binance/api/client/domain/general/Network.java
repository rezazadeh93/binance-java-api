package com.binance.api.client.domain.general;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Network {
    private String addressRegex;
    private String coin;
    private String depositDesc;
    private Boolean depositEnable;
    private Boolean isDefault;
    private String memoRegex;
    private Integer minConfirm;
    private String name;
    private String network;
    private Boolean resetAddressStatus;
    private String specialTips;
    private Integer unLockConfirm;
    private String withdrawDesc;
    private Boolean withdrawEnable;
    private Double withdrawFee;
    private Double withdrawMin;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("addressRegex", addressRegex)
                .append("coin", coin)
                .append("depositDesc", depositDesc)
                .append("depositEnable", depositEnable)
                .append("isDefault", isDefault)
                .append("memoRegex", memoRegex)
                .append("minConfirm", minConfirm)
                .append("name", name)
                .append("network", network)
                .append("resetAddressStatus", resetAddressStatus)
                .append("specialTips", specialTips)
                .append("unLockConfirm", unLockConfirm)
                .append("withdrawDesc", withdrawDesc)
                .append("withdrawEnable", withdrawEnable)
                .append("withdrawFee", withdrawFee)
                .append("withdrawMin", withdrawMin)
                .toString();
    }
}
