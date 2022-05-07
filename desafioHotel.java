import java.util.Scanner;
public class desafioHotel {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		//Declaração de Variaveis
        int cli, i ,l ,b ,r;
		l = 0;
		b = 0;
		r = 0;
		int h[] = new int[3];
		int dat[][] = new int [3][3];
		//Primeira entrada referente ao tipo de cliente
		System.out.println("Por favor, informe que tipo de Cliente é você: \nDigite (1) para Regular(Cliente Normal) \nDigite (2) para Reward(Cliente Participante do programa de Fidelidade) ");
		cli = sc.nextInt();
		//Impedindo usuário de inserir um valor invalido
		while(cli < 1 || cli > 2) {
			System.out.println("Impossivel continuar, por favor digite um valor valido.");
			System.out.println("Por favor, informe que tipo de Cliente é você: \nDigite (1) para Regular(Cliente Normal) \nDigite (2) para Reward(Cliente Participante do programa de Fidelidade) ");
			cli = sc.nextInt();
		}
		//Segunda entrada referente as datas
		for(i = 0; i <= 2; i ++) {//Criando um laço de repetição para o usuário inserir as datas
			System.out.printf("Por favor digite a data referente ao seu "+ (i + 1) +"° dia de hospedagem:\n");
			System.out.println("Dia :");
			int d = sc.nextInt();
			while(d < 1 || d > 31) {//Impedindo usuário de inserir um valor invalido
				System.out.println("Não foi possivel.\nDigite novamente o Dia :");
				d = sc.nextInt();
			}
			System.out.println("Mês:");
			int m = sc.nextInt();
			while(m < 1 || m > 12) {//Impedindo usuário de inserir um valor invalido
				System.out.println("Não foi possivel.\nDigite novamente o Mês :");
				m = sc.nextInt();
			}
			System.out.println("Ano:");
			int y = sc.nextInt();
			//Armazenando as datas digitadas pelo usuário
			dat[i][0] = d;
			dat[i][1] = m;
			dat[i][2] = y;
			//Calculando qual é o dia da semana com base na data
			int s = (d + (2*m) + ((3*(m+1))/5) + y + (y/4) - (y/100) + (y/400) + 2) % 7;
			if (s == 0) {//validando o 7° dia
				s = s + 7;
			}
			h[i] = s;//Armazenando os dias da semana
		}
		//Validando o tipo de cliente
		if(cli == 1) {
			for(i = 0; i <= 2; i ++) {
				if(h[i] == 1 || h[i] == 7) {//Verificando o dia da semana 
					//Somando o valor dos hoteis
					l = l + 90;
					b = b + 60;
					r = r + 150;
				}else {
					//Somando o valor dos hoteis
					l = l + 110;
					b = b + 160;
					r = r + 220;
				}
			}
	 }else {
		 for(i = 0; i <= 2; i ++) {
				if(h[i] == 1 || h[i] == 7) {
					//Somando o valor dos hoteis
					l = l + 80;
					b = b + 50;
					r = r + 40;
				}else {
					//Somando o valor dos hoteis
					l = l + 80;
					b = b + 110;
					r = r + 100;
				}
			}
	 }
	//Imprimindo os resultados
	 if (cli == 1) {
			System.out.printf("Cliente Regular  ");
			System.out.printf("Datas : ");
			for (i = 0; i <= 2; i++ ) {
				System.out.printf("/");	
				for (int j = 0; j <= 2; j++ ) {
					System.out.printf(dat[i][j]+ "/");
				}
				System.out.printf("  ");
			}
	 }else {
			System.out.printf("Cliente Reward  ");
			System.out.printf("Datas : ");
			for (i = 0; i <= 2; i++ ) {
				System.out.printf("/");	
				for (int j = 0; j <= 2; j++ ) {
					System.out.printf(dat[i][j]+ "/");
				}
				System.out.printf("  ");
			}
	 }
		System.out.println("");
	 if(l < b){
		if(l < r) {
			System.out.printf("A melhor escolha de hotel é o Lakewood com o valor de R$"+ l +",00\n");
		}else if (l == r) {
			System.out.printf("A melhor escolha de hotel é o Ridgewood com o valor de R$"+ r +",00\n");
		}else{
			System.out.printf("A melhor escolha de hotel é o Ridgewood com o valor de R$"+ r +",00\n");
		}
	}else if(l == b && l == r){
		System.out.printf("A melhor escolha de hotel é o Ridgewood com o valor de R$"+ r +",00\n");
	}else if (l == b){
		if(b < r){
			System.out.printf("A melhor escolha de hotel é o Bridgewood com o valor de R$"+ b +",00\n");
		}else if(b == r){
			System.out.printf("A melhor escolha de hotel é o Ridgewood com o valor de R$"+ r +",00\n");
		}else {
			System.out.printf("A melhor escolha de hotel é o Ridgewood com o valor de R$"+ r +",00\n");
		}
	}else if (b < l) {
		if(b < r) {
			System.out.printf("A melhor escolha de hotel é o Bridgewood com o valor de R$"+ b +",00\n");
		}else {
			System.out.printf("A melhor escolha de hotel é o Ridgewood com o valor de R$"+ r +",00\n");
		}
	}
	}
}
