package controller;

import model.ContaPoupanca;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ContaPoupancaServlet")
public class ContaPoupancaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float valor = Float.parseFloat(request.getParameter("valor"));

        // Inicializa uma Conta Poupança
        ContaPoupanca conta = new ContaPoupanca("Cliente", 123, 1000, 1);

        // Realiza o saque
        conta.sacar(valor);

        // Atualiza o saldo na página JSP
        request.setAttribute("saldo", conta.getSaldo());

        // Encaminha para a página JSP
        request.getRequestDispatcher("contaPoupanca.jsp").forward(request, response);
    }
}