<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Номер</th>
        <th>Модель</th>
        <th>Имя владельца</th>
    </tr>
<#list model.autos as auto>
    <tr>
        <td>${auto.id}</td>
        <td>${auto.number}</td>
        <td>${auto.model}</td>
        <td>${auto.color}</td>
        <td>${auto.owner.name}</td>
    </tr>
</#list>
</table>
<form action="/autos" method="post">
    <input name="model" placeholder="Модель"/>
    <input name="number" placeholder="Номер"/>
    <input name="color" placeholder="Цвет"/>
    <input name="ownerId" placeholder="ID владельца"/>
    <input type="submit">
</form>
</body>