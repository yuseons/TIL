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

- out 태그 
   \- JspWriter에 데이터를 출력
   \- \<pre>~\</pre>는 공백과 엔터를 있는 그대로 출력
   \- escapeXml="true": < <, > >, & &, ' ', " " 출력

- 국제화 태그 : 숫자 및 날짜 포맷팅 

  - formatNumber Tag 
     \- groupingUsed="false": ','구분기호를 사용할지 여부를 결정

  - timeZone, setTimeZone Tag
     \- 홍콩에서 한국에 있는 서버에 접속시에 한국시간이 아닌 홍콩의 시간이 출력이 되도록 하는 기능