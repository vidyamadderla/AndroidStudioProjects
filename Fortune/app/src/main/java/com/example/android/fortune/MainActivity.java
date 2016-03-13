package com.example.android.fortune;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String userName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.noun_button).setOnClickListener(this);

        }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.noun_button) {
            EditText name = (EditText) findViewById(R.id.user_name);
            userName = name.getText().toString();
            Intent intent = new Intent(this, SentenceDisplay.class);
            intent.putExtra(SentenceDisplay.EXTRA_USER_NAME, userName);
            startActivity(intent);
        }
    }
}
