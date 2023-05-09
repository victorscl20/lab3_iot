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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentRegistroBinding.inflate(inflater,container,false);


        //Crear una lista para de la clase "Mascota" que ya tiene el getter y setter del campo nombre
        ArrayList<Mascota> listaMascotas = new ArrayList<>();

        //Asigna el onClickListener al botón de registro
        binding.buttonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Obtiene el nombre de la mascota del campo de texto
                String nombreMascota = binding.nombre.getText().toString();

                //Crea un objeto Mascota con el nombre ingresado
                Mascota nuevaMascota = new Mascota(nombreMascota);

                // Agregar la mascota a la lista
                MascotaUtil.agregarMascota(nuevaMascota);

                // Navegar al fragmento OtroFragment
                NavHostFragment.findNavController(FragmentRegistro.this).navigate(R.id.action_fragmentRegistro_to_fragmentHome);

                /*
                //Pasa la lista de mascotas a otro fragmento usando un Bundle
                Bundle bundle = new Bundle();
                bundle.putSerializable("listaMascotas", (Serializable) listaMascotas);
                Fragment fragment = new FragmentHistorial();
                fragment.setArguments(bundle);
                //Reemplaza el fragmento actual con el nuevo fragmento
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();

                 */

            }
        });

        return binding.getRoot();
    }
}
