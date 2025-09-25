import javax.swing.*;
import java.util.ArrayList;

public class Principal {

    private static Locadora locadora = new Locadora();

    private static final String MENU = """
            LOCADORA DE CARROS
            1 - Cadastrar Carro
            2 - Cadastrar Cliente
            3 - Alugar Carro
            4 - Devolver Carro
            5 - Listar Carros Disponíveis
            6 - Sair
            """;


    public static void main(String[] args) {


        locadora.cadastrarCarro(new Carro("Gol", 2020, "Prata", true));
        locadora.cadastrarCarro(new Carro("Civic", 2018, "Preto", true));
        locadora.cadastrarCarro(new Carro("Onix", 2022, "Branco", true));
        locadora.cadastrarCarro(new Carro("Corolla", 2019, "Cinza", true));
        locadora.cadastrarCarro(new Carro("Fiesta", 2017, "Vermelho", true));

        while (true) {
            String opcaoStr = JOptionPane.showInputDialog(null, MENU, "Menu", JOptionPane.QUESTION_MESSAGE);
            if (opcaoStr == null) break;

            int opcao;
            try {
                opcao = Integer.parseInt(opcaoStr.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                continue;
            }

            switch (opcao) {
                case 1 -> cadastrarCarro();
                case 2 -> cadastrarCliente();
                case 3 -> alugarCarro();
                case 4 -> devolverCarro();
                case 5 -> listarCarrosDisponiveis();
                case 6 -> {
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema. Até logo!");
                    return;
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    private static void cadastrarCarro() {
        String modelo = JOptionPane.showInputDialog("Modelo do carro:");
        String anoStr = JOptionPane.showInputDialog("Ano do carro:");
        String cor = JOptionPane.showInputDialog("Cor do carro:");

        if (modelo == null || anoStr == null || cor == null) return;

        try {
            int ano = Integer.parseInt(anoStr.trim());
            Carro carro = new Carro(modelo.trim(), ano, cor.trim(), true);
            locadora.cadastrarCarro(carro);
            JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ano inválido.");
        }
    }

    private static void cadastrarCliente() {
        String nome = JOptionPane.showInputDialog("Nome do cliente:");
        String cpf = JOptionPane.showInputDialog("CPF do cliente:");
        String idadeStr = JOptionPane.showInputDialog("Idade do cliente:");

        if (nome == null || cpf == null || idadeStr == null) return;

        try {
            int idade = Integer.parseInt(idadeStr.trim());
            Cliente cliente = new Cliente(nome.trim(), cpf.trim(), idade);
            locadora.cadastrarCliente(cliente);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Idade inválida.");
        }
    }

    private static void alugarCarro() {
        String modelo = JOptionPane.showInputDialog("Modelo do carro para alugar:");
        if (modelo == null || modelo.trim().isEmpty()) return;

        boolean sucesso = locadora.alugarCarro(modelo.trim());
        JOptionPane.showMessageDialog(null, sucesso ? "Carro alugado com sucesso!" : "Carro indisponível ou não encontrado.");
    }

    private static void devolverCarro() {
        String modelo = JOptionPane.showInputDialog("Modelo do carro para devolver:");
        if (modelo == null || modelo.trim().isEmpty()) return;

        boolean sucesso = locadora.devolverCarro(modelo.trim());
        JOptionPane.showMessageDialog(null, sucesso ? "Carro devolvido com sucesso!" : "Carro não estava alugado ou não encontrado.");
    }

    private static void listarCarrosDisponiveis() {
        String lista = locadora.listarCarrosDisponiveis();
        JOptionPane.showMessageDialog(null, lista);
    }
}
