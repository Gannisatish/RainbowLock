package hlsg.com.smartphonesecurityapp;

/**
 * Created by GanniSatish on 16/02/16.
 */
public class ColorValues {

    String _id;
    String name;
    String pin;

    public ColorValues(){   }
    public ColorValues(String id){
        this._id = id;
    }
    public String getID(){
        return this._id;
    }

    public void setID(String id){
        this._id = id;
    }

    public String getColorName(){
        return this.name;
    }
    public void setColorName(String name) {
        this.name = name;
    }

    public String getPin(){
        return this.pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
}
