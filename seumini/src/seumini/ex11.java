package seumini;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cont, num,pri=0;
		System.out.println("Digite um numero");
		num=in.nextInt();
		cont =2;
		
		while(cont<num) {
			if(num%cont==0) {
				pri=1;
				break;
			}
			cont++;
			
		}
		System.out.println (num!=1 && pri==0 ? "é primo" : "não é primo");
		
		in.close();

	}

}
