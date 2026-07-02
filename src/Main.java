class Main{
    public static void main(String[] args){
        // 1 Crie um programa que realize a média de duas notas decimais e exiba o resultado.

        double nota1 = 8;
        double nota2 = 6;
        double media = (nota1 + nota2) / 2;

        System.out.println("A media ds notas: " + nota1 + " e " + nota2 + " é " + media);


        // 2 Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double valor = 3500.00;
        System.out.println(valor);
        int valorConvertido = (int) valor;
        System.out.println(valorConvertido);

        // 3 Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'A';
        System.out.println(letra);

        String frase = "é a primeira letra do alfabeto";
        System.out.println(letra + " " + frase);


    }
}