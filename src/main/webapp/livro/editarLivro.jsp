<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar Livro</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>Editar Livro</h1>
    <form action="livro/editar" method="post">
        <input type="hidden" name="id" value="${livro.id}">
        Título: <input type="text" name="titulo" value="${livro.titulo}" required><br>
        Autor: <input type="text" name="autor" value="${livro.autor}" required><br>
        Editora: <input type="text" name="editora" value="${livro.editora}" required><br>
        Ano de Publicação: <input type="number" name="anoPublicacao" value="${livro.anoPublicacao}" required><br>
        ISBN: <input type="text" name="isbn" value="${livro.isbn}"><br>
        Descrição: <textarea name="descricao">${livro.descricao}</textarea><br>
        <input type="submit" value="Salvar">
    </form>

    <footer>
        <p>&copy; 2024 Sistema de Cadastro de Livros. Todos os direitos reservados.</p>
    </footer>
</body>
</html>
