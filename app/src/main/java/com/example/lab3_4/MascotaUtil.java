package com.example.lab3_4;

import java.util.ArrayList;
import java.util.List;

public class MascotaUtil {

    private static List<Mascota> mascotas = new ArrayList<>();

    public static void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public static List<Mascota> getMascotas() {
        return mascotas;
    }
}
