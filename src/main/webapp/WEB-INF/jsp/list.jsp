<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>出现</title>
</head>
<body>
<div class="container">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12">
            <h1>REDIS_RESOURCE</h1>
        </div>
    </div>
    <!-- 显示表格数据 -->
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover" id="redis_table">
                <thead>
                <tr>
                    <th>#</th>
                    <th>RedisName</th>
                    <th>sys_cpu_rate</th>
                    <th>usr_cpu_rate</th>
                </tr>
                </thead>
                <tbody>
                ${redis}

                    <c:forEach items="${redis}" var="redis">

                        <tr>
                            <th>${redis.redisid}</th>
                                <th>${redis.sysCpuRate}</th>
                                <th>${redis.usrCpuRate}</th>
                                <th>${redis.redisName}</th>
                        </tr>
                    </c:forEach>


                </tbody>

            </table>
        </div>
    </div>

</div>

</div>
</body>
</html>
