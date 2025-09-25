public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private boolean disponivel;

    public Carro(String uno, String number, String preto, boolean disponivel){

    }

    public Carro(String modelo, int ano, String cor, boolean disponivel){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.disponivel = disponivel;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public boolean isDisponivel(){
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    @Override
    public String toString(){
        return "Modelo: " + this.modelo + " - Ano: " + this.ano +
                " - Cor: " + this.cor + " - Disponivel:" + this.disponivel;

    }
}
