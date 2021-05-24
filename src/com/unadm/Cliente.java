package com.unadm;

import java.util.Scanner;

public class Cliente extends Persona {
    private String RFC;
    private String direccion;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente() {
        super();
    }

    @Override
    public String mostrar() {
        System.out.println("not implemented yet");
        return "";
    }

    @Override
    public void registrar(){
        Scanner input = new Scanner(System.in);
        super.registrar();
        System.out.println("Ingrese RFC");
        this.setRFC(input.nextLine());
        System.out.println("Ingrese Direccion");
        this.setDireccion(input.nextLine());
    }
}
