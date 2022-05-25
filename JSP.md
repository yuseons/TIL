# 🔸JSP

## ◻ JSP 기초문법

- WEB 환경에서 JAVA를 이용한 DBMS 접근을 처리 
- Java Logic 처리를 구현
- JAVA를 기반으로하는 문법
- JSP 고유의 태그가 존재
- JSP의 출력 결과를 HTML과 CSS로 편집하여 출력

### [1] 스크립틀릿

- 일반적인 java 코드가 쓰인다.

- `<%     JAVA 코드    %>`

   ```java
   <%
   String name = "홍길동";
   int kuk = 80;
   int eng = 70;
   int tot = kuk + eng;
   int avg = tot / 2;
   %>
   ```

   

### [2] 선언문

- 선언문은 권장하지 않음(특별한 경우만 사용)

 \- 메소드(함수) 선언 : ` <%!    JAVA 메소드   %>`

   int tot = tot(kuk, eng, mat);



### [3] 표현식(Expression) 
​	: 단순 출력 기능

  - <% System.out.print(hap(10, 20)); %>  : 콘솔에 출력 
  - <% out.print(hap(10, 20)); %>       : JSP 출력
  - <%=hap(10, 20)%>        : JSP 출력, 문장 종결자(' ; ')를 사용할 수 없고, 오로지 하나의 값만 출력


### [4] 주석

```javascript
<%

 //       

/*   ...   */ 

             %>
```

## ◻지시자(Directive) 태그

- 지시자(Directive) 태그는 현재의 JSP 페이지 자체에 대해서

   JSP 엔진 및 컨테이너에게 각종 처리정보를 전달하고 수행해야 할 기능을 정하는 역할을 한다.

- 지시자는 태그 안에서 @으로 시작하며,  3가지 종류가 있다.
   page, include, taglib

### [1] page Directive 태그

- jsp페이지에서 지원되는 속성들
- jsp페이지에서 JSP컨테이너에게 해당 페이지를 어떻게 처리할 것인가에 대한 페이지 정보를 제공하는데 사용된다.

```javascript
<%@ page contentType="text/html; charset=utf-8"%>
```

#### 1. contentType 속성

- JSP 내용의 타입(html,xml)을 브라우저에 알려주며,  jsp의 출력 형식, 캐릭터 셋을 지정한다

```javascript
  <%@ page contentType="text/html; charset=utf-8" %>
```

​		: JSP처리 결과가 HTML이므로 MIME Type을 'text/html'와 문자 코드(UTF-8)로 선언

- MIME Type : 브러우저가 출력하는 데이터의 종류를 나타낸 코드

  ​	EX) image/jpg는 이미지가 출력된다.

#### 2. import 속성
- 관련된 패키지나 클래스를 지정하여 활용하겠다고 선언하는 것이다.
- 중복 사용 가능하다.

```javascript
<%@ page import="java.util.*, java.sql.*" %>
```

#### 3. pageEncoding

- jsp페이지의 캐릭터셋 형식을 지정

```javascript
 <%@ page pageEncoding="UTF-8" contentType="text/html" %> 
```

#### 4. errorPage , isErrorPage 속성

- errorPage
  - 이 속성이 지정된 JSP 페이지 내에서 Exception이 발생하는 경우, Exception을 처리할 페이지를 지정하기 위해서 사용한다.
  - jsp 컨테이너가 jsp 페이지 처리 도중 에러가 발생했을 경우 보여줄 페이지를 설정하는 것으로,  forward로 설정된 페이지로 이동한다.
- isErrorPage
  - 다른 jsp페이지의 에러페이지로 사용하게 될 것인지를 결정하는 것이다.
  - 디폴트는 false이며 true로 설정하면 exeption 기본객체에 접근할 수 있다.
  - 새롭게 실행되는 페이지에 지정할 속성으로 현재 페이지가 Execption 처리를 위한 페이지이라는 것을 컨테이너에 알려준다.

### [2] Include Directive 태그

- 여러 jsp페이지에서 공통적으로 포함하는 내용이 있을 때, 매번 입력하지 않고 파일에 저장한 후 

​		JSP파일에 포함해서 실행한다.

- 처리 결과가 합쳐지는 것이 아니라 파일의 소스가 하나의 파일에 합쳐진 다음에 실행된다. 

  - 포함하는 jsp와 포함되는 jsp가 합쳐져서 새로운 페이지가 생성되고 새로운 페이지를 컴파일하여 실행된다.

      							list.jsp 소스 + ssi.jsp 소스 =  jsp 통합 큰 소스    ==>  실행 

- 정적인 특징을 갖는다.



** Include Directive 태그가 사용되는 경우

- 많은 JSP 페이지에서 자주 사용되는 공용 변수 지정
- 많은 JSP 페이지에서 간단하면서도 중복되어 사용되는 텍스트나 문구

​		EX) 날짜, 저작권 표시, 메뉴 등

```javascript
<%@ include file="Local URL" %> 
 
<%@ include file="./ssi.jsp" %> 
```

### [3] taglib Directive 태그

- 사용자에 의해서 만든 커스텀 태그를 이용할 때 사용
- JSP 페이지 내에 불필요한 자바 코드를 줄일 수 있다.

```javascript
<%@ taglib uri="/WEB_INF/taglib.tld" prefix="soccer"%>
```



## ◻액션태그

- 서버나 클라이언트에게 어떤 행등을 하도록 명령하는 태그이다.

- JSP 페이지에서 페이지와 페이지 사이를 제어한다.

- 다른 페이지의 실행 결과 내용을 현재 페이지에 포함한다.

- 액션태그의 종류로는 include, forward, useBean, setProperty, getProperty 등이 있다.

-  형식 : `<jsp: .../> `
 ![img](https://velog.velcdn.com/images%2Fansalstmd%2Fpost%2Fcf3f08eb-73df-4b26-ae68-fef43ef6ad9d%2Fimage.png)

 #### 1. `useBean, setProperty, getProperty`
 - 자바빈즈(JavaBeans)와 통신을 위해서 구현한 액션태그

#### 2. `forward` 

  - 다른페이지로 이동할 때 사용하는 태그

```javascript
<jsp:forward page="forwardTag1_2.jsp" />
```

#### 3. `include`

  -  include 액션태그는 include 지시자 처럼 다른페이지를 현재 페이지에 포함시킬 수
      있는 기능을 가진다.
  - include 액션태그는 include 지시자와 다르게 포함시킬 페이지의 처리결과를 포함한다.
  - 현재 JSP페이지에 포함할 수 있는 외부 파일은 HTML, JSP, 서블릿 페이지 등

  ```javascript
  <jsp:include page="파일명" flush="false"/>
  ```

- page 속성 값
  - 현재 JSP 페이지 내에 포함할 내용을 가진 외부 파일명
  - 외부 파일은 현재 JSP 페이지와 같은 디렉터리에 있으면 파일명만 설정하고, 그렇지 않으면전체 URL(또는 상대 경로)을 설정해야 함
- flush 속성 값
  - include 액션태그의 flush 속성은 포함될 페이지로 이동할 때, 현재 페이지가 지금까지 출력버퍼에 저장한 결과를 어떻게 처리할 것인가를 결정한다.
  - 기본 값은 false
  - flush = 'true' 이면 외부 파일로 제어가 이동할 때 현재 JSP 페이지가 지금까지 버퍼에 저장한 내용을 웹 브라우저에 출력하고 버퍼를 비운다.

## ◻JSP 내장객체

\- 개발자가 객체를 생성하지 않아도 서블릿 컨테이너(Tomcat)가 해당 JSP 페이지 실행 시 자동으로 생성한다.

-스크립틀릿 안에서만 사용 가능하다.

\- 개발자는 반복적인 작업을 줄이고 필요한 작업만 할 수 있다. 

\- 내장 객체로 인해 개발자는 좀 더 쉽게 JSP 프로그래밍이 가능하다.

\- jsp페이지는 Web서버 및 Servlet Container라고 하는 복잡한 환경에서 실행이 되기 때문에 실행중에 여러가지 상태정보를 가지고 있어야 하는데, 이러한 경우에 사용되는 객체들이 내부 객체들이다. 

![JSP 내장객체](../JSP 내장객체.jpg)
