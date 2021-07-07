package com.example.siddi.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity=2;
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        //String priceMessage="Total: "+(quantity*5)+"\nThank You";


        int total=calculatePrice(quantity);
        CheckBox ch=(CheckBox) findViewById(R.id.wipprd_cream);
        CheckBox ch1=(CheckBox) findViewById(R.id.chocolate);
        EditText ed=(EditText)findViewById(R.id.user_name);
        if(ch.isChecked()){total=total+quantity*1;}
        if(ch1.isChecked()){total=total+quantity*2;}
         String priceMessage="Name: "+ed.getText() +"\nAdd "+ch.getText()+"? "+ch.isChecked()+"\nAdd "+ch1.getText()+"?  " +ch1.isChecked()+"\nquantity="+quantity+"\nTotal: $"+total+"\nThank you!";
        displayMessage(priceMessage);
//        Uri gmmIntentUri = Uri.parse("mailto:siddichandu02@gmail.com");
//        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//        mapIntent.putExtra(Intent.EXTRA_SUBJECT,priceMessage );
//        //mapIntent.setPackage("com.google.android.apps.maps");
//        if (mapIntent.resolveActivity(getPackageManager()) != null) {
//            startActivity(mapIntent);
//            //startActivity(Intent.createChooser(mapIntent, "Send email..."));
//        }
//        Uri mailUri = Uri.parse("mailto:");
//        Intent intent = new Intent(Intent.ACTION_VIEW,mailUri);
//        intent.putExtra(Intent.EXTRA_TEXT,priceMessage);
//        intent.putExtra(Intent.EXTRA_SUBJECT,"order summary");
//
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        }
        Intent myIntent = new Intent(ed.getContext(), Display1.class);
        myIntent.putExtra(EXTRA_MESSAGE, ed.getText().toString());
        startActivity(myIntent);
    }
    private void displayMessage(String message){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);

        priceTextView.setText(message);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private String createOrderSummary(int total){
        return "Name: Chandu \nQuantity: "+quantity+"\nTotal: $"+total+"\nThank you!";
    }
    /**
     * this is called when + is clicked
     */

    public void increament(View view){
        //int quantity=2;
        if(quantity>=100){
            Toast.makeText(this,"quantity must be less than 100 " ,
                    Toast.LENGTH_LONG).show();

        }
        else {
            quantity = quantity + 1;
            displayQuantity(quantity);
        }
    }
    /**
     * this is called when - is clicked
     */
    public void decreament(View view){
        if(quantity==1 ){
            Toast.makeText(this,"quantity must be greater than 1 " ,
                    Toast.LENGTH_LONG).show();
        }
        else{
        quantity=quantity-1;
        displayQuantity(quantity);}
    }
    /**

     * Calculates the price of the order based on the current quantity.

     *

     * @return the price

     */

    private int calculatePrice(int quantity) {

        int price = quantity * 5;

        return price;

    }
}