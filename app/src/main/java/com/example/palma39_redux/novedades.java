package com.example.palma39_redux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;


public class novedades extends AppCompatActivity implements mTechno.OnFragmentInteractionListener, mHouse.OnFragmentInteractionListener {
    Toolbar mibarra;
    ArrayList<PersonajeVo> listaPersonajes;
    RecyclerView recyclerPersonajes;
    mTechno mtechno;
    mHouse mhouse;
    d91_001 d91_001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novedades);

         mibarra =findViewById(R.id.toolbar);
        setSupportActionBar(mibarra);
        mibarra.setOverflowIcon(getDrawable(R.drawable.ic_baseline_more_vert_24)); // para que nos coja el icono que hemos elegido como apertura de menu

            mtechno =new mTechno();
            mhouse = new mHouse();
            d91_001 = new d91_001();
            //getSupportFragmentManager().beginTransaction().add(R.id.mtechno,mhouse).commit();


    }



    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolb, menu);
        return true;
    }

    public boolean onOptionsItemSelected (MenuItem item) {
        int id = item.getItemId();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (id){
            case R.id.mtechno:

                transaction.replace(R.id.fragmentNovedades,mtechno).commit();

                break;

            case R.id.mhouse:
                /*Intent intent = new Intent(novedades.this, MainActivity.class);
                startActivity(intent);*/
                transaction.replace(R.id.fragmentNovedades,mhouse).commit();
                break;
            case R.id.agenda:
                break;
            case R.id.streaming:
                break;
            case R.id.ayuda:
                break;
            case R.id.conocenos:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    /*private void construirRecycler() {
        //instanciamos listapersoinajes
        listaPersonajes = new ArrayList<>();
        recyclerPersonajes = findViewById(R.id.RecyclerId);

        if (Utilidades.visualizacion==Utilidades.LIST){
            recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));
        } else {
            recyclerPersonajes.setLayoutManager(new GridLayoutManager(this,3));
        }
        /* COMENTAMOS ESTAS DOS LINEAS PORQUE SON DEL PRIMER RECYCLER SENCILLO.
         LO QUE HACEMOS ES METER LAS DOS EN EL IF PARA GENERAR LA LOGICA DE SELECCION DEPENDIENDO DE QUE BOTON PULSEMOS. lIST O GRID
        //recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this)); lo comentamos para probar el gridLayout a priori lo volveremos a activar
        //recyclerPersonajes.setLayoutManager(new GridLayoutManager(this,3));//gridlayout con cantidad de columnas*/
      /*  llenarPersonajes();

        AdaptadorPersonajes adapter = new AdaptadorPersonajes(listaPersonajes);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seleccion: "+
                        listaPersonajes.get(recyclerPersonajes.getChildAdapterPosition(view)).getNombre(),Toast.LENGTH_SHORT).show();

            }
        });
        recyclerPersonajes.setAdapter(adapter);


    }*/

        public void ir (View view){


            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmentNovedades,d91_001).commit();
            /*
            Intent intent = new Intent(novedades.this, MainActivity.class);
            startActivity(intent);*/

        }
        public void volver (View view) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmentNovedades,mtechno).commit();
        }
    public void pprincipal (View view) {
        Intent intent = new Intent(novedades.this, novedades.class);
        startActivity(intent);
    }
}