package jacob.gamertools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Score_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_);
    }

    public void click_Minor_Up(View view) //create an event for the strike button

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score++; //increments number of strikes

        Score_Text.setText(Score + "");

    }


    public void click_Major_Up(View view) //create an event for the strike button

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score=Score+10; //increments number of strikes

        Score_Text.setText(Score + "");

    }


    public void click_Minor_Down(View view) //create an event for the strike button

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score--; //increments number of strikes

        Score_Text.setText(Score + "");

    }
    public void click_Major_Down(View view) //create an event for the strike button

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score=Score-10; //increments number of strikes

        Score_Text.setText(Score + "");

    }
}
