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



## ◻ Properties class, String class, Class class

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

