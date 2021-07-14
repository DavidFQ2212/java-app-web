/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//david Flores Quiñones 
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;


/**
 *
 * @author david
 */
@WebServlet("/generacionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
   
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        //indicamos el tipo de respuesta al navegador  y que se descargue 
        response.setContentType("aplication/vnd.mss-excel");
        response.setHeader("content-Disposition", "attachment;filename=SumaConExcel.xls");
        //se le indico que no guarde cache y se actualise cada segundo
        response.setHeader("pragma", "no-cache");
        response.setHeader("cache-control","no-store");
        response.setDateHeader("expires", -1);
        //desplegamos la informacion a cliente 
        PrintWriter out = response.getWriter();
        //se puede ingresar informacion a las hojas de calculo 
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(B2:B3)");
        out.println("hecho por David Flores Quiñones ");
        out.close();
    
    }
}
