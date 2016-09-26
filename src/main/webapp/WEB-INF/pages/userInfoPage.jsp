<jsp:include page="_header.jsp" />
     
    <h2>User Info Page</h2>
 
    <h3>Welcome : ${pageContext.request.userPrincipal.name}</h3>
 
    <b>This is protected page!</b>  

<jsp:include page="_footer.jsp" />