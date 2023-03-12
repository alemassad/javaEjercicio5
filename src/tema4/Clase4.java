package tema4;

public class Clase4 {
	public static void main(String args[]) {
		/* Ejercicio A
		char orden = 'a';
		String numeros[] = {"15","18","6", "D"};
		ordenar(numeros, orden);
		
		*/
			int numero1 = Integer.parseInt(args[0]);
			int numero2 = Integer.parseInt(args[1]);
			int numero3 = Integer.parseInt(args[2]);
			if (args[3] == "D"){
				if (numero1 > numero2){
					if (numero2 > numero3){
						System.out.println(numero1);
						System.out.println(numero2);
						System.out.println(numero3);
					}
				}
			}
		// completar por los alumnos	
		

		
	}
	private static void ordenar(int[] numeros, char orden) {
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
		//Verificamos orden A o D
		if (orden == 'a') {
			for(int i=0; i<(numeros.length); i++){
				System.out.println(numeros[i]);
			}
		}else {
			for(int i=(numeros.length)-1; i >= 0; i--){
				System.out.println(numeros[i]);
			}
		}
	}
}
