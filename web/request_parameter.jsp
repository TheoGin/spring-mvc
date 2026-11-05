<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>测试request parameter</title>
    </head>
    <body>
        <h2>获取到超链接参数值</h2>
        <hr/>
        <a href="vote/vote01?name=hspedu">获取超链接的参数</a>

        <hr>
        <h1>添加主人信息</h1>
        <!--
        老韩解读
        1. 这里的字段名称和对象的属性名保持一致,级联添加属性也是一样保持名字对应关系
        2. 如果只是添加主人信息，则去掉宠物号和宠物名输入框即可,pet 为null-->
        <form action="vote/vote03" method="post">
            主人号:<input type="text" name="id"><br>
            主人名:<input type="text" name="name"><br>
            宠物号:<input type="text" name="pet.id"><br>
            宠物名:<input type="text" name="pet.name"><br>
            <input type="submit" value="添加主人和宠物">
        </form>

        <hr>
        <h1>获取servlet api </h1>
        <form action="vote/vote04" method="post">
            用户名:<input type="text" name="username"><br>
            密 码:<input type="text" name="pwd"><br>
            <input type="submit" value="添加主人和宠物">
        </form>
    </body>
</html>