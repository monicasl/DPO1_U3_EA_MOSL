package com.unadm;

import java.util.Scanner;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public abstract String mostrar();

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void registrar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese Nombre");
        this.setNombre(input.nextLine());
        System.out.println("Ingrese Apellido");
        this.setApellido(input.nextLine());
        System.out.println("Ingrese Edad");
        this.setEdad(this.obtenerNumero(input));
    }
    protected int obtenerNumero(Scanner input) {
        while(true){
            try {
                return Integer.parseInt(input.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Ingrese un numero!");
            }
        }
    }
}
