# ๐ธ MVC(Model, View, Controller) Pattern



## โป MVC Pattern

\- MVC ํจํด์ ๋ชจ๋ธ(Model), ๋ทฐ(View), ์ปจํธ๋กค๋ฌ(Controller)๋ก ์ด๋ฃจ์ด์ง๋ค.

\- ์น ์์ฉํ๋ก๊ทธ๋จ์ ๊ตฌ์ฑํ๋ ์๋ฒ ๋ชจ๋์ ์ฌ์ฉ์์๊ฒ ๋ณด์ฌ์ฃผ๋ ๊ฒ์ ๋ทฐ(View), 

โ	์๋ฃ์ ๋น์ฆ๋์ค ๋ก์ง ์ฒ๋ฆฌ๋ฅผ ๋ชจ๋ธ(Model), 

โ	์ด๋ค ์ํธ ๊ฐ์ ํ๋ฆ์ ์ ์ดํ๋ ์ปจํธ๋กค๋ฌ(Controller)๋ก ๋ถ๋ฆฌํ์ฌ ๊ฐ๋ฐํ๋ค.

\- MVC๋ ์๋ก์ด ๊ฐ๋ฐ ๋ฐฉ๋ฒ์ด ์๋๋ผ ๊ธฐ์กด์ MVC ๊ฐ๋ฐ ๋ชจ๋ธ์ด ์น ์์ฉํ๋ก๊ทธ๋จ ๊ฐ๋ฐ์๋ ์ ํฉํ๋ค๋ ๊ฒ์ด ์์ฆ๋์ด, JSP ๊ฐ๋ฐ์๋ค์๊ฒ ๊ถ๊ณ ํ๋ ๊ฐ๋ฐ ๋ชจ๋ธ์ด๋ค.



### ๋น์ฆ๋์ค ๋ก์ง๊ณผ ํํ์ ๋ถ๋ฆฌ

- ์ฅ์ 
  \- ๋์์ด๋๋ ํํ์ ์ง์ค, ํ๋ก๊ทธ๋๋จธ๋ ๋น์ฆ๋์ค ๋ก์ง์ ์ ๋ํ์ฌ ๊ฐ๋ฐํ๋ฏ๋ก ํจ์จ์ฑ์ด ๋์์ง๋ค.

  \- ์น ์์ฉํ๋ก๊ทธ๋จ์ ์์ ์ด ์ฝ๋ค.

  \- ์น ์์ฉํ๋ก๊ทธ๋จ์ ํ์ฅ์ด ์ฝ๋ค.

  \- ์น ์์ฉํ๋ก๊ทธ๋จ์ ์ ์ง ๋ณด์๊ฐ ์ฝ๋ค.

  \- jsp์ javabeans๋ก ๊ฐ๋ฐํ ๊ฒฝ์ฐ๋ ๋น์ฆ๋์ค ๋ก์ง๊ณผ ํํ์ ์์ ํ ๋ถ๋ฆฌํ๊ธฐ ์ฝ์ง ์์ ๋ฟ ์๋๋ผ ํ๋ก์ ํธ ๊ท๋ชจ๊ฐ ์ปค์ง์๋ก ๋์ฑ ์ด๋ ค์ ์๊ธด๋ค.

  \- ์ด๋ฌํ ๋ฌธ์ ์ ํด๊ฒฐ์ฑ์ผ๋ก ์น ์์ฉํ๋ก๊ทธ๋จ์ ๋น์ฆ๋์ค ๋ก์ง๊ณผ ํํ์ผ๋ก ๋ถ๋ฆฌํ์ฌ ๊ฐ๋ฐํ๊ณ ์ ํ๋ ๊ฒ์ด MVC ๋ชจ๋ธ์ด๋ค.

![mvc](https://github.com/yuseons/TIL/blob/master/image/MVC.jpg)

![MVC2](https://github.com/yuseons/TIL/blob/master/image/MVC2.jpg)



## โป MVC ๊ฐ๋ฐ



### [1] JSP+JavaBeans๊ฐ๋ฐ๊ณผ MVC ๋ชจ๋ธ ๊ตฌ์กฐ



#### 1. Model 1 (JSP+JavaBeans) ์ ๊ตฌ์กฐ 

![model1](https://github.com/yuseons/TIL/blob/master/image/model1.jpg))

\- ๋ธ๋ผ์ฐ์ ์ ์์ฒญ์ **JSP๊ฐ ์ ๋ถ ๋ค ์ฒ๋ฆฌ**ํ๋ค.
\- ์น ๋ธ๋ผ์ฐ์ ์ ์์ฒญ์ ๋ฐ์ JSP๋ ์๋ฐ๋น์ด๋ ์๋น์ค ํด๋์ค๋ฅผ ์ฌ์ฉํด์ ์์์ ์ฒ๋ฆฌํ๊ณ , ๊ฒฐ๊ณผ๋ฅผ ํด๋ผ์ด์ธํธ์ ์ถ๋ ฅํ๋ค.

-  ์์ฒญ๊ณผ ์๋ต ๋ชจ๋ JSP๊ฐ ์ฒ๋ฆฌํ๋ค.

- Model1 ๊ตฌ์กฐ์ ๋จ์  

โ	:  JSP ํ์ผ์์ ๋ชจ๋ ์ฒ๋ฆฌํ๋ฏ๋ก ์ญํ  ๊ตฌ๋ถ์ด ๋ชํํ์ง ์๊ณ  ๋๋ฒ๊น๊ณผ ์ ์ง ๋ณด์๊ฐ ์ด๋ ต๋ค.



#### 2. Model2 (MVC) ๊ตฌ์กฐ

: Model 1์ ๋ฌธ์ ์ ์ ๋ณด์

![model2](https://github.com/yuseons/TIL/blob/master/image/model2.jpg)



: 1. ๋ธ๋ผ์ฐ์ ์ ์์ฒญ์ ์ปจํธ๋กค๋ฌ๊ฐ ๋ฐ๊ณ  ์ปจํธ๋กค๋ฌ๊ฐ ๊ทธ ๋ธ๋ผ์ฐ์ ์ ์์ฒญ์ ๋ถ์ํ์ฌ View๋ก ๋ณด์ฌ์ค ๊ฒ์ธ์ง 	     	Model๋ก ๋ณด๋ด์ค ๊ฒ์ธ์ง ๊ฒฐ์ ํ์ฌ ์ ์กํ๋ค.

2. Model๋ก ์ ์กํ๋ค๋ฉด ์์ฒญ์ ๋ถ์ํ์ฌ ์ด๋ ํ ๋ชจ๋ธ์ ์ฌ์ฉํ ์ง ์ ํ๊ณ , ํธ์ถ๋ ๋ชจ๋ธ์ ๋ฐ์ดํฐ๋ค์ ์ฒ๋ฆฌํ ํ ์ปจํธ๋กค๋ฌ์๊ฒ ๊ฒฐ๊ณผ๋ฅผ ๋ณด๋ธ๋ค.

3. ์ปจํธ๋กค๋ฌ๋ ๊ทธ ๊ฒฐ๊ณผ๋ฅผ ์๋ง์ ๋ทฐ์๊ฒ ๋ณด๋ด๊ณ  ๋ทฐ๋ ๋ธ๋ผ์ฐ์ ์๊ฒ ์๋ตํ๋ค.


- ๋ชจ๋ธ 2๋ ์์ฒญ์ ์ปจํธ๋กค๋ฌ๊ฐ ๋ฐ๊ณ  ์๋ต์ ๋ทฐ๊ฐ ํ๋ค.

- ๋ชจ๋ธ 2 ๋ฐฉ์์ View์ Controller๋ฅผ ๋ถ๋ฆฌํ๋ฏ๋ก ๋์์ด๋์ ๊ฐ๋ฐ์์ ๋ถ์์ด ๊ฐ๋ฅํ๋ฉฐ ์ ์ง ๋ณด์์ ์ ๋ฆฌํ๋ค.


> Model 1์ ๋ฐฉ์์ผ๋ก ์น ์๋น์ค๋ฅผ ๊ฐ๋ฐํ๋ ์ฌ๋ก๋ ์์ ์๋ค๊ณ  ๋ด๋ ๋ฌด๋ฐฉํ๋ค๊ณ  ํ๋ค.   ๋ฐฑ์๋์ ํ๋ก ํธ์๋ ์ญํ  ๋ถ๋ด์ด ๋ชจํธํ๊ธฐ ๋๋ฌธ์ด๋ค.



#### Controller์ ์ฒ๋ฆฌ์์ 


```
Browser  ---> Servlet(Controller) 

        	  1. HTTP ์์ฒญ๋ฐ์, doGet(), doPost()๋ฉ์๋ ์๋ํธ์ถ 

        	  2. ํด๋ผ์ด์ธํธ๊ฐ ์๊ตฌํ๋ ๊ธฐ๋ฅ์ ๋ถ์(๋ฐฉ๋ช๋ก์ ๊ฒฝ์ฐ ๊ธ์ฐ๊ธฐ ๋ฑ) 
        	  
        	  3. ์์ฒญํ ๋น์ฆ๋์ค ๋ก์ง ์ฒ๋ฆฌํ๋ Model ์ฌ์ฉ, Business Logic Class 

        	  4. ๊ฒฐ๊ณผ๋ฅผ request ๋๋ session์ setAttribute()๋ฉ์๋๋ฅผ ์ฌ์ฉํ์ฌ ์ ์ฅ 

        	  5. ์๋ง์ ๋ทฐ ์ ํ 

        	  6. ๋ทฐ๋ก ํฌ์๋ฉ(๋๋ ๋ฆฌ๋ค์ด๋ ํธ)   
             	  -> JSP๋ก ์ด๋
        	       -> HTTP ์๋ต
        	        -> ๋ธ๋ผ์ฐ์  

```



#### Command Pattern์ ๊ธฐ๋ฐํ Controller์ ์ฒ๋ฆฌ์์ 

- Command Handler : Interface, ์ถ์ ํด๋์ค์ ํํ 
    									JSP Beans, EJB๋ฅผ ํตํด์ Command Handler๋ฅผ ๊ตฌํํ๋ค. 


```
   Browser  -------->  Servlet(Controller) 

             			1. HTTP ์์ฒญ๋ฐ์ 
             			
                        2. ํด๋ผ์ด์ธํธ๊ฐ ์๊ตฌํ๋ ๊ธฐ๋ฅ์ ๋ถ์ 
                        
                        3. ๋ก์ง์ ์ฒ๋ฆฌํ  ๋ช๋ น์ด ํธ๋ค๋ฌ ์์ฑ ----> Command Handler 
                        
                        4. ๋ช๋ น์ด ํธ๋ค๋ฌ๋ฅผ ์ด์ฉํด ๋ก์ง ์ฒ๋ฆฌ ----> ๋ก์ง ์ฒ๋ฆฌ (Class) 
                           ->  ๊ฒฐ๊ณผ ์ ์ฅ 
    						-> ๋ทฐ ๋ฆฌํด
    						
                        5. ๋ช๋ น์ด ํธ๋ค๋ฌ๊ฐ ๋ฆฌํด ํ ๋ทฐ๋ก ํฌ์๋ฉ(๋๋ ๋ฆฌ๋ค์ด๋ ํธ) 
    						->  JSP๋ก ์ด๋
    							-> HTTP ์๋ต 
    								-> ๋ธ๋ผ์ฐ์ 
```



### [2] MVC App ๊ฐ๋ฐ ์์ 



#### 1. JSP + JavaBeans ๊ฐ๋ฐ ์์  ( Model 1 )

1. DBMS ์ค์ 
2. DTO(Data Transfer Object) Class ์ ์ 
3. DAO(Data Access Object) Class ์ ์ 
4. Service Class ์ ์ 
5. Service/DAO test 
6.  JSP ์์ฑ ์ฐ๋ 



#### 2. MVC Web Application ๊ฐ๋ฐ ์์ ( Model 2 )
1. DBMS ์ค์  
2. DTO(Data Transfer Object) Class ์ ์ 
3. DAO(Data Access Object) Class ์ ์ 
4. Service Class ์ ์ 
5. Service/DAO test 
6. Servlet Controller ์ ์ 
7. Action Interface ์ ์ 
8. Action ๊ตฌํ Class ์ ์ 
9. Service Class ์ฐ๋  
10. JSP ์์ฑ ์ฐ๋ 



## โป Properties class, String class

### [1] Properties Class

 \- ํค์ ๊ฐ์ ๊ตฌ์กฐ๋ฅผ ๊ฐ์ง๊ณ  ์์ผ๋ฉฐ ํน์  ๊ฐ์ฒด๋ฅผ ์์ฑํ๋ ๊ฒฝ์ฐ์ ์ด๊ธฐ๊ฐ์ผ๋ก ๋ง์ด ์ฌ์ฉํ๋ค.

 \- Properties ํด๋์ค๋ Hashtables์ ํ์ ํด๋์ค์ด๋ค.

 \- Hashtables๋ฅผ ์์ ๋ฐ์๊ธฐ ๋๋ฌธ์ Map์ ์์ฑ ์ฆ, Key์ Value๋ฅผ ๊ฐ๋๋ค.

 \- HashMap๊ณผ ํฐ ์ฐจ์ด๊ฐ ์์ง๋ง, Properties ํด๋์ค๋ ํ์ผ ์์ถ๋ ฅ์ ์ง์ํ๋ค.

 \- key=value ํ์์ผ๋ก ์์ฑ ๋ ํ์ผ์ key์ value ๋ก ๋๋์ด ์ ์ฅํ  ๋ ์ ์ฉํ๋ค.



 \- ์์ ๊ตฌ์กฐ

java.lang.Object 
  java.util.Dictionary<K,V> 
    java.util.Hashtable<Object,Object> 
      java.util.Properties<String,String> 



#### 1. JAVA ์น ํ๋ก์ ํธ์์ Properties ํ์ผ ํ์ฉ

- ์น ์ดํ๋ฆฌ์ผ์ด์์ด ์์ํ์๋ง์ ๊ฐ์ ธ์์ผํ๋ ์ ๋ณด๋ค์ ํ๋กํผํฐ ํ์ผ์ ์์ฑํด์ ๊ด๋ฆฌํ  ์ ์๋ค.
- ํ๋กํผํฐ ํ์ผ์ ํ ์ค์ key=value ํ์์ผ๋ก ์์ฑํ๊ณ  .properties ํ์ฅ์๋ฅผ ๋ถ์ฌ์ ์ ์ฅํ๋ค.
** **์์ฑํ ํ** ๊ฐ ์ค์ ๋งจ๋ค์ **๋น๊ณต๊ฐ์ด ์์ด์ผํ๋ค.** 

```
driver=oracle.jdbc.driver.OracleDriver
url=jdbc:oracle:thin:@127.0.0.1:1521:XE
account=user1234
password=1234
```
- java.util.Properties ํด๋์ค๋ฅผ ์ฌ์ฉํด์ ํ๋กํผํฐ ํ์ผ์ ๋ค๋ฃฌ๋ค. 
	- Properties๋ key=value ํ์์ ํ์คํธ ํ์ผ์ ๋ค๋ฃฐ ๋ ์ฌ์ฉํ๋ ํด๋์ค๋ค.



 #### 2. Properties ์ฃผ์ ๋ฉ์๋




| ๋ฉ์๋                                              | ์ค๋ช                                                         |
| :-------------------------------------------------- | ------------------------------------------------------------ |
| String getProperty(String key)                      | ์ง์ ๋ ํค(key)์ ๊ฐ(value)๋ฅผ ๋ฐํ                            |
| String getProperty(String key, String defaultValue) | ์ง์ ๋ ํค(key)์ ๊ฐ(value)๋ฅผ ๋ฐํ (ํค๋ฅผ ์ฐพ์ง๋ชปํ๋ฉด defaultValue๋ฅผ ๋ฐ) |
| void list(PrintStream out)                          | ์ง์ ํ PrintStream์ ์ ์ฅ๋ ๋ชฉ๋ก์ ์ถ๋ ฅ                      |
| void list(PrintWriter out                           | ์ง์ ํ PrintWriter์ ์ ์ฅ๋ ๋ชฉ๋ก์ ์ถ๋ ฅ                      |
| void load(InputStream inStream)                     | ์ง์ ๋ InputStream์ผ๋ก๋ถํฐ ๋ชฉ๋ก์ ์ฝ์ด์ ์ ์ฅ                |
| void load(InputStream inStream)                     | ์ธ์๋ก ์ ๋ฌ๋ ์๋ ฅ ์คํธ๋ฆผ์ผ๋ก๋ถํฐ ํค์ ์์๊ฐ ํ ์์ผ๋ก ๊ตฌ์ฑ๋ ์์ฑ ๋ชฉ๋ก๋ค์ ์ฝ์ด์์ Properties ๊ฐ์ฒด์ ์ ์ฅ |
| void loadFromXML(InputStream in)                    | ์ง์ ๋ InputStream์ผ๋ก๋ถํฐ XML๋ฌธ์๋ฅผ ์ฝ๊ณ , XML๋ฌธ์์ ์ ์ฅ๋ ๋ชฉ๋ก์ ์ฝ์ด์ ๋ด์ (load&store) |
| Enumeration                                         | ๋ชฉ๋ก์ ๋ชจ๋  ํค(key)๊ฐ ๋ด๊ธด Enumeration์ ๋ฐํ                |
| getProperty(String                                  | ์ง์ ๋ ํค์ ๊ฐ์ ๋ฐํ                                        |
| Object setProperty(String key, String value)        | - ์ง์ ๋ ํค์ ๊ฐ์ ์ ์ฅ.     - ์ด๋ฏธ ์กด์ฌํ๋ ํค๋ฉด ์๋ก์ด ๊ฐ์ผ๋ก ๋ฐ๋.                - ๊ธฐ์กด์ ๊ฐ์ ํค๋ก ์ ์ฅ๋ ๊ฐ์ด ์๋ ๊ฒฝ์ฐ ๊ทธ ๊ฐ์ Objectํ์์ผ๋ก ๋ฐํํ๋ฉฐ ๊ทธ๋ ์ง ์์ผ๋ฉด null์ ๋ฐํ |

```java
Properties properties = new Properties(); // ๊ฐ์ฒด์์ฑ

properties.getProperty("website");    // getProperty๋ก ํค๊ฐ ๊บผ๋ด๊ธฐ

properties.load(new Filereader(filePath)); //ํ์ผ์ ๋ด์ฉ์ ์ฝ์ด์ ํค-๊ฐ์ ํํ๋ก ๋ถ๋ฅํด์ ๋งต์ ๋ณด๊ด
```



### [2] String class

: ๋ฌธ์์ด ์ถ์ถ



- `startsWith()` : ์ด๋ค ๋ฌธ์์ด์ด ํน์  ๋ฌธ์๋ก ์์ํ๋์ง ํ์ธํ์ฌ ๊ฒฐ๊ณผ๋ฅผ **true** ํน์ **false**๋ก ๋ฐํํ๋ค.
  - ๋ฌธ์์ด์ ๋์ด ์ฃผ์ด์ง ๋ฌธ์์ด๋ก ๋๋๋ฉด **true**, ๊ทธ๋ ์ง ์๋ค๋ฉด **false**


```javascript
str.startsWith(searchString[, position])

// searchString : ๋ฌธ์์ด์ ์์ ์ง์ ์์ ํ์ํ  ๋ฌธ์์ด
//position (์๋ต๊ฐ๋ฅ) : searchString์ ํ์ํ  ์์น. ๊ธฐ๋ณธ๊ฐ 0.
```

- `endsWith()` : ์ด๋ค ๋ฌธ์์ด์์ ํน์  ๋ฌธ์์ด๋ก ๋๋๋์ง๋ฅผ ํ์ธํ  ์ ์์ผ๋ฉฐ, ๊ทธ ๊ฒฐ๊ณผ๋ฅผ **true** ํน์ **false**๋ก ๋ฐํํ๋ค. 
  - ๋ฌธ์์ด์ ๋์ด ์ฃผ์ด์ง ๋ฌธ์์ด๋ก ๋๋๋ฉด **true**, ๊ทธ๋ ์ง ์๋ค๋ฉด **false**


```javascript
str.endsWith(searchString[, length])
    
// searchString : ์ด ๋ฌธ์์ด์ ๋์ด ํน์  ๋ฌธ์์ด๋ก ๋๋๋์ง๋ฅผ ์ฐพ๊ธฐ ์ํ๋ ๋ฌธ์์ด์๋๋ค.
// length (์๋ต๊ฐ๋ฅ) : ์ฐพ๊ณ ์ ํ๋ ๋ฌธ์์ด์ ๊ธธ์ด๊ฐ์ด๋ฉฐ, ๊ธฐ๋ณธ๊ฐ์ ๋ฌธ์์ด ์ ์ฒด ๊ธธ์ด์ด๋ค. 
	// ๋ฌธ์์ด์ ๊ธธ์ด๊ฐ์ ๋ฌธ์์ด ์ ์ฒด ๊ธธ์ด ์์์๋ง ์กด์ฌํ์ฌ์ผ ํ๋ค.
  
```

- `indexOf()`: ๋ฐฐ์ด์์ ์ง์ ๋ ์์๋ฅผ ์ฐพ์ ์ ์๋ ์ฒซ ๋ฒ์งธ ์ธ๋ฑ์ค๋ฅผ ๋ฐํํ๊ณ  ์กด์ฌํ์ง ์์ผ๋ฉด -1์ ๋ฐํํ๋ค.
  - ๋ฐฐ์ด ๋ด์ ์์์ ์ต์ด์ ์ธ๋ฑ์ค๋ฅผ ๋ฐํํ๋ค.  ๋ฐ๊ฒฌ๋์ง ์์ผ๋ฉด -1.
  - ๋ฌธ์์ด์ ์ฐพ์ ๋ ๋์๋ฌธ์๋ฅผ ๊ตฌ๋ถํ๋ค.

```javascript
string.indexOf(searchvalue, position)
// searchvalue : ํ์ ์๋ ฅ๊ฐ, ์ฐพ์ ๋ฌธ์์ด
// position (์๋ต ๊ฐ๋ฅ) : ๊ธฐ๋ณธ๊ฐ์ 0, string์์ searchvalue๋ฅผ ์ฐพ๊ธฐ ์์ํ  ์์น
```



- `lastIndexOf()` : ์ฃผ์ด์ง ๊ฐ๊ณผ ์ผ์นํ๋ ๋ถ๋ถ์ `fromIndex`๋ก๋ถํฐ ์ญ์์ผ๋ก ํ์ํ์ฌ, ์ต์ด๋ก ๋ง์ฃผ์น๋ ์ธ๋ฑ์ค๋ฅผ ๋ฐํํ๋ค. ์ผ์นํ๋ ๋ถ๋ถ์ ์ฐพ์ ์ ์์ผ๋ฉด `-1`์ ๋ฐํํ๋ค.
  - ๋ฌธ์์ด ๋ด์์ searchValue๊ฐ ๋ง์ง๋ง์ผ๋ก ๋ฑ์ฅํ๋ ์ธ๋ฑ์ค๋ฅผ ๋ฐํํ๋ค. ๋ฑ์ฅํ์ง ์์ผ๋ฉด `-1`.

```javascript
str.lastIndexOf(searchValue[, fromIndex])

// searchValue : ํ์ํ  ๋ฌธ์์ด. ๋น ๊ฐ์ ์ ๊ณตํ  ๊ฒฝ์ฐ fromIndex๋ฅผ ๋ฐํ
/* 
	fromIndex (์๋ต ๊ฐ๋ฅ) : ํ์์ ์์์ ์ผ๋ก ์ฌ์ฉํ  ์ธ๋ฑ์ค. ๊ธฐ๋ณธ๊ฐ์ +Infinity. 
	fromIndex >= str.length์ธ ๊ฒฝ์ฐ ๋ชจ๋  ๋ฌธ์์ด์ ํ์ํ๋ค. 
	fromIndex < 0์ธ ๊ฒฝ์ฐ์ 0์ ์ง์ ํ ๊ฒ๊ณผ ๋์ผํ๋ค.
*/
```



## โป MVC์ ๊ตฌํ



### [01] ํํ๋ฆฟ ๊ธฐ๋ฐ์ URI Command Pattern์ ๊ธฐ๋ฐํ MVC์ ๊ตฌํ 

- URI์์ ์๋ ์ฃผ์๋ฅผ ์ป์ด์ ๋ช๋ น์ด๋ก ์ฒ๋ฆฌํ๋ ํจํด

 \- STS Setting 
  	Project Type: Dynamic Web Project 
  	Name: mvc 
  	Package Name: action, controller, model

 

 \- ํด๋ ๊ตฌ์กฐ 
    mvc/src/main/webapp/view   : jsp ํ์ผ๋ค 

โ    mvc/src/main/webapp/template  : template๊ด๋ จ ํ์ผ๋ค 

โ    mvc/src/main/webapp/WEB-INF  : web.xml ํ๊ฒฝ ์ค์  ํ์ผ ์์น 

โ    mvc/src/main/java    : ์๋ธ๋ฆฟ ํด๋์ค ์์น

โ    mvc/src/main/webapp/WEB-INF/config  : properties ํ์ผ๋ฑ, ๊ธฐํ ๋ฆฌ์์ค ํ์ผ 

โ    mvc/src/main/webapp/WEB-INF/lib   : jar ํ์ผ์ ๋ผ์ด๋ธ๋ฌ๋ฆฌ ์์น, ์๋ ์์ฑ 



#### 1. Service Class 

\- DAO : ๋ฐ์ดํฐ์ ์ ๊ทผํ  ๋ ์ฌ์ฉ๋๋ ๊ธฐ๋ฅ์ ์ ๊ณต

  Service Class  : ์ฌ์ฉ์์ ์์ฒญ์ ์ฒ๋ฆฌํ๊ธฐ ์ํ ๊ธฐ๋ฅ์ ์ ๊ณต

\- ์๋น์ค ํด๋์ค๋ ์ฃผ๋ก DAO๋ฅผ ํตํด์ ๋ฐ์ดํฐ์ ์ ๊ทผํ๊ณ  ๊ธฐ๋ฅ์ ์ํํ๋๋ฐ ํ์ํ ๋ก์ง์ ์ํํ๋ค. 

\- ํ ๊ฐ์ Service Class๋ ํ ๊ฐ์ ๊ธฐ๋ฅ๋ง ์ ๊ณตํ๋ ๊ฒ ๊ตฌํ์ด๋ ์ ์ง ๋ณด์ํ๋๋ฐ ์ข๋ค.



\>>> CommandService.java 

```java
package model; 

import java.util.Date; 

public class CommandService{ 

  /** 
   \* ๊ธฐ๋ณธ ์์ฑ์ 
   */ 
  public CommandService() { 
    super(); 
  } 

  public StringBuffer getHello(){ 
    StringBuffer sb = new StringBuffer(); 
    sb.append("<li> ์๋ํ์ธ์..MVC ์๋๋ค.<br>"); 
    sb.append("<li> Template Page<br>"); 
    sb.append("<li> URI Command Pattern<br>"); 
    sb.append("<li> Properties ํ์ผ์ ์ด์ฉํ ์ฒ๋ฆฌ์๋๋ค.<br>"); 
     
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

 \- ์ธํฐํ์ด์ค ๋๋ ์ถ์ ํด๋์ค๋ก ๊ตฌํํ๋ค.
 \- ๋น์ฆ๋์ค ๋ก์ง ํด๋์ค(์์ ํด๋์ค)๋ค์ด ๋์ผํ ๋ฉ์๋๋ฅผ ์คํํ๋๋ก ๊ฐ์ ์ฑ์ ๋ถ์ฌํ๋ฉฐ ํ์ค ์ธํฐํ์ด์ค ์ญํ ์ ํ๋ค.



\>>> Action.java 

```java
package action; 

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

/** 
 * ํ์ค ์ธํฐํ์ด์ค 
 * @author stu 
 */ 
public interface Action { 
    /** 
     * ๋ก์ง ์ฒ๋ฆฌ ๋ฉ์๋ 
     * @param request ๋ด๋ถ ๊ฐ์ฒด 
     * @param response ๋ด๋ถ ๊ฐ์ฒด 
     * @return ์ฒ๋ฆฌ ๊ฒฐ๊ณผ ๋ฌธ์์ด 
     * @throws Throwable 
     */ 
    public String execute( 
        HttpServletRequest request, HttpServletResponse response) 
    throws Throwable; 
}  
```



#### 3. Action Class 
\- Action Interface๋ฅผ ์์๋ฐ์ ๊ตฌํํ๋ค.



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
     
    // Context Path์ ์ ๊ฑฐํ ๊ฒฝ๋ก ์ง์  
    return "/view/hello.jsp"; 
   
  } 
} 
```



\>>> DateAction.java 
	\- ํ์ฌ ๋ ์ง๋ฅผ ๋ฆฌํดํ๋ค.

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
     
    // ๊ฐ์ ธ์จ ๋ ์ง ๋ฌธ์์ด์ request ๊ฐ์ฒด์ ์ ์ฅ 
    request.setAttribute("date", str); 
     
    System.out.println("DateAction Loading");     
     
    // Context Path์ ์ ๊ฑฐํ ๊ฒฝ๋ก ์ง์  
    return "/view/date.jsp"; 
  } 
} 


```




\>>> NullAction.java 
	\- ์๋ฌด๋ฐ ๋ช๋ น์ด๋ ์ผ์นํ์ง ์์ผ๋ฉด ์์ฑ๋๋ ํด๋์ค๋ค.

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
     
    // Context Path์ ์ ๊ฑฐํ ๊ฒฝ๋ก ์ง์  
    return "/view/nullCommand.jsp"; 
  } 
} 
```



### [2] MVC์ ๊ตฌํ(Controller, config, web.xml) 



#### - config.properties 

/WEB-INF/config/config.properties 

- \# : ์ฃผ์
- *.do : ์ผ๋ฐ์ ์ผ๋ก ๋ช๋ น์ด์ ํ์ฅ์๋ก do๋ฅผ ์ฌ์ฉํ๋ค. 

```properties
# command = Action class Mapping List 
/mvc/hello.do=action.HelloAction
/mvc/date.do=action.DateAction
```



#### - web.xml 

/WEB-INF/web.xml

- xml ์ ์ธ๋ฌธ ์์ ๊ณต๋ฐฑ์ด๋ ๋น ๋ฌธ์๊ฐ ์์ผ๋ฉด ์๋๋ค. 

- `<load-on-startup>` : Application ๋ก๋ฉ์ ์๋์ผ๋ก ์คํํ๋ผ๋ ํ๊ทธ 

- `<url-pattern></url-pattern> `

  ๊ตฌํํ ์๋ธ๋ฆฟ์ ํน์  URL์ ๋งคํ์ ํด์ค์ผํ๋ค.

  ๊ทธ๋์ผ ํด๋ผ์ด์ธํธ์์ ํด๋น URL๋ก ์์ฒญ์ ํด๋น ์๋ธ๋ฆฟ์ด ์์ฒญ์ ์ฒ๋ฆฌํ  ์ ์๋ค.
  
  - **url-pattern์ ๋ฑ๋กํ  ์ ์๋ URL**
  - ํด๋ ๋งคํ  : /mvc 
       ํด๋ ๋งคํ  : /mvc/* 
        ํ์ฅ์ ๋งคํ : *.do 
