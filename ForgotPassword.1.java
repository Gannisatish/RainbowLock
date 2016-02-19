package hlsg.com.smartphonesecurityapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

/**
 * Created by GanniSatish on 16/02/16.
 */
public class ForgotPassword extends AppCompatActivity{

    EditText secQuest,answer,phoneNum;
    TextView quest,answer1,num;
    Button save,show,reset;
    DBHelper dbHelper=new DBHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot);

        secQuest=(EditText)findViewById(R.id.secQuestion);
        answer=(EditText)findViewById(R.id.answer);
        phoneNum=(EditText)findViewById(R.id.phoneNum);
        save=(Button)findViewById(R.id.saveQuest);
        show=(Button)findViewById(R.id.show);
        reset=(Button)findViewById(R.id.reset);

        quest=(TextView)findViewById(R.id.q);
        answer1=(TextView)findViewById(R.id.a);
        num=(TextView)findViewById(R.id.n);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quest=secQuest.getText().toString();
                String ans=answer.getText().toString();
                String number=phoneNum.getText().toString();

                dbHelper.addQuestions(quest,ans,number);
            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Questions> questions = dbHelper.getData();

                String Q = null;
                String N = null;
                String A = null;
                for (Questions cn : questions) {
                    String log = "Id: " + cn.getID() + " ,Name: " + cn.getName() + " ,Phone: " +
                            cn.getPhoneNumber();
                    // Writing Contacts to log
                    Log.d("Name: ", log);
                    Q = cn.getID();
                    A = cn.getName();
                    N = cn.getPhoneNumber();
                }
                quest.setText(Q);
                answer1.setText(A);
                num.setText(N);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secQuest.setText("");
                answer.setText("");
                phoneNum.setText("");
                dbHelper.delete();
            }
        });
    }
}
