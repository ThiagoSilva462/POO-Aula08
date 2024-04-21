package controller;

import model.ContaEspecial;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ContaEspecialServlet")
public class ContaEspecialServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float valor = Float.parseFloat(request.getParameter("valor"));

        // Inicializa uma Conta Especial
        ContaEspecial conta = new ContaEspecial("Cliente", 456, 2000, 500);

        // Realiza o saque
        conta.sacar(valor);

        // Atualiza o saldo na página JSP
        request.setAttribute("saldo", conta.getSaldo());

        // Encaminha para a página JSP
        request.getRequestDispatcher("contaEspecial.jsp").forward(request, response);
    }
}