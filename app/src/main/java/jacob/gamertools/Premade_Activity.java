package jacob.gamertools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Premade_Activity extends AppCompatActivity {
    Global_Variables variables = new Global_Variables();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premade);
    }

    public void click_Scrabble_Button(View view) //go to Dice screen on button click
    {
        startActivity(new Intent(Premade_Activity.this, Scrabble_Activity.class));

    }

    public void click_Monopoly_Button(View view) //go to Dice screen on button click
    {
        startActivity(new Intent(Premade_Activity.this, Monopoly_Activity.class));

    }

    public void click_MTG_Button(View view) //go to Dice screen on button click
    {
        startActivity(new Intent(Premade_Activity.this, MTG_Activity.class));

    }

    public void click_Yugioh_Button(View view) //go to Dice screen on button click
    {
        startActivity(new Intent(Premade_Activity.this, Yugioh_Activity.class));

    }

}
