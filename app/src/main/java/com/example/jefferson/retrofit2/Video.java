package com.example.jefferson.retrofit2;

/**
 * Created by jefferson on 23/02/16.
 */
public class Video {

    private long id;
    private String categoria;
    private String titulo;
    private String video;
    private String nota;
    private String descricao;
    private String data;
    private String imagem;

    public Video() {
        super();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", categoria='" + categoria + '\'' +
                ", titulo='" + titulo + '\'' +
                ", video='" + video + '\'' +
                ", nota='" + nota + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data='" + data + '\'' +
                ", imagem='" + imagem + '\'' +
                '}';
    }
}
