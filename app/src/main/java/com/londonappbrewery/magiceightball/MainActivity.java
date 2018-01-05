package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button mybutton;
    private ImageView ballDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        mybutton = (Button) findViewById(R.id.askButton);


        final int ballImageArr[] = new int[5];
        ballImageArr[0] = R.drawable.ball1;
        ballImageArr[1] = R.drawable.ball2;
        ballImageArr[2] = R.drawable.ball3;
        ballImageArr[3] = R.drawable.ball4;
        ballImageArr[4] = R.drawable.ball5;

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                Integer randomImageRef = random.nextInt(4);
                Toast bread = Toast.makeText(getApplicationContext(),randomImageRef.toString(), Toast.LENGTH_SHORT);
                bread.show();

                ballDisplay.setImageResource(ballImageArr[randomImageRef]);
            }
        });

    }
}
