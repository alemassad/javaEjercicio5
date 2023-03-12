package ArgentinaPrograma;

public class Carrito {
	
		// Propiedades
	
		private String cantidad;
		private String precio;
		private String productos;		
		private Double precioTotal;
		
		private static final Double minPrecio = 0.1;
	
		
	
			
		
		public Carrito(itemCarrito item1, itemCarrito item2, itemCarrito item3) {
			
			this.cantidad = Integer.toString(item1.getCantidad())+"\n"+ Integer.toString(item2.getCantidad())+"\n"
					+ Integer.toString(item3.getCantidad())+"\n";
			
			this.precio= Double.toString((item1.getCantidad() * item1.getPrecio()))+"\n"
					+Double.toString((item2.getCantidad() * item2.getPrecio()))+"\n"
					+Double.toString((item3.getCantidad() * item3.getPrecio()))+"\n";
			
			this.productos= item1.getProductos()+"\n"+item2.getProductos()+"\n"+item3.getProductos();
			
		}



		//Setters y Getters
		public String getCantidad() {
			return cantidad;
		}

		public String getPrecio() {
			return precio;
		}

		public String getProductos() {
			return productos;
		}

		public Double getPrecioTotal(itemCarrito item1,itemCarrito item2, itemCarrito item3) {
			precioTotal=(double) (+ item1.getPrecio()*item1.getCantidad() +item2.getPrecio()*item2.getCantidad() +item3.getPrecio()*item3.getCantidad());
			return (double) precioTotal;
		}

		public static Double getMinprecio() {
			return minPrecio;
		}

		public void setCantidad(String cantidad) {
			this.cantidad = cantidad;
		}

		public void setPrecio(String precio) {
			this.precio = precio;
		}

		public void setProductos(String productos) {
			
			this.productos = productos;
		}

		public void setPrecioTotal(Double precioTotal) {
			
			this.precioTotal = precioTotal;
		}



		
		
		
		
		
		

		
		
		
	
		
	
}
