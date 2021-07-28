package Mohammad.Najm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton;


        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton = (Button) findViewById(R.id.roll_button);

        final ImageView leftDice = (ImageView) findViewById(R.id.diceimage1);
        final ImageView rightDice = (ImageView) findViewById(R.id.diceimage_2);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","A button has been pressed!");
                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);
                int number_right = randomNumberGenerator.nextInt(6);

                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[number_right]);



                Log.d("Dicee","Ze Number iz:"+number);
                Log.d("Dicee" , "Ze second dice number is:"+number_right);
            }
        });

    }
}