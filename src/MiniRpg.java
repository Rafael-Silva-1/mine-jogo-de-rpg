import java.util.Scanner;

public class MiniRpg{
    public static void main(String[] args) {

        // DECLARAÇÃO DE VARIAVEL
        Scanner sc;
        String nomeHero, nomeVillain1;
        int escolha, vidaHero, pocaoHero, vidaVillain1;



        // INICIO
        sc = new Scanner(System.in);


        System.out.println("========================================");
        System.out.println("              MINI RPG JAVA             ");
        System.out.println("========================================");
        System.out.println("");


        System.out.print("Digite o nome do aventureiro: ");
        nomeHero = sc.nextLine();
        System.out.println("");


        vidaHero = 100;
        pocaoHero = 2;

        vidaVillain1 = 80;
        nomeVillain1 = "Goblin";


        System.out.println("----------FICHA DO AVENTUREIRO----------");
        System.out.println("Nome: " + nomeHero);
        System.out.println("Vida: " + vidaHero + "Hp");
        System.out.println("Poções: " + pocaoHero);
        System.out.println("");


        System.out.println("-----------INIMIGO ENCONTRADO-----------");
        System.out.println("Nome: " + nomeVillain1);
        System.out.println("Vida: " + vidaVillain1 + "Hp");
        System.out.println("");


        System.out.println("Prepare-se para a batalha!");



        System.out.println("========== TURNO DO AVENTUREIRO ==========");
        System.out.println("");

        System.out.println("1 - Atacar");
        System.out.println("2 - Usar poção");
        System.out.println("3 - Fugir");
        escolha = sc.nextInt();
        System.out.println("");

        switch (escolha) {
            case 1:
                System.out.println("Você atacou o Goblin!");
                break;
            case 2:
                System.out.println("Você usou uma poção!");
                break;
            case 3:
                System.out.println("Você fugiu da batalha!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }





        sc.close();

    }
}