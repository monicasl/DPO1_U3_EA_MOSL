package com.unadm;

import java.text.MessageFormat;
import java.util.Scanner;

public class Especialista extends Empleado{
    private String area;

    @Override
    public String mostrar() {
        String template = "{0}. Especialista: {1} {2}, {3}, {4}, {5}";
        String msg = MessageFormat.format(template,
                this.getNumEmpleado(), this.getNombre(), this.getApellido(),
                this.getEdad(), this.getEmail(), this.getTelefono());
        System.out.println(msg);
        return msg;
    }

    public Especialista() {
        super();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void registrar() {
        Scanner input = new Scanner(System.in);
        super.registrar();
        System.out.println("Ingrese area");
        this.setArea(input.nextLine());
    }



}
