/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelCarritoCompras;

/**
 *
 * @author Dell
 */
public class Usuario {
    String user;
    String clave;
    int tipo;

    public Usuario(String user, String clave, int tipo) {
        this.user = user;
        this.clave = clave;
        this.tipo = tipo;
    }
     public Usuario() {
     }

    public String getUser() {
        return user;
    }

    public String getClave() {
        return clave;
    }

    public int getTipo() {
        return tipo;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "user=" + user + ", clave=" + clave + ", tipo=" + tipo + '}';
    }
    
}
