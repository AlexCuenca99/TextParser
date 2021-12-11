/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

import entidades.datoscorreo;

/**
 *
 * @author LENOVO_5
 */
public class datosCorreoDAO {

    conexion conn = new conexion();

    public datosCorreoDAO() {

    }

    public boolean guardar(datoscorreo co) {
        this.conn.open();
        boolean save = false;

        try {
            StringBuilder sql = new StringBuilder();
            StringBuilder sqlElim = new StringBuilder();

            sql.append("INSERT INTO correos (remitente,fecha,asunto) values ('"); // Añadir la sentencia SQL para insertar en la BS
            sql.append(co.getRemitente()).append("', '"); // Añadir el remitente
            sql.append(co.getFecha()).append("', '"); // Añadir la fecha
            sql.append(co.getAsunto()).append("')"); // Añadir el asunto
           
            this.conn.execute(sql.toString()); // Ejecutar el comando añadir
            
            sqlElim.append("DELETE FROM correos WHERE remitente = 'null'"); // Eliminar el primer elemento que sale con valor null

            this.conn.execute(sqlElim.toString()); // Ejecutar el comando eliminar

            save = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(co.getAsunto());
            save = false;
        } finally {
            this.conn.close();
        }
        return save; // Si todo está bien, true, si falla algo, false.
    }
}
