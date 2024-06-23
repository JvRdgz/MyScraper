package com.android.myscraper.infrastructure.ports.etherscan;

import android.content.Context;

import com.android.myscraper.domain.model.api.Wallet;

import java.util.ArrayList;

public class WalletAdapter {

    private ArrayList<Wallet> dataset;
    private Context context;

    public WalletAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    public int getItemCount() {
        return dataset.size();
    }

    public void addTransactionList(ArrayList<Wallet> transactionList) {
        dataset.addAll(transactionList);

    }
}
