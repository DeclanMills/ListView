package org.me.gcu.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RelativeLayout relativeLayout;
    Button redButton, greenButton, blueButton, endButton;
    ListView bullshit;
    String colours[] = { "Red", "Green", "Blue"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bullshit = findViewById(R.id.list);
        redButton = findViewById(R.id.red);
        relativeLayout = findViewById(R.id.rl);
        greenButton = findViewById(R.id.green);
        blueButton = findViewById(R.id.blue);
        endButton = findViewById(R.id.end);

        ArrayAdapter<String> arr;

        arr = new ArrayAdapter<String>(
                this,
                com.google.android.material.R.layout.support_simple_spinner_dropdown_item,
                colours
        );

        bullshit.setAdapter(arr);

        bullshit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = (String) adapterView.getItemAtPosition(i);
                if(selectedItem == "Red"){
                    relativeLayout.setBackgroundResource(R.color.Red);
                    Toast.makeText(MainActivity.this, "Changed to Red", Toast.LENGTH_SHORT).show();
                } else if (selectedItem == "Green") {
                    relativeLayout.setBackgroundResource(R.color.Green);
                    Toast.makeText(MainActivity.this, "Changed to Green", Toast.LENGTH_SHORT).show();
                } else if (selectedItem == "Blue") {
                    relativeLayout.setBackgroundResource(R.color.Blue);
                    Toast.makeText(MainActivity.this, "Changed to Blue", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "How the fuck u get there bro", Toast.LENGTH_SHORT).show();
                }
            }
        });


                redButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        relativeLayout.setBackgroundResource(R.color.Red);
                        Toast.makeText(MainActivity.this, "Changed to Red", Toast.LENGTH_SHORT).show();
                    }
                });

        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout.setBackgroundResource(R.color.Green);
                Toast.makeText(MainActivity.this, "Changed to Green", Toast.LENGTH_SHORT).show();
            }
        });

        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout.setBackgroundResource(R.color.Blue);
                Toast.makeText(MainActivity.this, "Changed to Blue", Toast.LENGTH_SHORT).show();
            }
        });

        endButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(1);
            }
        });


    }

    @Override
    public void onClick(View view) {

    }
}