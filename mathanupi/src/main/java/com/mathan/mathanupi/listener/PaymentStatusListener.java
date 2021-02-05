package com.mathan.mathanupi.listener;


import com.mathan.mathanupi.entity.TransactionResponse;

public interface PaymentStatusListener {
    void onTransactionCompleted(TransactionResponse transactionDetails);
    void onTransactionSuccess(TransactionResponse transactionDetails);
    void onTransactionSubmitted();
    void onTransactionFailed();
    void onTransactionCancelled();
}
