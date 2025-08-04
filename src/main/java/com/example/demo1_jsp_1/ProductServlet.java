package com.example.demo1_jsp_1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name ="ProductServlet" , value ="/product")

public class ProductServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost");
        String productDescription = request.getParameter("productDescription");
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));
        float calculatedPrice = listPrice * discountPercent * 0.01f ;

        request.setAttribute("productDescription", productDescription);
        request.setAttribute("listPrice", listPrice);
        request.setAttribute("discountPercent", discountPercent);
        request.setAttribute("calculatedPrice", calculatedPrice);

        request.getRequestDispatcher("product.jsp").forward(request, response);

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet");
        request.getRequestDispatcher("product.jsp").forward(request, response);



    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
