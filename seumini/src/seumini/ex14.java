package seumini;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, sinal = 1;
		double conta=0;
		
		System.out.println("Digite um numero");
		num = in.nextInt();
		
		for(int cont=1;cont<=num;cont++) {
			
			conta= conta + sinal *1.0 /cont;
			sinal = -sinal;
			
		}
		
		System.out.println(conta);
		in.close();
	}

}
