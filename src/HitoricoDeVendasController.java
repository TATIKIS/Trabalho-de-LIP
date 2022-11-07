import java.util.ArrayList;
public class HitoricoDeVendasController {
    private ArrayList<Livro> livro = new ArrayList<>();
    private ArrayList<HistoricoDeVendas> livrosVendidos = new ArrayList<>();
    public void comprarLivro(int id, HistoricoDeVendas livroVendido, int quantidade) {
        for (int i = 0; i < livro.size(); i++) {
            if (livro.get(i).getId() == id) {
                livro.get(i).setQuantidade_do_livro(-quantidade);
            }
        }
        livrosVendidos.add(livroVendido);
        System.out.println("Livros comprados com sucesso!");
    }
    public void livrosVendidos(){
        if (livrosVendidos.isEmpty()){
            System.out.println("Vazio!");
        } else {
            System.out.println(livrosVendidos);
        }
    }

    @Override
    public String toString() {
        return "Livro:" + '\n'+
                "Livro:" + livrosVendidos +'\n';
    }
}
