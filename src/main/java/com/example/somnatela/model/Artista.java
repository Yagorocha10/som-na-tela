package com.example.somnatela.model;

import jakarta.persistence.*;

@Entity
@Table(name = "artistas")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(unique = true)
    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoArtista tipoArtista;

    public Artista() {
    }

    public Artista(Long id, String nome, TipoArtista tipoArtista) {
        this.id = id;
        this.nome = nome;
        this.tipoArtista = tipoArtista;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoArtista getTipoArtista() {
        return tipoArtista;
    }

    public void setTipoArtista(TipoArtista tipoArtista) {
        this.tipoArtista = tipoArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                nome + '\'' +
                ", tipoArtista=" + tipoArtista +
                '}';
    }
}
