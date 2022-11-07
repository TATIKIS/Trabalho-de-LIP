public class HistoricoDeVendas {
    private String nomedolivrovendido;
    private double precodolivrovendido;
    private String tipodolivrovendido;
    private int quantidadevendida;
    private int id_dolivrovendido;

    public String getNomedolivrovendido() {return nomedolivrovendido;}

    public void setNomedolivrovendido(String nomedolivrovendido) {this.nomedolivrovendido = nomedolivrovendido;}

    public double getPrecodolivrovendido() {return precodolivrovendido;}

    public void setPrecodolivrovendido(double precodolivrovendido) {this.precodolivrovendido = precodolivrovendido;}

    public String getTipodolivrovendido() {return tipodolivrovendido;}

    public void setTipodolivrovendido(String tipodolivrovendido) {this.tipodolivrovendido = tipodolivrovendido;}

    public int getQuantidadevendida() {return quantidadevendida;}

    public void setQuantidadevendida(int quantidadevendida) {this.quantidadevendida = quantidadevendida;}

    public int getId_dolivrovendido() {return id_dolivrovendido;}

    public void setId_dolivrovendido(int id_dolivrovendido) {this.id_dolivrovendido = id_dolivrovendido;}

    public HistoricoDeVendas (String n, double prc, String tip, int qtd, int id){
        setNomedolivrovendido(n);
        setPrecodolivrovendido(prc);
        setTipodolivrovendido(tip);
        setQuantidadevendida(qtd);
        setId_dolivrovendido(id);
    }
    @Override
    public String toString() {
        return "Livros Vendidos:" + '\n'+
                "Nome:" + getNomedolivrovendido() +'\n'+
                "Preço:" + getPrecodolivrovendido() +'\n'+
                "Tipo:" + getTipodolivrovendido() +'\n'+
                "Quantidade vendida:" + getQuantidadevendida() +'\n'+
                "ID:" + getId_dolivrovendido() +'\n';
    }
}
