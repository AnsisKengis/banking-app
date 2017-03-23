<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
</head>
<body>

<div class="container">
    <form:form method="post" commandName="todo">
        <fieldset class="form-group">
            <form:label path="desc">Description</form:label>
            <form:input path="desc" type="text" class="form-control"
                        required="required"/>
            <form:errors path="desc" cssClass="text-warning" />

        </fieldset>
        <button type="submit" class="btn btn-success">Add</button>
    </form:form>
</div>

<script src="templates/webjars/jquery-3.2.0.min.js"></script>
<script src="templates/webjars/bootstrap-3.3.7-dist"></script>

</body>
</html>