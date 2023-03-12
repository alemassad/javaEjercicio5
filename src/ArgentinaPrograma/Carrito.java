package ArgentinaPrograma;

public class Carrito {
	
				
		
		public Integer[] getCantidad() {
			return cantidad;
		}

		public double[] getPrecio() {
			return precio;
		}

		public String[] getProductos() {
			return productos;
		}

		public Double getPrecioTotal() {
			precioTotal=(double) (+ item[0].getPrecio()*item[0].getCantidad() +item[1].getPrecio()*item[1].getCantidad() +item[2].getPrecio()*item[2].getCantidad());
			return (double) precioTotal;
			
		}

		public itemCarrito[] getItem() {
			return item;
		}

		public void setPrecio(double[] precio) {
			this.precio = precio;
		}

		public void setProductos(String[] productos) {
			this.productos = productos;
		}

		public void setPrecioTotal(Double precioTotal) {
			
			this.precioTotal = precioTotal;
		}

		public void setItem(itemCarrito[] item) {
			this.item = item;
		}

		private Integer cantidad[]= new Integer[3];
		private double precio[]= new double[3];
		private String productos[]= new String[3];		
		private Double precioTotal;
		private itemCarrito[] item = new itemCarrito[3];
		
		public itemCarrito[] traerCarrito(){	
			return item;			
		}	
		
		public Carrito(itemCarrito item1, itemCarrito item2, itemCarrito item3) {
			item[0] = item1;
			item[1]= item2;
			item[2]= item3;
		
			for(int i=0 ;i<3 ;i++){
				
				this.cantidad[i] = item[i].getCantidad();
				this.precio[i]=+(item[i].getCantidad() * item[i].getPrecio());
				this.productos[i]= item[i].getProductos();
			}
		}


		
		
		
		
		

		
		
		
	
		
	
}
