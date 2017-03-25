package com.wordpress.thatsmartproduct.baskettracker;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by wssyed on 2/11/2017.
 */

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity);

        /**
         * The text view that displays the text.
         */

        TextView textView = (TextView) findViewById(R.id.about_text_view_1);
        textView.setText("This application is solely meant for leisure. This software is distributed " +
                "on an \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either " +
                "expressed or implied. By using this application, you (user) are agreeing to the terms and " +
                "conditions of the author." +
                "\nAuthor signature: wssyed.\nDated: 2/11/2017.\nVersion 2.0.1 - NEW ADDITIONS SOON!" +
                "\nTo submit suggestions, " +
                "send an email to \"nnic590@gmail.com\" or please click the button below. " +
                "Remember to be as detailed as possible.");

        /**
         * The suggestions button that calls an implicit intent to an EMail application on the
         * mobile device.
         */

        Button button = (Button) findViewById(R.id.about_button_1);
        button.setText("Suggestions");
        button.setAllCaps(true);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, "nnic590@gmail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Re: Basket Tracker Application");
                intent.putExtra(Intent.EXTRA_TEXT, "Suggestion for Basket Tracker Application follows below:\n ");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}
