package com.company;

public abstract class Persona {
    private String id;
    private String nombre;
    private String email;
    private String idioma;
    private String url = "educursos.com";

    public Persona(String id, String nombre, String email, String idioma) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.idioma = idioma;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //Es el método abstracto donde las clases hijas implementarán el comportamiento de la aplicación cuando
    //la persona intente acceder ala plataforma.
    public abstract void dirigir();
}