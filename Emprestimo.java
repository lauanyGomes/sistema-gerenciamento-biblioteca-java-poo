public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private String dataEmprestimo;
    private String dataDevolucaoPrevista;
    private String status;

    public Emprestimo(Livro livro, Usuario usuario, String dataEmprestimo, String dataDevolucaoPrevista) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.status = "Ativo";
        livro.setQuantidadeDisponivel(livro.getQuantidadeDisponivel() - 1);
    }

    public Livro getLivro() { return livro; }
    public void setLivro(Livro livro) { this.livro = livro; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public String getDataEmprestimo() { return dataEmprestimo; }
    public void setDataEmprestimo(String dataEmprestimo) { this.dataEmprestimo = dataEmprestimo; }

    public String getDataDevolucaoPrevista() { return dataDevolucaoPrevista; }
    public void setDataDevolucaoPrevista(String dataDevolucaoPrevista) { this.dataDevolucaoPrevista = dataDevolucaoPrevista; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Empréstimo do Livro: \"" + livro.getTitulo() + "\" para " + usuario.getNome() + " | Status: " + status;
    }
}
