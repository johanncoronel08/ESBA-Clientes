package app;

class Cliente {
	private String nombre;
    private String dni;
    private int comprasRealizadas;

    public Cliente(String dni, String nombre) {
    	this.setNombre(nombre);
        this.setDni(dni);
        this.setComprasRealizadas(0);
    }

    public void realizarCompra(int monto) {
        setComprasRealizadas(getComprasRealizadas() + monto);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getComprasRealizadas() {
		return comprasRealizadas;
	}

	public void setComprasRealizadas(int comprasRealizadas) {
		this.comprasRealizadas = comprasRealizadas;
	}

}



