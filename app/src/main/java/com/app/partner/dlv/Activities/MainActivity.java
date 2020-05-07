package com.app.partner.dlv.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.app.partner.dlv.Fragments.DescubreOfertasFragments;
import com.app.partner.dlv.Fragments.OfertasFragments;
import com.app.partner.dlv.Fragments.ProductosFragments;
import com.app.partner.dlv.Fragments.TuOrdenFragment;
import com.app.partner.dlv.R;

public class MainActivity extends AppCompatActivity {


    private FrameLayout contentframelayout;
    private DescubreOfertasFragments descubreOfertasFragments;
    private ProductosFragments productosFragments;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setFragmentDefecto();
    }

    private void setFragmentDefecto(){
        cambiarFragment(new OfertasFragments());
    }

    private void cambiarFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFrame, fragment).commit();
    }

}
