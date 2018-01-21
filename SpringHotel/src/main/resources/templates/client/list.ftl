[#ftl]
<html>
<header></header>
<body>

<p><b>Client List</b>
</p>

<a href="/client/add">ADD</a>
<table>
<tr>
    <th>first name</th>
    <th>last name</th>
    <th>gender</th>
    <th>birth date</th>
    <th></th>

</tr>

[#list clients as client]
<tr>
    <td>${client.userName}</td>
    <td>${client.password}</td>
    <td>${client.firstName}</td>
    <td>${client.lastName}</td>
    <td>${client.gender}</td>
    <td>${client.birthDate?string('dd/MM/yyyy')}</td>
    <td><a href="/client/edit?id=${client.id?c}">EDIT</a></td>




</tr>
[/#list]


</table>
</body>
</html>

