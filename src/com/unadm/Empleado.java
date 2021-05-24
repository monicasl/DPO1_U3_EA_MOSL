package com.unadm;

import java.text.MessageFormat;
import java.util.Scanner;

public abstract class Empleado extends Persona {
    private int numEmpleado;
    private String curp;
    private String telefono;
    private String email;
    private Double sueldoBruto;
    private String puesto;

    public Empleado() {
        super();
    }

    public void registrar(){
        super.registrar();
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese Numero de Empleado:");
        this.setNumEmpleado(this.obtenerNumero(input));
        System.out.println("Ingrese Curp:");
        this.setCurp(input.nextLine());
        System.out.println("Ingrese Telefono:");
        this.setTelefono(input.nextLine());
        System.out.println("Ingrese Email:");
        this.setEmail(input.nextLine());
        System.out.println("Ingrese Sueldo bruto:");
        this.setSueldoBruto(this.obtenerDoble(input));
        System.out.println("Ingrese Puesto:");
        this.setPuesto(input.nextLine());
    }
    protected Double obtenerDoble(Scanner input){
        while(true){
            try{
                return Double.parseDouble(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Ingrese un numero!");
            }
        }
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(Double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
