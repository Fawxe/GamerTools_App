package jacob.gamertools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Score_Activity extends AppCompatActivity {
    Global_Variables variables = new Global_Variables();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_);


        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);  //sets up persistent memory
        int Minor_Up = sharedPref.getInt("Minor_Up", 1);
        int Major_Up = sharedPref.getInt("Major_Up", 10);
        int Minor_Down = sharedPref.getInt("Minor_Down", 1);
        int Major_Down = sharedPref.getInt("Major_Down", 10);

        variables.setLarge_decrease(Major_Down);
        variables.setLarge_increase(Major_Up);
        variables.setSmall_increase(Minor_Up);
        variables.setSmall_decrease(Minor_Down);
    }





    public void click_Values_Tab(View view)
    {
        findViewById(R.id.Major_Increase).setVisibility(View.VISIBLE);
        findViewById(R.id.Minor_Increase).setVisibility(View.VISIBLE);
        findViewById(R.id.Major_Decrease).setVisibility(View.VISIBLE);
        findViewById(R.id.Minor_Decrease).setVisibility(View.VISIBLE);
        findViewById(R.id.Value_Change_Button).setVisibility(View.VISIBLE);

        findViewById(R.id.major_Down_Button).setVisibility(View.INVISIBLE);
        findViewById(R.id.major_Up_Button).setVisibility(View.INVISIBLE);
        findViewById(R.id.minor_Down_Button).setVisibility(View.INVISIBLE);
        findViewById(R.id.minor_Up_Button).setVisibility(View.INVISIBLE);
        findViewById(R.id.Score_Text).setVisibility(View.INVISIBLE);
    }

    public void click_Options_Tab(View view)
    {
        findViewById(R.id.Score_Layout).setVisibility(View.GONE);
        findViewById(R.id.Options_Layout).setVisibility(View.VISIBLE);
    }

    public void click_Counter_Tab(View view)
    {
        findViewById(R.id.Score_Layout).setVisibility(View.VISIBLE);
        findViewById(R.id.Options_Layout).setVisibility(View.GONE);
    }


    public void click_Accept_Button(View view)
    {
        try {
            TextView Major_Increase_Value = (TextView) findViewById(R.id.Major_Increase);
            int Major_Increase = Integer.parseInt(Major_Increase_Value.getText().toString());

            variables.setLarge_increase(Major_Increase);
        }catch(IllegalArgumentException e)
        {}

        try{
            TextView Major_Decrease_Value = (TextView) findViewById(R.id.Major_Decrease);
            int Major_Decrease = Integer.parseInt(Major_Decrease_Value.getText().toString());

            variables.setLarge_decrease(Major_Decrease);
        }catch(IllegalArgumentException e)
        {}

        try{
            TextView Minor_Decrease_Value = (TextView) findViewById(R.id.Minor_Decrease);
            int Minor_Decrease = Integer.parseInt(Minor_Decrease_Value.getText().toString());

            variables.setSmall_decrease(Minor_Decrease);
        }catch(IllegalArgumentException e)
        {}

        try{
            TextView Minor_Increase_Value = (TextView) findViewById(R.id.Minor_Increase);
            int Minor_Increase = Integer.parseInt(Minor_Increase_Value.getText().toString());

            variables.setSmall_increase(Minor_Increase);
        }catch(IllegalArgumentException e)
        {}

        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Changes Made Successfully");
        alertDialogBuilder.setMessage("Changes Made Successfully");
        alertDialogBuilder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();


        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("Major_Down", variables.getLarge_decrease());
        editor.putInt("Major_Up", variables.getLarge_increase());
        editor.putInt("Minor_Down", variables.getSmall_decrease());
        editor.putInt("Minor_Up", variables.getSmall_increase());
        editor.commit();


    }

    public void click_Preset(View view)//go to Scorekeeping screen on button click
    {
        String[] choiceArray = {"Save Preset","Load Preset"};


        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("What would you like to do?");
        alertDialogBuilder.setItems(choiceArray, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {

                if(which==0)
                {
                    SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putInt("Major_Down", variables.getLarge_decrease());
                    editor.putInt("Major_Up", variables.getLarge_increase());
                    editor.putInt("Minor_Down", variables.getSmall_decrease());
                    editor.putInt("Minor_Up", variables.getSmall_increase());
                    editor.commit();
                }

                else if(which==1)
                {
                    SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);  //sets up persistent memory
                    int Minor_Up = sharedPref.getInt("Minor_Up_Preset", 1);
                    int Major_Up = sharedPref.getInt("Major_Up_Preset", 10);
                    int Minor_Down = sharedPref.getInt("Minor_Down_Preset", 1);
                    int Major_Down = sharedPref.getInt("Major_Down_Preset", 10);

                    variables.setLarge_decrease(Major_Down);
                    variables.setLarge_increase(Major_Up);
                    variables.setSmall_increase(Minor_Up);
                    variables.setSmall_decrease(Minor_Down);
                }
                else
                {}

            }});


        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }


    public void click_Minor_Up(View view) //increase score by minor value

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score= Score+ variables.getSmall_increase();

        Score_Text.setText(Score + "");

    }


    public void click_Major_Up(View view) //increase score by major value

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text);
        int Score = Integer.parseInt(Score_Text.getText().toString());



        Score=Score+variables.getLarge_increase();

        Score_Text.setText(Score + "");

    }


    public void click_Minor_Down(View view) //decrease score by minor value

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score=Score-variables.getSmall_decrease();

        Score_Text.setText(Score + "");

    }
    public void click_Major_Down(View view) //decrease score by major value

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score=Score-variables.getLarge_decrease();

        Score_Text.setText(Score + "");

    }
}
