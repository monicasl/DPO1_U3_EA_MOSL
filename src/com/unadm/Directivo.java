package com.unadm;

import java.util.Scanner;

public class Directivo extends Empleado {
    private String oficina;

    @Override
    public String mostrar() {
        return null;
    }

    public Directivo() {
        super();
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    @Override
    public void registrar() {
        Scanner input = new Scanner(System.in);
        super.registrar();
        System.out.println("Ingrese Oficina");
        this.setOficina(input.nextLine());
    }



}
