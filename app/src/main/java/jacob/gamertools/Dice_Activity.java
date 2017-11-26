package jacob.gamertools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Random;

public class Dice_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_);
    }

    public void onRoll(View view)
    {
        int sides=6;  //default numbers
        int dice=1;
        int result=0;
        int max=6;
        boolean overflow=false;
        try {
            TextView Dice_Count = (TextView) findViewById(R.id.Dice_Number);
            if(Dice_Count.getText().length()>9)
            {
                dice=1;
                overflow=true;
            }                                  //////////////
            else {
                dice = Integer.parseInt(Dice_Count.getText().toString());
            }
            TextView Side_Count = (TextView) findViewById(R.id.Side_Number);
            if(Side_Count.getText().length()>9)
            {
                sides=1;
                overflow=true;
            }                                ///////////////
            else {
                sides = Integer.parseInt(Side_Count.getText().toString());
            }

            long longDice=((long) dice);
            long longSides=((long) sides);
            long test=longDice*longSides;
            if (test>Integer.MAX_VALUE)
            {
                overflow=true;
            }
            else
                max=dice*sides;

            Random rand = new Random(System.currentTimeMillis());  //RNG based on current Millisecond
            result = rand.nextInt(max-dice+1) + dice;
        } catch(ArithmeticException e)
        {
            overflow=true;
            return;
        }
        TextView Roll_Result = (TextView) findViewById(R.id.Roll_Result); //show result
        Roll_Result.setText(result + ""); //convert number to string
        if(overflow)
        {
            Roll_Result.setText("Error:Result too large.");
        }

        TextView BackLog = (TextView) findViewById(R.id.BackLog_Text);
        String BackLog_Text= (String) BackLog.getText();
        BackLog.setText(BackLog_Text+"\n"+result);


        if (dice==2)
        {
            if(result==2||result==12)
            {
                Roll_Result.append("\n Double!");
            }

            }
            if(result==4||result==10) {
                Random rand = new Random(System.currentTimeMillis());  //RNG based on current Millisecond
                result = rand.nextInt(10) + dice;
                if (result > 6) {
                    Roll_Result.append("\n Double!");
                }
            }

                if(result==6||result==8)
            {
                Random rand = new Random(System.currentTimeMillis());  //RNG based on current Millisecond
                result = rand.nextInt(10) + dice;
                if (result>10)
                {
                    Roll_Result.append("\n Double!");
                }
            }
        }


    }
