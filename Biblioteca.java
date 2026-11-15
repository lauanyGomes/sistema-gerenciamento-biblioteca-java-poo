import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervoLivros;
    private List<Usuario> cadastroUsuarios;
    private List<Emprestimo> emprestimosAtivos;

    public Biblioteca() {
        this.acervoLivros = new ArrayList<>();
        this.cadastroUsuarios = new ArrayList<>();
        this.emprestimosAtivos = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        acervoLivros.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        cadastroUsuarios.add(usuario);
    }

    public void registrarEmprestimo(Emprestimo emprestimo) {
        emprestimosAtivos.add(emprestimo);
    }

    public void listarAcervo() {
        System.out.println("\n--- ACERVO DE LIVROS ---");
        for (Livro l : acervoLivros) {
            System.out.println(l);
        }
    }

    public void listarUsuarios() {
        System.out.println("\n--- USUÁRIOS CADASTRADOS ---");
        for (Usuario u : cadastroUsuarios) {
            System.out.println(u);
        }
    }

    public void listarEmprestimos() {
        System.out.println("\n--- EMPRÉSTIMOS ATIVOS ---");
        for (Emprestimo e : emprestimosAtivos) {
            System.out.println(e);
        }
    }
}
