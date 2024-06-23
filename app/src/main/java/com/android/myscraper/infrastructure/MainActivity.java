package com.android.myscraper.infrastructure;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.myscraper.R;
import com.android.myscraper.application.services.TransactionFetchResult;
import com.android.myscraper.domain.model.api.ModulesTypes;
import com.android.myscraper.domain.model.api.modules.Account;
import com.android.myscraper.domain.utils.Constant;
import com.android.myscraper.infrastructure.adapters.etherscan.EtherscanAPIService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private EtherscanAPIService etherscanAPIService;
    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void getData(String address, int offset, boolean ready) {
        String module = ModulesTypes.ACCOUNT.toString().toLowerCase();
        String action = Account.TXLIST.toString().toLowerCase();
        this.etherscanAPIService = retrofit.create(EtherscanAPIService.class);

        Call<TransactionFetchResult> walletFetchResultCall = this.etherscanAPIService.getTransactionsList(module, action, address, 0, 99999999, 1, 10, Constant.DESC, Constant.API_KEY);
        walletFetchResultCall.enqueue(new Callback<TransactionFetchResult>() {
            @Override
            public void onResponse(Call<TransactionFetchResult> call, Response<TransactionFetchResult> response) {
                if (response.isSuccessful()) {
                    TransactionFetchResult transactionFetchResult = response.body();
                }
            }

            @Override
            public void onFailure(Call<TransactionFetchResult> call, Throwable t) {

            }
        });
    }
}