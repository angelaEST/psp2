/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Angela Edith Su�rez Torres
 */
public class PaintingWeb {

    public static void presentarOpcion(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();
        pw.write("<html>");
        pw.println("<h1>PSP2 INTEGRACION NUMERICA!</h1>");

        pw.println("<body><form action=\"integracion\" method=\"post\">");
        pw.println("</br><table><tr><td>Valor para x :</td></tr>");
        pw.println("<tr><td><input type=\"text\" id=\"cantidadX\" name=\"valx\"></td></tr></br>");
        pw.println("</br><tr><td>Valor para n�mero de segmentos :</td></tr>");
        pw.println("<td><input type=\"text\" id=\"cantidadseg\" name=\"segmento\"></td></tr></br>");
        pw.println("</br><tr><td>Valor para dof :</td></tr>");
        pw.println("<td><input type=\"text\" id=\"cantidaddof\" name=\"dof\"></td></tr></table></br>");
        pw.println("<input type=\"submit\" id=\"acepta\" name=\"acepta\" value=\"Calcular\">");
        pw.println("</form></body>");
        pw.println("</html>");

    }

    public static void showResults(HttpServletRequest req, HttpServletResponse resp, Double valor, boolean error)
            throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.println("<html><head><title>PSP2INTEGRACION NUMERICA!</title></head>");
        pw.println("<h1>Resultado: </h1></br>");
        pw.println("<body>");
        pw.println("<table>");
         if(!error ){
         pw.println("<tr><td>******** El resultado de Beta 1 es:  " + valor + "  ********</td></tr>");
        }else{
        pw.println("<tr><td>******** Utilice como separador (.) punto ********</td></tr>");
        }
        pw.println("</table>");
        pw.println("</body>");
        pw.println("</html>");

    }
}
