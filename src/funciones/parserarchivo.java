/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;

import accesodatos.datosCorreoDAO;
import entidades.datoscorreo;

/**
 *
 * @author LENOVO_5
 */
public class parserarchivo {

    private String fecha;
    private String remitente;
    private String asunto;

    public List<datoscorreo> abrirTexto(String ruta) {

        List<datoscorreo> listaCorreos = new ArrayList<>();
        try (Scanner input = new Scanner(new File(ruta))) {

            datoscorreo objCorreo = new datoscorreo();

            // Recorrer el txt
            while (input.hasNextLine()) {
                //fecha = "";
                // Crear una línea
                String linea;

                // Tomar la siguiente lína del txt
                linea = input.nextLine();

                try (Scanner data = new Scanner(linea)) {
                    Pattern patron = Pattern.compile("X-DSPAM-Processed:");
                    Pattern patron1 = Pattern.compile("Author:");
                    Pattern patron2 = Pattern.compile("Subject:");

                    if (data.hasNext(patron)) {
                        //System.out.println("Patron hallado" + cont + data.nextLine());                         
                        fecha = data.nextLine();
                        fecha = fecha.trim();
                        fecha = fecha.replaceAll("X-DSPAM-Processed: ", "");
                        objCorreo.setFecha(fecha);
                        //System.out.println(fecha);
                    }
                    if (data.hasNext(patron1)) {
                        remitente = data.nextLine();
                        remitente = remitente.trim();
                        remitente = remitente.replaceAll("Author: ", "");
                        objCorreo.setRemitente(remitente);
                        //System.out.println(remitente);
                    }

                    if (data.hasNext(patron2)) {
                        asunto = data.nextLine();
                        asunto = asunto.trim();
                        asunto = asunto.replaceAll("Subject: ", "");
                        objCorreo.setAsunto(asunto);
                        listaCorreos.add(objCorreo);
                        objCorreo = new datoscorreo();
                        //System.out.println(asunto);
                    }

                    //System.out.println(fecha + "\t" + remitente + "\t" + asunto);
                    //guardarDatos();
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return listaCorreos;

    }

    public void ingresarCorreos(String ruta) {
        datosCorreoDAO datosCorreo = new datosCorreoDAO();
        List<datoscorreo> listaCorreos = abrirTexto(ruta);
        boolean comp = false;
        for (datoscorreo correo : listaCorreos) {
            if (!datosCorreo.guardar(correo)) {
                System.out.println("Error al ingresar: " + correo.getAsunto());
            }
        }

    }
}
