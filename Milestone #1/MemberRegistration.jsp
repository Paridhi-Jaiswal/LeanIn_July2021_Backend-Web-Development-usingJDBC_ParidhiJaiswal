<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<Form action="Reg" method="post">
<p><LABEL for="firstname">FIRST NAME: </LABEL>
<INPUT id="firstname"type="Text"><BR>
<LABEL for="lastname">LAST NAME: </LABEL>
<INPUT id="lastname"type="Text"><BR>
<LABEL for="email">EMAIL: </LABEL>
<INPUT id="email"type="email"><BR>
PASSWORD: <INPUT type="password"></P>
<p> choose one</p>
<INPUT type="Checkbox" name= "C1"  value= "School">School<BR><BR>
<INPUT type="Checkbox" name= "C1"  value= "Graduate">Graduate<BR><BR>
<P> Gender </P>
<INPUT type="Radio" name= "gender"  value= "Male"> Male<BR><BR>
<INPUT type="Radio" name= "gender"  value= "Female"> Female<BR><BR>
<p> Select Your City. <p><BR>
<SELECT name="cities">
<OPTION> Kanpur
<OPTION> Kolkata
<OPTION> Delhi
<OPTION> Mumbai
<OPTION> Agra
<OPTION> Lucknow
<OPTION> Chennai
<OPTION> Bhopal
<OPTION> Patna
<OPTION> Shimla
</select><BR><BR><BR><BR>
<INPUT type="Submit" value="Send">
<INPUT type="Reset" value="Reset">
</p>
</form>
</body>
</html>