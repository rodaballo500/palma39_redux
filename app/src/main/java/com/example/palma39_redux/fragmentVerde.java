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
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragmentVerde#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmentVerde extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    //DECLARAMOS VARIABLES
    TextView FechaRegistro;
    EditText Correo, Password, Nombres, Apellidos, Edad;
    Button Registrar;
    View vista;

    public fragmentVerde() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       vista= inflater.inflate(R.layout.fragment_verde, container, false);
        // inicializamos variables
        FechaRegistro = vista.findViewById(R.id.fechaRegistro);
        Correo = vista.findViewById(R.id.CorreoIn);
        Password = vista.findViewById(R.id.PasswordIn);
        Nombres = vista.findViewById(R.id.Nombre);
        Apellidos = vista.findViewById(R.id.Apellidos);
        Edad =vista.findViewById(R.id.Edad);
        Registrar = vista.findViewById(R.id.Registrar);
        //CUIDAO!! HEMOS IMPORTADO CLASE Y PUEDE NO SER LA CORRECTA. hABIA DOS. COGIMOS LA PRIMERA!!
        Date date = new Date();
        SimpleDateFormat fecha = new SimpleDateFormat("d ' de 'MMM ' del ' yyyy"); // fecha del dia que toque 04/01/2022
        String SFecha = fecha.format(date); // con esto convertimos fecha a string
        FechaRegistro.setText(SFecha);

        // al hacer click en registarr

        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // convertimo a string los edit text de correo0 y contraseña para poder hacer las validaciones
                String correo = Correo.getText().toString();
                String pass = Password.getText().toString();

                // EMPIEZA LA VALIDACION DEL CORREO ELECTRONICO

                if (!Patterns.EMAIL_ADDRESS.matcher(correo).matches()) { //Patterns.EMAIL_ADDRESS nos permite saber si lleva arroba y el .com
                    Correo.setError("Correo inválido");
                    Correo.setFocusable(true);// para que mantenga parpadeando la barra y pueda seguir escribiendo un correo el usuario
                }
                else if (pass.length()<6){
                    Password.setError("Contraseña debe ser mayor o igual que seis");
                    Password.setFocusable(true);
                }else {
                    Intent intento = new Intent(getContext(), novedades.class);
                    startActivity(intento);
                   // RegistroAdministradores(Correo,pass);

                }
            }
        });

        return vista;
    }

    public interface OnFragmentInteractionListener {
    }
    // metodo para registrar administradores
    private void RegistroAdministradores(EditText correo, String pass) {
        System.out.println("chupala");
    }
}