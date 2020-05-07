package com.app.partner.dlv.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.app.partner.dlv.Models.Producto;
import com.app.partner.dlv.R;

import java.util.List;

public class ListAdapterTuOrden extends BaseAdapter {

    private Context context;
    private int layout;
    List<Producto> lsproductos;

    public ListAdapterTuOrden(Context context, int layout, List<Producto> lsproductos){
        this.context = context;
        this.layout = layout;
        this.lsproductos = lsproductos;
    }

    @Override
    public int getCount() {
        return this.lsproductos.size();
    }

    @Override
    public Object getItem(int position) {
        return this.lsproductos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null){
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(this.context).inflate(layout, null);

            viewHolder.textViewnombre = convertView.findViewById(R.id.textViewNombreProdTuOrden);
            viewHolder.textViewPrecio = convertView.findViewById(R.id.textViewPrecioProdTuOrden);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textViewnombre.setText(lsproductos.get(position).getNombre());
        viewHolder.textViewPrecio.setText("s/" + lsproductos.get(position).getPrecio());

        return convertView;
    }

    static class ViewHolder {
        TextView textViewnombre;
        TextView textViewPrecio;
    }
}
