package com.unadm;

import java.text.MessageFormat;
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
        String template = "{1} {2}, {3}, {4}, {5}";
        String msg = MessageFormat.format(template,
                this.getNombre(), this.getApellido(),
                this.getEdad(), this.getRFC(), this.getDireccion());
        System.out.println(msg);
        return msg;
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
