package com.binance.api.client.domain.account;

import com.binance.api.client.domain.general.Network;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

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
}
