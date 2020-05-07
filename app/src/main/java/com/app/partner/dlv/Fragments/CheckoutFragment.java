package com.app.partner.dlv.Fragments;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.app.partner.dlv.Activities.MainActivity;
import com.app.partner.dlv.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CheckoutFragment extends Fragment {

    TextView textViewCambiarDirecccion;
    EditText editTextDireccion;
    Spinner spinnerTipoPago;

    public CheckoutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_checkout, container, false);
       setToolBar(view);

       textViewCambiarDirecccion = view.findViewById(R.id.textViewCambiarDirecCheckout);
       editTextDireccion = view.findViewById(R.id.editTextDireccionCheckout);
       spinnerTipoPago = view.findViewById(R.id.spinnerTipoPagoCheckout);

        List<String> lstipoPago = new ArrayList<>();
        lstipoPago.add("Tarjeta (POS)");
        lstipoPago.add("Efectivo");

        ArrayAdapter<String> adapterTipoPago = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, lstipoPago);
        adapterTipoPago.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTipoPago.setAdapter(adapterTipoPago);

       textViewCambiarDirecccion.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (editTextDireccion.isEnabled()) {
                   editTextDireccion.setEnabled(false);
                   textViewCambiarDirecccion.setText(getString(R.string.text_cambiar_direccion_checkout));
               } else {
                   editTextDireccion.setEnabled(true);
                   textViewCambiarDirecccion.setText(getString(R.string.text_guardar_checkout));
               }
           }
       });

        return view;
    }

    private void setToolBar(View view){
        Toolbar toolbar = view.findViewById(R.id.toolbarCheckout);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Check Out");
        ((MainActivity)getActivity()).getSupportActionBar().setHomeAsUpIndicator(R.drawable.flechaizquierda);
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

//    private void activarEditText(){
//
//    }
}
