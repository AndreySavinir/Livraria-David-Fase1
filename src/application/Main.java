package application;

import entities.Livraria;
import entities.Livros;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;

        while(opcao != 9){
            String opcaoStr = JOptionPane.showInputDialog("""
                    Escolha uma opção:
                    
                    1 - Cadastrar novo livro
                    2 - Listar todos os livros
                    3 - Buscar livro por título
                    4 - Realizar empréstimo de livro
                    5 - Registrar devolução de livro
                    6 - Excluir livro do sistema
                    7 - Listar livros emprestados
                    8 - Contar livros disponíveis e emprestados
                    9 - Sair""");

            opcao = Integer.parseInt(opcaoStr);

            switch (opcao) {
                case 1 -> {}

                case 2 -> {}

                case 3 -> {}

                case 4 -> {}

                case 5 -> {}

                case 6 -> {
                    String titulo = JOptionPane.showInputDialog("Digite o nome do livro:");

                    int confirmacao = JOptionPane.showConfirmDialog(
                            null,
                            "Deseja realmente excluir o livro?",
                            "Confirmação",
                            JOptionPane.YES_NO_OPTION
                    );

                    if (confirmacao == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, Livraria.excluirLivro(titulo));
                    }
                }

                case 7 -> {}

                case 8 -> JOptionPane.showMessageDialog(null, Livraria.buscarLivros());

                case 9 -> JOptionPane.showMessageDialog(null, "Programa Fechado");
            }
        }
    }
}
