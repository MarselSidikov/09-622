<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<head>
    <link href="/css/style.css" rel="stylesheet"/>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Имя</th>
        <th>Возраст</th>
    </tr>
    <#list model.users as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
        </tr>
    </#list>
</table>
<form action="/users" method="post">
    <input name="name"/>
    <input name="age"/>
    <input type="submit">
</form>
</body>