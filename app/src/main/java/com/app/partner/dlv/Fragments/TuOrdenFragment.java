package com.app.partner.dlv.Fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.app.partner.dlv.Activities.MainActivity;
import com.app.partner.dlv.Adapters.ListAdapterTuOrden;
import com.app.partner.dlv.Models.Producto;
import com.app.partner.dlv.R;

import java.util.ArrayList;
import java.util.List;

public class TuOrdenFragment extends Fragment {

    ListView listViewProductos;
    ListAdapterTuOrden adapter;
    Button buttonAceptar;
    MainActivity mainActivity;

    public TuOrdenFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tu_orden, container, false);
        setToolBar(view);
        buttonAceptar = view.findViewById(R.id.buttonAceptarTuOrden);
        listViewProductos = view.findViewById(R.id.listViewProductosTuOrden);
        adapter = new ListAdapterTuOrden(getContext(), R.layout.list_tu_orden_item, armarLista());
        listViewProductos.setAdapter(adapter);

        buttonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment, new CheckoutFragment()).addToBackStack(null).commit();
            }
        });

        return view;
    }

    public List<Producto> armarLista (){
        List<Producto> lsproducto = new ArrayList<Producto>();
        lsproducto.add(new Producto("Silla", 50.0));
        lsproducto.add(new Producto("Escritorio", 150.0));
        lsproducto.add(new Producto("Armario", 200.0));
        lsproducto.add(new Producto("Espejo", 70.0));
        lsproducto.add(new Producto("Sillon", 130.0));
        lsproducto.add(new Producto("Cama", 160.0));
        return lsproducto;
    }


    private void setToolBar(View view){
        Toolbar toolbar = view.findViewById(R.id.toolbarTuOrden);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Tu Orden");
        ((MainActivity)getActivity()).getSupportActionBar().setHomeAsUpIndicator(R.drawable.flechaizquierda);
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
