<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastrar Livro</title>
    <link rel="stylesheet" href="styles.css">
    <script>
        function validarFormulario() {
            const anoPublicacao = document.getElementById("anoPublicacao").value;
            const anoAtual = new Date().getFullYear();

            if (anoPublicacao > anoAtual || anoPublicacao < 1000) {
                alert("Por favor, insira um ano de publicação válido.");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <header>
        <h1>Cadastrar Livro</h1>
    </header>

    <h1>Cadastrar Livro</h1>
    <form action="livro" method="post">
        Título: <input type="text" name="titulo" required><br>
        Autor: <input type="text" name="autor" required><br>
        Editora: <input type="text" name="editora" required><br>
        Ano de Publicação: <input type="number" name="anoPublicacao" required><br>
        ISBN: <input type="text" name="isbn"><br>
        Descrição: <textarea name="descricao"></textarea><br>
        <input type="submit" value="Cadastrar">
    </form>

    <footer>
        <p>&copy; 2024 Sistema de Cadastro de Livros. Todos os direitos reservados.</p>
    </footer>
</body>
</html>
