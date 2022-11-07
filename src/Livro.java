public class Livro {
    private String nome;
    private Double preco;
    private String tipo;
    private int quantidade_do_livro;
    private int id;
    private static int count = 1;

    public String getNome() {return nome;}

    public void setNome(String n) {this.nome = n;}

    public double getPreco() {return preco;}

    public void setPreco(double prc) {this.preco = prc;}
    public String getTipo() {return tipo;}
    public void setTipo(String tp) {this.tipo = tp;}

    public int getQuantidade_do_livro() {return quantidade_do_livro;}

    public void setQuantidade_do_livro(int quantidade_do_livro) {this.quantidade_do_livro += quantidade_do_livro;}
    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public Livro(String n, double prc,String tp, int qtd){
        setNome(n);
        setPreco(prc);
        setTipo(tp);
        setQuantidade_do_livro(qtd);
        id = count ++;
    }
    @Override
    public String toString() {
        return "Livro:" + '\n'+
                "Nome:" + getNome() +'\n'+
                "Preço:" + getPreco() +'\n'+
                "Tipo:" + getTipo() +'\n'+
                "Quantidade:" + getQuantidade_do_livro() +'\n'+
                "ID:" + getId() +'\n';
    }
}


