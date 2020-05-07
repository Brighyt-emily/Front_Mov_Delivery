package com.app.partner.dlv.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.app.partner.dlv.Models.Tienda;

import java.util.List;

public class OfertasAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    List<Tienda> listaTienda;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public List<Tienda> getListaTienda() {
        return listaTienda;
    }

    public void setListaTienda(List<Tienda> listaTienda) {
        this.listaTienda = listaTienda;
    }

    public OfertasAdapter() {
        super();
    }


    @Override
    public int getCount() {
        return this.listaTienda.size();
    }

    @Override
    public Object getItem(int i) {
        return this.listaTienda.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
