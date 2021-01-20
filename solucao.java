import java.util.Scanner;

public class solucao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // primeiramente leio os valores das variáveis n e t
        int n = in.nextInt();
        int t = in.nextInt();

        // declaração da variável que guarda a resposta
        int resposta = 0;

        /* Para solução desse problema, temos que nos atentar
           apenas onde colocaremos as torres e o rei, assim, 
           podemos separar o problema em 3 casos:
            1 - não há torres;
            2 - há apenas uma torre; e
            3 - há duas torres. */

        /* No primeiro caso, quando não há torres, podemos ver
           que a resposta é dada pelo número de casas do tabuleiro,
           logo que o número de possibilidades é igual ao número
           de casas que o rei pode ser colocado. */ 
        if (t == 0) resposta = n;

        /* Para o segundo caso podemos usar o princípio fundamental 
           da contagem. Como temos que definir a posição do rei e
           posteriormente a posição da torre, para encontrar a resposta
           temos que multiplicar o número de possibilidades para o rei 
           com número de possibilidades para a torre. Para o rei temos 
           n possibilidades e  posteriormente para a torre temos n-1 possibilidades,
           logo que já alocamos uma casa para o rei. */
        else if (t == 1) resposta = n*(n-1);

        /* Para o último caso vou propor 3 algoritmos */

        /* Por uma ótica mais simplista, podemos criar um algoritmo
           fixando a posição da primeira torre e do rei e depois ir 
           somando as possibilidades para a segunda torre, porém esse
           algoritmo é da ordem quadrática. */

        // else
        //     for (int i = 1; i <= n-2; i++)
        //         for (int j = i+1; j <= n-1; j++)
        //             resposta += n-j;

        /*************************************************************************************/

        /* Ao pegar os primeiros elementos e as diferenças entre cada elemento
        podemos notar uma relação de recorrência:
        
        0 - 1 - 4 - 10 - 20
          1 - 3 - 6 - 10
            2 - 3 - 4

        Vamos melhorar a complexidade do algoritmo usando a técnica pré-fixada com
        o auxílio de dois vetores. Esse algoritmo é linear, porém usa mémoria extra. */

        // else
        // {
        //     // declaração dos vetores auxiliáres
        //     int[] a = new int[1005], b = new int[1005];

        //     // caso base
        //     a[2] = 0;
        //     a[2] = 0;
    
        //     for (int i = 3; i <= n; i++)
        //     {
        //         a[i] = i-2 + a[i-1];
        //         b[i] = a[i]+b[i-1];
        //     }
    
        //     resposta = b[n];
        // }

        /***********************************************************************************/
        
        /* A sequencia 1, 4, 10, 20, ..., não é uma simples sequência, ela é dada pelos n
           primeiros números tetraédricos, sendo que, cada número da sequência, é a soma
           dos n primeiros números triangulares. Podemos encontrar n-ésimo número da sequência
           a partir da fórmula fechada n(n-1)(n-2)/6. Essa solução é ótima e não usa memória
           auxiliar. Logo obtemos a resposta de formas mais célere e assim podemos trabalhar 
           com um número de casas bem superior.*/

        else resposta = n*(n-1)*(n-2)/6;

        // imprime o resultado
       System.out.println(resposta);
       
       in.close();
    }
}