/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parseremailtxt;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author LENOVO_5
 */
public class DatosCorreo {
    private String fecha;
    private String remitente;
    private String asunto;

    public void leerDatos(){
        try(Scanner input = new Scanner(new File("src/parseremailtxt/mbox-short.txt"))){
           
            // Recorrer el txt
            while(input.hasNextLine()){
                fecha = "";
                // Crear una línea
                String linea;
                
                // Tomar la siguiente lína del txt
                linea = input.nextLine();
                
                try(Scanner data = new Scanner(linea)){
                    Pattern patron = Pattern.compile("X-DSPAM-Processed:");
                    String patron1 = "Author:";
                    String patron2 = "Subject:";
                    //String patron2 = "Subject: ";

                    if(data.hasNext(patron)){
                        //System.out.println("Patron hallado" + cont + data.nextLine());                         
                        fecha = data.nextLine();
                        fecha = fecha.trim();
                        fecha = fecha.replaceAll("X-DSPAM-Processed: ", "");
                        //System.out.println(fecha);
                    }
                    if(data.hasNext(patron1)){
                        remitente = data.nextLine();
                        remitente = remitente.trim();
                        remitente = remitente.replaceAll("Author: ", "");
                        //System.out.println(remitente);
                    }

                    if(data.hasNext(patron2)){
                        asunto = data.nextLine();
                        asunto = asunto.trim();
                        asunto = asunto.replaceAll("Subject: ", "");
                        //System.out.println(asunto);
                    }

                    //System.out.println(fecha + "\t" + remitente + "\t" + asunto);
                    guardarDatos();
                }
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }

    private void guardarDatos(){
        try(Connection conn = connect();
            PreparedStatement prepStat = conn.prepareStatement("INSERT INTO correos VALUES(?, ?, ?)")){
            prepStat.setString(1, remitente);
            prepStat.setString(2, fecha);
            prepStat.setString(3, asunto);

            prepStat.executeUpdate();

            PreparedStatement prepStatElim = conn.prepareStatement("DELETE FROM `correos` WHERE `fecha` = ''");

            prepStatElim.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    private Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_datostxt", "root", "");
        }catch(SQLException | ClassNotFoundException e){
            System.out.println(e);
            return null;
        }
    }
}

class FDemo{
    public static void main(String[] args){
        DatosCorreo datos = new DatosCorreo();
        
        try{
            datos.leerDatos();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}