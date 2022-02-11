package com.example.palma39_redux;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link mTechno#newInstance} factory method to
 * create an instance of this fragment.
 */
public class mTechno extends Fragment {
    View vista;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


        RecyclerView recyclerVinilos;
        ArrayList <PersonajeVo> listaVinilos;




    public mTechno() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment mTechno.
     */
    // TODO: Rename and change types and number of parameters


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista= inflater.inflate(R.layout.fragment_m_techno, container, false);
        listaVinilos=new ArrayList<>();
        recyclerVinilos = vista.findViewById(R.id.recycledmTechno);
        recyclerVinilos.setLayoutManager(new LinearLayoutManager(getContext())); // en fragmento no funciona el this, hay que tirar de getcontext()

        llenarlista();
        AdaptadorPersonajes adaptador = new AdaptadorPersonajes(listaVinilos);
        recyclerVinilos.setAdapter(adaptador);
        return vista;


    }

    private void llenarlista() {

        listaVinilos.add(new PersonajeVo("Distrito 91 001","BlaBlaBlaBlaInfoInfoInfo",R.drawable.discoprimeroo));
        listaVinilos.add(new PersonajeVo("Distrito 91 002","BlaBlaBlaBlaInfoInfoInfo",R.drawable.discosegundoo));
        listaVinilos.add(new PersonajeVo("Distrito 91 003","BlaBlaBlaBlaInfoInfoInfo",R.drawable.discoterceroo));
        listaVinilos.add(new PersonajeVo("Distrito 91 004","BlaBlaBlaBlaInfoInfoInfo",R.drawable.discocuartoo));
        listaVinilos.add(new PersonajeVo("Hooded Rec 001","BlaBlaBlaBlaInfoInfoInfo",R.drawable.discoquintoo));
        listaVinilos.add(new PersonajeVo("Hooded Rec 002","BlaBlaBlaBlaInfoInfoInfo",R.drawable.discosextoo));
        listaVinilos.add(new PersonajeVo("Hooded Rec 003","BlaBlaBlaBlaInfoInfoInfo",R.drawable.discoseptimoo));
        listaVinilos.add(new PersonajeVo("Hooded Rec 004","BlaBlaBlaBlaInfoInfoInfo",R.drawable.discooctavoo));
        listaVinilos.add(new PersonajeVo("Hooded Rec 005","BlaBlaBlaBlaInfoInfoInfo",R.drawable.disconovenoo));
    }

    public interface OnFragmentInteractionListener {
    }
}