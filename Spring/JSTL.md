# ๐ธJSTL

## โปJSTL(JavaServer Pages Standard Tag Library)

: JSP ๊ฐ๋ฐ์ ๋จ์ํํ๊ธฐ์ํ ํ๊ทธ library

 \- ๋ง์ด ์ฌ์ฉ๋๋ ์ฌ์ฉ์ ์ ์ ํ๊ทธ๋ฅผ ๋ชจ์์ JSTL ๊ท์ฝ ์์ฑ
 \- ์คํฌ๋ฆฝํ๋ฆฟ, ํํ์์ ๋ณด๋ค ํจ์ฌ ๊ฐ๊ฒฐํ ๋ฌธ๋ฒ ๊ตฌ์กฐ ์ง์

\- HTML ์ฝ๋ ๋ด์ java ์ฝ๋์ธ ์คํฌ๋ฆฝํ๋ฆฟ `<%= student %>`๋ฅผ `${student}`๋ก, `<%=if %>`๋ฌธ์ `<c:if>`, `<%=for%>`๋ฌธ์ `<c:forEach>`๋ก ๋์ฒดํ์ฌ ์ฌ์ฉํ๋ค.



\-  JSTL์ 5๊ฐ์ง์ ํ๊ทธ๋ฅผ ์ง์ํ๋ค.

- JSTL tag

  | ๋ผ์ด๋ธ๋ฌ๋ฆฌ      | ๊ธฐ๋ฅ                                         | ์ ๋์ด | URL                                   |
  | --------------- | -------------------------------------------- | ------ | ------------------------------------- |
  | core tags       | ๋ณ์ ์ง์, URL ๊ด๋ฆฌ, ํ๋ฆ ์ ์ด ๋ฑ์ ์ ๊ณต     | c      | http://java.sun.com/jsp/jstl/core     |
  | function tags   | ๋ฌธ์์ด ์กฐ์ ๋ฐ ๋ฌธ์์ด ๊ธธ์ด๋ฅผ ์ง์            | fn     | http://java.sun.com/jsp/jstl/function |
  | formatting tags | ๋ฉ์์ง ํ์ํ, ๋ฒํธ ๋ฐ ๋ ์ง ํ์ํ ๋ฑ์ ์ง์ | fmt    | http://java.sun.com/jsp/jstl/fmt      |
  | XML tags        | ํ๋ฆ ์ ์ด, ๋ณํ ๋ฑ์ ์ ๊ณต                    | x      | http://java.sun.com/jsp/jstl/xml      |
  | SQL tags        | SQL ์ง์์ ์ ๊ณต                              | sql    | http://java.sun.com/jsp/jstl/sq       |

  - Core Tags

    - 
  
    | ๊ธฐ๋ฅ      | ํ๊ทธ๋ช         | ๊ธฐ๋ฅ์ค๋ช                                                 |
    | --------- | -------------- | -------------------------------------------------------- |
    | ๋ณ์ ์ง์ | \<c:set>       | jsp์์ ์ฌ์ฉ๋  ๋ณ์๋ฅผ ์ค์                                |
    |           | \<c:remove>    | ์ค์ ํ ๋ณ์๋ฅผ ์ ๊ฑฐ                                       |
    | ํ๋ฆ ์ ์ด | \<c:if>        | ์กฐ๊ฑด์ ๋ฐ๋ผ ๋ด๋ถ ์ฝ๋๋ฅผ ์ํ                             |
    |           | \<c:choose>    | ๋ค์ค ์กฐ๊ฑด์ ์ฒ๋ฆฌํ  ๋ ์ฌ์ฉ                               |
    |           | \<c:forEach>   | Collection์ ๊ฐ ํญ๋ชฉ์ ์ฒ๋ฆฌํ  ๋ ์ฌ์ฉ                    |
    |           | \<c:forTokens> | ๊ตฌ๋ถ์๋ก ๋ถ๋ฆฌ๋ ๊ฐ๊ฐ์ ํ ํฐ์ ์ฒ๋ฆฌํ  ๋ ์ฌ์ฉ             |
    | URL ์ฒ๋ฆฌ  | \<c:import>    | URL์ ์ฌ์ฉํ์ฌ ๋ค๋ฅธ ์์์ ๊ฒฐ๊ณผ๋ฅผ ์ฝ์                   |
    |           | \<c:redirect>  | ์ง์ ํ ๊ฒฝ๋ก๋ก ์ด๋                                       |
    |           | \<c:url>       | URL์ ์ฌ์์ฑ                                             |
    | ๊ธฐํ ํ๊ทธ | \<c:catch>     | ์์ธ ์ฒ๋ฆฌ์ ์ฌ์ฉ                                         |
    |           | \<c:out>>      | <% = ... %> ํ๊ทธ ์๋ ๋ฐฉ์๊ณผ ์ ์ฌํ ํํ์์ ๊ฒฐ๊ณผ๋ฅผ ํ์ |
  
    
  
  - formatting tags : ์ซ์, ๋ ์ง, ์๊ฐ์ formattingํ๋ ๊ธฐ๋ฅ๊ณผ ๊ตญ์ ํ, ๋ค๊ตญ์ด ์ง์ ๊ธฐ๋ฅ์ ์ ๊ณต
    
  - ํฌ๋งคํ ํ๊ทธ ๋ผ์ด๋ธ๋ฌ๋ฆฌ ์ข๋ฅ
    
    - `<fmt:timeZone>` : ์ง์ ํ ๊ตญ๊ฐ์ ์๊ฐ์ ์ง์ ํ๋ ํ๊ทธ
    
    - `<fmt:setTimeZone>`: ์ง์ ํ ๊ตญ๊ฐ์ ์๊ฐ์ ์ง์ ํ๋ ํ๊ทธ.
    
      \- ํ๊ทธ๋ฅผ ์ด๊ณ  ๋ซ๋ ์์ญ ์์์๋ง ์ ์ฉ๋๋ค
    
      => setTimeZone ํ๊ทธ๋ ํ๊ทธ๋ฅผ ์ด๊ณ  ๋ซ๋ ์์ญ ์์์๋ง ์ ์ฉ๋๋ค๋ ์ ์์ timeZoneํ๊ทธ์์ 	์ฐจ์ด์ ์ด ์๋ค.
    
    - `<fmt:formatNumber>`: ํ์ํ  ์ซ์์ ํ์์ ์ง์ 
    
    - `<fmt:formatDate>`: ์ง์ ํ ํ์์ ๋ ์ง๋ฅผ ํ์
