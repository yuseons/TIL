# 🔸JSTL

## ◻JSTL(JavaServer Pages Standard Tag Library)

: JSP 개발을 단순화하기위한 태그 library

 \- 많이 사용되는 사용자 정의 태그를 모아서 JSTL 규약 생성
 \- 스크립틀릿, 표현식을 보다 훨씬 간결한 문법 구조 지원

\- HTML 코드 내에 java 코드인 스크립틀릿 `<%= student %>`를 `${student}`로, `<%=if %>`문을 `<c:if>`, `<%=for%>`문을 `<c:forEach>`로 대체하여 사용한다.



\-  JSTL은 5가지의 태그를 지원한다.

- JSTL tag

  | 라이브러리      | 기능                                         | 접두어 | URL                                   |
  | --------------- | -------------------------------------------- | ------ | ------------------------------------- |
  | core tags       | 변수 지원, URL 관리, 흐름 제어 등을 제공     | c      | http://java.sun.com/jsp/jstl/core     |
  | function tags   | 문자열 조작 및 문자열 길이를 지원            | fn     | http://java.sun.com/jsp/jstl/function |
  | formatting tags | 메시지 형식화, 번호 및 날짜 형식화 등을 지원 | fmt    | http://java.sun.com/jsp/jstl/fmt      |
  | XML tags        | 흐름 제어, 변환 등을 제공                    | x      | http://java.sun.com/jsp/jstl/xml      |
  | SQL tags        | SQL 지원을 제공                              | sql    | http://java.sun.com/jsp/jstl/sq       |

  - Core Tags

    - 
  
    | 기능      | 태그명         | 기능설명                                                 |
    | --------- | -------------- | -------------------------------------------------------- |
    | 변수 지원 | \<c:set>       | jsp에서 사용될 변수를 설정                               |
    |           | \<c:remove>    | 설정한 변수를 제거                                       |
    | 흐름 제어 | \<c:if>        | 조건에 따라 내부 코드를 수행                             |
    |           | \<c:choose>    | 다중 조건을 처리할 때 사용                               |
    |           | \<c:forEach>   | Collection의 각 항목을 처리할 때 사용                    |
    |           | \<c:forTokens> | 구분자로 분리된 각각의 토큰을 처리할 때 사용             |
    | URL 처리  | \<c:import>    | URL을 사용하여 다른 자원의 결과를 삽입                   |
    |           | \<c:redirect>  | 지정한 경로로 이동                                       |
    |           | \<c:url>       | URL을 재작성                                             |
    | 기타 태그 | \<c:catch>     | 예외 처리에 사용                                         |
    |           | \<c:out>>      | <% = ... %> 태그 작동 방식과 유사한 표현식의 결과를 표시 |
  
    
  
  - formatting tags : 숫자, 날짜, 시간을 formatting하는 기능과 국제화, 다국어 지원 기능을 제공
    
  - 포매팅 태그 라이브러리 종류
    
    - `<fmt:timeZone>` : 지정한 국가의 시간을 지정하는 태그
    
    - `<fmt:setTimeZone>`: 지정한 국가의 시간을 지정하는 태그.
    
      \- 태그를 열고 닫는 영역 안에서만 적용된다
    
      => setTimeZone 태그는 태그를 열고 닫는 영역 안에서만 적용된다는 점에서 timeZone태그와의 	차이점이 있다.
    
    - `<fmt:formatNumber>`: 표시할 숫자의 형식을 지정
    
    - `<fmt:formatDate>`: 지정한 형식의 날짜를 표시
