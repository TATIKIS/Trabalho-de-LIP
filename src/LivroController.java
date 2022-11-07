import java.util.ArrayList;
public class LivroController {
    private ArrayList<Livro> livro = new ArrayList<>();
    public void salvarLivro(Livro livros){
        livro.add(livros);
        System.out.println("Livro salvo com sucesso!");
    }

    public void excluirLivro(int id){
        for (int i = 0; i < livro.size(); i++){
            if (livro.get(i).getId() == id ){
                livro.remove(i);
                System.out.println("Livro excluido com sucesso!");
            }
        }
    }
    public void vendedorPrint(){
        if (livro.isEmpty()){
            System.out.println("Vazio!");
        }
        else {
            System.out.println(livro);
            System.out.println("Quantidade em estoque:" + livro.size());
        }
    }
    @Override
    public String toString() {
        return "Livro:" + '\n'+
                "Livro:" + livro +'\n';
    }
 }


