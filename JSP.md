# 🔸JSP

[목차]

- [◻ JSP 기초문법](#-jsp-기초문법)

  [1] 스크립틀릿

  [2] 선언문

  [3] 표현식(Expression)

  [4] 주석

- [◻지시자(Directive) 태그](#지시자directive-태그)

  [1] page Directive 태그

  1. contentType 속성
  2. import 속성
  3. pageEncoding
  4. errorPage , isErrorPage 속성

  [2] Include Directive 태그

  [3] taglib Directive 태그

- [◻액션태그](#액션태그)

  1. useBean, setProperty, getProperty
  2. forward
  3. include

- [◻JSP 내장객체](#jsp-내장객체)

  [[1] 입출력 객체](#1-입출력-객체)

  1. request 객체

     \- request 객체 관련 메소드

     \- request 객체 관련 메소드(파라미터 메소드)

  2. response 객체

     \- response 객체 메소드

  3. out 객체

     \- out 객체 메소드

  [[2] 외부환경 관련 객체](#2-외부환경-관련-객체)

  1. session 객체

     \- session 객체 메소드

  2. application 객체

     \- application 객체 메소드

  3. pageContext 객체

     \- pageContext 메소드

  [[3] 서블릿 관련 객체](#3-서블릿-관련-객체)

  1.  page 객체

  2.  config 객체

      \- config 메소드

  [[4] 예외 관련 객체](#4-예외-관련-객체)

  \- exception 객체

  \- exception 객체 메소드

- [◻ 서블릿 기초 문법](#-서블릿-기초-문법)

  [1] 서블릿

  [2] 서블릿의 주요 클래스

  [3] 서블릿의 라이프 사이클

  [4] 서블릿의 요청 방식

  1.  get방식
  2.  post방식

## ◻ JSP 기초문법

- WEB 환경에서 JAVA를 이용한 DBMS 접근을 처리
- Java Logic 처리를 구현
- JAVA를 기반으로하는 문법
- JSP 고유의 태그가 존재
- JSP의 출력 결과를 HTML과 CSS로 편집하여 출력

### [1] 스크립틀릿

- 일반적인 java 코드가 쓰인다.

- `<% JAVA 코드 %>`

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

\- 메소드(함수) 선언 : ` <%! JAVA 메소드 %>`

int tot = tot(kuk, eng, mat);

### [3] 표현식(Expression)

: 단순 출력 기능

- <% System.out.print(hap(10, 20)); %> : 콘솔에 출력
- <% out.print(hap(10, 20)); %> : JSP 출력
- <%=hap(10, 20)%> : JSP 출력, 문장 종결자(' ; ')를 사용할 수 없고, 오로지 하나의 값만 출력

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

- 지시자는 태그 안에서 @으로 시작하며, 3가지 종류가 있다.
  page, include, taglib

### [1] page Directive 태그

- jsp페이지에서 지원되는 속성들
- jsp페이지에서 JSP컨테이너에게 해당 페이지를 어떻게 처리할 것인가에 대한 페이지 정보를 제공하는데 사용된다.

```javascript
<%@ page contentType="text/html; charset=utf-8"%>
```

#### 1. contentType 속성

- JSP 내용의 타입(html,xml)을 브라우저에 알려주며, jsp의 출력 형식, 캐릭터 셋을 지정한다

```javascript
  <%@ page contentType="text/html; charset=utf-8" %>
```

: JSP처리 결과가 HTML이므로 MIME Type을 'text/html'와 문자 코드(UTF-8)로 선언

- MIME Type : 브러우저가 출력하는 데이터의 종류를 나타낸 코드

  EX) image/jpg는 이미지가 출력된다.

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
  - jsp 컨테이너가 jsp 페이지 처리 도중 에러가 발생했을 경우 보여줄 페이지를 설정하는 것으로, forward로 설정된 페이지로 이동한다.
- isErrorPage
  - 다른 jsp페이지의 에러페이지로 사용하게 될 것인지를 결정하는 것이다.
  - 디폴트는 false이며 true로 설정하면 exeption 기본객체에 접근할 수 있다.
  - 새롭게 실행되는 페이지에 지정할 속성으로 현재 페이지가 Execption 처리를 위한 페이지이라는 것을 컨테이너에 알려준다.

### [2] Include Directive 태그

- 여러 jsp페이지에서 공통적으로 포함하는 내용이 있을 때, 매번 입력하지 않고 파일에 저장한 후

JSP파일에 포함해서 실행한다.

- 처리 결과가 합쳐지는 것이 아니라 파일의 소스가 하나의 파일에 합쳐진 다음에 실행된다.

  - 포함하는 jsp와 포함되는 jsp가 합쳐져서 새로운 페이지가 생성되고 새로운 페이지를 컴파일하여 실행된다.
  - list.jsp 소스 + ssi.jsp 소스 = jsp 통합 큰 소스 ==> 실행

- 정적인 특징을 갖는다.

\*\* Include Directive 태그가 사용되는 경우

- 많은 JSP 페이지에서 자주 사용되는 공용 변수 지정
- 많은 JSP 페이지에서 간단하면서도 중복되어 사용되는 텍스트나 문구

EX) 날짜, 저작권 표시, 메뉴 등

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

- 형식 : `<jsp: .../> `
  ![img](https://velog.velcdn.com/images%2Fansalstmd%2Fpost%2Fcf3f08eb-73df-4b26-ae68-fef43ef6ad9d%2Fimage.png)

#### 1. `useBean, setProperty, getProperty`

- 자바빈즈(JavaBeans)와 통신을 위해서 구현한 액션태그

#### 2. `forward`

- 다른페이지로 이동할 때 사용하는 태그

```javascript
<jsp:forward page="forwardTag1_2.jsp" />
```

#### 3. `include`

- include 액션태그는 include 지시자 처럼 다른페이지를 현재 페이지에 포함시킬 수
  있는 기능을 가진다.
- include 액션태그는 include 지시자와 다르게 포함시킬 페이지의 처리결과를 포함한다.
- 현재 JSP페이지에 포함할 수 있는 외부 파일은 HTML, JSP, 서블릿 페이지 등

```javascript
<jsp:include page="파일명" flush="false" />
```

- page 속성 값
  - 현재 JSP 페이지 내에 포함할 내용을 가진 외부 파일명
  - 외부 파일은 현재 JSP 페이지와 같은 디렉터리에 있으면 파일명만 설정하고, 그렇지 않으면전체 URL(또는 상대 경로)을 설정해야 함
- flush 속성 값
  - include 액션태그의 flush 속성은 포함될 페이지로 이동할 때, 현재 페이지가 지금까지 출력버퍼에 저장한 결과를 어떻게 처리할 것인가를 결정한다.
  - 기본 값은 false
  - flush = 'true' 이면 외부 파일로 제어가 이동할 때 현재 JSP 페이지가 지금까지 버퍼에 저장한 내용을 웹 브라우저에 출력하고 버퍼를 비운다.

## ◻JSP 내장객체

- 개발자가 객체를 생성하지 않고 바로 사용할 수 있는 객체

- 개발자가 객체를 생성하지 않아도 서블릿 컨테이너(Tomcat)가 해당 JSP 페이지 실행 시 자동으로 생성한다.

- 스크립틀릿 안에서만 사용 가능하다.

- 개발자는 반복적인 작업을 줄이고 필요한 작업만 할 수 있다.

- 내장 객체로 인해 개발자는 좀 더 쉽게 JSP 프로그래밍이 가능하다.

![JSP 내장객체](https://github.com/yuseons/TIL/blob/master/image/JSP%20%EB%82%B4%EC%9E%A5%EA%B0%9D%EC%B2%B4.jpg)

### [1] 입출력 객체

#### 1. request 객체

- 웹 브라우저를 통해 서버에 어떤 정보를 요청하는 것
- 요청 정보는 request 객체가 관리

- \<FORM>에 입력되어 웹 브러우저가 전송한 데이터를 Tomcat 서버의 JSP에서
  처리할수 있도록 객체로 가져오는 역할을 한다
  \- ? : 파라메터를 보낸다
  \- &: 접속자가 보내는 값이 2개 이상인 경우

```javascript
http://localhost:8000/jsptest/request.jsp?pay=3000000&name=홍길동&java=100&jsp=90&spring=90


** URL: http://localhost:8000/jsptest/request.jsp?pay=3000000&name=홍길동&java=100&jsp=90&spring=90
** URI : jsptest/request.jsp?pay=3000000&name=홍길동&java=100&jsp=90&spring=90
```

##### - request 객체 관련 메소드

: 웹브라우저와 웹 서버의 정보를 반환한다

- `getContextPath()` : 해당 JSP페이지가 속한 웹 애플리케이션의 콘텍스트 경로를 얻는다.

  - 콘텍스트 경로 : 웹 애플리케이션의 루트 경로

- `getMethod()` : 요청에 사용된 요청 방식(get, post 방식) 을 구분하기 위해 사용한다.
- `getSession` : 세션 객체를 얻어 올 때 사용한다.
- `getProtocol()` : 해당 프로토콜을 얻어올 때 사용한다.
- `getRequestURL()` : 요청한 URL을 얻어올 때 사용한다.
- `getRequestURI()` : 요청한 URI를 얻어올 때 사용한다.
- `getQueryString()` : QueryString을 얻는다.
- `getServerName()` : 서버 name을 얻어올 때 사용한다.
- `getServerPort()` : 서버 port를 얻어올 때 사용한다.

##### - request 객체 관련 메소드(파라미터 메소드)

: \<form> 태그로 전송된 데이터를 받아오는 메서드

- `String getParameter(String name)` : name의 값을 알 때, name에 해당하는 파라미터의 값을 받아옴

- `String[] getParameterValues(String name)` : name에 해당하는 모든 파라미터의 값을 얻어내는 메소드 (배열타입으로 리턴된다)

- `Enumeration getParameterNames()` : 요청에 의해 넘어오는 모든 파라미터의 값을 얻어옴(name 값을 모를 떄 사용)

#### 2. response 객체

: 웹 브라우저의 요청에 응답할 응답 정보를 가지고 있는 JSP 내장 객체

- 처리 결과를 웹 브러우저에게 출력할 목적을 가지고 있다.

\- out 객체는 response 객체로부터 생성한다.

##### - response 객체 메소드

- getCharacterEncoding() : 응답할 때 문자의 인코딩 형태를 반환한다.
- addCookie() : 쿠키 데이터를 지정할 때 사용한다.
- sendRedirect(URL) : 지정한 URL로 이동한다.

#### 3. out 객체

- Out 객체는 웹 브라우저에 데이터를 전송하는 출력 스트림으로서 JSP 페이지가 생성하는 모든 데이터는 out 기본 객체를 통해서 출력된다.

  ( JSP 스크립트 요소뿐만 아니라 비 스크립트 요소인 HTML, 일반 텍스트도 모두 포함)

  ```javascript
  out.println("출력합니다.");
  ```

##### - out 객체 메소드

- `boolean isAutoFlush()` : 출력 버퍼가 다 찼을 때 처리 여부를 결정하는 것으로, 버퍼내용을 클라이언트로 전송하도록 지정되어 있으면 true를 리턴하고, 예외가 발생하도록 지정되어 있으면 false를 리턴한다.

- `int getBufferSize()` 출력 버퍼의 전체 크기를 리턴한다

- ` int getRemaining()` 출력 버퍼에서 현재 남아있는 크기를 리턴한다

- `void clearBuffer()` 현재 출력 버퍼에 저장되어 있는 내용을 웹 브라우저에 전송하지 않고 비운다.

- `String println(str)` : 주어진 str 값을 웹 브라우저에 출력한다. 줄 바꿈은 적용되지 않는다.

- `void flush()` 현재 출력 버퍼에 저장되어 있는 내용을 웹 브라우저에 전송하고 비운다.

- `void close() `현재 출력 버퍼에 저장되어 있는 내용을 웹 브라우저에 전송하고 출력 스트림을 닫는다.

### [2] 외부환경 관련 객체

#### 1. session 객체

- 웹 브라우저 요청시, 요청한 웹 브라우저에 관한 정보를 저장 및 관리하는 내장객체이다.

- 세션은 오직 서버에만 생성된다.

- 세션은 요청을 시도한 특정클라이언트와 다른 클라이언트와 구별하여 각각의 클라이언트에 대한 정보를 지속적으로 관리할 수 있다.

##### - session 객체 메소드

- `String getId()` : 해당 웹 브라우저에 대한 고유한 세션 ID를 리턴한다.
- ` long getCreationTime()` : 해당 세션이 생성된 시간을 리턴한다.
- ` long getLastAccessedTime()` : 웹 브라우저의 요청이 시도된 마지막 접근시간을 리턴한다.
- `void setMaxInactiveInterval(time) ` : 해당 세션을 유지할 시간을 초단위로 설정한다.
- `int getMaxInactiveInterval() ` : 기본값은 30분으로, setMaxInactiveInterval(time) 로 지정된 값을 리턴한다.
- `boolean isNew()` : 현재의 웹 브라우저가 새로 부른( 새로 생성된 세션 )의 경우 true 값을 리턴한다.
- ` void invalidate()` : 세션의 모든 데이터를 제거하고 연결된 객체를 해제한다. ( 현재 세션을 종료시킨다)

#### 2. application 객체

- 어플리케이션의 내외부의 여러 환경 정보(contenxt)를 담고 있는 객체이다.
- 서버의 정보와 서버측 자원에 대한 정보를 얻을 수 있다.

- 처음 컨테이너가 구동될 때 단 하나의 객체만 생성된다.

##### - application 객체 메소드

- `void setAttribute(String name, Object value)` : 해당 내장 객체의 속성값을 설정하는 메소드로, 속성명에 해당하는 name 매개 변수에 속성값에 해당하는 value 매개 변수의 값을 지정한다.
- `Object getAttribute(String name)` : 해당 내장 객체의 속성명을 읽어오는 메소드
- `void removeAttribute(String name)` : 해당 내장 객체의 속성을 제거하는 메소드
- `String getServerInfo()` : 컨테이너 이름과 버전을 리턴
- `void log(String msg)` : 제공된 문자열을 서블릿 로그 파일에 기록

#### 3. pageContext 객체

- Jsp페이지의 Context를 나타낸다.
- pageContext 객체는 JSP 기본객체로 JSP 페이지에서 따로 선언하지 않아도 참조하여 사용 가능하다.
- pageContext 내부객체를 통해서 다른 내부객체를 접근할 수 있다.

##### - pageContext 메소드

- `ServletRequest getRequest()` : 클라이언트의 요청 정보를 담고 있는 객체를 리턴한다.
- `ServletResponse getResponse()`: 요청에 대한 응답 객체를 리턴한다.
- `JspWriter getOut()`: 응답 출력 스트림을 리턴한다.
- `Object getPage() ` : 서블릿 인스턴스 객체를 리턴한다.
- `ServletConfig getServletConfig() `: 서블릿의 초기 설정 정보를 담고 있는 객체를 리턴한다.
- `ServletContext getServletContext() ` : 서블릿의 실행 환경정보를 담고 있는 객체를 리턴한다
- `HttpSession getSession() ` : 클라이언트의 세션 정보를 담고 있는 객체를 리턴한다.
- `forward(String url) ` : 현재 페이지의 요청과 응답에 관한 제어권을 URL로 지정된 주소로 영구적 넘깁니다.

  - Forward된 페이지의 요청처리가 종료되면 응답도 종료된다.

- `include(String url)` : 현재 페이지의 요청과 응답에 관한 제어권을 URL로 지정된 주소로 임시로 넘긴다.
- include된 페이지의 요청처리가 끝나면 다시 원래의 페이지로 돌아온다.

- `Exception getException()` : 에러 정보를 가지고 있는 exception 내장 객체를 반환한다.

### [3] 서블릿 관련 객체

: page객체와 config객체를 통해서 JSP페이지가 변환된 서블릿과 관련된 내용에 접근할 수 있도록 하는 객체들이다.

#### 1. page 객체

- Jsp페이지 그 자체를 나타낸다.
- page객체는 this 키워드로 자기 자신을 참조할 수 있다.

#### 2. config 객체

- javax.servlet.ServletConfig 클래스 타입의 내부 객체이다.
- 서블릿이 초기화될 때 참조해야 할 다른 여러 정보를 가지고 있다가 전해준다.

##### - config 메소드

- `String getInitParameter(name)` : 지정한 name의 초기 파라미터 이름을 반환한다.
- `Enumeration getInitParameterNames()` : 서블릿 설정 파일에 지정된 초기 파라미터 이름을 반환한다.
- `String getServletName()` : 서블릿의 이름을 반환한다.
- `ServletContext getServletContext()` : 실행하는 ServletContext 객체를 반환한다.

### [4] 예외 관련 객체

#### exception 객체

- Jsp페이지에서 예외가 발생했을 때 처리해줄 수 있는 객체이다.
- 예외 발생 시 넘겨줄 페이지를 지시자로 지정할 수 있다.
- page지시자 isErrorPage속성을 true로 지정한 Jsp페이지에서만 사용가능하다.

##### - exception 객체 메소드

- ` String getMessage()` : 발생한 예외의 메세지를 리턴한다.
- `String toString()` : 발생한 예외 클래스 및 예외 메세지를 리턴한다.
- `void printStackTrace()` : 발생한 예외를 역추적하기 위해 예외 스트림을 서버에 출력한다.
- `void printStackTrace(PrintWriter s)` : 발생한 예외를 역추적 하기 위해 예외 스트림을 클라이언트에게 출력한다.

## ◻ 서블릿 기초 문법

### [1] 서블릿

- Jsp가 나오기전에 만들어진 웹페이지 생성 기술

- WAS(tomcat)에서 웹페이지를 동적으로 생성하여 결과를 전송해 주는 서버 측 프로그램이다.

  \- 장점

- JSP에는 없는 서버 측 프로그램의 기능이 있다.

- 대기업에서 사용하는 프레임워크의 기초 기술로 사용된다.

  \- 단점

- html, css, js 등과 연동하기엔 어렵다.

### [2] 서블릿의 주요 클래스

- HttpServlet
  \- 서블릿을 만들기 위해서 반드시 상속해야 할 필수 클래스스
  \- Servlet 인터페이스 > GenericServlet 추상클래스 > HttpServlet 상속구조
  \- 위에서 제공되는 많은 메소드사용 가능
  ![HttpServlet.jpg](https://github.com/yuseons/TIL/blob/master/image/HttpServlet.jpg)

- HttpServletRequest
  \- 클라이언트가 데이터를 입력하거나 클라이언트의 정보에 대한 요청 값을 가지고
  있다.
  ![HttpServletRequest.jpg](https://github.com/yuseons/TIL/blob/master/image/HttpServletRequest.jpg)

- HttpServletResponse
  \- 클라이언트가 요청한 정보를 처리하고 응답을 위한 정보를 담고 있다.
  ![HttpServletResponse.jpg](https://github.com/yuseons/TIL/blob/master/image/HttpServletResponse.jpg)

- HttpSession
  클라이언트가 세션정보를 저장하고, 세션 기능을 유지 하기 위해서 제공된다.
  ![HttpSession.jpg](https://github.com/yuseons/TIL/blob/master/image/HttpSession.jpg)

### [3] 서블릿의 라이프 사이클

- 클라이언트 서블릿 요청 -> init (최초 한번 호출) -> service, doGet, doPost (반복적 호출)

  -> destroy (마지막 한번 호출)

![서블릿의 라이프 사이클.jpg](https://github.com/yuseons/TIL/blob/master/image/%EC%84%9C%EB%B8%94%EB%A6%BF%EC%9D%98%20%EB%9D%BC%EC%9D%B4%ED%94%84%20%EC%82%AC%EC%9D%B4%ED%81%B4.jpg)

### [4] 서블릿의 요청 방식

#### 1. get방식

- 검색이나 조건을 다른 페이지로 전송할 때 사용한다.
- 요청 시 url에 노출되므로 보안적인 내용은 사용 안 한다.
- 클라이언트의 데이터를 URL뒤에 붙여서 보낸다.

```
www.example.com?id=abcde&pass=1234
```

#### 2. post방식

- 게시판에 글을 입력하거나 또는 회원가입을 하는 기능으로, 다른 페이지로 전송할 때 사용하는 방식이다.

- URL뒤에 붙여서 보내지 않고 BODY에 데이터를 넣어서 보낸다.

- url에 노출되지 않으며 html 헤더 값에 같이 전송된다.
