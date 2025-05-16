package entities;

import java.util.ArrayList;


public class Livraria {
    static ArrayList<Livros> livrosDisponiveis = new ArrayList<Livros>();
    static ArrayList<Livros> livrosEmprestados = new ArrayList<Livros>();
    static ArrayList<Livros> livros = new ArrayList<Livros>();

    public static void unificarListas(){

        livros.clear();

        livros.addAll(livrosDisponiveis);
        livros.addAll(livrosEmprestados);
    }

    public static void adicionarLivroDisponivel(Livros livro){
        livrosDisponiveis.add(livro);
    }

    public static String excluirLivro(String titulo){
        unificarListas();

        for(Livros livro : livros){
            if(livro.getTitulo().equals(titulo)){
                if(livro.getStatus() == "Disponível"){
                    livrosDisponiveis.remove(livro);
                    return "Livro excluído com sucesso!";
                } else {
                    return "Livros emprestados não estão disponíveis para exclusão.";
                }
            }
        }
        return "Livro não encontrado!";
    }

    public static String buscarLivros(){
        int totalLivrosDisponiveis = livrosDisponiveis.size();
        int totalLivrosEmprestados = livrosEmprestados.size();
        int totalLivros = totalLivrosDisponiveis + totalLivrosEmprestados;

        return String.format(
                "Livros disponíveis: %d\nLivros emprestados: %d\nTotal de livros: %d",
                totalLivrosDisponiveis, totalLivrosEmprestados, totalLivros);
    }
}


