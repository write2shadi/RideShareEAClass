<jsp:include page="_header.jsp" />
<%@page session="true"%> 

    <h2>Admin Page</h2>
 
 
    <h3>Welcome : ${pageContext.request.userPrincipal.name}</h3>
 
    <b>This is protected page!</b>  
<jsp:include page="_footer.jsp" />
    