package com.bitdata.heatclift.lavs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnlogin=(Button)findViewById(R.id.btnlogin);
        final TextView copywrite = (TextView)findViewById(R.id.txtcopywrite);
        final RelativeLayout rl = (RelativeLayout)findViewById(R.id.rlcontrols);
        Animation slide = AnimationUtils.loadAnimation(this,R.anim.slidein);
        final Animation slideside = AnimationUtils.loadAnimation(this,R.anim.slideinside);
        rl.startAnimation(slide);
        slide.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                copywrite.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {

                copywrite.startAnimation(slideside);
                copywrite.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

}
