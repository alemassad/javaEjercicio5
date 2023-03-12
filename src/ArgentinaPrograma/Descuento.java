package ArgentinaPrograma;

public class Descuento {
	
	
	private String descripcion;	
	private Double descuento;
	
	//Constructor
	public Descuento(String descripcion, Double descuento) {
		super();
		this.descripcion = descripcion;
		this.descuento = descuento;
	}
	
	
	//Getters y Setters
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	

}
