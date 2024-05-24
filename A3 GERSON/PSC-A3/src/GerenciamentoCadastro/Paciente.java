
package GerenciamentoCadastro;


public class Paciente {
    private int id, idade;
    private String nome, tipoPlano;
    private long cpf, telefone;

    public Paciente () {
    
    }
    
    public Paciente(int idade, String nome, String tipoPlano, long cpf, long telefone) {
        this.idade = idade;
        this.nome = nome;
        this.tipoPlano = tipoPlano;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        if (this.idade <= 18){
            tipoPlano = "PLANO JUNIOR";
        } else if (this.idade <= 40 ) {
            tipoPlano = "PLANO PLENO";
        } else {
            tipoPlano = "PLANO SENIOR";
        }
        this.tipoPlano = tipoPlano;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    
    public String toString () {
    
        return nome + idade + tipoPlano;
    }
    
}
