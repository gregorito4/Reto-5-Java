/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gregory
 */
public class ObjetoGeografico {
    private String nombre;
    private int id_cuerpo_agua;
    private String municipio;

    public ObjetoGeografico() {
    }

    public ObjetoGeografico(String nombre, int id_cuerpo_agua, String municipio) {
        this.nombre = nombre;
        this.id_cuerpo_agua = id_cuerpo_agua;
        this.municipio = municipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_cuerpo_agua() {
        return id_cuerpo_agua;
    }

    public void setId_cuerpo_agua(int id_cuerpo_agua) {
        this.id_cuerpo_agua = id_cuerpo_agua;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
    
}
