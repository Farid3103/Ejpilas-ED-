
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1059237155
 */
public class Control {
     Pilas miPila = new Pilas();
    Scanner in = new Scanner(System.in);

    public void menu() {
        int opc;
       // String num;
        do {

            System.out.println("------MENU EJEMPLO PILAS Y OBJETOS-----");
            System.out.println("1. Agregar una caja a la pila");
            System.out.println("2. Listar todos las cajas de la lista");
            System.out.println("3. Desapilar una cajs de la lista");
            System.out.println("4. Salir");
            System.out.print("DIGITE UNA OPCION: ");
            opc = in.nextInt();

            switch (opc) {
                case 1:
                    this.agregarElementos();                                  
                    break;
                case 2:
                    miPila.ListarTodo();
                    break;
                case 3:
                    System.out.println(miPila.pop());
                    //String recuperado = (String) miPila.pop();                  
                    break;         
                 
            }

        } while (opc > 0 && opc < 4);
    }
    
    public void agregarElementos(){
        System.out.print("Digite el codigo unico de la caja: ");
        int codigo=in.nextInt();
        System.out.print("Digite el destinatario de la caja: ");
        String destinatario=in.next();
         System.out.print("Digite la ciudad de destino: ");
        String ciudad=in.next();
        //seteamos
        Caja elm=new Caja();
        elm.setCodigo(codigo);
        elm.setDestinatario(destinatario);
        elm.setCiudad(ciudad);
        
        //llamamos al metodo para apilar este objeto
        miPila.push(elm);
        System.out.println("Objeto guardado en la Pila!!!");
    }
    
}
