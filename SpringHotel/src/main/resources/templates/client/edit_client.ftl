[#ftl]
<form method="POST" action="/client/save">
    <p>Username: <input type="text" name="userName" value="${client.userName}"/></p>
    <p>Password: <input type="text" name="password" value="${client.password}"/></p>
    <p>First name: <input type="text" name="firstName" value="${client.firstName}"/></p>
    <p>Last name: <input type="text" name="lastName" value="${client.lastName}"/></p>
    <p>Gender: <input type="text" name="gender" value="${client.gender}"/></p>
    <p>Birth Date: <input type="text" name="birthDate" value="${client.birthDate?string('dd/MM/yyyy')}"/></p>


    <p><input type="submit" value="submit"/>

        <input type="hidden" name="id" value="${client.id?c}"/>
</form>