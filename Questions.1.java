package hlsg.com.smartphonesecurityapp;

/**
 * Created by GanniSatish on 16/02/16.
 */
public class Questions {
    String _id;
    String _name;
    String _phone_number;
    public Questions(){   }
    public Questions(String id, String name, String _phone_number){
        this._id = id;
        this._name = name;
        this._phone_number = _phone_number;
    }

    public Questions(String name, String _phone_number){
        this._name = name;
        this._phone_number = _phone_number;
    }
    public String getID(){
        return this._id;
    }

    public void setID(String id){
        this._id = id;
    }

    public String getName(){
        return this._name;
    }

    public void setName(String name){
        this._name = name;
    }

    public String getPhoneNumber(){
        return this._phone_number;
    }

    public void setPhoneNumber(String phone_number){
        this._phone_number = phone_number;
    }
}
