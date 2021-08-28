
package com.mycompany.semana8;

import java.text.NumberFormat;
import java.util.*;


public class ClsObjetos {
    
    Scanner Ingre_teclado = new Scanner(System.in);
    public static NumberFormat formatoCantidad = NumberFormat.getCurrencyInstance(new Locale("es","GT"));
    List<ClsModeloDatos> Lista_General = new ArrayList<>();
    
    
    public ClsModeloDatos IngresoInformacion (){
        ClsModeloDatos Datos = new ClsModeloDatos();
        
        System.out.println("Ingrese nombre del vendedor");
        Datos.setNombre(Ingre_teclado.nextLine());
        
        System.out.println("Ingrese la venta de Enero");
        Datos.setVentaEnero(Ingre_teclado.nextInt());
                
        System.out.println("Ingrese la venta de Febrero");
        Datos.setVentaFebrero(Ingre_teclado.nextInt());
        
        System.out.println("Ingrese la venta de Marzo");
        Datos.setVentaMarzo(Ingre_teclado.nextInt());
        Ingre_teclado.nextLine();
        
        Lista_General.add(Datos);
        return Datos;
    }
   
    public static String cambiarFormato(double cantidad){
        return formatoCantidad.format(cantidad);
    }
    
    public void DesplegarInformacion(){
        
        for(ClsModeloDatos ele: Lista_General){
            
            System.out.println(ele.getNombre() + "       " + cambiarFormato(ele.getVentaEnero()) +"     "+ cambiarFormato(ele.getVentaFebrero()) +"     "+ cambiarFormato(ele.getVentaMarzo()));
        }
    }
   
    public void Sumar(){
        
        double totalEnero = 0;
       double totalFebrero = 0;
       double totalMarzo = 0;
       
       for( ClsModeloDatos ele: Lista_General){
           totalEnero += ele.getVentaEnero();
           totalFebrero += ele.getVentaFebrero();
           totalMarzo += ele.getVentaMarzo();
       }
       double GranTotal = totalEnero+totalFebrero+totalMarzo;
        System.out.println("Venta Total hasta la fecha: "+ cambiarFormato(GranTotal));
        System.out.println("Venta total de Enero: " + cambiarFormato(totalEnero));
        System.out.println("Venta total de Febrero: " + cambiarFormato(totalFebrero));
        System.out.println("Venta total de Marzo: " + cambiarFormato(totalMarzo));
      
    }
 
    public void CargarTotal(){
         for(ClsModeloDatos Mp : Lista_General){  
        Mp.setTotal(Mp.VentaEnero + Mp.VentaFebrero + Mp.VentaMarzo);
        }
    }
    public void QuienVendioMas(){
        
        CargarTotal();
        
        if(Lista_General.get(0).getTotal() > Lista_General.get(1).getTotal() && Lista_General.get(0).getTotal()> Lista_General.get(2).getTotal()){
            System.out.println(Lista_General.get(0).getNombre() +"  "+ Lista_General.get(0).getTotal());
        }else if(Lista_General.get(1).getTotal() > Lista_General.get(0).getTotal() && Lista_General.get(1).getTotal()> Lista_General.get(2).getTotal()){
            System.out.println(Lista_General.get(1).getNombre() +"  "+ Lista_General.get(1).getTotal());
        }else{
            System.out.println(Lista_General.get(2).getNombre() +"  "+ cambiarFormato(Lista_General.get(2).getTotal()));
        }
    }     
    public void QuienVendioMenos(){
        CargarTotal();
        if(Lista_General.get(0).getTotal() < Lista_General.get(1).getTotal() && Lista_General.get(0).getTotal()< Lista_General.get(2).getTotal()){
            System.out.println(Lista_General.get(0).getNombre() +"  "+ Lista_General.get(0).getTotal());
        }else if(Lista_General.get(1).getTotal() < Lista_General.get(0).getTotal() && Lista_General.get(1).getTotal() < Lista_General.get(2).getTotal()){
            System.out.println(Lista_General.get(1).getNombre() +"  "+ Lista_General.get(1).getTotal());
        }else{
            System.out.println(Lista_General.get(2).getNombre() +"  "+ cambiarFormato(Lista_General.get(2).getTotal()));
        }
    }
    
    public void BusquedaCantidad(){
        ClsModeloDatos nuevo = new ClsModeloDatos();
        double valor =0;
        int indice = 0;
        System.out.println("Ingrese el valor a buscar");
        valor = Ingre_teclado.nextDouble();
       indice = Lista_General.indexOf(valor);
    
    if(indice != -1){
        System.out.println("el indice es: " + indice );
    }else{
        System.out.println("No se encontro el numero");
    }
//     double valor=0;
//     int indice =0;
//     System.out.println("Ingrese el Valor que desea Buscar");
//     valor= Ingre_teclado.nextDouble();
//     indice= Lista_General.indexOf(valor);
//     if(indice!=-1){
//         
//     System.out.println("La cantidad esta en la posicion : "+ indice);
// 
//     }else{
//              System.out.println("El dato nose encuentra en el rango");
//     }
    }
   
    public void Menu(){
         Scanner t = new Scanner(System.in);
            String opc =" ";
            
            do{
            System.out.println("1- Ingreso de Informacion");//ready
            System.out.println("2- Desplegar toda la informacion");//ready
            System.out.println("3- Quien vendio menos (3 meses)");//ready
            System.out.println("4- Quien Vendio Mas(3 meses)");//ready
            System.out.println("5- Editar registro");//processing
            System.out.println("6- Busqueda por cantidad");//processing
            System.out.println("7- Totales por mes");//ready
            System.out.println("8- Salir del programa ;)");//ready jaja
            opc = t.nextLine();
            
            switch(opc){
                case"1": IngresoInformacion();
                break;
                case"2": DesplegarInformacion();
                break;
                case"3": QuienVendioMenos();
                break;
                case"4": QuienVendioMas();
                break;
                case"5": QuienVendioMas();
                break;
                case"6": BusquedaCantidad();
                break;
                case"7": Sumar();
                break;
                case"8": System.out.println("Que te valla bien");
                break;
                
                
            }
        }while(!opc.equals("8"));
            
    }
}
