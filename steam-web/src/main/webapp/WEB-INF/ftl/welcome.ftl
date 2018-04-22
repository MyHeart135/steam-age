<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>freemarker测试</title>
</head>
<body>

<h1>WEB-INF/ftl </h1>
<h2>${message},${name}</h2>


<ol>
        <#list myList as lst>
            <li><a href="javascript:void(0)"> ${lst}</a>  </li>
        </#list>
</ol>

</body>
</html>