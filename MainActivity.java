package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button f1,f2;
    FragmentOne frag1;
    Fragement2 frag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1=findViewById(R.id.button1);
        f2=findViewById(R.id.button2);
        frag1 = new FragmentOne();
        frag2 = new Fragement2();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragement,frag1);
        ft.commit();
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragement,frag1);
                ft.commit();
                Toast.makeText(MainActivity.this, "Fragment1 Successful", Toast.LENGTH_SHORT).show();
//                Navigation.findNavController(view).navigate(R.id.action_fragmentOne_to_fragement2);
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragement,frag2);
                ft.commit();
                Toast.makeText(MainActivity.this, "Fragment2 Successful", Toast.LENGTH_SHORT).show();
            }
        });
    }
}