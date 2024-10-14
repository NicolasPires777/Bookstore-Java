<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Livros Cadastrados</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>Lista de Livros</h1>
    <table border="1">
        <tr>
            <th>Título</th>
            <th>Autor</th>
            <th>Editora</th>
            <th>Ano de Publicação</th>
            <th>ISBN</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="livro" items="${livros}">
            <tr>
                <td>${livro.titulo}</td>
                <td>${livro.autor}</td>
                <td>${livro.editora}</td>
                <td>${livro.anoPublicacao}</td>
                <td>${livro.isbn}</td>
                <td>
                    <a href="livro/editar?id=${livro.id}">Editar</a>
                    <form action="livro/excluir" method="post" style="display:inline;">
                        <input type="hidden" name="id" value="${livro.id}">
                        <input type="submit" value="Excluir">
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>

    <footer>
        <p>&copy; 2024 Sistema de Cadastro de Livros. Todos os direitos reservados.</p>
    </footer>
</body>
</html>
