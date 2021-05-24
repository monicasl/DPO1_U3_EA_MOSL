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
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        int opcion = 0;
        while(opcion !=5 ) {
            System.out.println("ERP MOSL");
            System.out.println("Seleccione una opcion");
            System.out.println("\t1. Ingresar empleados");
            System.out.println("\t2. Ingresar cliente");
            System.out.println("\t3. Reporte de empleados");
            System.out.println("\t4. Reporte de clientes");
            System.out.println("\t5. Salir.");
            Scanner input = new Scanner(System.in);
            opcion = seleccionaOpcion();
            switch(opcion) {
                case 1:
                    Empleado nuevoEmpleado;
                    System.out.println("Seleccione tipo de empleado");
                    System.out.println("\t1. Especialista");
                    System.out.println("\t2. Directivo");
                    opcion = seleccionaOpcion();
                    switch(opcion){
                        case 1:
                            nuevoEmpleado =  new Especialista();
                            nuevoEmpleado.registrar();
                            break;
                        case 2:
                            nuevoEmpleado =  new Directivo();
                            nuevoEmpleado.registrar();
                            break;
                        default:
                            System.out.println("Opcion invalida... cancelando ingreso");
                    }
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        }
    }
}
