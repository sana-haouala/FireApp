package tn.rnu.fmt.fireapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private Button mSendString;
    private Button mMove;
    private EditText mValueField;
    private EditText mKeyValue;
    private TextView mValueText;

    private DatabaseReference mRootDatabase;
    //private DatabaseReference myRefChild = mRootDatabase.child("Name");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get UI elements
        mSendString = (Button) findViewById(R.id.addButton);
        mMove = (Button) findViewById(R.id.moveButton);
        mValueField = (EditText) findViewById(R.id.valueEditText);
        mKeyValue = (EditText) findViewById(R.id.key);
        mValueText = (TextView) findViewById(R.id.valueText);

        mMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });

    }

    /*@Override
    protected void onStart() {
        super.onStart();

        mRootDatabase = FirebaseDatabase.getInstance().getReference();
        mRootDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Map<String, String> map =  (Map<String, String>) dataSnapshot.getValue();
                //mValueText.setText(dataSnapshot.getValue(Map.class).toString());
                    String name = map.get("Name");
                    //String age = map.get("age");
                    String lastname = map.get("LastName");
                    String hobby = map.get("Hobby");

                    mValueText.setText(name+" "+lastname+" "+hobby.toString()+"!");
                Log.v("NAME","Name : "+name);
                //Log.v("AGE","Age : "+age);
                Log.v("LASTNAME","Lastname : "+lastname);
                Log.v("HOBBY","Hobby : "+hobby);

              *//*String text = dataSnapshot.getValue(String.class);
               mValueText.setText(text);*//*
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        *//*mSendString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String key = mKeyValue.getText().toString();
                String value = mValueField.getText().toString();
                DatabaseReference myRefChild = mRootDatabase.child(key);
                myRefChild.setValue(value);
            }
        });*//*
        mMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });
    }*/
}
