package hlsg.com.smartphonesecurityapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by GanniSatish on 19/02/16.
 */
public class ConfirmPassword extends AppCompatActivity{

    ImageView im1,im2,im3,im4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm);

        im1=(ImageView)findViewById(R.id.image1);
        im2=(ImageView)findViewById(R.id.image2);
        im3=(ImageView)findViewById(R.id.image3);
        im4=(ImageView)findViewById(R.id.image4);
    }

    public void send(String Name) {
        if(Name.equals("Blue"))
        {
            im1.setImageResource(R.drawable.ff0000ff);
        }
    }
}
