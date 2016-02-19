package hlsg.com.smartphonesecurityapp;

/**
 * Created by GanniSatish on 15/02/16.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by GanniSatish on 25/01/16.
 */
public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.setting);

            ListView listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1,
                    new String[] {"Color Selection", "App Selection", "Forgot Password"}));

            listView.setOnItemClickListener(new OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    // When clicked, show a toast with the TextView text Game, Help, Home
                    String sText = ((TextView) view).getText().toString();
                    Intent intent = null;
                    if(sText.equals("Color Selection"))
                        intent = new Intent(getBaseContext(),
                                ColorSelect.class);
                    //else if(sText.equals("Help")) ..........

                    if(intent != null)
                        startActivity(intent);

                    if(sText.equals("App Selection")) {
                        intent = new Intent(getBaseContext(), AppSelect.class);
                        startActivity(intent);
                    }
                    if(sText.equals("Forgot Password"))
                    {
                        intent= new Intent(getBaseContext(),ForgotPassword.class);
                        startActivity(intent);
                    }
                }
            });
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}