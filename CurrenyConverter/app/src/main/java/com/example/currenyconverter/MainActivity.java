package com.example.currenyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void currencyConvert(View view) {

        Log.i("Info", "Convert Button Pressed");
        TextView textView = findViewById(R.id.textView2);
        EditText editText = findViewById(R.id.editText);
        String amountInDollars = editText.getText().toString();
        double amountInDollarsDouble = Double.parseDouble(amountInDollars);
        double amountInRupeesDouble = amountInDollarsDouble * 155.7;
        String amountInRupeesString = String.format("%.2f", amountInRupeesDouble);

        Toast.makeText(this, "Amount in dollars = " + amountInDollars + "\n" +
                      "Amount in Rupees = " + amountInRupeesString, Toast.LENGTH_LONG).show();

        textView.setText("Amount in dollars = " + amountInDollars + "\n" +
                "Amount in Rupees = " + amountInRupeesString);
    }
}
