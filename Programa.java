
public class Programa {
    public static void main(String[] args) {
        // 1. Instanciar a classe gerenciadora (Biblioteca)
        Biblioteca biblioteca = new Biblioteca();

        // 2. Cadastrar pelo menos 2 livros diferentes no acervo
        Livro livro1 = new Livro("Java: Como Programar", "Deitel & Deitel", "978-8543004792", 2016, 5);
        Livro livro2 = new Livro("Engenharia de Software", "Ian Sommerville", "978-8579361081", 2011, 2);
        
        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);

        // 3. Cadastrar pelo menos 2 usuários diferentes (um Aluno e um Professor)
        Aluno aluno = new Aluno("Ana Silva", "123.456.789-00", "ana@email.com", "202300123", "Computação");
        Professor professor = new Professor("Daniel Henrique", "987.654.321-11", "daniel@email.com", "Computação", "SIAPE-192837");

        biblioteca.cadastrarUsuario(aluno);
        biblioteca.cadastrarUsuario(professor);

        // 4. Realizar um empréstimo de um livro para um usuário
        Emprestimo emp = new Emprestimo(livro2, aluno, "10/11/2026", "17/11/2026");
        biblioteca.registrarEmprestimo(emp);

        // 5. Simular o cálculo ou registro de uma multa
        Multa multa = new Multa(15.50, emp);

        // 6. Exibir no console os dados consolidados
        biblioteca.listarUsuarios();
        biblioteca.listarAcervo();
        biblioteca.listarEmprestimos();
        
        System.out.println("\n--- DETALHES DA MULTA ---");
        System.out.println(multa);
    }
}
