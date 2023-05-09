package com.example.lab3_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder> {

    private List<Mascota> mascotas;
    private Context context;

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false);
        return new MascotaViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder holder, int position) {

        Mascota m = mascotas.get(position);
        holder.mascota = m;

        TextView textViewFirstName = holder.itemView.findViewById(R.id.textViewFirstName);
        textViewFirstName.setText(m.getNombre());

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }


    //ViewHolder
    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        Mascota mascota;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }


}
