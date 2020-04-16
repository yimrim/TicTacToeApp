package de.ylcoding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class TicTacToe extends AppCompatActivity implements View.OnClickListener {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b10;
    private ImageView iv1;
    private boolean yellow = true;
    private String[] speicher = new String[9];
    //private Button[] buttonArray = {b1, b2, b3, b4, b5, b6, b7, b8, b9};
    //private int klickzähler = 0;
    // Gewinnabfrage programmieren, dp werte nehmen weil anpassbar


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.b10);
        iv1 = findViewById(R.id.imageView3);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent tictactoe_to_main = new Intent(this, MainActivity.class);
        startActivity(tictactoe_to_main);
        this.finish();


    }


    public void eingabesperre(boolean clickability) {
        b1.setClickable(clickability);
        b2.setClickable(clickability);
        b3.setClickable(clickability);
        b4.setClickable(clickability);
        b5.setClickable(clickability);
        b6.setClickable(clickability);
        b7.setClickable(clickability);
        b8.setClickable(clickability);
        b9.setClickable(clickability);
    }


    public void gewinnabfrage() {
        //Toast message set before win
        Toast tuerkgewinn = Toast.makeText(getApplicationContext(), "Türkis gewinnt!", Toast.LENGTH_LONG);
        Toast gelbgewinn = Toast.makeText(getApplicationContext(), "Gelb gewinnt!", Toast.LENGTH_LONG);


        String zwischenspeicher_w1 = speicher[0] + speicher[1] + speicher[2];
        String zwischenspeicher_w2 = speicher[3] + speicher[4] + speicher[5];
        String zwischenspeicher_w3 = speicher[6] + speicher[7] + speicher[8];

        String zwischenspeicher_h1 = speicher[0] + speicher[3] + speicher[6];
        String zwischenspeicher_h2 = speicher[1] + speicher[4] + speicher[7];
        String zwischenspeicher_h3 = speicher[2] + speicher[5] + speicher[8];

        String zwischenspeicher_asc = speicher[6] + speicher[4] + speicher[2];
        String zwischenspeicher_des = speicher[0] + speicher[4] + speicher[8];


        if (zwischenspeicher_w1.equals("xxx") || zwischenspeicher_w2.equals("xxx") || zwischenspeicher_w3.equals("xxx")) {//horizontal x
            tuerkgewinn.show();
            eingabesperre(false);
        } else if (zwischenspeicher_w1.equals("ooo") || zwischenspeicher_w2.equals("ooo") || zwischenspeicher_w3.equals("ooo")) {//horizontal o
            gelbgewinn.show();
            eingabesperre(false);
        } else if (zwischenspeicher_h1.equals("xxx") || zwischenspeicher_h2.equals("xxx") || zwischenspeicher_h3.equals("xxx")) {//vertikal x
            tuerkgewinn.show();
            eingabesperre(false);
        } else if (zwischenspeicher_h1.equals("ooo") || zwischenspeicher_h2.equals("ooo") || zwischenspeicher_h3.equals("ooo")) {//vertikal o
            gelbgewinn.show();
            eingabesperre(false);
        } else if (zwischenspeicher_asc.equals("xxx")) {//aufsteigend x
            tuerkgewinn.show();
            eingabesperre(false);
        } else if (zwischenspeicher_asc.equals("ooo")) {//aufsteigend o
            gelbgewinn.show();
            eingabesperre(false);
        } else if (zwischenspeicher_des.equals("xxx")) {//absteigend x
            tuerkgewinn.show();
            eingabesperre(false);
        } else if (zwischenspeicher_des.equals("ooo")) {//absteigend o
            gelbgewinn.show();
            eingabesperre(false);
        }


    }

    //gewinnermittlung schreiben
    //gelb= o
    //türkis=x
    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.b1:
                b1.setClickable(false);
                if (yellow) {
                    b1.setBackgroundResource(R.color.yellow);
                    speicher[0] = "o";
                    yellow = false;
                    iv1.setImageResource(R.color.tuerkis);

                } else {
                    b1.setBackgroundResource(R.color.tuerkis);
                    speicher[0] = "x";
                    yellow = true;
                    iv1.setImageResource(R.color.yellow);

                }
                gewinnabfrage();

                break;
            case R.id.b2:
                b2.setClickable(false);
                if (yellow) {
                    b2.setBackgroundResource(R.color.yellow);
                    speicher[1] = "o";
                    yellow = false;
                    iv1.setImageResource(R.color.tuerkis);

                } else {
                    b2.setBackgroundResource(R.color.tuerkis);
                    speicher[1] = "x";
                    yellow = true;
                    iv1.setImageResource(R.color.yellow);

                }
                gewinnabfrage();
                break;
            case R.id.b3:
                b3.setClickable(false);
                if (yellow) {
                    b3.setBackgroundResource(R.color.yellow);
                    speicher[2] = "o";
                    yellow = false;
                    iv1.setImageResource(R.color.tuerkis);

                } else {
                    b3.setBackgroundResource(R.color.tuerkis);
                    speicher[2] = "x";
                    yellow = true;
                    iv1.setImageResource(R.color.yellow);

                }
                gewinnabfrage();
                break;
            case R.id.b4:
                b4.setClickable(false);
                if (yellow) {
                    b4.setBackgroundResource(R.color.yellow);
                    speicher[3] = "o";
                    yellow = false;
                    iv1.setImageResource(R.color.tuerkis);

                } else {
                    b4.setBackgroundResource(R.color.tuerkis);
                    speicher[3] = "x";
                    yellow = true;
                    iv1.setImageResource(R.color.yellow);

                }
                gewinnabfrage();
                break;
            case R.id.b5:
                b5.setClickable(false);
                if (yellow) {
                    b5.setBackgroundResource(R.color.yellow);
                    speicher[4] = "o";
                    yellow = false;
                    iv1.setImageResource(R.color.tuerkis);

                } else {
                    b5.setBackgroundResource(R.color.tuerkis);
                    speicher[4] = "x";
                    yellow = true;
                    iv1.setImageResource(R.color.yellow);

                }
                gewinnabfrage();
                break;
            case R.id.b6:
                b6.setClickable(false);
                if (yellow) {
                    b6.setBackgroundResource(R.color.yellow);
                    speicher[5] = "o";
                    yellow = false;
                    iv1.setImageResource(R.color.tuerkis);

                } else {
                    b6.setBackgroundResource(R.color.tuerkis);
                    speicher[5] = "x";
                    yellow = true;
                    iv1.setImageResource(R.color.yellow);

                }
                gewinnabfrage();
                break;
            case R.id.b7:
                b7.setClickable(false);
                if (yellow) {
                    b7.setBackgroundResource(R.color.yellow);
                    speicher[6] = "o";
                    yellow = false;
                    iv1.setImageResource(R.color.tuerkis);

                } else {
                    b7.setBackgroundResource(R.color.tuerkis);
                    speicher[6] = "x";
                    yellow = true;
                    iv1.setImageResource(R.color.yellow);

                }
                gewinnabfrage();
                break;
            case R.id.b8:
                b8.setClickable(false);
                if (yellow) {
                    b8.setBackgroundResource(R.color.yellow);
                    speicher[7] = "o";
                    yellow = false;
                    iv1.setImageResource(R.color.tuerkis);

                } else {
                    b8.setBackgroundResource(R.color.tuerkis);
                    speicher[7] = "x";
                    yellow = true;
                    iv1.setImageResource(R.color.yellow);

                }
                gewinnabfrage();
                break;
            case R.id.b9:
                b9.setClickable(false);
                if (yellow) {
                    b9.setBackgroundResource(R.color.yellow);
                    speicher[8] = "o";
                    yellow = false;
                    iv1.setImageResource(R.color.tuerkis);

                } else {
                    b9.setBackgroundResource(R.color.tuerkis);
                    speicher[8] = "x";
                    yellow = true;
                    iv1.setImageResource(R.color.yellow);

                }
                gewinnabfrage();
                break;
            case R.id.b10:
                b1.setBackgroundResource(R.color.light_grey);
                b2.setBackgroundResource(R.color.light_grey);
                b3.setBackgroundResource(R.color.light_grey);
                b4.setBackgroundResource(R.color.light_grey);
                b5.setBackgroundResource(R.color.light_grey);
                b6.setBackgroundResource(R.color.light_grey);
                b7.setBackgroundResource(R.color.light_grey);
                b8.setBackgroundResource(R.color.light_grey);
                b9.setBackgroundResource(R.color.light_grey);
                eingabesperre(true);
                for (int i = 0; i < speicher.length; i++) {
                    speicher[i] = "";
                }
                break;


        }

    }

}

