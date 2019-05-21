package manzi.ur.yvesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    EditText etregnumber, etfname, etlname;
    Button btnsave,btnshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etregnumber= (EditText)findViewById(R.id.etregnumber);
        etfname= (EditText)findViewById(R.id.etfname);
        etlname= (EditText)findViewById(R.id.etlnane);
        btnsave=(Button)findViewById(R.id.btnsave);
        btnshow=(Button)findViewById(R.id.btnshow);

        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Result.class);
                startActivity(i);
            }
        });

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Realm realm = Realm.getDefaultInstance();

                int regNumber= Integer.parseInt(etregnumber.getText().toString());
                String firstName= etfname.getText().toString();
                String lastName= etlname.getText().toString();

                realm.beginTransaction();

                Student student= realm.createObject(Student.class);

                student.setRegNumber(regNumber);
                student.setFirstName(firstName);
                student.setLastName(lastName);

                realm.commitTransaction();

                Toast.makeText(MainActivity.this,"Data saved Successfully",Toast.LENGTH_LONG).show();
            }
        });
    }
}
