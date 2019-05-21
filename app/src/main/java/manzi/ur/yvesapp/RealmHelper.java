package manzi.ur.yvesapp;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class RealmHelper {

    Realm realm;

    public RealmHelper(Realm realm) {
        this.realm = realm;
    }

    public ArrayList<String> retrieve(){

        ArrayList<String> StudentNames= new ArrayList<>();

        RealmResults<Student> students= realm.where(Student.class).findAll();



       for (Student mystudent: students){
           StudentNames.add(mystudent.getFirstName());
       }



        return StudentNames;
    }
}
