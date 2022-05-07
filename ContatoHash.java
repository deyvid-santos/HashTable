/**
 * Classe ContatoHash
 */
public class ContatoHash {
    int codigo; // Código do contato
    String nome; // Nome do contato
    String telefone; // Telefone do contato

    ContatoHash(int codigo, String nome, String telefone) { // Construtor com parâmetros
        this.codigo = codigo; // atributos a serem inicializados
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "("+ codigo +","+ nome+ ")"; // Retorna em formato de String o código e o nome
    }
};