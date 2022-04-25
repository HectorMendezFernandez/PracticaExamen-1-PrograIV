/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelCarritoCompras;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Factura {
    Usuario user;
    int numFactura;
    Date fecha;

    public Factura(Usuario user, int numFactura, Date fecha) {
        this.user = user;
        this.numFactura = numFactura;
        this.fecha = fecha;
    }

    public Usuario getUser() {
        return user;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Factura{" + "user=" + user + ", numFactura=" + numFactura + ", fecha=" + fecha + '}';
    }
    
}
