<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table table-striped">
    <thead>
    <th>Hospital Name </th>
    <th>Address </th>
    <th>Phone </th>
    <th>Index </th>
    <th>Department </th>
    </thead>
<c:forEach items="${result}" var="r">
    <tr>
        <td>${r.hospital.hospital_name}</td>
        <td>${r.hospital.hospital_address}</td>
        <td>${r.hospital.hospital_tel}</td>
        <td>${r.hospital.hospital_index}</td>
        <td>${r.dept_name}</td>
    </tr>
    </c:forEach>
</table>
${noResult}
</body>
</html>
