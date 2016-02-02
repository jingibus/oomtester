package com.bignerdranch.android.oomtester;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_PHOTO_IDX = "PHOTO_IDX";

    private int[] sDrawableIds = new int[] {
            R.drawable.img_1,
            R.drawable.img_10,
            R.drawable.img_11,
            R.drawable.img_12,
            R.drawable.img_13,
            R.drawable.img_14,
            R.drawable.img_15,
            R.drawable.img_16,
            R.drawable.img_17,
            R.drawable.img_18,
            R.drawable.img_19,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5,
            R.drawable.img_6,
            R.drawable.img_7,
            R.drawable.img_8,
            R.drawable.img_9,

    };

    private int mIdx = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIdx = getIntent().getIntExtra(EXTRA_PHOTO_IDX, 0);
        ((Button)findViewById(R.id.button))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this, MainActivity.class);
                        i.putExtra(EXTRA_PHOTO_IDX, (mIdx + 1) % sDrawableIds.length);
                        startActivity(i);
                    }
                });

        findViewById(R.id.main_layout).setBackgroundResource(sDrawableIds[mIdx]);
    }


}
