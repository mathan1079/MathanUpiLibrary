package com.mathan.mathanupilibrary;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.mathan.mathanupi.MatUpi;
import com.mathan.mathanupi.entity.TransactionResponse;
import com.mathan.mathanupi.listener.PaymentStatusListener;



public class MainActivity extends AppCompatActivity implements PaymentStatusListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MatUpi matUpi=new MatUpi.Builder().with(MainActivity.this)
                .setPayeeVpa("example@vpa")
                .setAmount("25.00")// amount must be in decimal
                .setPayeeName(getResources().getString(R.string.app_name))
                .setDescription("description")
                .setTransactionId("transactionid")//need to pass from your end
                .setTransactionRefId("txnred") // need to pass from your end
                .build();
        matUpi.setPaymentStatusListener(MainActivity.this);
        matUpi.pay("Pay Using");
    }



    @Override
    public void onTransactionCompleted(TransactionResponse transactionDetails) {

    }

    @Override
    public void onTransactionSuccess(TransactionResponse transactionDetails) {
      //do your logic
    }

    @Override
    public void onTransactionSubmitted() {
        //do your logic
    }

    @Override
    public void onTransactionFailed() {
        //do your logic
    }

    @Override
    public void onTransactionCancelled() {
        Toast.makeText(MainActivity.this,"Payment Cancelled By User Try Again !",Toast.LENGTH_LONG).show();
    }
}