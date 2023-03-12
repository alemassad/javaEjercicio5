package ArgentinaPrograma;

public class Principal {

	public static void main(String[] args) {
		
		
		Producto prod1 = new Producto("Atun en aceite","Lata de lomitos de atun de 300 grs en aceite", 10.00, 200);
		Producto prod2 = new Producto("Atun en agua","Lata de lomitos de atun de 300 grs en agua", 12.00, 250);
		Producto prod3 = new Producto("Agua minera","Agua mineral enbotellada por 1 litro", 20.00, 2);
						
		itemCarrito item1 = new itemCarrito(2, prod1.getPrecio(), prod1.getNombre());
		itemCarrito item2 = new itemCarrito(3, prod2.getPrecio(), prod2.getNombre());
		itemCarrito item3 = new itemCarrito(5, prod3.getPrecio(), prod3.getNombre());
		
		Carrito carro = new Carrito (item1,item2,item3);
					
		
		System.out.println("Cant"+"       "+"PrecioUnitario"+"      "+"Producto");
		System.out.println("-------------------------------------------------------");
		System.out.println(carro.getCantidad()+carro.getPrecio()+carro.getProductos());
		
		System.out.println();
		
	
		System.out.println("PRECIO TOTAL: "+carro.getPrecioTotal(item1,item2,item3));
		
		
		
		
		

	}

}
