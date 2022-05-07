public class Hash {
    int operador; // Atributo operador
    Lista[] vetor; // Vetor de listas

    Hash(int operador){ // Construtor iniciando com o operador
        this.operador = operador; // Inicializa o operador
        vetor = new Lista[operador]; // Vetor de listas
        for (int i = 0; i < operador; i++){ // Para cada posicao no vetor inicialize a lista dqla posicao vetor
            vetor[i] = new Lista();
        }
    }

    void inserir(ContatoHash contato) { // Inserir
        int chave = contato.codigo % operador; // Posicao = resto do codigo % operador
        vetor[chave].inserir(contato);  // insere o contato naquela lista
    }

    ContatoHash buscar(int codigo){ // Buscar
        return vetor[codigo % operador].buscar(codigo); // Busca apenas uma lista especifica
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < operador; i++) { // String para cada saída
            out += "" + i + ": "; // adiciona uma string representando a lista
            out += vetor[i % operador] + " \n";
        }
        return out; // Retorna a string
    }
}
