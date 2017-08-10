<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
</head>
<link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="input-group" id="adv-search">
            <form role="form" action="/find" method="get">
                <div class="col-md-8">
                    <label >Search</label>
                    <input type="text" class="form-control" name="search" placeholder="Search for any hospital or department" /></div>
                <div class="col-md-4" class="dropdown dropdown-lg">
                    <label >Filter by</label>
                    <select class="form-control" name="filter">
                        <option value="both" selected>Both</option>
                        <option value="hospital">Hospital</option>
                        <option value="department">Department</option>
                    </select>
                </div>
                <div class="col-md-12">
                    <input type="submit" class="btn btn-primary" value="Search"/></div>
            </form>
        </div>
    </div>
</div>
</div>
<br>
<br>

<center>
    <div class="container">
    <div style="overflow-y: scroll;" >
        <jsp:include page="result.jsp" />
    </div>
    </div>
</center>
</body>
</html>
