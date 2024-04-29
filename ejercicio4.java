package ejemplos;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) { 
	//Scanner es una clasae que permite meter datos
	Scanner teclado=new Scanner(System.in);
	System.out.println("Dame un numero");
	int n1=teclado.nextInt();
	System.out.println("El primer numero es "+n1);
	System.out.println("Dame otro numero");
	int n2=teclado.nextInt();
	System.out.println("El segundo numero es "+n2);
	
	int suma=0;
	int resta=0;
	int mul=0;
	float div=0.0f;
	int resto;
	
	suma=n1+n2;
	resta=n1-n2;
	mul=n1*n2;
	div=(float)n1/n2;
	resto=n1%n2;
	
	
	System.out.println("La suma es: "+suma);
	System.out.println("La resta es: "+resta);
	System.out.println("La multiplicacion es: "+mul);
	System.out.println("La division es: "+div);
	System.out.println("El resto es: "+resto);
	}

}
