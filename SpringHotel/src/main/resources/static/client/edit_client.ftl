[#ftl]
<form method="POST" action="/client/save">
<p>First name: <input type="text" name="firstName" value="${client.firstName}"/></p>
<p>Last name: <input type="text" name="lastName" value="${client.lastName}"/></p>
<p>Gender: <input type="text" name="gender" value="${client.gender}"/></p>
<p>Birth Date: <input type="text" name="birthDate" value="${client.birthDate?string('dd/MM/yyyy')}"/></p>

<p><input type="submit" value="save"/>

<input type="hidden" name="id" value="${client.id?c}"/>
</form>