package ejemplos;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		int suma=0;
		int contador=0;
		Scanner sn=new Scanner(System.in);
		System.out.print("Introduce un número: ");
		numero=sn.nextInt();
		
		while(numero!=0)
		{
		suma+=numero;
		contador++;//Contador=contador+1;
		System.out.print("Introduce un número: ");
		numero = sn.nextInt();
		}
		System.out.println("La media de los numeros positivos es: " +(float)(suma/contador));
		System.out.println("La media suma vale: "+ suma);
		sn.close();
	}

}
