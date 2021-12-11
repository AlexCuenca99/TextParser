/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextParser;

import funciones.parserarchivo;

/**
 *
 * @author LENOVO_5
 */
public class TextParser {

    public static void main(String[] args) {
        String ruta = "src/TextParser/mbox-short.txt";
        parserarchivo archivo = new parserarchivo();
        archivo.ingresarCorreos(ruta);
    }
}
