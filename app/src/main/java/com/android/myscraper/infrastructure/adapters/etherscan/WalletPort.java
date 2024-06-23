package com.android.myscraper.infrastructure.adapters.etherscan;

import com.android.myscraper.domain.model.api.Wallet;

import java.util.ArrayList;

public interface WalletPort {
    Wallet getWallet(String address);
    void getData(String address, int offset);
}
