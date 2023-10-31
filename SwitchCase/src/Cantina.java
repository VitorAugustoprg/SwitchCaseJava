import java.util.Scanner;
public class Cantina {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c; 
		
		System.out.println("Entre com o código: ");
		c = in.nextInt();
		
		switch(c) {
		     
		case 1: 
			System.out.println("Cachorro quente: R$6,50");
			break;
		case 2:
			System.out.println("Cheeseburger: R$8,00");
			break;
		case 3:
			System.out.println("X-Salada: R$9,50");
			break;
		case 4:
			System.out.println("Misto quente: R$7,50");
			break;
		case 5:
			System.out.println("Pão na chapa: R$4,00");
			break;
		default:
			System.out.println("Código inválido/Produto não encontrado!");
			
			
		
		}
		
		in.close();
	}
	
}
