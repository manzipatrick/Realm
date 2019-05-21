package manzi.ur.yvesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import io.realm.Realm;

public class Result extends AppCompatActivity {

    ListView listView;
    ArrayAdapter adapter;
    ArrayList<String> students;
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        listView= (ListView)findViewById(R.id.lv);
        realm= Realm.getDefaultInstance();

        RealmHelper helper = new RealmHelper(realm);
        students= helper.retrieve();

        adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,students);
        listView.setAdapter(adapter);
    }
}
