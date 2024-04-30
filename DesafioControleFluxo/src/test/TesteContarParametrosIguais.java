package test;

import main.Contador;

// Classe de teste para verificar o comportamento com parâmetros iguais
public class TesteContarParametrosIguais {
    public static void main(String[] args) {
        try {
            Contador.contar(10, 10);  // Parâmetros iguais, sem exceção esperada
            System.out.println("Teste bem-sucedido: Sem exceção lançada.");
        } catch (Exception e) {
            System.out.println("Falha no teste: " + e.getMessage());
        }
    }
}
