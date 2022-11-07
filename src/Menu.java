import java.util.ArrayList;
import java.util.Scanner;
public class Menu  {
    public String opcao;
    LivroController lv = new LivroController();
    HitoricoDeVendasController lvpd = new HitoricoDeVendasController();

    public void menuPrincipal() {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("+====================================================================+");
            System.out.println("                       !!!Bem vindo!!!                                ");
            System.out.println("Para navegar no menu basta digitar o número que corresponde à escolha!");
            System.out.println("+====================================================================+");
            System.out.println("(1) Acessar como vendendor");
            System.out.println("(2) Acessar como cliente");
            System.out.println("(0) sair");
            opcao = scan.next();
            if (opcao.equals("1")) {
                login();
                break;
            }
            else if (opcao.equals("2")) {
                submenuCliente();
                break;
            }
            else if (opcao.equals("0")) {
                break;
            }
            else {
                System.out.println("Opcao inválida");
            }
        }
    }
    public void login() {
        Scanner scan = new Scanner(System.in);
        Login login = new Login("admim", "admim");

        while (true){
            System.out.println("+====================================================================+");
            System.out.println("                          !!!Login!!!                                 ");
            System.out.println("+====================================================================+");
            System.out.println("Nome:");
            String nomelogin = scan.next();
            System.out.println("Senha:");
            String senhalogin = scan.next();
            if (nomelogin.equals("admim") & senhalogin.equals("admim")) {
                submenuVendedor();
                break;
            }
            else {
                System.out.println("Acesso negado!");
            }
        }
    }
    public void submenuVendedor() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("+====================================================================+");
            System.out.println("                !!!Navegação em modo vendedor!!!                       ");
            System.out.println("+====================================================================+");
            System.out.println("(1) Adicionar livros");
            System.out.println("(2) Listar meus livros");
            System.out.println("(3) Excluir livros");
            System.out.println("(4) Livros vendidos");
            System.out.println("(v) voltar");
            opcao = scan.next();
            if (opcao.equals("1")) {
                System.out.println("Nome do livro:");
                String nome = scan.next();
                System.out.println("Preço:");
                try{
                    Double preco = scan.nextDouble();
                    System.out.println("Tipos permitdos: Aventura, Drama e Comédia!");
                    System.out.println("Tipo:");
                    String tipo = scan.next();
                    System.out.println("Declarar quantidade à adicionar:");
                    int quantidade = scan.nextInt();
                    Livro lvr = new Livro(nome, preco, tipo, quantidade);
                    lv.salvarLivro(lvr);
                } catch (Exception preco){
                    System.out.println("Caractere inválido, digite apenas números");
                }
            } else if (opcao.equals("2")) {
                lv.vendedorPrint();
            } else if (opcao.equals("3")) {
                lv.vendedorPrint();
                System.out.println("Digite o ID do livro a ser excluido aqui:");
                int id = scan.nextInt();
                lv.excluirLivro(id);
            } else if (opcao.equals("4")) {
                lvpd.livrosVendidos();
            } else if (opcao.equals("v")) {
                menuPrincipal();
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    public void submenuCliente() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("+====================================================================+");
            System.out.println("                  !!!Navegação em modo cliente!!!                     ");
            System.out.println("+====================================================================+");
            System.out.println("(1) Listar livros a venda");
            System.out.println("(2) Compar livros");
            System.out.println("(v) voltar");
            opcao = scan.next();
            if (opcao.equals("1")) {
                lv.vendedorPrint();
            } else if (opcao.equals("2")) {
                lv.vendedorPrint();
                System.out.println("Digite aqui nome do Livro:");
                String nomelivrovenda = scan.next();
                System.out.println("Digite aqui o preço:");
                Double precovenda = scan.nextDouble();
                System.out.println("Digite aqui o Tipo:");
                String tipovenda = scan.next();
                System.out.println("Digite aqui a quantidade a se comprada:");
                int quantidavenda = scan.nextInt();
                System.out.println("Digite aqui o id do livro:");
                int idvenda = scan.nextInt();
                HistoricoDeVendas lpv = new HistoricoDeVendas(nomelivrovenda, precovenda, tipovenda, quantidavenda, idvenda);
                lvpd.comprarLivro(idvenda,lpv,quantidavenda);
            } else if (opcao.equals("v")) {
                menuPrincipal();
                break;
            } else {
                System.out.println("Opção válida!");
            }
        }
    }
}

