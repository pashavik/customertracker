package org.mycompany.testdb;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String user = "sa";
        String password = "";
        String url = "jdbc:h2:tcp://localhost/~/web-customer-tracker";
        String driver="org.h2.Driver";

        try {
            PrintWriter out = response.getWriter();
            out.println("connecting to " + url);



            Connection connection = DriverManager.getConnection(url, user, password);
            out.println("success");
            connection.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}


