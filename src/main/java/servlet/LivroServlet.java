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
        Integer id = livrosCadastrados.size() + 1;  
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String editora = request.getParameter("editora");
        Integer anoPublicacao = Integer.parseInt(request.getParameter("anoPublicacao"));
        String isbn = request.getParameter("isbn");
        String descricao = request.getParameter("descricao");

        Livro livro = new Livro(id, titulo, autor, editora, anoPublicacao, isbn, descricao);

        livrosCadastrados.add(livro);

        request.setAttribute("livros", livrosCadastrados);
        request.getRequestDispatcher("livros.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idLivro = request.getParameter("id");
        if (idLivro != null) {
            Integer id = Integer.parseInt(idLivro);
            for (Livro livro : livrosCadastrados) {
                if (livro.getId().equals(id)) {
                    livro.setDisponibilidade(false);
                    break;
                }
            }
        }
        
        request.setAttribute("livros", livrosCadastrados);
        request.getRequestDispatcher("livros.jsp").forward(request, response);
    }
}
