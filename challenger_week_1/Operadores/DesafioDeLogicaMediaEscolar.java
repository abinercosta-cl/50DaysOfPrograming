/*
 * Nivel 3: Desafio de Logica Media escolar
 * Calcular a media de um Aluno
 * 
 * Tenha uma variável nota1 valendo 8.0.
 * 
 * Tenha uma variável nota2 valendo 7.5.
 * 
 * Tenha uma variável nota3 valendo 6.0.
 * 
 * Calcule a média e guarde numa variável mediaFinal.
 * 
 * Imprima o resultado.
 * 
 * Atenção: Lembre-se da ordem da matemática! Multiplicação e divisão acontecem
 * antes da soma. Use ( ) parênteses se precisar forçar a soma antes.
 * 
 */
public class DesafioDeLogicaMediaEscolar {
    public static void main(String[] args) {
        double nota1 = 8.0;
        double nota2 = 7.5;
        double nota3 = 6.0;

        // Errado: double mediaFinal: nota1 + nota2 + nota3 / 3;
        // O java dividiria a nota3 por 3 primeiro e somaria com nota1 e nota2 depois.

        // Certo
        double mediaFinal = (nota1 + nota2 + nota3) / 3;
        System.out.println("A media é: " + mediaFinal);
    }

}