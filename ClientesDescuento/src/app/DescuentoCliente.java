package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DescuentoCliente {

    private Map<String, Cliente> clientes;

    public DescuentoCliente() {
        clientes = new HashMap<>();
    }

    public void agregarCliente(String dni, String nombre) {
        clientes.put(dni, new Cliente(dni, nombre));
    }

    public void realizarCompra(String dni, int monto) {
        Cliente cliente = clientes.get(dni);
        if (cliente != null) {
            cliente.realizarCompra(monto);
        }
    }

    public boolean esAcreedorDescuento(String dni) {
    	
        Cliente cliente = clientes.get(dni);
        if (cliente != null) {
            int comprasRealizadas = cliente.getComprasRealizadas();
  
            if (comprasRealizadas >= 1500) {
                return true;
            }
        }
        return false;
    }
    
    public int consultaCantidadCompras(String dni) {
    	Cliente cliente = clientes.get(dni);
    	int totalCompras = 0;
    	if (cliente != null) {
    		totalCompras = cliente.getComprasRealizadas();
    	}
    	return totalCompras;
    }
    
    
    public List<Cliente> listarClientes() {
    	List<Cliente> listaClientes = new ArrayList<>(clientes.values());
    	
    	return listaClientes;
    }
    
    public String buscarNombreCliente(String dni) {
    	Cliente cliente = clientes.get(dni);
    	String nombre = "";
    	
        if (cliente != null) {
            nombre = cliente.getNombre();
        } else {
        	nombre = "No registrado";
        }
    
		return nombre;
    }
    
    
    
    

}
