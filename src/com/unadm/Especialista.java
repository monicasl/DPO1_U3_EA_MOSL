package com.unadm;

import java.util.Scanner;

public class Especialista extends Empleado{
    private String area;

    @Override
    public String mostrar() {
        return null;
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
