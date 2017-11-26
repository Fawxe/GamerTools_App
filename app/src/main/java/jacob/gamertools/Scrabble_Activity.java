package jacob.gamertools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Scrabble_Activity extends AppCompatActivity {
    Global_Variables variables = new Global_Variables();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrabble);
    }


    public void click_A(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+1;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("A");

    }

    public void click_B(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+3;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("B");

    }

    public void click_C(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+3;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("C");

    }

    public void click_D(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+2;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("D");

    }

    public void click_E(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+1;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("E");

    }

    public void click_F(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+4;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("F");

    }

    public void click_G(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+2;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("G");

    }

    public void click_H(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+4;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("H");

    }

    public void click_I(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+1;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("I");

    }

    public void click_J(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+8;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("J");

    }

    public void click_K(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+5;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("K");

    }

    public void click_L(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+1;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("L");

    }

    public void click_M(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+3;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("M");

    }

    public void click_N(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+1;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("N");

    }

    public void click_O(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+1;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("O");

    }

    public void click_P(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+3;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("P");

    }

    public void click_Q(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+10;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("Q");

    }

    public void click_R(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+1;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("R");

    }

    public void click_S(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+1;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("S");

    }

    public void click_T(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+1;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("T");

    }

    public void click_U(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+1;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("U");

    }

    public void click_V(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+4;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("V");

    }

    public void click_W(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+4;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("W");

    }

    public void click_X(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+8;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("X");

    }

    public void click_Y(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+4;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("Y");

    }

    public void click_Z(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score+10;

        Word_Score_Text.setText(Word_Score + "");
        Word_Text.append("Z");

    }

    public void click_WordX2(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score*2;

        Word_Score_Text.setText(Word_Score + "");

    }

    public void click_WordX3(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());

        Word_Score=Word_Score*3;

        Word_Score_Text.setText(Word_Score + "");

    }

    public void click_Confirm(View view) //increase score by minor value

    {
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Total_Score_Text=(TextView) findViewById(R.id.Total_Score_Num);
        TextView Word_Text = (TextView) findViewById(R.id.Word);

        int Word_Score = Integer.parseInt(Word_Score_Text.getText().toString());
        int Total_Score = Integer.parseInt(Total_Score_Text.getText().toString());

        Total_Score= Total_Score+Word_Score;

        Word_Text.setText("");
        Word_Score_Text.setText("0");
        Total_Score_Text.setText(Total_Score + "");

    }

    public void click_Clear(View view) //increase score by minor value

    {
        TextView Word_Text = (TextView) findViewById(R.id.Word);
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);


        Word_Text.setText("");
        Word_Score_Text.setText("0");

    }

    public void click_Reset(View view) //increase score by minor value

    {
        TextView Word_Text = (TextView) findViewById(R.id.Word);
        TextView Word_Score_Text = (TextView) findViewById(R.id.Word_Score_Num);
        TextView Total_Score_Text=(TextView) findViewById(R.id.Total_Score_Num);

        Word_Text.setText("");
        Word_Score_Text.setText("0");
        Total_Score_Text.setText("0");
    }


}
