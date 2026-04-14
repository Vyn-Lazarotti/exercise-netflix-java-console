import java.util.Scanner;

public class Netflix {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bem-vindo(a) a Netflix!");

        System.out.println("Primeiro passo: Validação de plano!");
        System.out.println("Plano 1: Básico (Resolução 720p - 1 tela disponível)");
        System.out.println("Plano 2: Padrão (Resolução 1080p (Full HD) - 2 telas disponíveis)");
        System.out.println("Plano 3: Premium (Resolução 4K + HDR - 4 telas disponíveis)");
        System.out.println("Escolha seu plano: ");
        int plano = teclado.nextInt();
        switch (plano) {
            case 1:
                System.out.println("Plano Básico selecionado! Aproveite! :)");
                break;
            case 2:
                System.out.println("Plano Padrão selecionado! Aproveite! :)");
                break;
            case 3:
                System.out.println("Plano Premium selecionado! Aproveite! :)");
                break;
            default:
                System.out.println("Código de plano inválido.");
                break;
        }

        System.out.println("Segundo passo: Classificação de Conteúdo!");
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        if (idade < 12) {
            System.out.println("Categoria: Infantil (Desenhos e Animações)");
        } else if (idade >= 12 || idade <= 17) {
            System.out.println("Categoria: Adolescente (Séries Teen e Aventura)");
        } else {
            System.out.println("Categoria: Adulto (Filmes de Ação e Documentários)");
        }

        System.out.println("Terceiro passo: Bônus regional!");
        System.out.println("Digite seu país: ");
        String local = teclado.nextLine();
        if (local.equalsIgnoreCase("Brasil")) {
            System.out.println("Destaque: Assista agora produções originais brasileiras! :D");
        } else {
            System.out.println("Sem bônus regional :(");
        }
        

        teclado.close();
    }
}
