package com.android.myscraper.domain.repositories;

import com.android.myscraper.domain.model.api.Wallet;

import java.util.ArrayList;

public interface WalletRepository {

    Wallet getWallet(String address);
    ArrayList<Wallet> getTransactionsList(Wallet wallet);
}
