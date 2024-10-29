package models;

import exceptions.ProductoInexistenteException;
import models.mock.Mocks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Articulos {
    private List<AbstractArticulo> articulos;

    public Articulos(){
        articulos = new ArrayList<>();
    }

    public Articulos(int size){
        articulos = new ArrayList<>(size);
        addArticulos(size);
    }

    public void addArticulo(AbstractArticulo articulo){
        articulos.add(articulo);
    }

    public AbstractArticulo getArticulo(int id){
        for (AbstractArticulo articulo : articulos) {
            if(articulo.getIdInt() == id){
                return articulo;
            }
        }
        return null;
    }

    public void removeArticulo(int id) throws ProductoInexistenteException {
        for (AbstractArticulo articulo : articulos) {
            if(articulo.getIdInt() == id){
                articulos.remove(articulo);
                break;
            }
        }
        throw new ProductoInexistenteException("El producto con id " + id + " no existe");
    }

    public boolean addStock(int id, int cantidad){
        for (AbstractArticulo articulo : articulos) {
            if(articulo.getIdInt() == id){
                articulo.addStock(cantidad);
                return true;
            }
        }
        return false;
    }

    public boolean venta(int id, int cantidad){
        for (AbstractArticulo articulo : articulos) {
            if(articulo.getIdInt() == id){
                return articulo.substractStock(cantidad);
            }
        }
        return false;
    }

    public void sort(){
        Collections.sort(articulos);
    }

    public void show(){
        for (AbstractArticulo articulo : articulos) {
            articulo.show();
        }
    }

    public void showFilter(String className){
        printTitle(" Lista de " + className);
        for (AbstractArticulo articulo : articulos) {
            if(articulo.getClass().getSimpleName().equals(className)){
                articulo.show();
            }
        }
    }

    public void showFilter(Class<?> classType){
        printTitle(" Lista de " + classType.getSimpleName());
        for (AbstractArticulo articulo : articulos) {
            if(articulo.getClass().equals(classType)){
                articulo.show();
            }
        }
    }

    public <T> void showFilter2(T classType){
        printTitle(" Lista de " + classType.getClass().getSimpleName());
        for (AbstractArticulo articulo : articulos) {
            if(articulo.getClass().equals(classType)){
                articulo.show();
            }
        }
    }

    public void showClass(Class<?> classType){
        System.out.println("class: " + classType);
        System.out.println("getClass: " + classType);
        System.out.println("getSimpleName: " + classType.getSimpleName());
        System.out.println("getName: " + classType.getName());
        System.out.println("getTypeName: " + classType.getTypeName());
        System.out.println("getCanonicalName: " + classType.getCanonicalName());
        System.out.println("GetGenericSuperclass: " + classType.getGenericSuperclass());
        System.out.println("getGenericInterfaces: " + Arrays.toString(classType.getGenericInterfaces()));
        System.out.println("getGenericSuperclass().getTypeName: " + classType.getGenericSuperclass().getTypeName());
        System.out.println("getGenericSuperclass().getClass: " + classType.getGenericSuperclass().getClass());
    }

    public void showClavos(){
        printTitle(" Lista de Clavos ");
        for (AbstractArticulo articulo : articulos) {
            if(articulo instanceof Clavo){
                articulo.show();
            }
        }
    }

    public void showTornillos(){
        printTitle(" Lista de Tornillos ");
        for (AbstractArticulo articulo : articulos) {
            if(articulo instanceof Tornillo){
                articulo.show();
            }
        }
    }

    public void showHerramientasElectricas(){
        printTitle(" Lista de Herramientas Electricas ");
        for (AbstractArticulo articulo : articulos) {
            if(articulo instanceof HerramientaElectrica){
                articulo.show();
            }
        }
    }

    public void showHerramientasManuales(){
        printTitle(" Lista de Herramientas Manuales ");
        for (AbstractArticulo articulo : articulos) {
            if(articulo instanceof HerramientaManual){
                articulo.show();
            }
        }
    }

    public void addArticulos(int size){
        for (int i = 0; i < size; i++) {
            int nro = i+10;
            if(nro%10 == 0 || nro%10 == 4)
                this.articulos.add(addClavo());
            else if(nro%10 == 1 || nro%10 == 5 || nro%10 == 9)
                this.articulos.add(addTornillo());
            else if(nro%10 == 2 || nro%10 == 6 || nro%10 == 8)
                this.articulos.add(addHerramientaManual());
            else if(nro%10 == 3 || nro%10 == 7)
                this.articulos.add(addHerramientaElectrica());
        }
    }

    public Clavo addClavo(){
        return (Clavo) new Clavo()
                .longitud(Mocks.getLongitud())
                .cantidadPorPaquete(Mocks.getCantidadPorPaquete())
                .marca(Mocks.getMarca())
                .precio(Mocks.getPrecio())
                .stock(Mocks.getStock());
    }

    public Tornillo addTornillo(){
        return (Tornillo) new Tornillo()
                .cantidad(Mocks.getCantidadPorPaquete())
                .tipoDeMaterial(Mocks.getTipoDeMaterial())
                .marca(Mocks.getMarca())
                .precio(Mocks.getPrecio())
                .stock(Mocks.getStock());
    }

    public HerramientaManual addHerramientaManual(){
        return (HerramientaManual) new HerramientaManual()
                .herramienta(Mocks.getHerramienta())
                .modelo(Mocks.getModelo())
                .marca(Mocks.getMarca())
                .precio(Mocks.getPrecio())
                .stock(Mocks.getStock());

    }

    public HerramientaElectrica addHerramientaElectrica(){
        return (HerramientaElectrica) new HerramientaElectrica()
                .esInalambrica(Mocks.getEsInalambrica())
                .modelo(Mocks.getModelo())
                .marca(Mocks.getMarca())
                .precio(Mocks.getPrecio())
                .stock(Mocks.getStock());
    }

    private void printTitle(String title){
        System.out.println("============================================================================================");
        System.out.println("\t\t\t\t<<<<< " + title + " >>>>>");
        System.out.println("============================================================================================");
    }
}
