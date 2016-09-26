<jsp:include page="_header.jsp" />
 
<h1>Register New User Account</h1>

<form name='f' method='POST'>
      <table>
         <tr>
            <td>First Name:</td>
            <td><input type='text' name='firstName' value=''></td>
         </tr>
         <tr>
            <td>Last Name:</td>
            <td><input type='text' name='lastName' /></td>
         </tr>        
         <tr>
            <td>User Name:</td>
            <td><input type='text' name='username' value=''></td>
         </tr>
         <tr>
            <td>Password:</td>
            <td><input type='password' name='password' /></td>
         </tr>
         <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
         </tr>
      </table>
  </form>

<jsp:include page="_footer.jsp" />