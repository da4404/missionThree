package com.example.missionthree;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int numberOfClicks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberOfClicks = 0;
        btn =  (Button) findViewById(R.id.myButton);
    }


    public void clickButton(View view) {
        numberOfClicks++;
        btn.setText("This is a click number: "+numberOfClicks);
        if (numberOfClicks==6)
        {
            btn.setText("Enough to click. Go to new start!");
            numberOfClicks=0;
        }

    }
}