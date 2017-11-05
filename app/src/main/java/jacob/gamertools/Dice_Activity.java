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
        try {
            TextView Dice_Count = (TextView) findViewById(R.id.Dice_Number);
            if(Dice_Count.getText().length()>9)
            {dice=0;}
            else {
                dice = Integer.parseInt(Dice_Count.getText().toString());
            }
            TextView Side_Count = (TextView) findViewById(R.id.Side_Number);
            if(Side_Count.getText().length()>9)
            {sides=0;}
            else {
                sides = Integer.parseInt(Side_Count.getText().toString());
            }
            int max=0;
            if (dice != 0 && Math.abs(sides) > Math.abs(Long.MAX_VALUE / dice))
            {
                throw new ArithmeticException();
            }  //the highest possible dice roll is the number of dice times their highest possible value

            else
                max=dice*sides;

            Random rand = new Random(System.currentTimeMillis());  //RNG based on current Millisecond
            result = rand.nextInt(max) + dice;
        } catch(ArithmeticException e)
        {}
        TextView Roll_Result = (TextView) findViewById(R.id.Roll_Result); //show result

        Roll_Result.setText(result + ""); //convert number to string

        TextView BackLog = (TextView) findViewById(R.id.BackLog_Text);
        String BackLog_Text= (String) BackLog.getText();
        BackLog.setText(BackLog_Text+result+"\n");
    }
}
