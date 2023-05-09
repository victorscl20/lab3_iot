package com.example.lab3_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Context context;

    public MascotaAdapter(Context context, ArrayList<Mascota> arrayList){
        this.context = context;
        this.mascotas = arrayList;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false);
        return new MascotaViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder holder, int position) {

        Mascota m = mascotas.get(position);
        holder.nombre.setText(m.getNombre());
        holder.genero.setText(m.getGenero());
        holder.dueno.setText(m.getNombreDueno());
        holder.dni.setText(m.getDni());
        holder.descripcion.setText(m.getDescripcion());



    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }


    //ViewHolder
    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        TextView nombre,genero,dueno,dni,descripcion;
        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre=itemView.findViewById(R.id.nombre);
            genero=itemView.findViewById(R.id.genero);
            dueno=itemView.findViewById(R.id.dueno);
            dni=itemView.findViewById(R.id.dni);
            descripcion=itemView.findViewById(R.id.descripcion);

        }
    }


}
