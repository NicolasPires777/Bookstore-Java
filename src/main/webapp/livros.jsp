<!DOCTYPE html>
<html>
<head>
    <title>Livros Cadastrados</title>
</head>
<body>
    <h1>Livros Cadastrados</h1>
    <table border="1">
        <tr>
            <th>Nome</th>
            <th>Autor</th>
            <th>Editora</th>
            <th>Data</th>
            <th>G�nero</th>
            <th>Disponibilidade</th>
            <th>A��o</th>
        </tr>
        <c:forEach var="livro" items="${livros}">
            <tr>
                <td>${livro.nome}</td>
                <td>${livro.autor}</td>
                <td>${livro.editora}</td>
                <td>${livro.data}</td>
                <td>${livro.genero}</td>
                <td>${livro.disponibilidade ? "Dispon�vel" : "Indispon�vel"}</td>
                <td>
                    <c:if test="${livro.disponibilidade}">
                        <form action="LivroServlet" method="get">
                            <input type="hidden" name="nome" value="${livro.nome}">
                            <input type="submit" value="Alugar">
                        </form>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="formularioCadastro.jsp">Cadastrar novo livro</a>
</body>
</html>
