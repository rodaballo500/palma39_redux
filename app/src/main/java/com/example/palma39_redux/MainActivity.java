package com.example.palma39_redux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements fragmentRojo.OnFragmentInteractionListener,fragmentVerde.OnFragmentInteractionListener {

    fragmentRojo fragmentrojo;
    fragmentVerde fragmentverde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentrojo = new fragmentRojo();
        fragmentverde = new fragmentVerde();

        getSupportFragmentManager().beginTransaction().add(R.id.fragmentVerde,fragmentrojo).commit();
    }

    public void seleccion (View view) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (view.getId()){

            case R.id.btn1:

                transaction.replace(R.id.fragmentVerde,fragmentrojo);

                break;

            case R.id.btn2:
                transaction.replace(R.id.fragmentVerde,fragmentverde);


                break;

        }

        transaction.commit();


    }

    public void novedades () {
        Intent intent = new Intent(MainActivity.this, novedades.class);
        startActivity(intent);
    }
}