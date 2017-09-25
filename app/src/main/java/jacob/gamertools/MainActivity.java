package jacob.gamertools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setVisible(true);
    }

    public void click_Score(View view)//go to Scorekeeping screen on button click
    {
        startActivity(new Intent(MainActivity.this, Score_Activity.class));

    }

    public void click_Dice(View view) //go to Dice screen on button click
    {
        startActivity(new Intent(MainActivity.this, Dice_Activity.class));

    }

}
