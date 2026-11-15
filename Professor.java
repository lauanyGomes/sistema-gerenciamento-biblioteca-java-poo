public class Professor extends Usuario {
    private String departamento;
    private String siape;

    public Professor(String nome, String cpf, String email, String departamento, String siape) {
        super(nome, cpf, email);
        this.departamento = departamento;
        this.siape = siape;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public String getSiape() { return siape; }
    public void setSiape(String siape) { this.siape = siape; }

    @Override
    public String toString() {
        return "[Professor] " + super.toString() + " | Depto: " + departamento + " | SIAPE: " + siape;
    }
}
