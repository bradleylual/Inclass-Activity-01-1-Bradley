package com.introtoandroid.inclass_activity_01_1_bradley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import java.util.Calendar;
import android.widget.TextView;
        
public class InclassActivity01Bradley extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inclass_activity01_bradley);

        final TextView text = (TextView) findViewById(R.id.dateView);

        final DatePicker date = (DatePicker) findViewById(R.id.DatePicker01);
        Calendar cal = Calendar.getInstance();
        date.init(2015, 7, 17,
                new DatePicker.OnDateChangedListener() {
                    public void onDateChanged(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(year, monthOfYear, dayOfMonth);
                        text.setText(calendar.getTime().toString());
                    }
                });

        RatingBar rate = (RatingBar) findViewById(R.id.ratebar1);
        rate.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar,
                                        float rating, boolean fromTouch) {
                ((TextView)findViewById(R.id.rating_text))
                        .setText("Rating: "+ rating);
            }
        });

        ProgressBar mProgress = (ProgressBar) findViewById(R.id.progress_bar);
        mProgress.setProgress(75);

    }

}
