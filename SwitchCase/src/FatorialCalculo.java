import java.util.Scanner;
public class FatorialCalculo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1, x, f=1;
		
		System.out.println("Digite um n�mero para o c�lculo de seu fatorial: ");
		x = in.nextInt();
		
		while(i <= x) {
		f *= i;
		  
		i++;
		}
		System.out.println("O fatoria de "+x+" �: "+f);

		in.close();
	}
	
}
