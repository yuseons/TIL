## ◻ EL(표현 언어, Expression Language)

 \- EL은 JSP 객체의 출력을 단순화하는 용도로 사용한다. 
 \- JSP 2.0은 JSTL 1.1버전에 포한된 EL의 기능을 제공한다
 \- 값이 없는 경우 "null"값을 출력하지 않는다
 \- 표현 방법 : **${ 속성 }**

### [1] JSP 내부 객체에 대한 EL 객체 
 \- pageContext : PageContext 객체

 \- pageScope : page 영역에 포함된 객체

 \- requestScope : request 영역에 포함된 객체

 \- sessionScope : session 영역에 포함된 객체

 \- applicationScope : application 영역에 포함된 객체

 \- param : HTTP의 파라미터들 ( request.getParameter(“ ”)로 얻을 수 있는 값들 )

 \- paramValues : 하나의 파라미터의 값들 ( request.getParameterValues(“ ”) 와 동일한 기능 )

 \- header : 헤더 정보들 

 \- headerValues  : 하나의 헤더의 값들 

 \- cookie : 쿠키들 

 \- initParam : 컨텐츠의 초기화 파라미터들 



### [2] EL 객체의 사용 예 

- ${pageContext.request.requestURI} : request URI 

- ${sessionScope.profile} : session 영역에서 profile이라는 이름으로 저장된 객체 

- ${param.productId} : productId라는 이름의 파라미터 값 

- ${paramValues.productId} : productId라는 이름의 파라미터 값들 

- ${pageContext.request.contextPath} : Context Path 추출 