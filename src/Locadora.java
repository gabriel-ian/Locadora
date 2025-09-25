import java.util.ArrayList;

public class Locadora {
    private ArrayList<Carro> carros;
    private ArrayList<Cliente> clientes;

    public Locadora(){
        this.carros = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCarro(Carro c){
        if (c != null){
            this.carros.add(c);
        }
    }

    public void cadastrarCliente(Cliente c){
        if (c != null){
            this.clientes.add(c);
        }
    }
    public boolean alugarCarro(String modelo) {
        for (Carro carro : carros) {
            if (carro.getModelo().equalsIgnoreCase(modelo) && carro.isDisponivel()) {
                carro.setDisponivel(false);
                System.out.println("Carro alugado: " + modelo);
                return true;
            }
        }
        System.out.println("Carro indisponível ou não encontrado: " + modelo);
        return false;
    }

    public boolean devolverCarro(String modelo) {
        for (Carro carro : carros) {
            if (carro.getModelo().equalsIgnoreCase(modelo) && !carro.isDisponivel()) {
                carro.setDisponivel(true);
                System.out.println("Carro devolvido: " + modelo);
                return true;
            }
        }
        System.out.println("Carro não estava alugado ou não encontrado: " + modelo);
        return false;
    }

    public String listarCarrosDisponiveis() {
        StringBuilder sb = new StringBuilder("Carros disponíveis:\n");
        boolean encontrou = false;
        for (Carro carro : carros) {
            if (carro.isDisponivel()) {
                sb.append("- ").append(carro.toString()).append("\n");
                encontrou = true;
            }
        }
        if (!encontrou) {
            sb.append("Nenhum carro disponível no momento.");
        }
        return sb.toString();
    }


}
