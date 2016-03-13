package com.example.android.fortune;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SentenceDisplay extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_USER_NAME = "user_name";

    private Button btnToMainPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.line_display_layout);
        btnToMainPage = (Button) findViewById(R.id.main_page);
        btnToMainPage.setOnClickListener(this);
        String pickedString = getSentence(getRandomNumber());
        TextView finalView = (TextView) findViewById(R.id.final_display);
        String userName = getIntent().getStringExtra(EXTRA_USER_NAME);

        finalView.setText(userName +" " + pickedString);

    }
    public int getRandomNumber(){
        return new Random().nextInt(20);
    }


    public String getSentence(int number) {
        return getResources().getStringArray(R.array.pickLine)[number];
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.main_page)
            startActivity(new Intent(this, MainActivity.class));
    }
}
