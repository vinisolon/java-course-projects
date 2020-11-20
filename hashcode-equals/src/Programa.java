public class Programa {
    public static void main(String[] args) {

        /**
         * HashCode tem a comparação mais rapida que Equals. Porém, existe uma chance minima dos
         * valores hash serem identicos entre os objetos diferentes. Já o Equals sempre retorna
         * a comparação 100% correta.
         * Indicado sempre que quiser comparar pelo conteúdo dos objetos, usar o método Equals.
         */

        Pessoa pessoaA = new Pessoa("Vinicius Solon", "321654987");
        Pessoa pessoaB = new Pessoa("Nikolas Maganini", "987654321");
        Pessoa pessoaC = new Pessoa("noloS suiciniV", "789456123"); //"Anagrama"
        Pessoa pessoaD = new Pessoa("Vinicius Solon", "321654987");


        System.out.println("hashCode pessoa A: " + pessoaA.hashCode());
        System.out.println("hashCode pessoa B: " + pessoaB.hashCode());
        System.out.println("hashCode pessoa C: " + pessoaC.hashCode());
        System.out.println("Comparação de hashCode entre A e B: " + (pessoaA.hashCode() == pessoaB.hashCode()));
        System.out.println("Comparação com equals entre A e B: " + pessoaA.equals(pessoaB));
        System.out.println("Comparação com equals entre A e C: " + pessoaA.equals(pessoaC));
        System.out.println("Comparação dos objetos A e D pela referência na memória: " + (pessoaA == pessoaD));

        String strA = "teste";
        String strB = "teste";
        String strC = new String("teste");
        String strD = new String("teste");

        System.out.println("Comparação entre strings literais (String str = 'texto'): " + (strA == strB));
        System.out.println("Comparação entre strings instanciada (String str = new String('texto')): " + (strC == strD));
    }
}
