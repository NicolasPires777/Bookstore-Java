<!DOCTYPE html>
<html>
<head>
    <title>Cadastrar Livro</title>
</head>
<body>
    <h1>Cadastrar Livro</h1>
    <form action="LivroServlet" method="post">
        Nome: <input type="text" name="nome" required><br>
        Autor: <input type="text" name="autor" required><br>
        Editora: <input type="text" name="editora" required><br>
        Data de Publicação: <input type="date" name="data" required><br>
        Gênero: <input type="text" name="genero" required><br>
        <input type="submit" value="Cadastrar">
    </form>
</body>
</html>
