package jacob.gamertools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Score_Activity_3 extends AppCompatActivity {
    Global_Variables variables = new Global_Variables();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_3);
    }


    public void click_Options_Tab_3(View view)
    {
        findViewById(R.id.Score_Layout_3).setVisibility(View.GONE);
        findViewById(R.id.Options_Layout_3).setVisibility(View.VISIBLE);
    }

    public void click_Counter_Tab_3(View view)
    {
        findViewById(R.id.Score_Layout_3).setVisibility(View.VISIBLE);
        findViewById(R.id.Options_Layout_3).setVisibility(View.GONE);
    }


    public void click_Accept_Button(View view)
    {
        TextView Major_Increase_Value = (TextView) findViewById(R.id.Major_Increase);
        int Major_Increase = Integer.parseInt(Major_Increase_Value.getText().toString());

        variables.setLarge_increase(Major_Increase);


        TextView Major_Decrease_Value = (TextView) findViewById(R.id.Major_Decrease);
        int Major_Decrease = Integer.parseInt(Major_Decrease_Value.getText().toString());

        variables.setLarge_decrease(Major_Decrease);

        TextView Minor_Decrease_Value = (TextView) findViewById(R.id.Minor_Decrease);
        int Minor_Decrease = Integer.parseInt(Minor_Decrease_Value.getText().toString());

        variables.setSmall_decrease(Minor_Decrease);

        TextView Minor_Increase_Value = (TextView) findViewById(R.id.Minor_Increase);
        int Minor_Increase = Integer.parseInt(Minor_Increase_Value.getText().toString());

        variables.setSmall_increase(Minor_Increase);

    }


    public void click_Minor_Up(View view) //increase score by minor value

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score= Score+variables.getSmall_increase();

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

    public void click_Minor_Up_2(View view) //increase score by minor value

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text_2);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score=Score+variables.getSmall_increase();

        Score_Text.setText(Score + "");

    }


    public void click_Major_Up_2(View view) //increase score by major value

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text_2);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score=Score+variables.getLarge_increase();

        Score_Text.setText(Score + "");

    }


    public void click_Minor_Down_2(View view) //decrease score by minor value

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text_2);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score=Score-variables.getSmall_decrease();

        Score_Text.setText(Score + "");

    }
    public void click_Major_Down_2(View view) //decrease score by major value

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text_2);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score=Score-variables.getLarge_decrease();

        Score_Text.setText(Score + "");

    }

    public void click_Minor_Up_3(View view) //increase score by minor value

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text_3);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score=Score+variables.getSmall_increase();

        Score_Text.setText(Score + "");

    }


    public void click_Major_Up_3(View view) //increase score by major value

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text_3);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score=Score+variables.getLarge_increase();

        Score_Text.setText(Score + "");

    }


    public void click_Minor_Down_3(View view) //decrease score by minor value

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text_3);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score=Score-variables.getSmall_decrease();

        Score_Text.setText(Score + "");

    }
    public void click_Major_Down_3(View view) //decrease score by major value

    {
        TextView Score_Text = (TextView) findViewById(R.id.Score_Text_3);
        int Score = Integer.parseInt(Score_Text.getText().toString());

        Score=Score-variables.getLarge_decrease();

        Score_Text.setText(Score + "");

    }


}
