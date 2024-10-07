package servlet;

import model.Livro;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/LivroServlet")
public class LivroServlet extends HttpServlet {
    private List<Livro> livrosCadastrados;

    @Override
    public void init() throws ServletException {
        super.init();
        livrosCadastrados = new ArrayList<>();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String autor = request.getParameter("autor");
        String editora = request.getParameter("editora");
        String data = request.getParameter("data");
        String genero = request.getParameter("genero");

        Livro livro = new Livro(nome, autor, editora, data, genero);

        livrosCadastrados.add(livro);

        request.setAttribute("livros", livrosCadastrados);
        request.getRequestDispatcher("livros.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeLivro = request.getParameter("nome");
        for (Livro livro : livrosCadastrados) {
            if (livro.getNome().equals(nomeLivro)) {
                livro.setDisponibilidade(false);
                break;
            }
        }

        request.setAttribute("livros", livrosCadastrados);
        request.getRequestDispatcher("livros.jsp").forward(request, response);
    }
}
