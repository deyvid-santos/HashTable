public class Main {
    public static void main(String[] args) {
        Hash hash = new Hash(4); // Tabela Hash com Operador 4
        hash.inserir(new ContatoHash(2, "Deyvid", "40028922"));
        hash.inserir(new ContatoHash(6, "Clécio", "40038922"));
        hash.inserir(new ContatoHash(13, "Carlos", "40048922"));
        hash.inserir(new ContatoHash(12, "Moisés", "40058922"));
        hash.inserir(new ContatoHash(7, "Yuri", "40068922"));

        // Saída - Hash e Listas
        System.out.println(hash);
    }
}
