package org.keetech.ex10_7ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RatingBar ratingBar1, ratingBar2, ratingBar3;
        Button btnInc, btnDec;

        ratingBar1 = (RatingBar) findViewById(R.id.ratingBar1);
        ratingBar2 = (RatingBar) findViewById(R.id.ratingBar2);
        ratingBar3 = (RatingBar) findViewById(R.id.ratingBar3);
        btnInc = (Button) findViewById(R.id.btnInc);
        btnDec = (Button) findViewById(R.id.btnDec);

        btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ratingBar1.setRating(ratingBar1.getRating() + ratingBar1.getStepSize());
                ratingBar2.setRating(ratingBar2.getRating() + ratingBar2.getStepSize());
                ratingBar3.setRating(ratingBar3.getRating() + ratingBar3.getStepSize());
            }
        });
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ratingBar1.setRating(ratingBar1.getRating() - ratingBar1.getStepSize());
                ratingBar2.setRating(ratingBar2.getRating() - ratingBar2.getStepSize());
                ratingBar3.setRating(ratingBar3.getRating() - ratingBar3.getStepSize());

            }
        });
    }
}
