<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Error Page</title>
</head>
<body>
	name is error
	<s:fielderror fieldName="name" theme="simple"></s:fielderror>
	<s:debug></s:debug>
	<s:property value="fieldErrors.name[0]" />
</body>
</html>