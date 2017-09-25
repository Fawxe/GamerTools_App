package jacob.gamertools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        TextView Dice_Count = (TextView) findViewById(R.id.Dice_Number);
        dice = Integer.parseInt(Dice_Count.getText().toString());

        TextView Side_Count = (TextView) findViewById(R.id.Side_Number);
        sides = Integer.parseInt(Side_Count.getText().toString());

        int max=sides*dice;  //the highest possible dice roll is the number of dice times their highest possible value

        Random rand = new Random(System.currentTimeMillis());  //RNG based on current Millisecond
        int result= rand.nextInt(max)+dice;

        TextView Roll_Result = (TextView) findViewById(R.id.Roll_Result); //show result

        Roll_Result.setText(result + ""); //convert number to string

    }
}
