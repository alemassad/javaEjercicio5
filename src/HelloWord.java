import java.util.Arrays;

public class HelloWord {
	
	public static void main(String args[]) {
		
		
		Producto prod1 = new Producto("Atun en aceite");
		Producto prod2 = new Producto("Atun en agua");
		Producto prod3 = new Producto("Agua minera");
		prod1.setDescripcion("Lata de lomitos de atun de 300 grs en aceite");
		prod2.setDescripcion("Lata de lomitos de atun de 300 grs en agua");
		prod3.setDescripcion("Agua mineral enbotellada por 1 litro");
		System.out.println(prod1.GetNombreDescripcion());
		System.out.println(prod2.GetNombreDescripcion());

			
	}
	
	public static void ordenar(){
		int numeros[] = {15,18,6,14,20};
		int aux;
		int j;
		int nuevaPosicion;
		for(int i=1; i<(numeros.length); i++){
			// Identifica posicion del elemento en el paso
			j = i-1;
			while(numeros[i] < numeros[j] && j >=0) {
				j=j-1;
				if (j == -1){
					break;
				}
			}
			nuevaPosicion = j+1;
			// Desplazar el vector
			if (nuevaPosicion < i) {
				aux = numeros[i];
				for(int k=i; k>nuevaPosicion; k--){
					numeros[k] = numeros[k - 1];
				}
				numeros[nuevaPosicion] = aux;
			
			}
		}	

		for(int i=0; i<(numeros.length); i++){
			System.out.println(numeros[i]);
		}
	}
	
	public static void temaMatriz() {
		int numeros[][] = new int[3][5];
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				numeros[i][j] = 1;
			}
		}
		System.out.println(numeros[0][1]);
	}

	
	// guìa de ejercicio 2 A
	public static void tareaCodifica() {
		
		String desplazo1= "hola que tal";
		String desplazo2="hola que tal";
		String abecedario ="abcdefghijklmnñopqrstuvwxyz";
		char caracter;
		String codec="";
		for (int i = 0; i < desplazo1.length(); i++) {
		
			caracter=desplazo1.charAt(i);
		switch (caracter) {
			case 'a':
				System.out.println('a');
				codec=codec +"b";
				break;
			case 'b':
				System.out.println('b');
				codec=codec +"c";
				break;
			case 'c':
				System.out.println('c');
				codec=codec +"d";
				break;
			case 'd':
				System.out.println('d');
				codec=codec +"e";
				break;
			case 'e':
				System.out.println('e');
				codec=codec +"f";
				break;
			case 'f':
				System.out.println('f');
				codec=codec +"g";
				break;
			case 'g':
				System.out.println('g');
				codec=codec +"h";
				break;	
			case 'h':
				System.out.println('h');
				codec=codec +"i";
				break;
			case 'i':
				System.out.println('i');
				codec=codec +"j";
				break;
			case 'j':
				System.out.println('j');
				codec=codec +"k";
				break;
			case 'k':
				System.out.println('k');
				codec=codec +"l";
				break;
			case 'l':
				System.out.println('l');
				codec=codec +"m";
				break;
			case 'm':
				System.out.println('m');
				codec=codec +"n";
				break;
			case 'n':
				System.out.println('n');
				codec=codec +"ñ";
				break;
			case 'ñ':
				System.out.println('ñ');
				codec=codec +"o";
				break;
			case 'o':
				System.out.println('o');
				codec=codec +"p";
				break;
			case 'p':
				System.out.println('p');
				codec=codec +"q";
				break;
			case 'q':
				System.out.println('q');
				codec=codec +"r";
				break;
			case 'r':
				System.out.println('r');
				codec=codec +"s";
				break;
			case 's':
				System.out.println('s');
				codec=codec +"t";
				break;
			case 't':
				System.out.println('t');
				codec=codec +"u";
				break;
			case 'u':
				System.out.println('u');
				codec=codec +"v";
				break;
			case 'v':
				System.out.println('v');
				codec=codec +"w";
				break;
			case 'w':
				System.out.println('w');
				codec=codec +"x";
				break;
			case 'x':
				System.out.println('x');
				codec=codec +"y";
				break;
			case 'y':
				System.out.println('y');
				codec=codec +"z";
				break;
			case 'z':
				System.out.println('z');
				codec=codec +" ";
				break;
				
			default:
				System.out.println(' ');
				codec=codec +"a";
				break;
			}
		}	
		System.out.println("codificacion: "+codec);
			
		//Desplazamiento de 2
		codec="";
		for (int i = 0; i < desplazo1.length(); i++) {			
			caracter=desplazo1.charAt(i);
			switch (caracter) {
			case 'a':
				System.out.println('a');
				codec=codec +"c";
				break;
			case 'b':
				System.out.println('b');
				codec=codec +"d";
				break;
			case 'c':
				System.out.println('c');
				codec=codec +"e";
				break;
			case 'd':
				System.out.println('d');
				codec=codec +"f";
				break;
			case 'e':
				System.out.println('e');
				codec=codec +"g";
				break;
			case 'f':
				System.out.println('f');
				codec=codec +"h";
				break;
			case 'g':
				System.out.println('g');
				codec=codec +"i";
				break;	
			case 'h':
				System.out.println('h');
				codec=codec +"j";
				break;
			case 'i':
				System.out.println('i');
				codec=codec +"k";
				break;
			case 'j':
				System.out.println('j');
				codec=codec +"l";
				break;
			case 'k':
				System.out.println('k');
				codec=codec +"m";
				break;
			case 'l':
				System.out.println('l');
				codec=codec +"n";
				break;
			case 'm':
				System.out.println('m');
				codec=codec +"ñ";
				break;
			case 'n':
				System.out.println('n');
				codec=codec +"o";
				break;
			case 'ñ':
				System.out.println('ñ');
				codec=codec +"p";
				break;
			case 'o':
				System.out.println('o');
				codec=codec +"q";
				break;
			case 'p':
				System.out.println('p');
				codec=codec +"r";
				break;
			case 'q':
				System.out.println('q');
				codec=codec +"s";
				break;
			case 'r':
				System.out.println('r');
				codec=codec +"t";
				break;
			case 's':
				System.out.println('s');
				codec=codec +"u";
				break;
			case 't':
				System.out.println('t');
				codec=codec +"v";
				break;
			case 'u':
				System.out.println('u');
				codec=codec +"w";
				break;
			case 'v':
				System.out.println('v');
				codec=codec +"x";
				break;
			case 'w':
				System.out.println('w');
				codec=codec +"y";
				break;
			case 'x':
				System.out.println('x');
				codec=codec +"z";
				break;
			case 'y':
				System.out.println('y');
				codec=codec +" ";
				break;
			case 'z':
				System.out.println('z');
				codec=codec +"a";
				break;
				
			default:
				System.out.println(' ');
				codec=codec +"b";
				break;
			}
		}	
		System.out.println("codificacion: "+codec);
			
	}
	
	// guìa de ejercicio 1 - C
	public static void tareaNumerosX(){
		int vector[] = new int[] {5, 10, 3, 80, 8, 20};
		int x = 8;
		int suma=0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i]> x) {
				suma= suma+vector[i];
			}
			
		}		
		System.out.println("suma : "+suma);
	}
	
	// guìa de ejercicio 1 - B
	public static void tareaVectores(){
		
		int vector[] = new int[] {50, 12, 20};
		Arrays.sort(vector);
		for (int i = 0; i < vector.length; i++) {
			
			System.out.println(vector[i]);	
			
		}
		
	}
		
		
	
	public static void temaArrays(){
		int numeros[] = new int [3];
		int ordenados[]= new int[] {1, 16, 25, 34, 40, 45, 49};
		
		numeros[0]=1;
		numeros[1]=37;
		numeros[2]=16;
		
		int mayor = numeros[0];
		int sumatoria = 0;
		int promedio;
		int menor= numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
				
			}
			sumatoria = sumatoria + numeros[i];
			  
		} 
		promedio = sumatoria/ numeros.length;
		
		
		for (int numero: numeros) {
			if (numero< menor) {
				menor=numero;
				System.out.println(numero);
			}
		
		}
		
		System.out.println();
		System.out.println(menor);
		System.out.println(mayor);
		System.out.println(sumatoria);
		System.out.println(promedio);
		System.out.println();
		
	}
	// guìa de ejercicio 1 - A
	public static void tareaString(){
		
		String palabra = "unapalabra";
		String[] letras = palabra.split("a");
		int cantiLetra = 0;
		for (String elemento : letras) {
			cantiLetra ++;
		}
		System.out.println("cantidad de A : "+ cantiLetra);
		
	}	
	
	public static void temaString(){
		String saludo = "hola que tal?";
		System.out.println(saludo.toUpperCase());
		System.out.println(saludo);
		saludo = "hola y chau";
		System.out.println(saludo);
		saludo = saludo.toUpperCase();
		System.out.println(saludo);
		
		String[] saludoPartido1= saludo.split(" ");
		for (String palabra : saludoPartido1) {
			System.out.println(palabra);
		}
		System.out.println(saludo.length());
	}
	
	public static void tablaDelDos() {
		int unValor = 1;
		while (unValor <11) {
			System.out.println(unValor * 2 );
			unValor ++ ;
		}
		System.out.println("Esta es la tabla del 2 ");
	}
	
	public static void tablaDelTres() {
		String miTexto;
		for (int i=1; i<=10; i++) {
			miTexto= "3 x "+ i + " = " + i*3;
			System.out.println(miTexto);
		}
		System.out.println("Esta es la tabla del 3 ");
	}
	public static String devuelveDiaSemana(int dia) {
		
		switch (dia) {
		case 1:
			return "Domingo";
		case 2:
			return "Lunes";
		case 3:
			return "Martes";
		case 4:
			return "Miercoles";
		case 5:
			return "Jueves";
		case 6:
			return "Viernes";
		case 7:
			return "Sabado";
		default:
				return "Día inválido";
		}
	
	}
	
	public static boolean numeroPrimo (int numero){
		
		boolean aux = true;
		int divisor = 3;
		if (numero % 2 == 0) {
			return false;
		}else {
			while (aux) {
				if (numero % divisor == 0) {
					aux = false;
					return false;
				}
				divisor = divisor + 2;
				if (divisor >= numero) {
					aux = false;
					return true;
				}


			}
		}
		
		return true;
	}
}
