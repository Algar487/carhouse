package com.ruizgarcia.carhouse;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorCoches extends RecyclerView.Adapter<AdaptadorCoches.ViewHolderCoches> {

    ArrayList<Coche> listaCoches;

    public AdaptadorCoches(ArrayList<Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }

    @NonNull
    @Override
    public ViewHolderCoches onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolderCoches(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCoches holder, int position) {
        holder.marca.setText(listaCoches.get(position).getMarca());
        holder.modelo.setText(listaCoches.get(position).getModelo());
        holder.kilometraje.setText(listaCoches.get(position).getKilometraje());
        holder.anio.setText(listaCoches.get(position).getAnio());
        holder.precio.setText(listaCoches.get(position).getPrecio());
        holder.vendido.setImageResource(listaCoches.get(position).getVendido());
    }

    @Override
    public int getItemCount() {
        return listaCoches.size();
    }

    public class ViewHolderCoches extends RecyclerView.ViewHolder {

        TextView marca, modelo, kilometraje, anio, cilindrada, potencia, precio;
        ImageView vendido;


        public ViewHolderCoches(@NonNull View itemView) {
            super(itemView);
            marca=(TextView) itemView.findViewById(R.id.textViewLMarca);
            modelo=(TextView) itemView.findViewById(R.id.textViewLModelo);
            kilometraje=(TextView) itemView.findViewById(R.id.textViewLKM);
            anio=(TextView) itemView.findViewById(R.id.textViewLAnio);
            precio=(TextView) itemView.findViewById(R.id.textViewLPrecio);
            vendido=(ImageView) itemView.findViewById(R.id.textViewLIcon);
        }
    }
}
