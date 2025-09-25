public class Cliente {
    private String nome;
    private String cpf;
    private int idade;

    public Cliente(){

    }

    public Cliente(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + " - CPF: " + this.cpf +
                " - Idade: " + this.idade;
    }
}
