package com.unadm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        menu();
    }

    private static int seleccionaOpcion(){
        Scanner input = new Scanner(System.in);
        int opcion;
        try{
            opcion = Integer.parseInt(input.nextLine());
            return opcion;
        }catch (NumberFormatException e){
            System.out.println("Ingresa un numero");
            return 0;
        }
    }

    private static void menu(){
        ArrayList<Persona> empleados = new ArrayList<>();
        ArrayList<Persona> clientes = new ArrayList<>();
        int opcion = 0;
        while(opcion !=5 ) {
            System.out.println("ERP MOSL");
            System.out.println("Seleccione una opcion");
            System.out.println("\t1. Ingresar empleados");
            System.out.println("\t2. Ingresar cliente");
            System.out.println("\t3. Reporte de empleados");
            System.out.println("\t4. Reporte de clientes");
            System.out.println("\t5. Salir.");
            opcion = seleccionaOpcion();
            switch(opcion) {
                case 1:
                    Empleado nuevoEmpleado = null;
                    System.out.println("Seleccione tipo de empleado");
                    System.out.println("\t1. Especialista");
                    System.out.println("\t2. Directivo");

                    while(opcion != 99) {
                        opcion = seleccionaOpcion();
                        switch (opcion) {
                            case 1 -> {
                                nuevoEmpleado = new Especialista();
                                nuevoEmpleado.registrar();
                                opcion = 99;
                            }
                            case 2 -> {
                                nuevoEmpleado = new Directivo();
                                nuevoEmpleado.registrar();
                                opcion = 99;
                            }
                            case 99 -> {
                            }
                            default -> System.out.println("Opcion invalida... ingrese de nuevo");
                        }
                    }
                    empleados.add(nuevoEmpleado);
                    break;
                case 2:
                    Cliente nuevoCliente = new Cliente();
                    nuevoCliente.registrar();
                    clientes.add(nuevoCliente);
                    break;
                case 3:
                    for(Persona e : empleados) {
                        e.mostrar();
                    }
                    break;
                case 4:
                    System.out.println("Clientes:");
                    for(Persona e: clientes) {
                        e.mostrar();
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        }
    }
}
