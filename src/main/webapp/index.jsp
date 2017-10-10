<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>展示redis</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <script type="text/javascript">

    </script>
</head>
<body>
<%--搭建展示页面--%>

<div class="container">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12">
            <h1>SHOW_REDIS</h1>
        </div>
    </div>
    <!-- 显示表格数据 -->
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover" id="redis_table">
                <thead>
                <tr>
                    <%--<th>--%>
                        <%--<input type="checkbox" id="check_all"/>--%>
                    <%--</th>--%>
                    <th>#</th>
                    <th>RedisName</th>
                    <th>sys_cpu_rate</th>
                    <th>usr_cpu_rate</th>
                </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
            <script type="text/javascript">
                $(function () {
                    to_page(1);
                });
                
                function  to_page(pn) {
                    $.ajax({
                        url:"${APP_PATH}/redis",
                        data:"pn="+pn,
                        type:"GET",
                        success:function (result) {
                            build_redis_table(result);
                        }
                    });
                }

                function  build_redis_table(result) {
                    $("#redis_table tbody").empty();
                    var redis = result.extend.pageInfo.list;
                    $.each(redis,function (index,item) {
                        var redisName = $("<td></td>").append(item.redisName);
                        var sys_cpu_rate = $("<td></td>").append(item.sysCpu);
                        var usr_cpu_rate = $("<td></td>").append(item.usrCpu);
                        $("<tr></tr>").append(redisName)
                            .append(sys_cpu_rate)
                            .append(usr_cpu_rate)
                            .appendTo("#redis_table tbody");
                    });
                }

            </script>

        </div>
    </div>


</div>
</body>
</html>