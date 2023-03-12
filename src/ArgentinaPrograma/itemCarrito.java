package ArgentinaPrograma;

public class itemCarrito {
	
	// Propiedades
	
	private Integer cantidad;
	private double precio;
	private String productos;
	private static final Double minPrecio = 0.1;
	
	//Constructores
	
	public itemCarrito(Integer cantidad, double precio, String producto) {		
		this.cantidad = cantidad;
		this.precio = precio;
		this.productos = producto;
	}
	
	// Getters y Setters
	

	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public static Double getMinprecio() {
		return minPrecio;
	}

	public String getProductos() {
		return productos;
	}

	public void setProductos(String producto) {
		this.productos = producto;
	}
	
	//Metodos
	
	

}
