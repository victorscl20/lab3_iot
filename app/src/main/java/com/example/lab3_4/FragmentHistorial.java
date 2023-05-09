package com.example.lab3_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab3_4.databinding.FragmentHistorialBinding;

import java.util.List;

public class FragmentHistorial extends Fragment {

    FragmentHistorialBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHistorialBinding.inflate(inflater,container,false);

        // Obtener la lista de mascotas desde la clase de utilidad
        List<Mascota> mascotas = MascotaUtil.getMascotas();


        // Configurar el RecyclerView con un LinearLayoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.recyclerView.setLayoutManager(layoutManager);

        // Crear un nuevo MascotaAdapter y configurarlo con la lista de mascotas
        MascotaAdapter adapter = new MascotaAdapter(mascotas);
        binding.recyclerView.setAdapter(adapter);


        return binding.getRoot();
    }
}
