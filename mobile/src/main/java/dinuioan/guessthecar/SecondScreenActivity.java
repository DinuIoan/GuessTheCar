package dinuioan.guessthecar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
    }

    public void back(View view){
        Intent i = new Intent(SecondScreenActivity.this, MainActivity.class);
        startActivity(i);
    }

    public void level1(View view)
    {
        Intent i = new Intent(SecondScreenActivity.this, Level1Activity.class);
        startActivity(i);
    }
}
