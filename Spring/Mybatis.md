# 🔸Mybatis



## ◻ Mybatis 프레임워크

\- 아파치(Apache) 소프트웨어 재단의 IBatis 개발자팀이 구글 코드로 이전하고, 구글 코드에서 이름이 MyBatis로 변경되었다.



### [1] Mybatis 프레임 특징

- 한두줄의 자바코드로 DB연동을 처리한다. 

  코드길이가 줄어들었다.

- SQL 명령어를 자바 코드에서 분리하여 XML 파일에 따로 관리한다.

- 이식성이 좋아 어떤 프로그래밍 언어로도 구현 가능하다.

- 오픈소스이며 무료이다.



### [2] Mybatis Component Flow

- Mybatis Framework가 Business Layer(Persistance Layer + Service Layer)와 DB Layer사이 가운데서 양쪽을 연결하고 있다.
- 하단의 mapper.xml 파일을 이용하여 쿼리문을 별도로 작성한다.

![MybatisComponentFlow](https://github.com/yuseons/TIL/blob/master/image/MybatisComponentFlow.jpg)



### [3] Mybatis의 구성요소



![mybatis구성요소](https://github.com/yuseons/TIL/blob/master/image/mybatis%EA%B5%AC%EC%84%B1%EC%9A%94%EC%86%8C.jpg)



#### 1. Configuration 파일(SqlMapConfig.xml)

- Mybatis 메인 환경설정을 정의한다.
- DB 설정 및 mapper 설정 등을 한다.
- DB 설정은 별도의 properties 파일로 분리할 수 있다.
- mapper는 SQL query를 xml문서로 분리한 것이다.

 

#### 2. 매퍼(Mapper)

- 두 가지 종류의 매퍼로 정의할 수 있다.
- 첫째,  SQL을 XML에 정의된 XML파일로 생성한다.
- 두 번째, SQL을 메서드에 어노테이션으로 정의한 인터페이스로 생성한다.



#### 3. 매핑 구문(Mapped Statements)

- SQL을 DB에 실행할 구문을 의미한다.

- 매핑 구문은 어노테이션 정의 방법과 XML정의 방식 두 가지가 있다.



#### 4. Mybatis Java API

- SqlSession은 Mapper xml에 등록된 SQL문을 실행한다.

- SqlSession 객체는 SQL문을 실행하기 위한 여러가지 메서드를 제공한다. 

  selectOne(), selectList(), insert(), update(), delete() 등



## ◻ Mapper XML 파일

- Mybatis 프레임워크에서 가장 중요한 파일이다.

- 실행 할 SQL문을 정의해놓은 파일이다.

- ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <!DOCTYPE mapper
  PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
  <mapper namespace="com.study.model.BbsMapper"> 
                   :
  </mapper>
  ```

  - Mapper 구조는  DTD 선언이 등장하고, 그 밑에 \<mapper> 루트 엘리먼트가 선언된다.

  - \<mapper>엘리먼트는 namespace라는 속성을 가진다.

    - namespace 속성은 이 xml 파일과 매핑될 인터페이스 (ex)mapper.java) 를 의미한다.

    - namespace에는 mapper의 인터페이스 경로를 작성한다. 

      	(패키지를 포함한 Mapper 인터페이스 이름 형식)



### SELECT

```xml
<select id="selectPerson" parameterType="int" resultType="hashmap">

SELECT * FROM PERSON
	WHERE ID = #{id}

</select>
```



#### - id 속성 

- 필수 속성으로 전체 Mapper 파일들 내에서 유일한 아이디를 등록한다.
- `<mapper namespace="">`에서 namespace 값이 다르면 id가 같아도 다른 id로 인식한다.

```xml
<mapper namespace="bbs"> 
    <select id=”selectPerson” >...</select>
</mapper>
 <mapper namespace="member"> 
    <select id=”selectPerson” >...</select>
</mapper>
```

#### - paramaterType 속성

- 외부로부터 데이터를 받아올 때 사용하는 속성이다.
- insert, update 시 사용할 데이터를 받아와서 생성, 수정한다.
- 받아온 데이터의 타입을 명시한다. 

#### - resultType 속성

- 주로 select 구문 처리 후 DBMS로부터 결과를 받아올 때 사용한다.
- 결괏값을 매핑할 자바 객체 타입을 명시한다.
- select 구문에서 생략할 수 없는 속성이다.



### - insert, update, delete

- 데이터 삽입, 수정, 삭제를 위한 구문이다.



### - CDATA Section 사용

- XML 파서(parser)가 XML 처리 시 `<` 작다라는 의미를 태그시작으로 처리하기 때문에 SQL구문에 `<`를 사용하면 에러가 난다. 

- CDATA Section은 파서가 처리하지 않는 영역이므로 에러가 나지 않는다.

  (단순 문자 데이터로 인식한다.)

- `>` 크다는 그냥 사용해도 된다.(에러가 나지 않는다.)

```xml
<select id=”selectBoard” parameterType=”int” resultType=”board”>
    SELECT *
    FROM board
   <![CDATA[
    WHERE num <= #{num}
    ]]>
</select>
```

### - 동적 SQL

- 동적 SQL 요소들은 JSTL 이나 XML 기반의 텍스트 프로세서 사용과 비슷하다.



#### [1] if

```xml
<select id=”findActive”
        parameterType=”Blog” resultType=”Blog”>
        SELECT * FROM BLOG
        WHERE state = ‘ACTIVE’
        <if test=”title != null”>
        AND title like #{title}
        </if>
</select>
```

```xml
<select id=”findActiveBlogLike”
parameterType=”Blog” resultType=”Blog”>
        SELECT * FROM BLOG WHERE state = ‘ACTIVE’
        <if test=”title != null”>
        AND title like #{title}
        </if>
        <if test=”author != null and author.name != null”>
        AND author_name like #{author.name}
        </if>
</select>
```

:   if의 조건에 맞지 않으면 SELECT * FROM BLOG WHERE state = ‘ACTIVE’

​	title != null 이면 SELECT * FROM BLOG WHERE state = ‘ACTIVE’ AND title like #{title}




#### [2] choose, when, otherwise

```xml
<select id=”findActiveBlogLike”
        parameterType=”Blog” resultType=”Blog”>
        SELECT * FROM BLOG WHERE state = ‘ACTIVE’
        <choose>
        <when test=”title != null”>
                AND title like #{title}
        </when>
        <when test=”author != null and author.name != null”>
                AND author_name like #{author.name}
        </when>
        <otherwise>
                AND featured = 1
        </otherwise>
        </choose>
</select>
```

#### [3] where

```xml
<select id=”findActiveBlogLike”
        parameterType=”Blog” resultType=”Blog”>
        SELECT * FROM BLOG
        <where>
        <if test=”state != null”>
                state = #{state}
        </if>
        <if test=”title != null”>
                AND title like #{title}
        </if>
        <if test=”author != null and author.name != null”>
                AND author_name like #{author.name}
        </if>
        </where>
</select>
```

#### [4] set

- set 요소는 동적으로 set 키워드를 붙이고 필요없는 `,`콤마를 제거한다.

```xml
<update id="updateAuthorIfNecessary"
        parameterType="domain.blog.Author">
        update Author
        <set>
        <if test="username != null">username=#{username},</if>
        <if test="password != null">password=#{password},</if>
        <if test="email != null">email=#{email},</if>
        <if test="bio != null">bio=#{bio}</if>
        </set>
        where id=#{id}
</update>
```

#### [5] foreach

-  전달받은 collection 인자 값을 바탕으로 반복적인 SQL 구문을 작성할 때 사용한다.

\- **collection 속성** : 전달받은 인자값이다. Map, Array, List, Set 등과 같은 반복 가능한 객체를 전달할 수 있다.

\- **item** : collection 속성에서 전달받은 인자값을 다른 이름으로 대체할때 사용한다. 

​	대체할 '이름'을 속성 값으로 삽입한다.

\- **open** : 해당 구문이 시작할때 삽입할 문자열을 속성값으로 삽입한다.

\- **close** : 해당구문이 끝날때 삽입할 문자열을 속성 값으로 삽입한다.

\- **index** : 항목의 인덱스 값을 꺼낼 때 사용할 변수 이름을 지정한다.

​	태그 내에 #{index}를 통해 호출할 때 0부터 반환한다.

\- **separator** : 한번 이상 반복되는 구문 사이에 삽입할 문자열을 속성값으로 삽입한다.

```xml
<select id="selectPostIn" resultType="domain.blog.Post">
        SELECT *
        FROM POST 
        WHERE ID in 
        <foreach item="item" index="index" collection="list"
        open="(" separator="," close=")">
                #{item}
        </foreach>
</select>
```

