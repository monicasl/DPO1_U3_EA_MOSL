package com.unadm;

import java.text.MessageFormat;
import java.util.Scanner;

public class Directivo extends Empleado {
    private String oficina;

    @Override
    public String mostrar() {
        String template = "{0}. Directivo, {1} {2}, {3}, {4}, {}5";
        String msg = MessageFormat.format(template,
                this.getNumEmpleado(), this.getNombre(),
                this.getApellido(), this.getEdad(),
                this.getEmail(), this.getTelefono());
        System.out.println(msg);
        return msg;
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
