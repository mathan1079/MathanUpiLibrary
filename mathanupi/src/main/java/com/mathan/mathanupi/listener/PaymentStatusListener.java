package com.mathan.mathanupi.listener;


import com.mathan.mathanupi.entity.TransactionResponse;

public interface PaymentStatusListener {
    void onTransactionCompleted(TransactionResponse transactionDetails);
    void onTransactionSuccess(TransactionResponse transactionDetails);
    void onTransactionSubmitted(TransactionResponse transactionDetails);
    void onTransactionFailed(TransactionResponse transactionDetails);
    void onTransactionCancelled();
}
