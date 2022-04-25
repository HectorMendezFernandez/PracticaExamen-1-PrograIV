/*
Clase de servicio que tendra todas las listas fijas del programa
 */
package modelCarritoCompras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Service {
    private static Service uniqueInstance;
    
    public static Service instance(){
        if (uniqueInstance == null){
            uniqueInstance = new Service();
        }
        return uniqueInstance; 
    }
    List<Producto> listProductos = new ArrayList();
    List<Factura> listFacturas = new ArrayList();
    List<Usuario> listUsuarios = new ArrayList();
    
    private Service(){
        //se agregan productos por defecto
        Producto prod1 = new Producto("/CarritoCompras/assets/img/iphone.jpg",1000,"Iphone 12", "Electronica", false);
        Producto prod2 = new Producto("/CarritoCompras/assets/img/samsung.jpg",500,"Samsung Flip", "Electronica", true);
        Producto prod3 = new Producto("/CarritoCompras/assets/img/bicicleta.jpg", 400, "Mountain Bike", "Deporte", true);
        Producto prod4 = new Producto("/CarritoCompras/assets/img/parlante.jpg", 200, "Parlantes AC", "Electronica", false);
        Producto prod5 = new Producto("/CarritoCompras/assets/img/snorkel.jpg", 70, "Equipo Snorkel", "Deporte", false);
        Producto prod6 = new Producto("/CarritoCompras/assets/img/laptop1.jpg", 1200, "Laptop HP", "Electronica", true);
        Producto prod7 = new Producto("/CarritoCompras/assets/img/Funko.jpg", 100, "Funko", "Otros", true);
        //
        listProductos.add(prod1);
        listProductos.add(prod2);
        listProductos.add(prod3);
        listProductos.add(prod4);
        listProductos.add(prod5);
        listProductos.add(prod6);
        listProductos.add(prod7);
        
        //Se agregan usuarios por defecto
        Usuario user1 = new Usuario("1-11","111",1);
        Usuario user2 = new Usuario("2-22","111",1);
        Usuario user3 = new Usuario("3-33","333",2);
        //
        listUsuarios.add(user1);
        listUsuarios.add(user2);
        listUsuarios.add(user3);
    }
    
    public List<Producto> getListProductos() {
        return listProductos;
    }

    public List<Factura> getListFacturas() {
        return listFacturas;
    }

    public List<Usuario> getListUsuarios() {
        return listUsuarios;
    }
    
    //este metodo me retornara la lista de lo productos en oferta para mostrarlos en la pag principal
    public List<Producto> retornarProductosPromocion(){
         List<Producto> list = new ArrayList();
         for(Producto p: listProductos){
             //si el producto esta en oferta lo mete a la lista de ofertas
             if(p.isOferta()){
                 list.add(p);
             }
         }
         return list;
    }

    
}
