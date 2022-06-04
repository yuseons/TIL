# 🔸 MVC(Model, View, Controller) Pattern



## ◻ MVC Pattern

\- MVC 패턴은 모델(Model), 뷰(View), 컨트롤러(Controller)로 이루어진다.

\- 웹 응용프로그램을 구성하는 서버 모듈을 사용자에게 보여주는 것은 뷰(View), 

​	자료와 비즈니스 로직 처리를 모델(Model), 

​	이들 상호 간의 흐름을 제어하는 컨트롤러(Controller)로 분리하여 개발한다.

\- MVC는 새로운 개발 방법이 아니라 기존의 MVC 개발 모델이 웹 응용프로그램 개발에도 적합하다는 것이 입증되어, JSP 개발자들에게 권고하는 개발 모델이다.



### 비즈니스 로직과 표현의 분리

- 장점
  \- 디자이너는 표현에 집중, 프로그래머는 비즈니스 로직에 전념하여 개발하므로 효율성이 높아진다.

  \- 웹 응용프로그램의 수정이 쉽다.

  \- 웹 응용프로그램의 확장이 쉽다.

  \- 웹 응용프로그램의 유지 보수가 쉽다.

  \- jsp와 javabeans로 개발한 경우는 비즈니스 로직과 표현을 완전히 분리하기 쉽지 않을 뿐 아니라 프로젝트 규모가 커질수록 더욱 어려움 생긴다.

  \- 이러한 문제의 해결책으로 웹 응용프로그램을 비즈니스 로직과 표현으로 분리하여 개발하고자 하는 것이 MVC 모델이다.

![mvc](https://github.com/yuseons/TIL/blob/master/image/MVC.jpg)

![MVC2](https://github.com/yuseons/TIL/blob/master/image/MVC2.jpg)



## ◻ MVC 개발



### [1] JSP+JavaBeans개발과 MVC 모델 구조



#### 1. Model 1 (JSP+JavaBeans) 의 구조 

![model1](https://github.com/yuseons/TIL/blob/master/image/model1.jpg))

\- 브라우저의 요청을 **JSP가 전부 다 처리**한다.
\- 웹 브라우저의 요청을 받은 JSP는 자바빈이나 서비스 클래스를 사용해서 작업을 처리하고, 결과를 클라이언트에 출력한다.

-  요청과 응답 모두 JSP가 처리한다.

- Model1 구조의 단점 

​	:  JSP 파일에서 모두 처리하므로 역할 구분이 명확하지 않고 디버깅과 유지 보수가 어렵다.



#### 2. Model2 (MVC) 구조

: Model 1의 문제점을 보완

![model2](https://github.com/yuseons/TIL/blob/master/image/model2.jpg)



: 1. 브라우저의 요청을 컨트롤러가 받고 컨트롤러가 그 브라우저의 요청을 분석하여 View로 보여줄 것인지 	     	Model로 보내줄 것인지 결정하여 전송한다.

2. Model로 전송했다면 요청을 분석하여 어떠한 모델을 사용할지 정하고, 호출된 모델은 데이터들을 처리한 후 컨트롤러에게 결과를 보낸다.

3. 컨트롤러는 그 결과를 알맞은 뷰에게 보내고 뷰는 브라우저에게 응답한다.


- 모델 2는 요청은 컨트롤러가 받고 응답은 뷰가 한다.

- 모델 2 방식은 View와 Controller를 분리하므로 디자이너와 개발자의 분업이 가능하며 유지 보수에 유리하다.


> Model 1의 방식으로 웹 서비스를 개발하는 사례는 아예 없다고 봐도 무방하다고 한다.   백엔드와 프론트엔드 역할 분담이 모호하기 때문이다.



#### Controller의 처리순서 


```
Browser  ---> Servlet(Controller) 

        	  1. HTTP 요청받음, doGet(), doPost()메소드 자동호출 

        	  2. 클라이언트가 요구하는 기능을 분석(방명록의 경우 글쓰기 등) 
        	  
        	  3. 요청한 비즈니스 로직 처리하는 Model 사용, Business Logic Class 

        	  4. 결과를 request 또는 session의 setAttribute()메소드를 사용하여 저장 

        	  5. 알맞은 뷰 선택 

        	  6. 뷰로 포워딩(또는 리다이렉트)   
             	  -> JSP로 이동
        	       -> HTTP 응답
        	        -> 브라우저 

```



#### Command Pattern에 기반한 Controller의 처리순서 

- Command Handler : Interface, 추상 클래스의 형태 
    									JSP Beans, EJB를 통해서 Command Handler를 구현한다. 


```
   Browser  -------->  Servlet(Controller) 

             			1. HTTP 요청받음 
             			
                        2. 클라이언트가 요구하는 기능을 분석 
                        
                        3. 로직을 처리할 명령어 핸들러 생성 ----> Command Handler 
                        
                        4. 명령어 핸들러를 이용해 로직 처리 ----> 로직 처리 (Class) 
                           ->  결과 저장 
    						-> 뷰 리턴
    						
                        5. 명령어 핸들러가 리턴 한 뷰로 포워딩(또는 리다이렉트) 
    						->  JSP로 이동
    							-> HTTP 응답 
    								-> 브라우저
```



### [2] MVC App 개발 순서 



#### 1. JSP + JavaBeans 개발 순서  ( Model 1 )

1. DBMS 설정
2. DTO(Data Transfer Object) Class 제작 
3. DAO(Data Access Object) Class 제작 
4. Service Class 제작 
5. Service/DAO test 
6.  JSP 생성 연동 



#### 2. MVC Web Application 개발 순서 ( Model 2 )
1. DBMS 설정 
2. DTO(Data Transfer Object) Class 제작 
3. DAO(Data Access Object) Class 제작 
4. Service Class 제작 
5. Service/DAO test 
6. Servlet Controller 제작 
7. Action Interface 제작 
8. Action 구현 Class 제작 
9. Service Class 연동  
10. JSP 생성 연동 



## ◻ Properties class, String class

### [1] Properties Class

 \- 키와 값의 구조를 가지고 있으며 특정 객체를 생성하는 경우에 초기값으로 많이 사용한다.

 \- Properties 클래스는 Hashtables의 하위 클래스이다.

 \- Hashtables를 상속 받았기 때문에 Map의 속성 즉, Key와 Value를 갖는다.

 \- HashMap과 큰 차이가 없지만, Properties 클래스는 파일 입출력을 지원한다.

 \- key=value 형식으로 작성 된 파일을 key와 value 로 나누어 저장할 때 유용하다.



 \- 상속 구조

java.lang.Object 
  java.util.Dictionary<K,V> 
    java.util.Hashtable<Object,Object> 
      java.util.Properties<String,String> 



#### 1. JAVA 웹 프로젝트에서 Properties 파일 활용

- 웹 어플리케이션이 시작하자마자 가져와야하는 정보들을 프로퍼티 파일에 작성해서 관리할 수 있다.
- 프로퍼티 파일은 한 줄에 key=value 형식으로 작성하고 .properties 확장자를 붙여서 저장한다.
** **작성한 후** 각 줄의 맨뒤에 **빈공간이 없어야한다.** 

```
driver=oracle.jdbc.driver.OracleDriver
url=jdbc:oracle:thin:@127.0.0.1:1521:XE
account=user1234
password=1234
```
- java.util.Properties 클래스를 사용해서 프로퍼티 파일을 다룬다. 
	- Properties는 key=value 형식의 텍스트 파일을 다룰 때 사용하는 클래스다.



 #### 2. Properties 주요 메소드




| 메소드                                              | 설명                                                         |
| :-------------------------------------------------- | ------------------------------------------------------------ |
| String getProperty(String key)                      | 지정된 키(key)와 값(value)를 반환                            |
| String getProperty(String key, String defaultValue) | 지정된 키(key)와 값(value)를 반환 (키를 찾지못하면 defaultValue를 반) |
| void list(PrintStream out)                          | 지정한 PrintStream에 저장된 목록을 출력                      |
| void list(PrintWriter out                           | 지정한 PrintWriter에 저장된 목록을 출력                      |
| void load(InputStream inStream)                     | 지정된 InputStream으로부터 목록을 읽어서 저장                |
| void load(InputStream inStream)                     | 인자로 전달된 입력 스트림으로부터 키와 요소가 한 쌍으로 구성된 속성 목록들을 읽어와서 Properties 객체에 저장 |
| void loadFromXML(InputStream in)                    | 지정된 InputStream으로부터 XML문서를 읽고, XML문서에 저장된 목록을 읽어서 담음 (load&store) |
| Enumeration                                         | 목록의 모든 키(key)가 담긴 Enumeration을 반환                |
| getProperty(String                                  | 지정된 키의 값을 반환                                        |
| Object setProperty(String key, String value)        | - 지정된 키와 값을 저장.     - 이미 존재하는 키면 새로운 값으로 바뀜.                - 기존에 같은 키로 저장된 값이 있는 경우 그 값을 Object타입으로 반환하며 그렇지 않으면 null을 반환 |

```java
Properties properties = new Properties(); // 객체생성

properties.getProperty("website");    // getProperty로 키값 꺼내기

properties.load(new Filereader(filePath)); //파일의 내용을 읽어서 키-값의 형태로 분류해서 맵에 보관
```



### [2] String class

: 문자열 추출



- `startsWith()` : 어떤 문자열이 특정 문자로 시작하는지 확인하여 결과를 **true** 혹은 **false**로 반환한다.
  - 문자열의 끝이 주어진 문자열로 끝나면 **true**, 그렇지 않다면 **false**


```javascript
str.startsWith(searchString[, position])

// searchString : 문자열의 시작 지점에서 탐색할 문자열
//position (생략가능) : searchString을 탐색할 위치. 기본값 0.
```

- `endsWith()` : 어떤 문자열에서 특정 문자열로 끝나는지를 확인할 수 있으며, 그 결과를 **true** 혹은 **false**로 반환한다. 
  - 문자열의 끝이 주어진 문자열로 끝나면 **true**, 그렇지 않다면 **false**


```javascript
str.endsWith(searchString[, length])
    
// searchString : 이 문자열의 끝이 특정 문자열로 끝나는지를 찾기 원하는 문자열입니다.
// length (생략가능) : 찾고자 하는 문자열의 길이값이며, 기본값은 문자열 전체 길이이다. 
	// 문자열의 길이값은 문자열 전체 길이 안에서만 존재하여야 한다.
  
```

- `indexOf()`: 배열에서 지정된 요소를 찾을 수 있는 첫 번째 인덱스를 반환하고 존재하지 않으면 -1을 반환한다.
  - 배열 내의 요소의 최초의 인덱스를 반환한다.  발견되지 않으면 -1.
  - 문자열을 찾을 때 대소문자를 구분한다.

```javascript
string.indexOf(searchvalue, position)
// searchvalue : 필수 입력값, 찾을 문자열
// position (생략 가능) : 기본값은 0, string에서 searchvalue를 찾기 시작할 위치
```



- `lastIndexOf()` : 주어진 값과 일치하는 부분을 `fromIndex`로부터 역순으로 탐색하여, 최초로 마주치는 인덱스를 반환한다. 일치하는 부분을 찾을 수 없으면 `-1`을 반환한다.
  - 문자열 내에서 searchValue가 마지막으로 등장하는 인덱스를 반환한다. 등장하지 않으면 `-1`.

```javascript
str.lastIndexOf(searchValue[, fromIndex])

// searchValue : 탐색할 문자열. 빈 값을 제공할 경우 fromIndex를 반환
/* 
	fromIndex (생략 가능) : 탐색의 시작점으로 사용할 인덱스. 기본값은 +Infinity. 
	fromIndex >= str.length인 경우 모든 문자열을 탐색한다. 
	fromIndex < 0인 경우엔 0을 지정한 것과 동일하다.
*/
```



## ◻ MVC의 구현



### [01] 템플릿 기반의 URI Command Pattern에 기반한 MVC의 구현 

- URI상에 있는 주소를 얻어와 명령어로 처리하는 패턴

 \- STS Setting 
  	Project Type: Dynamic Web Project 
  	Name: mvc 
  	Package Name: action, controller, model

 

 \- 폴더 구조 
    mvc/src/main/webapp/view   : jsp 파일들 

​    mvc/src/main/webapp/template  : template관련 파일들 

​    mvc/src/main/webapp/WEB-INF  : web.xml 환경 설정 파일 위치 

​    mvc/src/main/java    : 서블릿 클래스 위치

​    mvc/src/main/webapp/WEB-INF/config  : properties 파일등, 기타 리소스 파일 

​    mvc/src/main/webapp/WEB-INF/lib   : jar 파일의 라이브러리 위치, 자동 생성 



#### 1. Service Class 

\- DAO : 데이터에 접근할 때 사용되는 기능을 제공

  Service Class  : 사용자의 요청을 처리하기 위한 기능을 제공

\- 서비스 클래스는 주로 DAO를 통해서 데이터에 접근하고 기능을 수행하는데 필요한 로직을 수행한다. 

\- 한 개의 Service Class는 한 개의 기능만 제공하는 게 구현이나 유지 보수하는데 좋다.



\>>> CommandService.java 

```java
package model; 

import java.util.Date; 

public class CommandService{ 

  /** 
   \* 기본 생성자 
   */ 
  public CommandService() { 
    super(); 
  } 

  public StringBuffer getHello(){ 
    StringBuffer sb = new StringBuffer(); 
    sb.append("<li> 안녕하세요..MVC 입니다.<br>"); 
    sb.append("<li> Template Page<br>"); 
    sb.append("<li> URI Command Pattern<br>"); 
    sb.append("<li> Properties 파일을 이용한 처리입니다.<br>"); 
     
    return sb; 

  } 

  public String getDate(){ 
    Date dt = new Date(); 
    String str = dt.toLocaleString(); 
     
    return str; 
  } 

} 

```



#### 2. Command Handler 

 \- 인터페이스 또는 추상 클래스로 구현한다.
 \- 비즈니스 로직 클래스(자식 클래스)들이 동일한 메소드를 실행하도록 강제성을 부여하며 표준 인터페이스 역할을 한다.



\>>> Action.java 

```java
package action; 

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

/** 
 * 표준 인터페이스 
 * @author stu 
 */ 
public interface Action { 
    /** 
     * 로직 처리 메소드 
     * @param request 내부 객체 
     * @param response 내부 객체 
     * @return 처리 결과 문자열 
     * @throws Throwable 
     */ 
    public String execute( 
        HttpServletRequest request, HttpServletResponse response) 
    throws Throwable; 
}  
```



#### 3. Action Class 
\- Action Interface를 상속받아 구현한다.



\>>> HelloAction.java 

```java
package action; 

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

public class HelloAction implements Action { 
   
  public String execute(HttpServletRequest request, 
    HttpServletResponse response) 
  throws Throwable { 
    CommandService commandService= new CommandService(); 
     
    StringBuffer sb = commandService.getHello(); 
     
    request.setAttribute("hello", sb); 

    System.out.println("HelloAction Loading"); 
     
    // Context Path을 제거한 경로 지정 
    return "/view/hello.jsp"; 
   
  } 
} 
```



\>>> DateAction.java 
	\- 현재 날짜를 리턴한다.

```java
package action; 

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

import java.util.Date; 

public class DateAction implements Action { 
   
  public String execute( 
    HttpServletRequest request, 
    HttpServletResponse response) 
  throws Throwable { 
    CommandService commandService= new CommandService(); 
     
    String str = commandService.getDate(); 
     
    // 가져온 날짜 문자열을 request 객체에 저장 
    request.setAttribute("date", str); 
     
    System.out.println("DateAction Loading");     
     
    // Context Path을 제거한 경로 지정 
    return "/view/date.jsp"; 
  } 
} 


```




\>>> NullAction.java 
	\- 아무런 명령어도 일치하지 않으면 생성되는 클래스다.

```java
package action; 

import javax.servlet.ServletException; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

public class NullAction implements Action { 

  public String execute( 
    HttpServletRequest request, 
    HttpServletResponse response) 
  throws ServletException { 

    System.out.println("NullAction Loading"); 
     
    // Context Path을 제거한 경로 지정 
    return "/view/nullCommand.jsp"; 
  } 
} 
```



### [2] MVC의 구현(Controller, config, web.xml) 
