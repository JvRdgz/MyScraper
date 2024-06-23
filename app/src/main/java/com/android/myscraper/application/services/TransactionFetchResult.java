package com.android.myscraper.application.services;

import com.android.myscraper.domain.model.api.Wallet;
import com.android.myscraper.domain.repositories.WalletRepository;

import java.util.ArrayList;

public class TransactionFetchResult {
    // private ArrayList<Wallet> result;
    private WalletRepository walletRepository;

    public Wallet getWallet(String address) {
        return this.walletRepository.getWallet(address);
    }

    public ArrayList<Wallet> getTransactionsList(Wallet wallet) {
        return this.walletRepository.getTransactionsList(wallet);
    }

    /**
    public ArrayList<Wallet> getHistoricalWalletBalance() {
        return result;
    }*/
}
