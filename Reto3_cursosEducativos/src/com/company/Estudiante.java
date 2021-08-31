package com.company;

public class Estudiante extends Persona {
    public Estudiante(String id, String nombre, String email, String idioma) {
        super(id, nombre, email, idioma);
    }
    @Override
    public void dirigir(){
         final String host = super.getUrl();
         final String lang = super.getIdioma();
         final String rol = "estudiante";
         super.setUrl(host+'/'+lang+'/'+rol);
    };
}
