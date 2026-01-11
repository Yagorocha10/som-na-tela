package com.example.somnatela.principal;

import java.util.Scanner;

public class Principal {

    Scanner sc = new Scanner(System.in);

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
    }


}

