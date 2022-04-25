/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelCarritoCompras;

/**
 *
 * @author Dell
 */
public class Producto {
    String direccionImagen;
    float precio;
    String nombreProducto;

    public Producto(String direccionImagen, float precio, String nombreProducto) {
        this.direccionImagen = direccionImagen;
        this.precio = precio;
        this.nombreProducto = nombreProducto;
    }

    public String getDireccionImagen() {
        return direccionImagen;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setDireccionImagen(String direccionImagen) {
        this.direccionImagen = direccionImagen;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "direccionImagen=" + direccionImagen + ", precio=" + precio + ", nombreProducto=" + nombreProducto + '}';
    }
    
}
