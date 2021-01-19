package com.example.carboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView airbag, battery, brakes, tcs, engine, tire, temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        airbag = (ImageView) findViewById(R.id.airbagView);
        airbag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAirbagActivity();
            }
        });

        battery = (ImageView) findViewById(R.id.batteryView);
        battery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBatteryActivity();
            }
        });

        brakes = (ImageView) findViewById(R.id.brakeView);
        brakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBrakeActivity();
            }
        });

        tcs = (ImageView) findViewById(R.id.tcsView);
        tcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTCSActivity();
            }
        });

        engine = (ImageView) findViewById(R.id.engineView);
        engine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEngineActivity();
            }
        });

        tire = (ImageView) findViewById(R.id.tireView);
        tire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTireActivity();
            }
        });

        temp = (ImageView) findViewById(R.id.tempView);
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTempActivity();
            }
        });
    }

    public void openAirbagActivity() {
        Intent intent = new Intent(this, airbag.class);
        startActivity(intent);
    }

    public void openBatteryActivity() {
        Intent intent = new Intent(this, battery.class);
        startActivity(intent);
    }

    public void openBrakeActivity() {
        Intent intent = new Intent(this, brakes.class);
        startActivity(intent);
    }

    public void openTCSActivity() {
        Intent intent = new Intent(this, tcs.class);
        startActivity(intent);
    }

    public void openEngineActivity() {
        Intent intent = new Intent(this, engine.class);
        startActivity(intent);
    }

    public void openTireActivity() {
        Intent intent = new Intent(this, tire.class);
        startActivity(intent);
    }

    public void openTempActivity() {
        Intent intent = new Intent(this, temp.class);
        startActivity(intent);
    }
}
