/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gregory
 */
public class CuerpoDeAgua extends ObjetoGeografico{
    private String tipocuerpodeagua;
    private String tipodeagua;
    private Double irca;
    private static int contador;
    
    public CuerpoDeAgua() {
    }

    public CuerpoDeAgua(String tipocuerpodeagua, String tipodeagua, Double irca) {
        this.tipocuerpodeagua = tipocuerpodeagua;
        this.tipodeagua = tipodeagua;
        this.irca = irca;
    }

    public CuerpoDeAgua(String tipocuerpodeagua, String tipodeagua, Double irca, String nombre, int id_cuerpo_agua, String municipio) {
        super(nombre, id_cuerpo_agua, municipio);
        this.tipocuerpodeagua = tipocuerpodeagua;
        this.tipodeagua = tipodeagua;
        this.irca = irca;
    }

    public String getTipocuerpodeagua() {
        return tipocuerpodeagua;
    }

    public void setTipocuerpodeagua(String tipocuerpodeagua) {
        this.tipocuerpodeagua = tipocuerpodeagua;
    }

    public String getTipodeagua() {
        return tipodeagua;
    }

    public void setTipodeagua(String tipodeagua) {
        this.tipodeagua = tipodeagua;
    }

    public Double getIrca() {
        return irca;
    }

    public void setIrca(Double irca) {
        this.irca = irca;
    }

    public static int getContador() {
        return contador;
    }
    
  
    public String  nivel(){

        String nivelRiesgo = "NA";

        if(irca >= 0 && irca <= 5 ){
            nivelRiesgo = "SIN RIESGO";
            contador++;
        }
        else if(irca > 5 && irca <= 14 ){
            nivelRiesgo = "BAJO";
            contador++;
        }
        else if(irca > 14 && irca <= 35 ){
            nivelRiesgo = "MEDIO";
            contador++;
        }
        else if(irca > 35 && irca <= 80 )
            nivelRiesgo = "ALTO";
        else if(irca > 80 && irca <= 100 )
            nivelRiesgo = "INVIABLE SANITARIAMENTE";

        return nivelRiesgo;
    }
    
    
}
