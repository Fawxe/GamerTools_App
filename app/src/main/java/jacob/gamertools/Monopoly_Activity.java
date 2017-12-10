package jacob.gamertools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Monopoly_Activity extends AppCompatActivity {
    Global_Variables variables = new Global_Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monopoly);
    }


    public void click_Gain(View view)
    {
        TextView Money_Total = (TextView) findViewById(R.id.Money_Total);
        TextView Money_Change = (TextView) findViewById(R.id.Money_Change);
        TextView Dollar_1 = (TextView) findViewById(R.id.Dollar_1);
        TextView Dollar_5 = (TextView) findViewById(R.id.Dollar_5);
        TextView Dollar_10 = (TextView) findViewById(R.id.Dollar_10);
        TextView Dollar_20 = (TextView) findViewById(R.id.Dollar_20);
        TextView Dollar_50 = (TextView) findViewById(R.id.Dollar_50);
        TextView Dollar_100 = (TextView) findViewById(R.id.Dollar_100);
        TextView Dollar_500 = (TextView) findViewById(R.id.Dollar_500);
        TextView Dollar_1_Amount = (TextView) findViewById(R.id.Dollar_1_Amount);
        TextView Dollar_5_Amount = (TextView) findViewById(R.id.Dollar_5_Amount);
        TextView Dollar_10_Amount = (TextView) findViewById(R.id.Dollar_10_Amount);
        TextView Dollar_20_Amount = (TextView) findViewById(R.id.Dollar_20_Amount);
        TextView Dollar_50_Amount = (TextView) findViewById(R.id.Dollar_50_Amount);
        TextView Dollar_100_Amount = (TextView) findViewById(R.id.Dollar_100_Amount);
        TextView Dollar_500_Amount = (TextView) findViewById(R.id.Dollar_500_Amount);

        int Money_Change_Num;

        try {
            Money_Change_Num = Integer.parseInt(Money_Change.getText().toString());
        }catch(IllegalArgumentException e)                  //if invalid value, don't crash
        {Money_Change_Num=0;}

        int Money_Total_Num = Integer.parseInt(Money_Total.getText().toString());
        int Dollar_1_Num = Integer.parseInt(Dollar_1.getText().toString());
        int Dollar_5_Num = Integer.parseInt(Dollar_5.getText().toString());
        int Dollar_10_Num = Integer.parseInt(Dollar_10.getText().toString());
        int Dollar_20_Num = Integer.parseInt(Dollar_20.getText().toString());
        int Dollar_50_Num = Integer.parseInt(Dollar_50.getText().toString());
        int Dollar_100_Num = Integer.parseInt(Dollar_100.getText().toString());
        int Dollar_500_Num = Integer.parseInt(Dollar_500.getText().toString());
        int Dollar_1_Num_Amount = Integer.parseInt(Dollar_1_Amount.getText().toString());
        int Dollar_5_Num_Amount = Integer.parseInt(Dollar_5_Amount.getText().toString());
        int Dollar_10_Num_Amount = Integer.parseInt(Dollar_10_Amount.getText().toString());
        int Dollar_20_Num_Amount = Integer.parseInt(Dollar_20_Amount.getText().toString());
        int Dollar_50_Num_Amount = Integer.parseInt(Dollar_50_Amount.getText().toString());
        int Dollar_100_Num_Amount = Integer.parseInt(Dollar_100_Amount.getText().toString());
        int Dollar_500_Num_Amount = Integer.parseInt(Dollar_500_Amount.getText().toString());

        Money_Total.setText((Money_Total_Num+Money_Change_Num)+"");

        int left_over=Money_Change_Num;

        int new_500= left_over/500;
        left_over=left_over%500;
        Dollar_500_Amount.setText((Dollar_500_Num_Amount+new_500)+"");

        int new_100= left_over/100;
        left_over=left_over%100;
        Dollar_100_Amount.setText((Dollar_100_Num_Amount+new_100)+"");

        int new_50= left_over/50;
        left_over=left_over%50;
        Dollar_50_Amount.setText((Dollar_50_Num_Amount+new_50)+"");

        int new_20= left_over/20;
        left_over=left_over%20;
        Dollar_20_Amount.setText((Dollar_20_Num_Amount+new_20)+"");

        int new_10= left_over/10;
        left_over=left_over%10;
        Dollar_10_Amount.setText((Dollar_10_Num_Amount+new_10)+"");

        int new_5= left_over/5;
        left_over=left_over%5;
        Dollar_5_Amount.setText((Dollar_5_Num_Amount+new_5)+"");

        int new_1= left_over/1;
        left_over=left_over%1;
        Dollar_1_Amount.setText((Dollar_1_Num_Amount+new_1)+"");



    }

    public void click_Lose(View view)
    {
        TextView Money_Total = (TextView) findViewById(R.id.Money_Total);
        TextView Money_Change = (TextView) findViewById(R.id.Money_Change);
        TextView Dollar_1 = (TextView) findViewById(R.id.Dollar_1);
        TextView Dollar_5 = (TextView) findViewById(R.id.Dollar_5);
        TextView Dollar_10 = (TextView) findViewById(R.id.Dollar_10);
        TextView Dollar_20 = (TextView) findViewById(R.id.Dollar_20);
        TextView Dollar_50 = (TextView) findViewById(R.id.Dollar_50);
        TextView Dollar_100 = (TextView) findViewById(R.id.Dollar_100);
        TextView Dollar_500 = (TextView) findViewById(R.id.Dollar_500);
        TextView Dollar_1_Amount = (TextView) findViewById(R.id.Dollar_1_Amount);
        TextView Dollar_5_Amount = (TextView) findViewById(R.id.Dollar_5_Amount);
        TextView Dollar_10_Amount = (TextView) findViewById(R.id.Dollar_10_Amount);
        TextView Dollar_20_Amount = (TextView) findViewById(R.id.Dollar_20_Amount);
        TextView Dollar_50_Amount = (TextView) findViewById(R.id.Dollar_50_Amount);
        TextView Dollar_100_Amount = (TextView) findViewById(R.id.Dollar_100_Amount);
        TextView Dollar_500_Amount = (TextView) findViewById(R.id.Dollar_500_Amount);
        int Money_Change_Num;

try {
    Money_Change_Num = Integer.parseInt(Money_Change.getText().toString());
}catch(IllegalArgumentException e)                  //if invalid value, don't crash
{Money_Change_Num=0;}

        int Money_Total_Num = Integer.parseInt(Money_Total.getText().toString());
        int Dollar_1_Num = Integer.parseInt(Dollar_1.getText().toString());
        int Dollar_5_Num = Integer.parseInt(Dollar_5.getText().toString());
        int Dollar_10_Num = Integer.parseInt(Dollar_10.getText().toString());
        int Dollar_20_Num = Integer.parseInt(Dollar_20.getText().toString());
        int Dollar_50_Num = Integer.parseInt(Dollar_50.getText().toString());
        int Dollar_100_Num = Integer.parseInt(Dollar_100.getText().toString());
        int Dollar_500_Num = Integer.parseInt(Dollar_500.getText().toString());
        int Dollar_1_Num_Amount = Integer.parseInt(Dollar_1_Amount.getText().toString());
        int Dollar_5_Num_Amount = Integer.parseInt(Dollar_5_Amount.getText().toString());
        int Dollar_10_Num_Amount = Integer.parseInt(Dollar_10_Amount.getText().toString());
        int Dollar_20_Num_Amount = Integer.parseInt(Dollar_20_Amount.getText().toString());
        int Dollar_50_Num_Amount = Integer.parseInt(Dollar_50_Amount.getText().toString());
        int Dollar_100_Num_Amount = Integer.parseInt(Dollar_100_Amount.getText().toString());
        int Dollar_500_Num_Amount = Integer.parseInt(Dollar_500_Amount.getText().toString());

        if((Money_Total_Num - Money_Change_Num)<=0)
        {
            Money_Total.setText(("0"));
            Dollar_500_Amount.setText("0");
            Dollar_100_Amount.setText("0");
            Dollar_50_Amount.setText("0");
            Dollar_20_Amount.setText("0");
            Dollar_10_Amount.setText("0");
            Dollar_5_Amount.setText("0");
            Dollar_1_Amount.setText("0");
        }
        else{
        Money_Total.setText((Money_Total_Num - Money_Change_Num)+"");

        int left_over=Money_Change_Num;

        if(Dollar_500_Num_Amount>0) {
            int new_500 = left_over / 500;
            if(new_500<=Dollar_500_Num_Amount) {
                left_over = left_over % 500;
                Dollar_500_Amount.setText((Dollar_500_Num_Amount - new_500) + "");
            }
            else{
                left_over=left_over-(Dollar_500_Num_Amount*500);
                Dollar_500_Amount.setText("0");
            }
        }

        if (Dollar_100_Num_Amount > 0) {
            int new_100 = left_over / 100;
            if(new_100<=Dollar_100_Num_Amount) {
                left_over = left_over % 100;
                Dollar_100_Amount.setText((Dollar_100_Num_Amount - new_100) + "");
            }
            else{
                left_over=left_over-(Dollar_100_Num_Amount*100);
                Dollar_100_Amount.setText("0");
            }

        }

        if (Dollar_50_Num_Amount > 0) {
            int new_50 = left_over / 50;
            if(new_50<=Dollar_50_Num_Amount) {
                left_over = left_over % 50;
                Dollar_50_Amount.setText((Dollar_50_Num_Amount - new_50) + "");
            }
            else{
                left_over=left_over-(Dollar_50_Num_Amount*50);
                Dollar_50_Amount.setText("0");
            }
        }
        if (Dollar_20_Num_Amount > 0) {
            int new_20 = left_over / 20;
            if(new_20<=Dollar_20_Num_Amount) {
                left_over = left_over % 20;
                Dollar_20_Amount.setText((Dollar_20_Num_Amount - new_20) + "");
            }
            else{
                left_over=left_over-(Dollar_20_Num_Amount*20);
                Dollar_20_Amount.setText("0");
            }
        }

        if (Dollar_10_Num_Amount > 0) {
            int new_10 = left_over / 10;
            if(new_10<=Dollar_10_Num_Amount) {
                left_over = left_over % 10;
                Dollar_10_Amount.setText((Dollar_10_Num_Amount - new_10) + "");
            }
            else{
                left_over=left_over-(Dollar_10_Num_Amount*10);
                Dollar_10_Amount.setText("0");
            }
        }

        if (Dollar_5_Num_Amount > 0) {
            int new_5 = left_over / 5;
            if(new_5<=Dollar_5_Num_Amount) {
                left_over = left_over % 5;
                Dollar_5_Amount.setText((Dollar_5_Num_Amount - new_5) + "");
            }
            else{
                left_over=left_over-(Dollar_5_Num_Amount*5);
                Dollar_5_Amount.setText("0");
            }
        }

        if (Dollar_1_Num_Amount > 0) {
            int new_1 = left_over / 1;
            if(new_1<=Dollar_1_Num_Amount) {
                left_over = left_over % 1;
                Dollar_1_Amount.setText((Dollar_1_Num_Amount - new_1) + "");
            }
            else{
                left_over=left_over-(Dollar_1_Num_Amount*1);
                Dollar_1_Amount.setText("0");
            }
        }
        }
    }
}


