package app;

public class ClienteRegistro {

    public static void cargarClientes(DescuentoCliente app) {
        app.agregarCliente("37289962", "Jonathan Balbuena");
        app.agregarCliente("95895201", "Johann Coronel");
        app.agregarCliente("95895202", "Pedro Perez");
        app.agregarCliente("95895203", "Ray Jhoel");
        app.agregarCliente("95895204", "Jesus navas");
        app.agregarCliente("20895204", "Maria Paredes");
        app.agregarCliente("35895204", "Martin Palermo");
        app.agregarCliente("35895206", "Roman Riquelme");
    }
    
    public static void cargarCompras(DescuentoCliente app) {
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
        
        // Riquelme 
        app.realizarCompra("35895206", 2800);
        app.realizarCompra("35895206", 3790);       
    }      

}
