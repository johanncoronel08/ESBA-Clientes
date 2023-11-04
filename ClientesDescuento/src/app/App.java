package app;

import java.util.Scanner;

public class App {
	
    public static void main(String[] args) {
    	
        DescuentoCliente app = new DescuentoCliente();
        
        // ++++++++++++++++++++++++++++++++++++++++++++++
        // CLIENTES AGREGADOS
        app.agregarCliente("37289962", "Jonathan Balbuena");
        app.agregarCliente("95895201", "Johann Coronel");
        app.agregarCliente("95895202", "Pedro Perez");
        app.agregarCliente("95895203", "Ray Jhoel");
        app.agregarCliente("95895204", "Jesus navas");
        app.agregarCliente("20895204", "Maria Paredes");
        app.agregarCliente("35895204", "Martin Palermo");
        // ++++++++++++++++++++++++++++++++++++++++++++++
        
        // ++++++++++++++++++++++++++++++++++++++++++++++        
        // Jonathan 
        app.realizarCompra("37289962", 1450);
     
        
        // Johann
        app.realizarCompra("95895201", 1292);
        app.realizarCompra("95895201", 2040);
        app.realizarCompra("95895201", 1232);
        app.realizarCompra("95895201", 3123);
        // ++++++++++++++++++++++++++++++++++++++++++++++ 
        
        // Ray 
        app.realizarCompra("95895203", 800);
        app.realizarCompra("95895203", 790);
        // ++++++++++++++++++++++++++++++++++++++++++++++ 
        
        // Jesus 
        app.realizarCompra("95895204", 800);
        app.realizarCompra("95895204", 400);
        // ++++++++++++++++++++++++++++++++++++++++++++++ 
        
        // Maria 
        app.realizarCompra("20895204", 1450);
        // ++++++++++++++++++++++++++++++++++++++++++++++ 
        
        // Martin 
        app.realizarCompra("35895204", 5000);
        app.realizarCompra("35895204", 400);
         
        
        Scanner scanner = new Scanner(System.in);
        
        boolean continuarProceso = true;
        
    	imprimirSaludoBienvenida();
    	
        while (continuarProceso) {
        	
        	imprimirMenuOpciones();        	
        	String opcionMenu = scanner.nextLine();
        	
        	switch (opcionMenu) {
			case "1": {
				
				boolean continuarBusqueda = true;
				
	            while (continuarBusqueda) {
	            	buscarClientePorDNI(app);
	            	
		            System.out.print("Desea continuar ? (S/N) (M = Menu): ");
		            String deseaContinuar = scanner.nextLine();
		            
		            if (deseaContinuar.equals("S") || deseaContinuar.equals("s")) {
		            	continuarBusqueda = true;
		            } else if (deseaContinuar.equals("M") || deseaContinuar.equals("m")){
		            	continuarBusqueda = false;
		            	continuarProceso = true;
		            } else {
		            	continuarBusqueda = false;
		            	continuarProceso = false;
		            	scanner.close();
		            	System.out.println("Gracias por su visita");	
		            }
	            }			
	            
				break;
			}
			case "2": {
				continuarProceso = false;
				
		        scanner.close();	// No olvides cerrar el scanner cuando hayas terminado de usarlo.     
		        System.out.println("Gracias por su visita");				
			}
			/*
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcionMenu);
			 */
			}

        }
    }  
     
    private static void imprimirSaludoBienvenida() {
    	System.out.println("Bienvenido al sistema de Gestion de Beneficios para clientes DISMATEL");
    	System.out.println("---------------------------------------------------------------------");    	
    }
    
    private static void imprimirMenuOpciones() {
    	System.out.println("Opciones:");
    	System.out.println("1 - Busqueda de cliente por DNI");
    	System.out.println("2 - SALIR");
    	System.out.println("---------------------------------------------------------------------");
    	
    	System.out.print("Seleccionar una opcion:");
    	System.out.println();
    }
    
    
    private static void buscarClientePorDNI(DescuentoCliente appAux) {
    	Scanner scanner = new Scanner(System.in);
    	
        System.out.print("Ingrese numero DNI: ");
        String numeroDocumento = scanner.nextLine();

            boolean clienteEsAcreedorDescuento = appAux.esAcreedorDescuento(numeroDocumento);
            int consultaCanditadCompras = appAux.consultaCantidadCompras(numeroDocumento);
            
            String nombreCliente = appAux.buscarNombreCliente(numeroDocumento);
            
            if (clienteEsAcreedorDescuento) {
            	System.out.println();
            	System.out.println("--- Hola " + nombreCliente + " disfruta de un 10% de descuento en tu proxima compra.");
            	System.out.println("--- Total en compras: $ " + consultaCanditadCompras);
            	System.out.println();
            } else {
            	System.out.println();
            	System.out.println("Hola " + nombreCliente + " sigue comprando para disfrutar mas beneficios.");
            	System.out.println("Total en compras: $ " + consultaCanditadCompras);
            	System.out.println();
            }
    }
    
    

}
