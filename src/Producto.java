import java.time.LocalDate;

public class Producto {

	// Propiedades
	private String nombre;
	private String descripcion;
	private LocalDate fechaAlta;
	private Integer pesoKg;
	private Double precio;
	private static final Double minPrecio = 0.1;
	
	// Constructores
	public Producto() {
		//this.fechaAlta = LocalDate.now();
		//this.precio = minPrecio;
		Inicializacion();
	 }
	
	public Producto(String nombre) {
		Inicializacion();		
		this.nombre = nombre;
	 }
	
	// Getters
	public String getNombre() {
	 return this.nombre;
	}
	
	public String getDescripcion() {
	 return this.descripcion;
	}

	public LocalDate getFechaAlta() {
		 return this.fechaAlta;
		}

	public int getPeso() {
		 return this.pesoKg;
		}

	public Double getPrecio() {
		 return this.precio;
		}

// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void setPeso(int peso) {
		this.pesoKg = peso;
	}
	

	//Metodos
	private void Inicializacion() {
		this.fechaAlta = LocalDate.now();
		this.precio = minPrecio;
	}
	
	public String GetNombreDescripcion() {
		return this.nombre + " " + this.descripcion;
	}
	
	
	
} // Fin de la clase

