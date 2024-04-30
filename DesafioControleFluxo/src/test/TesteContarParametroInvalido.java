package test;

import exceptions.ParametrosInvalidosException;
import main.Contador;

// Classe de teste para garantir que uma exceção seja lançada quando o primeiro parâmetro é maior que o segundo
public class TesteContarParametroInvalido {
public static void main(String[] args) {
        try {
            Contador.contar(20, 10);  // Deve lançar exceção
            System.out.println("Falha no teste: Não deveria ter permitido esse valor.");
        } catch (ParametrosInvalidosException e) {
            System.out.println("Teste bem-sucedido: Exceção lançada - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Falha no teste: Exceção inesperada - " + e.getMessage());
        }
    }
}
