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
        int sides=6;
        int dice=1;

        TextView Dice_Count = (TextView) findViewById(R.id.Dice_Number);
        dice = Integer.parseInt(Dice_Count.getText().toString());

        TextView Side_Count = (TextView) findViewById(R.id.Side_Number);
        sides = Integer.parseInt(Side_Count.getText().toString());

        int max=sides*dice;

        Random rand = new Random(System.currentTimeMillis());
        int result= rand.nextInt(max)+dice;

        TextView Roll_Result = (TextView) findViewById(R.id.Roll_Result);

        Roll_Result.setText(result + "");

    }
}
