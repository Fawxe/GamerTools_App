package jacob.gamertools;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setVisible(true);

        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);  //sets up persistent memory
        String preset_Players = sharedPref.getString(getString(R.string.preset_Players), "1");
        String preset_Players_2 = sharedPref.getString(getString(R.string.preset_Players), "1");
        String preset_Players_3 = sharedPref.getString(getString(R.string.preset_Players), "1");

    }

    public void click_Score(View view)//go to Scorekeeping screen on button click
    {
        String[] playerArray = {"1","2","3","4"};


        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("How Many Players?");
        alertDialogBuilder.setItems(playerArray, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {

                if(which==0)
                {
                    startActivity(new Intent(MainActivity.this, Score_Activity.class));
                }

                else if(which==1)
                {
                    startActivity(new Intent(MainActivity.this, Score_Activity_2.class));
                }

                else if(which==2)
                {
                    startActivity(new Intent(MainActivity.this, Score_Activity_3.class));
                }

                else if(which==3)
                {
                    startActivity(new Intent(MainActivity.this, Score_Activity_4.class));
                }
/*
                else if(which==4)
                {
                    startActivity(new Intent(MainActivity.this, Score_Activity_5.class));
                }


                else if(which==5)
                {
                    startActivity(new Intent(MainActivity.this, Score_Activity_6.class));
                }
*/
                else
                {
                    startActivity(new Intent(MainActivity.this, Score_Activity.class));
                }

            }});


        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }


    public void click_Dice(View view) //go to Dice screen on button click
    {
        startActivity(new Intent(MainActivity.this, Dice_Activity.class));

    }








}
