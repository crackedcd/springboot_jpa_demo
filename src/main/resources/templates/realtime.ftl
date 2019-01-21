<!DOCTYPE html>
<html lang="ch">
<head>
    <meta charset="utf-8"/>
    <title>实时数据</title>
</head>
<body>
<table border="1">
    <th>平台</th>
    <th>一级类目</th>
    <th>二级类目</th>
    <th>商品名称</th>
    <th>订单数</th>
    <th>有效金额</th>
    <#list data as d>
        <tr>
            <td>${d.channelName}</td>
            <td>${d.cateLevel1Name!""}</td>
            <td>${d.cateLevel2Name!""}</td>
            <td>${d.itemName}</td>
            <td>${d.ordCnt}</td>
            <td>${d.amtCnt}</td>
        </tr>
    </#list>
</table>
</body>
</html>
