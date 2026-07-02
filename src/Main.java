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

        // 4 Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 19.99;
        int quantidadeComprada = 6;
        double valorTotal = quantidadeComprada * precoProduto;
        System.out.println("Você comprou a quantidade de: " + quantidadeComprada + " pelo valoir de" + precoProduto);
        System.out.println("O total a ser pago ficou: " + valorTotal);


        // 5 Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        double valorEmDolares = 4.94;
        double dolares = 20;
        double valoEmReais = dolares * valorEmDolares;
        System.out.println("Convertando " + dolares + " U$" +  " para reais temos um total de " + valoEmReais);

    }
}