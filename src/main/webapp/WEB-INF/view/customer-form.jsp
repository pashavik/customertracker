<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Save customer</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">

</head>
<body>
      <div id="wrapper">
          <div id="header">
              <h2> Manager</h2>
          </div>
      </div>

      <div id="container">
          <h3>Save customer</h3>
          <form:form action="saveCustomer" modelAttribute="customer" method="post">
              <form:hidden path="id"/>

                  <table>
                      <tbody>
                            <tr>
                                <td><label>First Name</label></td>
                                <td><form:input path="firstName" /></td>
                            </tr>

                            <tr>
                                <td><label>Last Name</label></td>
                                <td><form:input path="lastName" /></td>
                            </tr>

                            <tr>
                            <td><label>Email</label></td>
                            <td><form:input path="email" /></td>
                        </tr>

                        <tr>
                            <td><label></label></td>
                            <td><input type="submit" value="save" class="save"/></td>
                        </tr>

                  </tbody>

              </table>
          </form:form>

          <div style="clear; both;"></div>
          <p>
              <a href="${pageContext.request.contextPath}/customer/list">Back</a>
          </p>
      </div>
</body>
</html>
