package app;

import java.util.Scanner;

public class ImprimirConsola {

    public static void saludoBienvenida() {
    	System.out.println("Bienvenido al sistema de Gestion de Beneficios para clientes DISMATEL");
    	System.out.println("---------------------------------------------------------------------");    	
    }
    
    public static void menuOpciones() {
    	System.out.println("Opciones:");
    	System.out.println("1 - Busqueda de cliente por DNI");
    	System.out.println("2 - Listado de clientes");
    	System.out.println("3 - SALIR");
    	System.out.println("---------------------------------------------------------------------");
    	
    	System.out.print("Seleccionar una opcion:");
    	System.out.println();
    } 
    
    public static void saludoDespedida() {
    	System.out.println("Gracias por su visita");
    }

    public static boolean deseaContinuar(Scanner scanner, String accion) {
    	String respuesta = "";
    	switch (accion) {
	    	case "buscarOtroCliente":
	            System.out.print("Desea buscar otro cliente ? (S/N): ");
	            respuesta = scanner.nextLine();
	    		break;
	    		
	    	case "irAlMenu":
	            System.out.print("Desea ir al menú principal ? (S/N): ");
	            respuesta = scanner.nextLine();	    		
	    		break;
    	}
        return respuesta.equalsIgnoreCase("S");
    }    
    
}
