Manual Técnico da Aplicação: Locadora de Carros

Estrutura do Projeto
O projeto é composto por quatro classes principais:
 
Carro 
Cliente  
Locadora  
Principal 


Classe Carro
Define os atributos e comportamentos de um carro:
- Atributos:
- modelo: nome do carro
- ano: ano de fabricação
- cor: cor do carro
- disponivel: booleano que indica se o carro está disponível para aluguel
- Métodos:
- Getters e setters para todos os atributos
- toString(): retorna uma descrição textual do carro
- Construtor duplicado: há um construtor não funcional (Carro(String uno, String number, String preto, boolean disponivel)) que pode ser removido

Classe Cliente
Define os dados de um cliente:
- Atributos:
- nome
- cpf
- idade
- Métodos:
- Getters e setters
- toString(): retorna uma descrição textual do cliente

Classe Locadora
Gerencia os dados e operações da locadora:
- Atributos:
- carros: lista de objetos Carro
- clientes: lista de objetos Cliente
- Métodos:
- cadastrarCarro(Carro c)
- cadastrarCliente(Cliente c)
- alugarCarro(String modelo): busca o carro pelo modelo e marca como indisponível
- devolverCarro(String modelo): busca o carro e marca como disponível
- listarCarrosDisponiveis(): retorna uma lista formatada dos carros disponíveis

Classe Principal
Interface principal com o usuário via JOptionPane:
- Menu interativo com opções:
- Cadastrar Carro
- Cadastrar Cliente
- Alugar Carro
- Devolver Carro
- Listar Carros Disponíveis
- Sair
- Fluxo de execução:
- Inicializa a locadora com 5 carros pré-cadastrados
- Exibe o menu em loop até o usuário escolher sair
- Cada opção chama um método específico que interage com o usuário via caixas de diálogo

Tecnologias Utilizadas
- Java SE
- Swing (JOptionPane) para interface gráfica
- Collections (ArrayList) para armazenar dados
