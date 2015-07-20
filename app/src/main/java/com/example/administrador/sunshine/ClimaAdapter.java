package com.example.administrador.sunshine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrador on 04/06/2015.
 */
public class ClimaAdapter extends ArrayAdapter<Clima> {

    public ClimaAdapter(Context context, int resource, List<Clima> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Clima clima = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_forecast, parent, false);
        }

        ImageView icono = (ImageView)  convertView.findViewById(R.id.imageView_icono);
        TextView dia = (TextView)  convertView.findViewById(R.id.textView_dia);
        TextView estado = (TextView)  convertView.findViewById(R.id.textView_estado);
        TextView temperatura = (TextView)  convertView.findViewById(R.id.textView_temperatura);

        icono.setImageResource(clima.getIcono());
        dia.setText(clima.getDia());
        estado.setText(clima.getEstado());
        temperatura.setText(clima.getTemperatura());

        return convertView;
    }
}
