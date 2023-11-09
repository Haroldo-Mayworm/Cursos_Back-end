package cursojava.maratonajava.cursojava.maratonajava.tiposprimitivos;

public class Aula01TiposPrimitivos {

    public static void main(String[] args) {
        // Tipos de dados primitivos
        byte numberByte = 10;
        short numbetShort = 20;
        int numberInteger = 30;
        long numberLong = 40;
        double numberDouble = 15.3;
        float numberFloat = 9.75F;
        char characterChar = 'a';
        boolean isTrue = false;
        
        // Casting
        double myDouble = 9.78;
        int myInteger = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInteger);
        
        // String - "reference type" (Tipo de referência)
        String myString = "Isso é uma string";
        
        /*
        Prática:
        Crie variáveis para os nomes entre "<>" e imprima o a frase 
        
        Eu <NOME>, informo que a encomenda foi entregue no logadouro <ENDEREÇO>, no valor de <VALOR>, na data <DATA>
        */
        
        String name = "Haroldo Mayworm";
        String address = "Rua abcdfg";
        double price = 115.90;
        String date = "03/06/2023";
        String phrase = "Eu " + name + ", informo que a encomenda foi entregue no logadouro " + address + ", no valor de " + price + ", na data " + date + ".";
        System.out.println(phrase);
    }
        
}
