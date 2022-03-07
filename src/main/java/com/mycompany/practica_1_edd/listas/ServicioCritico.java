/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_1_edd.listas;

import com.mycompany.practica_1_edd.hipodromo.Apuesta;
import com.mycompany.practica_1_edd.resultados.Resultados;

/**
 *
 * @author nroda
 */
public class ServicioCritico {
    //Atributos
    private static Nodo primero;
    private static Nodo ultimo;

    //constructor
    public ServicioCritico() {
        primero = null;
        ultimo = null;
    }
    
    //Rehace la lista nuevamente para seguir realizando carreras
    public static void rehacerLista(){
        primero = null;//1 paso
        ultimo = null;//1 paso
        //Complejidad O(1)
        //O(1) = 2
    }
    

    //insertar al final de la lista
    public static void insertarApuesta(Apuesta apuesta) {//1 paso
        if (primero == null) {// 1 paso
            ultimo = new Nodo(null, null, apuesta);//6 pasos
            primero = ultimo;//1 paso
        } else {
            Nodo nuevo = new Nodo(null, ultimo, apuesta);//6 pasos
            ultimo.setSiguiente(nuevo);//1 paso
            ultimo = nuevo;// 1 paso
        }
        //Complejidad O(1)
        //O(1) = 9 pasos en el mejor escenario
        //O(1) = 10 pasos en el peor escenario
    }

    //eliminar en cualquier posicion
    public static void eliminarApuesta(Nodo eliminado) {//1 paso
        if (eliminado == primero) {//Si el nodo a eliminar es el primero | 1 paso
            primero = primero.getSiguiente();// 1 paso
            if (primero != null) {// 1 paso
                primero.setAnterior(null); // 3 pasos
            } else {
                ultimo = null;//1 paso
            }
        } else if (eliminado == ultimo) {//Si el nodo a eliminar es el ultimo | 1 paso
            ultimo = ultimo.getAnterior();//1 paso
            if (ultimo != null) {//1 paso
                ultimo.setSiguiente(null);//1 paso
            } else {
                primero = null;//1 paso
            }
        } else {//Si es un nodo intermedio
            eliminado.getAnterior().setSiguiente(eliminado.getSiguiente());//3 pasos
            eliminado.getSiguiente().setAnterior(eliminado.getAnterior());// 3 pasos
        }
        //Complejidad O(1)
        //O(1) = 9 pasos en el peor escenario
        //O(1) = 5 pasos en el mejor de los casos
    }

    //Verifica las apuestas para proceder a eliminar a una que no cumpla los requisitos
    public static boolean verificarApuestas(int[] temp) {//1 paso
        long inicio = System.nanoTime();
        int contadorPasos = 1;
        boolean esApuesta = true;//1 paso
        int contadorI = 1;//1 paso
        contadorPasos += 3;
        for (int i = 0; i < temp.length; i++) {//1 + 2n pasos
            if (temp[i] == contadorI) {//1 paso
                contadorI++;//1 paso
                i = -1;//1 paso
                contadorPasos += 2;
            }
            contadorPasos += 3;
        }
        if (contadorI <= 10) {// 1 paso
            contadorPasos += 2;
            Resultados.setContadorPasosverificacion(contadorPasos);
            return false;//1 paso
        }
        contadorPasos += 1;
        Resultados.setContadorPasosverificacion(contadorPasos);
        long end = System.nanoTime();
        Resultados.setTiempoVerificacion((int)(end-inicio));
        return esApuesta;// 1 paso
        //Complejidad O(n)
        //O(n) = 6n + 6  en el peor escenario
        //O(n) = 6n + 5 en el mejor escenario
    }

    //Es el encargado de generar los resultados
    public static void compararResultados(int[] resultados, Nodo temp) {//2 pasos
        long inicio = System.nanoTime();
        int contadorPasos = 3;
        for (int i = 0; i < 10; i++) {//1 + 2n pasos
            if (resultados[i] == temp.getApuesta().getOrden_caballos()[i]) {//1 paso
                temp.getApuesta().setPuntaje_obtenido(temp.getApuesta().getPuntaje_obtenido() + (10 - i));//3 pasos
                contadorPasos += 3;
            }
            contadorPasos += 3;
        }
        Resultados.setContadorPasosCalculos(contadorPasos);
        long end = System.nanoTime();
        Resultados.setTiemporCalculos((int)(end-inicio));
        //Complejidad O(n) si no se sabe el tamaño del arreglo O(1) si si se sabe
        //O(n) = 6n + 3 en el peor escenario
        //O(n) = 2n + 3 en el mejor escenario
    }

    //Verifica si los resultado son correctos
    public static String revisarResultados(String[] resultados) {//1 paso
        String respuesta = ""; // 1 paso
        for (int i = 0; i < resultados.length; i++) { //1 + 2n
            if (resultados[i].isEmpty()) {//1 paso
                respuesta = "No se ingreso ningun caballo en el lugar " + (i + 1);//1 paso
                return respuesta;//1 paso
            } else if (Integer.parseInt(resultados[i]) < 0 || Integer.parseInt(resultados[i]) > 10) { // 1 paso
                respuesta = "El numero ingresado en la lugar " + (i + 1) + " no es un numero de caballo";// 1 paso
                return respuesta;// 1 paso
            }
        }
        return respuesta;//1 paso
        //Complejidad O(n)
        //O(n) = 6n + 3 pasos en el peor escenario
        //O(n) = 2n + 4 pasos en el mejor escenario
    }

    //Ordena los resultados por nombre por el metodo de insercion
    public static void ordenarNombre() {
        long inicio = System.nanoTime();
        Nodo pivote = primero; // 1 paso
        Nodo actual;// 1 paso
        Apuesta temp;// 1 paso
        int contadorPasos = 3;
        while (pivote != null) {// n pasos
            actual = pivote;//1 paso
            temp = pivote.getApuesta();//1 paso
            contadorPasos += 2;
            while (actual != primero && temp.getNombre_apostador().compareToIgnoreCase(actual.getAnterior().getApuesta().getNombre_apostador())<0) {//2n
                actual.setApuesta(actual.getAnterior().getApuesta());//1 paso
                actual = actual.getAnterior();//1 paso
                contadorPasos += 4;
            }
            actual.setApuesta(temp);// 1 paso
            pivote = pivote.getSiguiente();// 1 paso
            contadorPasos += 2;
        }
        long end = System.nanoTime();
        Resultados.setContadorPasosOrdenNombre(contadorPasos);
        Resultados.setTiempoNombre((int)(end-inicio));
        //Complejidad O(n^2)
        //O(n^2) = 4n^2 + 2n + 5 en el peor escenario
        //O(n^2) = 2n^2 + 2n + 5 ne el mejor escenario
    }
    
    //Ordena los resultados por puntaje obtenido por el metodo de insercion
    public static void ordenarPuntaje() {
        long inicio = System.nanoTime();
        Nodo pivote = primero;//1 paso
        Nodo actual;//1 paso
        Apuesta temp;//1 paso
        int contadorPasos = 3;
        while (pivote != null) {//n pasos
            actual = pivote;//1 pasos
            temp = pivote.getApuesta();//1 paso
            contadorPasos += 2;
            while (actual != primero && temp.getPuntaje_obtenido() > actual.getAnterior().getApuesta().getPuntaje_obtenido()) {//2n
                actual.setApuesta(actual.getAnterior().getApuesta());//1 paso
                actual = actual.getAnterior();//1 paso
                contadorPasos += 4;
            }
            actual.setApuesta(temp);//1 paso
            pivote = pivote.getSiguiente();//1 paso
            contadorPasos += 2;
        }
        long end = System.nanoTime();
        Resultados.setContadorPasosOrdenPuntos(contadorPasos);
        Resultados.setTiempoPuntos((int)(end-inicio));
        //Complejidad O(n^2)
        //O(n^2) = 4n^2 + 2n + 5 en el peor escenario
        //O(n^2) = 2n^2 + 2n + 5 ne el mejor escenario
    }

    //Getters y Setters
    public static Nodo getPrimero() {
        return primero;
    }

    public static void setPrimero(Nodo primero) {
        ServicioCritico.primero = primero;
    }

    public static Nodo getUltimo() {
        return ultimo;
    }

    public static void setUltimo(Nodo ultimo) {
        ServicioCritico.ultimo = ultimo;
    }

}
