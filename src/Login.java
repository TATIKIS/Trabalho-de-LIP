public class Login {
    private String nomelogin;
    private String senha;
    public String getNomelogin() {return nomelogin;}

    public void setNomelogin(String nomelogin) {this.nomelogin = nomelogin;}

    public String getSenha() {return senha;}

    public void setSenha(String senha) {this.senha = senha;}

    public Login(String nome, String senha) {
        setNomelogin(nome);
        setSenha(senha);
    }
    @Override
    public String toString() {
        return "Login:" + '\n'+
                "Nome:" + getNomelogin() +'\n'+
                "Senha:" + getSenha() +'\n';
    }
}
