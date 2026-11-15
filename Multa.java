public class Multa {
    private double valor;
    private boolean paga;
    private Emprestimo emprestimoAssociado;

    public Multa(double valor, Emprestimo emprestimoAssociado) {
        this.valor = valor;
        this.emprestimoAssociado = emprestimoAssociado;
        this.paga = false;
        emprestimoAssociado.setStatus("Atrasado (Com Multa)");
    }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public boolean isPaga() { return paga; }
    public void setPaga(boolean paga) { this.paga = paga; }

    public Emprestimo getEmprestimoAssociado() { return emprestimoAssociado; }
    public void setEmprestimoAssociado(Emprestimo emprestimoAssociado) { this.emprestimoAssociado = emprestimoAssociado; }

    @Override
    public String toString() {
        return "Multa no Valor de: R$ " + String.format("%.2f", valor) + " | Paga: " + (paga ? "Sim" : "Não") + " | Usuário: " + emprestimoAssociado.getUsuario().getNome();
    }
}
