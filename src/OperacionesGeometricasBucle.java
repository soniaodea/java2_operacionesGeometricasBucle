import java.util.Scanner;

import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Rectangulo;

//CLASSPATH=:/home/zubiri/ProyectosJava; export CLASSPATH

public class OperacionesGeometricasBucle {

	public static void main (String[] args) {

		String seleccion;

		char letra;
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("\nElige una de estas opciones: Circulo, Rectangulo o Terminar (C/R/T)");

		//1.- seleccion = sc.next();

		//2.- seleccion = sc.next().charAt(0);
	
		seleccion = sc.next();
		letra = seleccion.charAt(0);	
	
		//while (!seleccion.equalsIgnoreCase("terminar"))
			while ((letra != 'T')&&(letra != 't'))
		{
			//if(seleccion.equalsIgnoreCase("circulo")){
			//System.out.println("has elegido circulo");
			if ((letra == 'C')||(letra == 'c')){

			double radio, resultadoArea, resultadoCircun;

			System.out.print("\ningresa un radio: ");
			radio = sc.nextDouble();

			Circulo operaciones = new Circulo(radio);

			resultadoArea = operaciones.area();
			resultadoCircun = operaciones.circunferencia();

			System.out.println("\nEl resultado del AREA es: " + resultadoArea);
			System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + resultadoCircun);
	
			System.out.println("\n\nEGUN ONA IZAN!!\n");

			}


			else {
				//if (seleccion.equalsIgnoreCase("rectangulo")){
				//System.out.println("has elegido rectangulo");
				if ((letra == 'R')||(letra == 'r')){
	
				  double altura = 0, base = 0;
				  double result = 0;
		
				  System.out.print("Estamos trabajando con un rectangulo");

				  System.out.print("\ningresa la altura: ");
				  altura = sc.nextDouble();

				  System.out.print("\ningresa la base: ");
				  base = sc.nextDouble();

				  Rectangulo rectangulo = new Rectangulo(base, altura);

				  result =  rectangulo.area();
				  System.out.println("El area del rectangulo: " + result); 
				
				  result =  rectangulo.perimetro();
				  System.out.println("El perimetro del rectangulo: " + result); 
				}

				else{
				System.out.println("Error no has elegido la opcion correcta");
				}
			}
			System.out.println("\nElige una de estas opciones: Circulo, Rectangulo o Terminar (C/R/T)");
			seleccion = sc.next();
			letra = seleccion.charAt(0);
		}
	}
}
