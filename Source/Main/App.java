package Source.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Source.Entidades.ProdutoImportado;
import Source.Entidades.Produtos;
import Source.Entidades.ProdutosUsados;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Produtos> produtos = new ArrayList<>();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        int quantidadeProdutos = obterQuantidadeProdutos(scan);

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("Produto #" + (i + 1) + ":");
            char resposta = obterTipoProduto(scan);

            String nome = obterNomeProduto(scan);
            double preco = obterPrecoProduto(scan);

            if (resposta == 'I') {
                double taxa = obterTaxaProduto(scan);
                Produtos produto = new ProdutoImportado(nome, preco, taxa);
                produtos.add(produto);
            } else if (resposta == 'U') {
                LocalDate dataFabricacao = obterDataFabricacao(scan, dateFormatter);
                Produtos produto = new ProdutosUsados(nome, preco, dataFabricacao);
                produtos.add(produto);
            } else {
                Produtos produto = new Produtos(nome, preco);
                produtos.add(produto);
            }
        }

        System.out.println();
        System.out.println("Etiquetas de preço: ");
        for (Produtos prod : produtos) {
            System.out.println(prod.getEtiquetaPreco());
        }

        scan.close();
    }

    private static int obterQuantidadeProdutos(Scanner scan) {
        System.out.print("Entre o número de produtos: ");
        return scan.nextInt();
    }

    private static char obterTipoProduto(Scanner scan) {
        char resposta;
        do {
            System.out.print("Comum, usado ou importado (C/U/I)? ");
            resposta = scan.next().toUpperCase().charAt(0);
            if (resposta != 'C' && resposta != 'U' && resposta != 'I') {
                System.out.println("Resposta inválida. Por favor, digite C, U ou I.");
            }
        } while (resposta != 'C' && resposta != 'U' && resposta != 'I');
        scan.nextLine(); // Limpar o buffer de entrada
        return resposta;
    }

    private static String obterNomeProduto(Scanner scan) {
        System.out.print("Nome: ");
        return scan.nextLine();
    }

    private static double obterPrecoProduto(Scanner scan) {
        System.out.print("Preço: ");
        return scan.nextDouble();
    }

    private static double obterTaxaProduto(Scanner scan) {
        System.out.print("Taxa: ");
        return scan.nextDouble();
    }

    private static LocalDate obterDataFabricacao(Scanner scan, DateTimeFormatter dateFormatter) {
        System.out.print("Fabricado em (DD/MM/AAAA): ");
        String dataFabricacaoStr = scan.next();
        return LocalDate.parse(dataFabricacaoStr, dateFormatter);
    }
}
