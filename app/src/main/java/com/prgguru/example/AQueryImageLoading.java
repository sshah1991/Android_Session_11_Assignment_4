package com.prgguru.example;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.androidquery.AQuery;

public class AQueryImageLoading extends Activity {
    // AQuery object
    private AQuery aq;
    // Progress Dialog bar object
    ProgressDialog prgDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // Instantiate AQuery object
        aq = new AQuery(this);
        // Simple Image Loading
        aq.id(R.id.simpleLoadBtn).text("Simple Image Load").clicked(this, "loadImageFromInternet");

    }

    // Call back method for Button - R.id.simpleLoadBtn click
    public void loadImageFromInternet(View image) {
        Toast.makeText(aq.getContext(), "Download initiated...", Toast.LENGTH_SHORT).show();
        aq.id(R.id.simpleLoadImg).image("http://android.programmerguru.com/wp-content/uploads/2014/01/asynctask_thumb.png", false, false);
    }


}
