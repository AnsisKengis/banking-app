<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<head>
    <%--<link href="webjars/bootstrap-3.3.7-dist" rel="stylesheet">--%>
</head>
<body>
<div class="container">
    <table class="table table-striped">
        <caption>Your Todos are</caption>
        <thead>
        <tr>
            <th>Description</th>
            <th>Date</th>
            <th>Completed</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.desc}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
                <td>
                    <a type="button" class="btn btn-warning"
                       href="/delete-todo?id=${todo.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div>
        <a type="button" class="btn btn-success" href="/add-todo">Add</a>
    </div>
</div>

<script src="templates/webjars/jquery-3.2.0.min.js"></script>
<script src="templates/webjars/bootstrap-3.3.7-dist"></script>
<script src=""></script>
</body>
</html>