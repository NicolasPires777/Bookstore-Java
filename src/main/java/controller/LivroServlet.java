package controller;

import model.Livro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/livro")
public class LivroServlet extends HttpServlet {
    private List<Livro> livros = new ArrayList<>(); // Simulação de banco de dados de livros
    private int nextLivroId = 1;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("livros", livros);
        req.getRequestDispatcher("listarLivros.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titulo = req.getParameter("titulo");
        String autor = req.getParameter("autor");
        String editora = req.getParameter("editora");
        Integer anoPublicacao = Integer.parseInt(req.getParameter("anoPublicacao"));
        String isbn = req.getParameter("isbn");
        String descricao = req.getParameter("descricao");

        Livro livro = new Livro(nextLivroId++, titulo, autor, editora, anoPublicacao, isbn, descricao);
        livros.add(livro);
        resp.sendRedirect("livro");
    }
}
