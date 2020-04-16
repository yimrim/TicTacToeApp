package de.ylcoding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.b0);
        b0.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent main_to_tictactoe = new Intent(this,TicTacToe.class);
        startActivity(main_to_tictactoe);
        this.finish();
    }
}
