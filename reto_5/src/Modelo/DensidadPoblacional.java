/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gregory
 */
public class DensidadPoblacional {
    private int habitantes;

    public DensidadPoblacional() {
    }

    public DensidadPoblacional(int habitantes) {
        this.habitantes = habitantes;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
    
    public int afeccion(){
        int afec;
        if(habitantes<10000)
        {
            afec = 0;
        }
        else if((habitantes>=10000)&&(habitantes<=50000)){
            afec = 1;
        }
        else{
            afec=2;
        }
        return afec;        
    }
}
