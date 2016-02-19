package hlsg.com.smartphonesecurityapp;

/**
 * Created by GanniSatish on 15/02/16.
 */
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.List;

public class ColorSelect extends AppCompatActivity {

    Button save,clear,show;
    String hexValue = "",pin="";
    String C = null;
    String N=null;
    String P=null;
    ImageView color1, color2;
    ImageButton ib1,ib2,ib3,ib4,ib5,ib6,ib7;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
    EditText et1,et2,et3,et4,et5,et6,et7;

    DBHelperNew dbHelper1 = new DBHelperNew(this);
    ConfirmPassword cp=new ConfirmPassword();
    //private ArrayList<ColorPicker> colorPickerArray;
    //private ColorPicker colorPickerObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colorselect);

        //myDb=new DBHelper(this);

        //gridView = (GridView)findViewById(R.id.color_grid);
        save = (Button) findViewById(R.id.save);
        clear=(Button)findViewById(R.id.clear);
        show=(Button)findViewById(R.id.showPassword);
        color1 = (ImageView) findViewById(R.id.color1);

        //ImageButtons
        ib1=(ImageButton)findViewById(R.id.colorButton1);
        ib2=(ImageButton)findViewById(R.id.colorButton2);
        ib3=(ImageButton)findViewById(R.id.colorButton3);
        ib4=(ImageButton)findViewById(R.id.colorButton4);
        ib5=(ImageButton)findViewById(R.id.colorButton5);
        ib6=(ImageButton)findViewById(R.id.colorButton6);
        ib7=(ImageButton)findViewById(R.id.colorButton7);

        //intializeColorArray();
        //ColorPickerAdapter colorPickerAdapter = new ColorPickerAdapter(colorPickerArray);
        //gridView.setAdapter(colorPickerAdapter);

        //CheckBoxes
        cb1=(CheckBox)findViewById(R.id.colorcheckBox1);
        cb2=(CheckBox)findViewById(R.id.colorcheckBox2);
        cb3=(CheckBox)findViewById(R.id.colorcheckBox3);
        cb4=(CheckBox)findViewById(R.id.colorcheckBox4);
        cb5=(CheckBox)findViewById(R.id.colorcheckBox5);
        cb6=(CheckBox)findViewById(R.id.colorcheckBox6);
        cb7=(CheckBox)findViewById(R.id.colorcheckBox7);

        //EditTexts
        et1=(EditText)findViewById(R.id.colorText1);
        et2=(EditText)findViewById(R.id.colorText2);
        et3=(EditText)findViewById(R.id.colorText3);
        et4=(EditText)findViewById(R.id.colorText4);
        et5=(EditText)findViewById(R.id.colorText5);
        et6=(EditText)findViewById(R.id.colorText6);
        et7=(EditText)findViewById(R.id.colorText7);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cb1.isChecked()==true)
                {
                    ColorDrawable colorDrawable = (ColorDrawable) ib1.getBackground();
                    int colorId = colorDrawable.getColor();
                    hexValue = Integer.toHexString(colorId);
                    pin=et1.getText().toString();
                    Log.d("Selected color:", hexValue);
                    //textView.setTextColor(colorId);

                    dbHelper1.insertColors("Violet",hexValue,pin);
                }
                if(cb2.isChecked()==true)
                {
                    ColorDrawable colorDrawable = (ColorDrawable) ib2.getBackground();
                    int colorId = colorDrawable.getColor();
                    hexValue = Integer.toHexString(colorId);
                    pin=et2.getText().toString();
                    Log.d("Selected color:", hexValue);
                    //textView.setTextColor(colorId);

                    dbHelper1.insertColors("Indigo",hexValue,pin);
                }
                if(cb3.isChecked()==true)
                {
                    ColorDrawable colorDrawable = (ColorDrawable) ib3.getBackground();
                    int colorId = colorDrawable.getColor();
                    hexValue = Integer.toHexString(colorId);
                    pin=et3.getText().toString();
                    Log.d("Selected color:", hexValue);
                    //textView.setTextColor(colorId);

                    dbHelper1.insertColors("Blue",hexValue,pin);
                }
                if(cb4.isChecked()==true)
                {
                    ColorDrawable colorDrawable = (ColorDrawable) ib4.getBackground();
                    int colorId = colorDrawable.getColor();
                    hexValue = Integer.toHexString(colorId);
                    pin=et4.getText().toString();
                    Log.d("Selected color:", hexValue);
                    //textView.setTextColor(colorId);

                    dbHelper1.insertColors("Green",hexValue,pin);
                }
                if(cb5.isChecked()==true)
                {
                    ColorDrawable colorDrawable = (ColorDrawable) ib5.getBackground();
                    int colorId = colorDrawable.getColor();
                    hexValue = Integer.toHexString(colorId);
                    Log.d("Selected color:", hexValue);
                    pin=et5.getText().toString();
                    //textView.setTextColor(colorId);

                    dbHelper1.insertColors("Yellow",hexValue,pin);
                }
                if(cb6.isChecked()==true)
                {
                    ColorDrawable colorDrawable = (ColorDrawable) ib6.getBackground();
                    int colorId = colorDrawable.getColor();
                    hexValue = Integer.toHexString(colorId);
                    pin=et6.getText().toString();
                    Log.d("Selected color:", hexValue);
                    //textView.setTextColor(colorId);

                    dbHelper1.insertColors("Orange",hexValue,pin);
                }
                if(cb7.isChecked()==true)
                {
                    ColorDrawable colorDrawable = (ColorDrawable) ib7.getBackground();
                    int colorId = colorDrawable.getColor();
                    hexValue = Integer.toHexString(colorId);
                    pin=et7.getText().toString();
                    Log.d("Selected color:", hexValue);
                    //textView.setTextColor(colorId);

                    dbHelper1.insertColors("Red",hexValue,pin);
                }
                /*if (C.equals("ff0000ff")) {
                    color1.setImageResource(R.drawable.ff0000ff);
                }
                if (C.equals("ff4b0082")) {
                    color1.setImageResource(R.drawable.ff4b0082);
                }
                if (C.equals("ff008000")) {
                    color1.setImageResource(R.drawable.ff008000);
                }
                if (C.equals("ffee82ee")) {
                    color1.setImageResource(R.drawable.ffee82ee);
                }
                if (C.equals("ffff0000")) {
                    color1.setImageResource(R.drawable.ffff0000);
                }
                if (C.equals("ffffa500")) {
                    color1.setImageResource(R.drawable.ffffa500);
                }
                if (C.equals("ffffff00")) {
                    color1.setImageResource(R.drawable.ffffff00);
                }*/
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper1.delete();
            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ConfirmPassword.class);
                startActivity(intent);
                List<ColorValues> colorValues = dbHelper1.getDataOfColors();
                for (ColorValues cn : colorValues) {
                    C=cn.getID();
                    N=cn.getColorName();
                    P=cn.getPin();
                }
                cp.send(C);
            }
        });


    }
}
    /*private class ColorPickerAdapter extends BaseAdapter
    {
        ArrayList<ColorPicker> colorAdapterArray;
        public ColorPickerAdapter(ArrayList<ColorPicker> colorPickerArray)
        {
            super();
            this.colorAdapterArray = colorPickerArray;
        }
        @Override
        public int getCount()
        {
            return colorAdapterArray.size();
        }
        @Override
        public Object getItem(int arg0)
        {
            return colorAdapterArray.get(arg0);
        }
        @Override
        public long getItemId(int arg0)
        {
            return 0;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            getApplicationContext();
            LayoutInflater inflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View gridView ;
            ImageButton imageView=null;

            if (convertView == null)
            {
                gridView = inflater.inflate(R.layout.grid_component,null);
                imageView = (ImageButton)gridView.findViewById(R.id.color_image);
                final ImageButton finalImageView = imageView;
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ColorDrawable colorDrawable = (ColorDrawable) finalImageView.getBackground();
                        int colorId = colorDrawable.getColor();
                        hexValue = Integer.toHexString(colorId);
                        Log.d("Selected color:", hexValue);
                        textView = (TextView) findViewById(R.id.textView3);
                        textView.setTextColor(colorId);

                        dbHelper1.insertColors(hexValue);
                    }
                });*/
                //checkBox=(CheckBox)gridView.findViewById(R.id.checkBox);

                /*checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked)
                        {
                            numberOfCheckBoxes++;
                        }
                    }
                });
                editText=(EditText)gridView.findViewById(R.id.editText);*/
            //}
            /*else
            {
                gridView = (View)convertView;
            }
            final ColorPicker colorPicker = colorAdapterArray.get(position);
            int r = colorPicker.getRed();
            int g = colorPicker.getGreen();
            int b = colorPicker.getBlue();
            int alpha = colorPicker.getAlpha();
            if(imageView != null)
            {
                imageView.setBackgroundColor(Color.argb(alpha, r, g, b));
            }
            else
            {
                //do nothing
            }
            return gridView;
        }
    }*/
    /*private void intializeColorArray()
    {
        colorPickerArray = new ArrayList<ColorPicker>();
        colorPickerArray.add(new ColorPicker(238, 130, 238, 255));
        colorPickerArray.add(new ColorPicker(75,0,130,255));
        colorPickerArray.add(new ColorPicker(0,0,255,255));
        colorPickerArray.add(new ColorPicker(0,128,0,255));
        colorPickerArray.add(new ColorPicker(255,255,0,255));
        colorPickerArray.add(new ColorPicker(255,165,0,255));
        colorPickerArray.add(new ColorPicker(255, 0, 0, 255));
    }*/
    /*private static class StoreColor
    {
        public static int anInt=0;
        public void storeColor(int colorId)
        {
            int[] color=new int[4];
            color[anInt]=colorId;
            anInt++;
        }
    }*/
    /*public boolean insertColor(String Color_Name,int colorId)
    {

        SQLiteDatabase db = myDb.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("ColorName", Color_Name);
        contentValues.put("colorId", colorId);
        db.insert(myDb.COLOR_TABLE_NAME, null, contentValues);
        return true;
    }*/
