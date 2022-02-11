package com.example.palma39_redux;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link d91_001#newInstance} factory method to
 * create an instance of this fragment.
 */
public class d91_001 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View vista;
    ImageView iv1, iv2, iv3, iv4;

    public d91_001() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment d91_001.
     */
    // TODO: Rename and change types and number of parameters
    public static d91_001 newInstance(String param1, String param2) {
        d91_001 fragment = new d91_001();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        /*iv1 = vista.findViewById(R.id.idPlay1);
        iv2 = vista.findViewById(R.id.idPlay2);
        iv3 = vista.findViewById(R.id.idPlay3);
        iv4 = vista.findViewById(R.id.idPlay4);*/

        /*iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer=  MediaPlayer.create();
                mediaPlayer.start();

            }
        });*/

        vista= inflater.inflate(R.layout.fragment_d91_001, container, false);
        return vista;
    }
}