import java.util.Scanner;
public class cartaoBanco {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	int senha_eletronica = 313009;
	int o=0, new_password, resposta;
	
	System.out.println("Digite a senha eltr�nica: ");
	senha_eletronica = in.nextInt();
	
	if(senha_eletronica == 313009) {
		System.out.println("Acesso permitido");
		System.out.println("O que deseja fazer: [1]PIX [2]PAGAR BOLETO COM QR CODE [3]MUDAR SENHA ELTR�NICA");
		o = in.nextInt();
		switch(o) {
			case 1:
				System.out.println("[1]PIX");
				System.out.println("Sua chave pix �: (11) 99999-9999");
				break;
			case 2: 
				System.out.println("Por favor,libere o Itoken em seu dispositivo para prosseguir com a opera��o");
				break;
			case 3:
				System.out.println("Digite sua senha atual: ");
				senha_eletronica = in.nextInt();
					if(senha_eletronica == 313009) {
					System.out.println("Crie uma nova senha: ");
					new_password = in.nextInt();
					senha_eletronica = new_password;
					System.out.println("Deseja ver sua nova senha? [1] sim [2] n�o");
					resposta = in.nextInt();
					if(resposta == 1) {
						System.out.println("Sua nova senha �: "+new_password);
					}else {
						System.out.println("Concluindo servi�o, aguarde...");
					}
					}else {
					System.out.println("SENHA INV�LIDA");
					}
		}
	}else {
		System.out.println("Senha errada, tente novamente");
	}
	
	in.close();
	}
}
