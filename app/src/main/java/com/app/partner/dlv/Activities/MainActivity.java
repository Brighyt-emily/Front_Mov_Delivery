package com.app.partner.dlv.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.app.partner.dlv.Fragments.TuOrdenFragment;
import com.app.partner.dlv.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setFragmentDefecto();
    }

    private void setFragmentDefecto(){
        cambiarFragment(new TuOrdenFragment());
    }

    private void cambiarFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment, fragment).commit();
    }
}
