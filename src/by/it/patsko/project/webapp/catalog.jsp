<%@ page language="java" pageEncoding="UTF-8" %>
<%@ include file="include/begin-html.jsp" %>
<form class="form-horizontal" action="do?command=Catalog" method="post">
    <fieldset>

    <p>${catalog_table}</p>

    </fieldset>
</form>

<p>Cmd ERROR: ${error}</p>
<p>Cmd Message: ${message}</p>
<br><br><br><br><br><br><br><br><br>

<%@ include file="include/end-html.jsp" %>