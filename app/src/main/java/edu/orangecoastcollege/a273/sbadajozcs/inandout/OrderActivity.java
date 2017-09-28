package edu.orangecoastcollege.a273.sbadajozcs.inandout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    /**
     * Called when the activity is starting.
     *
     * @param savedInstanceState If the activity is being re-initialized after previously being shut down then this Bundle
     *                           contains the data it most recently supplied in onSaveInstanceState(Bundle). Note: Otherwise it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

    }

    /**
     * Creates an order object from {@link android.widget.EditText}s' text fields and puts calculations into an {@link Intent}
     * which sends the user to {@link SummaryActivity}
     * @param view Clicked {@link View}
     */
    protected void createOrder(View view) {
        Intent intent = new Intent(this, SummaryActivity.class);
        // If you squint real hard you can pretend its readable code
        Order order = new Order(Integer.parseInt(((TextView)findViewById(R.id.doubledoubleTextView)).getText().toString()),
                Integer.parseInt(((TextView)findViewById(R.id.cheeseburgerTextView)).getText().toString()),
                Integer.parseInt(((TextView)findViewById(R.id.frenchFriesTextView)).getText().toString()),
                Integer.parseInt(((TextView)findViewById(R.id.shakesTextView)).getText().toString()),
                Integer.parseInt(((TextView)findViewById(R.id.smallDrinkTextView)).getText().toString()),
                Integer.parseInt(((TextView)findViewById(R.id.mediumDrinkTextView)).getText().toString()),
                Integer.parseInt(((TextView)findViewById(R.id.largeDrinkTextView)).getText().toString()));

        intent.putExtra("Num", order.numItems());
        intent.putExtra("Subtotal", order.getSubtotal());
        intent.putExtra("Tax", order.getTax());
        intent.putExtra("Total", order.getTotal());

        startActivity(intent);
    }
}
