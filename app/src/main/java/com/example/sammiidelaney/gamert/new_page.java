package com.example.sammiidelaney.gamert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class new_page extends AppCompatActivity {
    private Button addToLibrary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_page);

        addToLibrary= (Button) findViewById(R.id.button23);
        addToLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfilePage();
            }
        });
    }

    public void openProfilePage(){
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
}
