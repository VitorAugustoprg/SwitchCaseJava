import java.util.Scanner;
public class PlacaCirculacao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p; 
		
		System.out.println("Digite o �ltimo n�mero da placa:");
		p = in.nextInt();
		
		switch(p) {
		case 1:
		case 2:
			System.out.println("N�o pode circular Segunda-feira");
			break;
		case 3:
		case 4:
			System.out.println("N�o pode circular Ter�a-feira");
			break;
		case 5:
		case 6:
			System.out.println("N�o pode circular Quarta-feira");
			break;
		case 7:
		case 8:
			System.out.println("N�o pode circular Quinta-feira");
			break;
		case 9:
		case 0:
			System.out.println("N�o pode circular Sexta-feira");
			break;
		default:
			System.out.println("Placa inv�lida");
		}
	}
}
