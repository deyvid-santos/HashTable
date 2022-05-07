public class Lista {
    NoHash inicio; //Ponteiro para o inicio da lista
    int tamanho; // Tamanho da lista

    public void inserir(ContatoHash info) { // Método para inserir no inicio
        NoHash no = new NoHash(); // Cria um No
        no.info = info; // Atribui informação ao no
        no.proximo = inicio; // O ponteiro proximo do no inserido aponta para o inicio
        inicio = no; // O inicio passa a ser esse novo no
        tamanho++; // tamanho = tamanho + 1
    }

    public ContatoHash buscar(int codigo){ // Buscar
        NoHash no = inicio; // inicio da lista
        while (no != null){ // Enquanto o nó não for nulo
            // Se o código do nó foi igual do parâmetro passado retorne a informação codigo
            if (no.info.codigo == codigo) return no.info;
            no = no.proximo;  //Vai para o nó proximo
        }
        return null;
    }

    @Override
    public String toString() {
        String out = ""; // Empty String
        NoHash no = inicio; // Inicio da Lista
        while (no != null){ // Enquanto nó for diferente de nulo, adicione a string a informação e vá para o próximo nó
            out += no.info + " ";
            no = no.proximo;
        }
        return out; // Retorna a string
    }
}
