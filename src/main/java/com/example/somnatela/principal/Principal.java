package com.example.somnatela.principal;

import com.example.somnatela.model.Artista;
import com.example.somnatela.model.TipoArtista;
import com.example.somnatela.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class Principal {

    @Autowired
   private ArtistaRepository repositorio;

    Scanner sc = new Scanner(System.in);

    public Principal(ArtistaRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu() {
        var opcao = -1;
        while (opcao != 10) {

            System.out.println("""
                                    
                    *** Som na tela ***
                                        
                        1 - Cadastrar artistas
                        2 - Cadastrar Músicas
                        3 - Listar músicas
                        4 - Buscar músicas por artistas
                        
                                        
                                        
                        10 - sair
                                    
                    """);

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtistas();
                    break;
                case 2:
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    buscarMusicasPorArtistas();
                    break;
                case 9:
                    System.out.println("Encerrando a aplicação.....");
                default:
                    System.out.println("Opção inválida");
            }





        }



        }

    private void buscarMusicasPorArtistas() {

    }

    private void listarMusicas() {
    }

    private void cadastrarMusicas() {
    }

    private void cadastrarArtistas() {
        var cadastroNovamente = "s";
        while (cadastroNovamente.equalsIgnoreCase("s")) {
            System.out.println("Digite o nome do artista que você quer cadastrar: ");
            var nome = sc.nextLine();
            System.out.println("Digite o tipo do artista (SOLO/DUPLA OU BANDA)");
            var tipoArtista = sc.nextLine();
            TipoArtista tipoArtistaEnum = TipoArtista.valueOf(tipoArtista.trim().toUpperCase());
            Artista artista = new Artista(nome, tipoArtistaEnum);
            repositorio.save(artista);
            System.out.println("Deseja cadastra um novo artista (S/N) ");
            cadastroNovamente = sc.nextLine();
        }
    }


}

