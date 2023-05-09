package com.example.lab3_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.lab3_4.databinding.FragmentHomeBinding;
import com.example.lab3_4.databinding.FragmentRegistroBinding;

public class FragmentHome extends Fragment {

    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater,container,false);

        NavController navController = NavHostFragment.findNavController(FragmentHome.this);

        binding.button.setOnClickListener( view -> {
            navController.navigate(R.id.action_fragmentHome_to_fragmentRegistro);
        });

        binding.button2.setOnClickListener( view -> {
            navController.navigate(R.id.action_fragmentHome_to_fragmentEmergencia);
        });

        binding.button3.setOnClickListener( view -> {
            navController.navigate(R.id.action_fragmentHome_to_fragmentHistorial);
        });


        return binding.getRoot();
    }
}
