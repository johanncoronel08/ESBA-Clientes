package app;

import java.util.List;
import java.util.Scanner;

public class App {
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	DescuentoCliente app = new DescuentoCliente();
        
        ClienteRegistro.cargarClientes(app);
        ClienteRegistro.cargarCompras(app);
        
        ImprimirConsola.saludoBienvenida();
        
        boolean continuarProceso = true;
        while (continuarProceso) {
        	ImprimirConsola.menuOpciones();
        	String opcionMenu = scanner.nextLine();
        	switch (opcionMenu) {
				case "1":
					boolean continuarBusqueda = true;
		            while (continuarBusqueda) {
		            	buscarClientePorDNI(app, scanner);
		            	continuarBusqueda = ImprimirConsola.deseaContinuar(scanner, "buscarOtroCliente");
		            }
					break;
					
				case "2":
                    listarClientes(app);
                    break;			

				case "3":
                    continuarProceso = false;
                    break;				
			}
        }
        scanner.close();
        ImprimirConsola.saludoDespedida();        
    }  

    
    private static void buscarClientePorDNI(DescuentoCliente app, Scanner scanner) {
        System.out.print("Ingrese numero DNI: ");
        String numeroDocumento = scanner.nextLine();

            boolean clienteEsAcreedorDescuento = app.esAcreedorDescuento(numeroDocumento);
            int consultaCantidadCompras = app.consultaCantidadCompras(numeroDocumento);            
            String nombreCliente = app.buscarNombreCliente(numeroDocumento);
            
            System.out.println();
            System.out.println("---------------------------------------------------------------------");
            System.out.println("--- Cliente: " + nombreCliente);
            System.out.println("--- Total en compras: $" + consultaCantidadCompras);

            if (clienteEsAcreedorDescuento) {
            	System.out.println("--- Descuento: SI");
                System.out.println("--- ¡Disfruta de un 10% de descuento en tu próxima compra!");
            } else {
            	System.out.println("--- Descuento: NO");
                System.out.println("--- Sigue comprando para disfrutar de más beneficios.");
            }
            System.out.println("---------------------------------------------------------------------");
            System.out.println();
    }
    
    private static void listarClientes(DescuentoCliente app) {
    	List<Cliente> listaClientes = app.listarClientes();
    
        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Listado de clientes:");
            for (Cliente cliente : listaClientes) {
                System.out.println("--- DNI: " + cliente.getDni());
                System.out.println("--- Nombre: " + cliente.getNombre());
                System.out.println("---------------------------------------------------------------------");
                System.out.println();
            }
        }
    } 
       
}
