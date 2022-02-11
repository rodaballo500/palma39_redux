package com.example.palma39_redux;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragmentRojo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmentRojo extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    View vista;
    EditText CorreoIn, PasswordIn;
    Button Iniciar_sesion;

    public fragmentRojo() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista= inflater.inflate(R.layout.fragment_rojo, container, false);
        //definimos las variables
        Iniciar_sesion=vista.findViewById(R.id.Iniciar_Sesion);
        CorreoIn = vista.findViewById(R.id.CorreoIn);
        PasswordIn = vista.findViewById(R.id.PasswordIn);
        Iniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //metemos el contenido en las variables
                String correoIn=CorreoIn.getText().toString();
                String passwordIn=PasswordIn.getText().toString();
                if (!Patterns.EMAIL_ADDRESS.matcher(correoIn).matches()) { //Patterns.EMAIL_ADDRESS nos permite saber si lleva arroba y el .com
                    CorreoIn.setError("Correo inválido");
                    CorreoIn.setFocusable(true);// para que mantenga parpadeando la barra y pueda seguir escribiendo un correo el usuario
                }
                else if (PasswordIn.length()<6){
                    PasswordIn.setError("Contraseña debe ser mayor o igual que seis");
                    PasswordIn.setFocusable(true);
                }else {
                    System.out.println("chupala");
                    Intent intento = new Intent(getContext(), novedades.class);
                    startActivity(intento);

                    //novedades();

                }

            }

        });
        // Inflate the layout for this fragment

        return vista;
    }

    public interface OnFragmentInteractionListener {
    }

    public void novedades (View view){

    }
}


