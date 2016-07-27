package dinuioan.guessthecar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Level1Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
    }

    public void back(View view){
        Intent i = new Intent(Level1Activity.this, SecondScreenActivity.class);
        startActivity(i);
    }


    public void picture1(View view){
        Intent i = new Intent(Level1Activity.this, Level1_1_Activity.class);
        startActivity(i);
    }


}
