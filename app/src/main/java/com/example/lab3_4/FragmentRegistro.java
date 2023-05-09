package com.example.lab3_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.lab3_4.databinding.FragmentRegistroBinding;

import java.io.Serializable;
import java.util.ArrayList;

public class FragmentRegistro extends Fragment {

    FragmentRegistroBinding binding;

    //Crear una lista para de la clase "Mascota" que ya tiene el getter y setter del campo nombre
    ArrayList<Mascota> listaMascotas = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentRegistroBinding.inflate(inflater,container,false);



        //Asigna el onClickListener al botón de registro
        binding.buttonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los datos ingresados por el usuario
                String nombreMascota = binding.nombre.getText().toString();
                String generoMascota = binding.spinnerGenero.getSelectedItem().toString();
                String nombreDueno = binding.dueno.getText().toString();
                String dniDueno = binding.dni.getText().toString();
                String descripcion = binding.descripcion.getText().toString();

                Mascota nuevaMascota = new Mascota(nombreMascota, generoMascota, nombreDueno, dniDueno, descripcion);

                // Agregar el objeto a la lista de mascotas
                listaMascotas.add(nuevaMascota);

                // Bundle
                Bundle bundle = new Bundle();
                bundle.putSerializable("listaMascotas", (Serializable) listaMascotas);
                Fragment fragment = new FragmentHistorial();
                fragment.setArguments(bundle);
                //Reemplaza el fragmento actual con el nuevo fragmento
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();


            }
        });

        return binding.getRoot();
    }
}
