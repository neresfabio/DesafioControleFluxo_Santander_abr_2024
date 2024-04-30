package test;

import main.Contador;
// Classe de teste para o comportamento esperado quando o primeiro parâmetro é menor que o segundo
public class TesteContarValoresNormais {
    public static void main(String[] args) {
        try {
            Contador.contar(10, 20);  // Primeiro parâmetro menor que o segundo
            System.out.println("Teste bem-sucedido: O método contou corretamente.");
        } catch (Exception e) {
            System.out.println("Falha no teste: " + e.getMessage());
        }
    }
}
