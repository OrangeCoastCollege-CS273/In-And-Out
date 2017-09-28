package edu.orangecoastcollege.a273.sbadajozcs.inandout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    /**
     * Called when the activity is starting.
     *
     * Grabs Extras from Intent and puts the text into the {@link TextView}s
     *
     * @param savedInstanceState If the activity is being re-initialized after previously being shut down then this Bundle
     *                           contains the data it most recently supplied in onSaveInstanceState(Bundle). Note: Otherwise it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent intent = getIntent();

        ((TextView) findViewById(R.id.orderTotalTextView)).setText(getString(R.string.order_total) + String.valueOf(intent.getFloatExtra("Total", 0.0f)));
        ((TextView) findViewById(R.id.itemsOrderedTextView)).setText(getString(R.string.items_ordered) + String.valueOf(intent.getIntExtra("Num", 0)));
        ((TextView) findViewById(R.id.subtotalTextView)).setText(getString(R.string.subtotal) + String.valueOf(intent.getFloatExtra("Subtotal", 0.0f)));
        ((TextView) findViewById(R.id.taxTextView)).setText(getString(R.string.tax) + String.valueOf(intent.getFloatExtra("Tax", 0.0f)));
        }

    /**
     * Ends current activity, goes back to {@link OrderActivity}
     * @param view The clicked {@link View}
     */
    protected void goBack(View view) {
        finish();
    }
}
