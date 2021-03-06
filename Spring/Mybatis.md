# ๐ธMybatis



## โป Mybatis ํ๋ ์์ํฌ

\- ์ํ์น(Apache) ์ํํธ์จ์ด ์ฌ๋จ์ IBatis ๊ฐ๋ฐ์ํ์ด ๊ตฌ๊ธ ์ฝ๋๋ก ์ด์ ํ๊ณ , ๊ตฌ๊ธ ์ฝ๋์์ ์ด๋ฆ์ด MyBatis๋ก ๋ณ๊ฒฝ๋์๋ค.



### [1] Mybatis ํ๋ ์ ํน์ง

- ํ๋์ค์ ์๋ฐ์ฝ๋๋ก DB์ฐ๋์ ์ฒ๋ฆฌํ๋ค. 

  ์ฝ๋๊ธธ์ด๊ฐ ์ค์ด๋ค์๋ค.

- SQL ๋ช๋ น์ด๋ฅผ ์๋ฐ ์ฝ๋์์ ๋ถ๋ฆฌํ์ฌ XML ํ์ผ์ ๋ฐ๋ก ๊ด๋ฆฌํ๋ค.

- ์ด์์ฑ์ด ์ข์ ์ด๋ค ํ๋ก๊ทธ๋๋ฐ ์ธ์ด๋ก๋ ๊ตฌํ ๊ฐ๋ฅํ๋ค.

- ์คํ์์ค์ด๋ฉฐ ๋ฌด๋ฃ์ด๋ค.



### [2] Mybatis Component Flow

- Mybatis Framework๊ฐ Business Layer(Persistance Layer + Service Layer)์ DB Layer์ฌ์ด ๊ฐ์ด๋ฐ์ ์์ชฝ์ ์ฐ๊ฒฐํ๊ณ  ์๋ค.
- ํ๋จ์ mapper.xml ํ์ผ์ ์ด์ฉํ์ฌ ์ฟผ๋ฆฌ๋ฌธ์ ๋ณ๋๋ก ์์ฑํ๋ค.

![MybatisComponentFlow](https://github.com/yuseons/TIL/blob/master/image/MybatisComponentFlow.jpg)



### [3] Mybatis์ ๊ตฌ์ฑ์์



![mybatis๊ตฌ์ฑ์์](https://github.com/yuseons/TIL/blob/master/image/mybatis%EA%B5%AC%EC%84%B1%EC%9A%94%EC%86%8C.jpg)



#### 1. Configuration ํ์ผ(SqlMapConfig.xml)

- Mybatis ๋ฉ์ธ ํ๊ฒฝ์ค์ ์ ์ ์ํ๋ค.
- DB ์ค์  ๋ฐ mapper ์ค์  ๋ฑ์ ํ๋ค.
- DB ์ค์ ์ ๋ณ๋์ properties ํ์ผ๋ก ๋ถ๋ฆฌํ  ์ ์๋ค.
- mapper๋ SQL query๋ฅผ xml๋ฌธ์๋ก ๋ถ๋ฆฌํ ๊ฒ์ด๋ค.

 

#### 2. ๋งคํผ(Mapper)

- ๋ ๊ฐ์ง ์ข๋ฅ์ ๋งคํผ๋ก ์ ์ํ  ์ ์๋ค.
- ์ฒซ์งธ,  SQL์ XML์ ์ ์๋ XMLํ์ผ๋ก ์์ฑํ๋ค.
- ๋ ๋ฒ์งธ, SQL์ ๋ฉ์๋์ ์ด๋ธํ์ด์์ผ๋ก ์ ์ํ ์ธํฐํ์ด์ค๋ก ์์ฑํ๋ค.



#### 3. ๋งคํ ๊ตฌ๋ฌธ(Mapped Statements)

- SQL์ DB์ ์คํํ  ๊ตฌ๋ฌธ์ ์๋ฏธํ๋ค.

- ๋งคํ ๊ตฌ๋ฌธ์ ์ด๋ธํ์ด์ ์ ์ ๋ฐฉ๋ฒ๊ณผ XML์ ์ ๋ฐฉ์ ๋ ๊ฐ์ง๊ฐ ์๋ค.



#### 4. Mybatis Java API

- SqlSession์ Mapper xml์ ๋ฑ๋ก๋ SQL๋ฌธ์ ์คํํ๋ค.

- SqlSession ๊ฐ์ฒด๋ SQL๋ฌธ์ ์คํํ๊ธฐ ์ํ ์ฌ๋ฌ๊ฐ์ง ๋ฉ์๋๋ฅผ ์ ๊ณตํ๋ค. 

  selectOne(), selectList(), insert(), update(), delete() ๋ฑ



## โป Mapper XML ํ์ผ

- Mybatis ํ๋ ์์ํฌ์์ ๊ฐ์ฅ ์ค์ํ ํ์ผ์ด๋ค.

- ์คํ ํ  SQL๋ฌธ์ ์ ์ํด๋์ ํ์ผ์ด๋ค.

- ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <!DOCTYPE mapper
  PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
  <mapper namespace="com.study.model.BbsMapper"> 
                   :
  </mapper>
  ```

  - Mapper ๊ตฌ์กฐ๋  DTD ์ ์ธ์ด ๋ฑ์ฅํ๊ณ , ๊ทธ ๋ฐ์ \<mapper> ๋ฃจํธ ์๋ฆฌ๋จผํธ๊ฐ ์ ์ธ๋๋ค.

  - \<mapper>์๋ฆฌ๋จผํธ๋ namespace๋ผ๋ ์์ฑ์ ๊ฐ์ง๋ค.

    - namespace ์์ฑ์ ์ด xml ํ์ผ๊ณผ ๋งคํ๋  ์ธํฐํ์ด์ค (ex)mapper.java) ๋ฅผ ์๋ฏธํ๋ค.

    - namespace์๋ mapper์ ์ธํฐํ์ด์ค ๊ฒฝ๋ก๋ฅผ ์์ฑํ๋ค. 

      	(ํจํค์ง๋ฅผ ํฌํจํ Mapper ์ธํฐํ์ด์ค ์ด๋ฆ ํ์)



### SELECT

```xml
<select id="selectPerson" parameterType="int" resultType="hashmap">

SELECT * FROM PERSON
	WHERE ID = #{id}

</select>
```



#### - id ์์ฑ 

- ํ์ ์์ฑ์ผ๋ก ์ ์ฒด Mapper ํ์ผ๋ค ๋ด์์ ์ ์ผํ ์์ด๋๋ฅผ ๋ฑ๋กํ๋ค.
- `<mapper namespace="">`์์ namespace ๊ฐ์ด ๋ค๋ฅด๋ฉด id๊ฐ ๊ฐ์๋ ๋ค๋ฅธ id๋ก ์ธ์ํ๋ค.

```xml
<mapper namespace="bbs"> 
    <select id=โselectPersonโ >...</select>
</mapper>
 <mapper namespace="member"> 
    <select id=โselectPersonโ >...</select>
</mapper>
```

#### - paramaterType ์์ฑ

- ์ธ๋ถ๋ก๋ถํฐ ๋ฐ์ดํฐ๋ฅผ ๋ฐ์์ฌ ๋ ์ฌ์ฉํ๋ ์์ฑ์ด๋ค.
- insert, update ์ ์ฌ์ฉํ  ๋ฐ์ดํฐ๋ฅผ ๋ฐ์์์ ์์ฑ, ์์ ํ๋ค.
- ๋ฐ์์จ ๋ฐ์ดํฐ์ ํ์์ ๋ช์ํ๋ค. 

#### - resultType ์์ฑ

- ์ฃผ๋ก select ๊ตฌ๋ฌธ ์ฒ๋ฆฌ ํ DBMS๋ก๋ถํฐ ๊ฒฐ๊ณผ๋ฅผ ๋ฐ์์ฌ ๋ ์ฌ์ฉํ๋ค.
- ๊ฒฐ๊ด๊ฐ์ ๋งคํํ  ์๋ฐ ๊ฐ์ฒด ํ์์ ๋ช์ํ๋ค.
- select ๊ตฌ๋ฌธ์์ ์๋ตํ  ์ ์๋ ์์ฑ์ด๋ค.



### - insert, update, delete

- ๋ฐ์ดํฐ ์ฝ์, ์์ , ์ญ์ ๋ฅผ ์ํ ๊ตฌ๋ฌธ์ด๋ค.



### - CDATA Section ์ฌ์ฉ

- XML ํ์(parser)๊ฐ XML ์ฒ๋ฆฌ ์ `<` ์๋ค๋ผ๋ ์๋ฏธ๋ฅผ ํ๊ทธ์์์ผ๋ก ์ฒ๋ฆฌํ๊ธฐ ๋๋ฌธ์ SQL๊ตฌ๋ฌธ์ `<`๋ฅผ ์ฌ์ฉํ๋ฉด ์๋ฌ๊ฐ ๋๋ค. 

- CDATA Section์ ํ์๊ฐ ์ฒ๋ฆฌํ์ง ์๋ ์์ญ์ด๋ฏ๋ก ์๋ฌ๊ฐ ๋์ง ์๋๋ค.

  (๋จ์ ๋ฌธ์ ๋ฐ์ดํฐ๋ก ์ธ์ํ๋ค.)

- `>` ํฌ๋ค๋ ๊ทธ๋ฅ ์ฌ์ฉํด๋ ๋๋ค.(์๋ฌ๊ฐ ๋์ง ์๋๋ค.)

```xml
<select id=โselectBoardโ parameterType=โintโ resultType=โboardโ>
    SELECT *
    FROM board
   <![CDATA[
    WHERE num <= #{num}
    ]]>
</select>
```

### - ๋์  SQL

- ๋์  SQL ์์๋ค์ JSTL ์ด๋ XML ๊ธฐ๋ฐ์ ํ์คํธ ํ๋ก์ธ์ ์ฌ์ฉ๊ณผ ๋น์ทํ๋ค.



#### [1] if

```xml
<select id=โfindActiveโ
        parameterType=โBlogโ resultType=โBlogโ>
        SELECT * FROM BLOG
        WHERE state = โACTIVEโ
        <if test=โtitle != nullโ>
        AND title like #{title}
        </if>
</select>
```

```xml
<select id=โfindActiveBlogLikeโ
parameterType=โBlogโ resultType=โBlogโ>
        SELECT * FROM BLOG WHERE state = โACTIVEโ
        <if test=โtitle != nullโ>
        AND title like #{title}
        </if>
        <if test=โauthor != null and author.name != nullโ>
        AND author_name like #{author.name}
        </if>
</select>
```

:   if์ ์กฐ๊ฑด์ ๋ง์ง ์์ผ๋ฉด SELECT * FROM BLOG WHERE state = โACTIVEโ

โ	title != null ์ด๋ฉด SELECT * FROM BLOG WHERE state = โACTIVEโ AND title like #{title}




#### [2] choose, when, otherwise

```xml
<select id=โfindActiveBlogLikeโ
        parameterType=โBlogโ resultType=โBlogโ>
        SELECT * FROM BLOG WHERE state = โACTIVEโ
        <choose>
        <when test=โtitle != nullโ>
                AND title like #{title}
        </when>
        <when test=โauthor != null and author.name != nullโ>
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
<select id=โfindActiveBlogLikeโ
        parameterType=โBlogโ resultType=โBlogโ>
        SELECT * FROM BLOG
        <where>
        <if test=โstate != nullโ>
                state = #{state}
        </if>
        <if test=โtitle != nullโ>
                AND title like #{title}
        </if>
        <if test=โauthor != null and author.name != nullโ>
                AND author_name like #{author.name}
        </if>
        </where>
</select>
```

#### [4] set

- set ์์๋ ๋์ ์ผ๋ก set ํค์๋๋ฅผ ๋ถ์ด๊ณ  ํ์์๋ `,`์ฝค๋ง๋ฅผ ์ ๊ฑฐํ๋ค.

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

-  ์ ๋ฌ๋ฐ์ collection ์ธ์ ๊ฐ์ ๋ฐํ์ผ๋ก ๋ฐ๋ณต์ ์ธ SQL ๊ตฌ๋ฌธ์ ์์ฑํ  ๋ ์ฌ์ฉํ๋ค.

\- **collection ์์ฑ** : ์ ๋ฌ๋ฐ์ ์ธ์๊ฐ์ด๋ค. Map, Array, List, Set ๋ฑ๊ณผ ๊ฐ์ ๋ฐ๋ณต ๊ฐ๋ฅํ ๊ฐ์ฒด๋ฅผ ์ ๋ฌํ  ์ ์๋ค.

\- **item** : collection ์์ฑ์์ ์ ๋ฌ๋ฐ์ ์ธ์๊ฐ์ ๋ค๋ฅธ ์ด๋ฆ์ผ๋ก ๋์ฒดํ ๋ ์ฌ์ฉํ๋ค. 

โ	๋์ฒดํ  '์ด๋ฆ'์ ์์ฑ ๊ฐ์ผ๋ก ์ฝ์ํ๋ค.

\- **open** : ํด๋น ๊ตฌ๋ฌธ์ด ์์ํ ๋ ์ฝ์ํ  ๋ฌธ์์ด์ ์์ฑ๊ฐ์ผ๋ก ์ฝ์ํ๋ค.

\- **close** : ํด๋น๊ตฌ๋ฌธ์ด ๋๋ ๋ ์ฝ์ํ  ๋ฌธ์์ด์ ์์ฑ ๊ฐ์ผ๋ก ์ฝ์ํ๋ค.

\- **index** : ํญ๋ชฉ์ ์ธ๋ฑ์ค ๊ฐ์ ๊บผ๋ผ ๋ ์ฌ์ฉํ  ๋ณ์ ์ด๋ฆ์ ์ง์ ํ๋ค.

โ	ํ๊ทธ ๋ด์ #{index}๋ฅผ ํตํด ํธ์ถํ  ๋ 0๋ถํฐ ๋ฐํํ๋ค.

\- **separator** : ํ๋ฒ ์ด์ ๋ฐ๋ณต๋๋ ๊ตฌ๋ฌธ ์ฌ์ด์ ์ฝ์ํ  ๋ฌธ์์ด์ ์์ฑ๊ฐ์ผ๋ก ์ฝ์ํ๋ค.

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

