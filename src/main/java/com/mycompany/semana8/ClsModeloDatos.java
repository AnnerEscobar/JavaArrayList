
package com.mycompany.semana8;

public class ClsModeloDatos {
    
    String nombre;
    double VentaEnero;
    double VentaFebrero;
    double VentaMarzo;
    private double total;
    
    //constructor
    public ClsModeloDatos(){
    nombre = "";
    VentaEnero = 0;
    VentaFebrero = 0;
    VentaMarzo = 0;
    total =0;
}

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the VentaEnero
     */
    public double getVentaEnero() {
        return VentaEnero;
    }

    /**
     * @param VentaEnero the VentaEnero to set
     */
    public void setVentaEnero(double VentaEnero) {
        this.VentaEnero = VentaEnero;
    }

    /**
     * @return the VentaFebrero
     */
    public double getVentaFebrero() {
        return VentaFebrero;
    }

    /**
     * @param VentaFebrero the VentaFebrero to set
     */
    public void setVentaFebrero(double VentaFebrero) {
        this.VentaFebrero = VentaFebrero;
    }

    /**
     * @return the VentaMarzo
     */
    public double getVentaMarzo() {
        return VentaMarzo;
    }

    /**
     * @param VentaMarzo the VentaMarzo to set
     */
    public void setVentaMarzo(double VentaMarzo) {
        this.VentaMarzo = VentaMarzo;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
   
}
