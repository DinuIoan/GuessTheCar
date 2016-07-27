package dinuioan.guessthecar;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckedTextView;

/**
 * Created by Ioan.Dinu on 7/27/2016.
 */
public class Level1_1_Activity extends AppCompatActivity {
    //TODO de scos din baza de date numarul de hinturi
    private int hints = 0;
    private CheckedTextView checkedTextView = new CheckedTextView(this);
    private AlertDialog.Builder correctAnswer = new AlertDialog.Builder(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level1_1);
    }

    public void hintButton(){
        if(hints > 0){
            //TODO afiseaza hintul

            //TODO updateaza numarul de hinturi in baza de date hints = hints - 1
        }
        else{
            //TODO afiseaza "Nu mai ai hinturi"
        }


    }

    public void checkText(){
//        if(checkedTextView.getText().equals("test")){
//            checkedTextView.setChecked(true);
//            correctAnswer.setCancelable(true);
//            correctAnswer.setMessage("Correct Answer!");
//            correctAnswer.create().show();
        }
    }


}
