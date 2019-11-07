package com.example.lab04_11_19;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.*;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","Metodo OnCreate");
        addFragment(new FragmentOne(), false, "primo");

    }

    public void onButtonClick(View v){
        Log.d("Sono nella main Activity","myTap");
        EditText tv = this.findViewById(R.id.editText);

        addFragment(new FragmentTwo(),false,"secondo");
        TextView tv2= this.findViewById(R.id.textView1);
       /* Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        intent.putExtra("valueToShow",""+ tv.getText()+"" );
        startActivity(intent);*/
    }
    public  void  addFragment(Fragment fragment, boolean addToBackStack, String tag){
        FragmentManager fragmentManager=this.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragment,tag);
        fragmentTransaction.commitAllowingStateLoss();
    }

}
