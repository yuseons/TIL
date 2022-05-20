# 🔸jQuery

[TOC]



## ◻jQuery 란?

- jQuery는 웹사이트에 자바스크립트를 쉽게 활용할 수 있도록 도와주는 오픈소스 기반의 자바스크립트 라이브러리이다.
-  CSS의 selector를 사용하고 있어서 습득하기 쉬우며,  브러우저의 다양성을 처리해
    줌으로  호환성 처리에 시간을 소비할 필요가 없다.
- 복잡한 Javascript의 구현시 DOM 문법을 매우 간결하게 해주어 개발 속도를  향상
    할 수 있다.
- jQuery의 기능을 확장할 수 있는 Plugin 구조를 지원한다.
    - Plugin : 기존 기능에 특정 기능을 추가하는 소프트웨어 구성 요소

- Ajax를 지원해 준다.



## ◻ Selector - CSS, CSS2, CSS3

- selector를 이용하여 DOM Element를 검색

### [1] Selector 기본 문법

- 사용법 : $("")
- 용어 : 태그 = Element, 속성 = Attribute

 

### [2] CSS Selector

#### 1. tag selector  

- $("태그명")  : HTML tag를 제어



#### 2. id selector

- $("#id명")   : id 속성을 가진 tag를 제어



#### 3. class selector  

- $(".class명") : class속성을 가진 tag를 제어



#### 4. 자손 selector 

   ​	: (자손: 자식의 자식의 자식들 모두 다 포함)

- $("태그1 태그2") : 태그안의 자식태그 제어



#### 5. 유니버셜 selector 

- $("*")  : 전체태그



#### 6. 그룹 selector

- $("셀렉터1, 셀렉터2")  : 여러 셀렉터

 

### [3] CSS2 Selector

#### 1. 자식 selector 

- $("부모태그명 > 자식태그명") : 특정 태그의 바로 밑에 자식태그

  - 자손 selector vs 자식 selector

    \- 자손 selector : 그 밑의 모든 자식들

    \- 자식 selector : 바로 밑의 자식만

    

#### 2. 다음 인접 selector 

- $("이전+다음")  :  '이전'에 인접한 다음 태그 선택



#### 3.  :first-child Selector

- $("태그:first-child")  : 동일 태그 안의 첫 태그



### [4] CSS3 Selector

#### 1. Next Siblings Selector (“prev ~ siblings”) 

- "prev" 요소 다음에 오는 모든 "siblings" 요소를 중에서 동일한 부모를 가지며 필터링 "siblings" 와 일치하는 요소 선택



#### 2.  $(" :not(selector)") 

- 주어진 selector에 매치되지 않는 모든 요소를 선택



#### 3. $("태그:empty") 

- 내용이 없는 빈 태그를 선택



#### 4.  $("태그:nth-child(index/even/odd/equation)")

- 특정 태그안에서 지정한 번호의 태그



#### 5. last-child selector  : $("태그:last-child")

- 자식 태그들 중에 마지막 자식태그를 선택 



#### 6. $("태그:only-child") 

- 부모의 자식이 하나인 태그를 선택



## ◻Selector - CSS 속성

### [1] Attribute

#### 1. $("[속성명]") 

- 특정 속성을 가진 태그



#### 2. [attribute^='value']

- $("태그명[속성명^='값']") 

  : 특정 속성 중에서 지정한 값으로 시작되는 태그



#### 3. [attribute$='value']

- $("태그명[속성명$='값']") 

​	   : 특정 속성이 지정한 값으로 끝나는 태그



#### 4. [attribute*='value']

- $("태그명[속성명*='값']") 

  : 특정 속성이 지정한 값을 포함하고 있는 태그



#### 5. [attribute~='value']

- $("태그명[속성~= 값]")
    :  지정된 속성에서 공백+주어진 값을 포함한 요소 선택

~~~javascript
$("input[name ~='man']")

//<input name="milk man">이 선택됨
~~~



#### 6. [attribute |= 'value']

- $("태그[속성 |= 값]")
   : 지정된 속성 중에서 주어진 '값'과 같거나 '값-'(하이픈)이 있는 요소 선택

```javascript
"a[hreflang |= 'en']"

//<a href="example.html" hreflang="en">Some text</a>
//<a href="example.html" hreflang="en-UK">Some other text</a> 이 선택됨
```



##  ◻필터

#### 1.  .first()

- 일치하는 요소 집합의 첫 번째 요소를 선택



#### 2. even()

- 일치하는 요소 집합의 0부터 지정된 번호까지의 요소들 중에서 짝수를 선택



#### 3. odd()

- 일치하는 요소 집합의 0부터 지정된 번호까지의 요소들 중에서 홀수를 선택



#### 4. eq()

- 일치하는 요소 집합에서 지정된 인덱스에 해당하는 요소를 선택

##### 	4.1 eq(index)

  - 0부터 세어서 요소의 위치를 나타냄

##### 	4.2 eq(indexFromEnd), 

  - 집합의 마지막 요소부터 거꾸로 계산하여 요소의 위치를 나타냄

​		

#### 5. slice(start [,end])

- start ~ end까지 또는 start ~끝까지 일치하는 요소 선택



#### 6. $(":header") 

- h1 ~ h6까지의 heading태그



#### 7.  $(":contains(text)") 

- 특정 text를 포함하고 있는 태그



#### 8.  $(":has(태그)") 

- 특정 태그를 포함하고 있는 태그 



#### 9.  $(":parent") 
- 하나 이상의 자식 노드(요소 또는 텍스트)가 있는 모든 요소를 선택



## ◻명령어

#### 1. 텍스트 변경, 가져오기  

- text(  ...  )
- text()
- text(function)

#### 2. HTML 변경과 취득

- html(  ...  )
- html()
- html(funtion) 

#### 3. HTML 삽입

- prepend(  ...  ) : 태그 안의 맨앞에 HTML을 삽입함
- append(  ...  )  : 태그 안의 맨뒤에 HTML을 삽입함
  - prepend(...)/append(...) : 태그를 찾아서 그 안에 새롭게 추가한다.

- before(  ...  ) : 태그 앞에 HTML을 삽입함
- after(  ...  )   : 태그 뒤에 HTML을 삽입함

#### 4. HTML 이동

- prependTo()/appendTo() :  기존에 존재하는 태그를 찾아서 이동시킨다.

- prependTo()
  - $("A").prependTo("B");
  : A를 B요소 안의 앞으로 이동

- appendTo() 
  - $( "A" ).appendTo( "B" );
      :  A를 B요소 안의 뒤로 이동



- $( "A" ).first().insertBefore( "B" );  

  ​	: A가 B요소 앞에 이동 

- $( "A" ).last().insertAfter( "B" );  

  ​	: A가 B요소 뒤로 이동

#### 5. wrap

​	:태그로 묶는다

- `.wrap('<div></div>)`  

  : 각각의 요소를`<div></div>` 태그로 감싼다.

- `.wrapAl('<div></div>') `

  : 요소 전체를` <div></div>` 태그로 한번에 다 감싼다.

- `.wrapInner('<b></b>')` 

  : 자식 요소를 각각 `<b></b>` 태그로 감싼다.

#### 6. 태그변경/제거

- .replaceWith( 변경할 내용 )

​	: 선택한 요소를 다른 것으로 바꾼다

```javascript
$( 'A' ).replaceWith( 'B' );
//A요소를 B로 바꾼다.
```

- .remove() : 태그를 제거한다

#### 7. 속성값 변경, 취득

- .attr(속성이름, 값) : 지정한 속성값을 변경한다
- .attr(...)    : 지정한 속성값을 가져온다
- .removeAttr(...) : 지정한 속성값을 제거한다

#### 8. class속성 추가/제거

- addClass(...)   : class 속성을 추가한다

- removeClass(...) : class 속성을 제거한다

#### 9. css 제어

- .css( 속성이름, 값)

​		: 지정한 CSS의 속성값을 설정한다


-    .css( 속성이름)

​		: 지정한 CSS의 속성값을 가져온다

## ◻이벤트

#### 1. 이벤트가 발생한 태그 얻기

- $(function(){  ...  }

  - $(document).ready(function()(......) 의 생략형이다

     : html 문서의 로딩이 다 끝나면 함수를 실행해라

#### 2. toggle()

- 일치하는 요소를 표시하거나 숨긴다.

#### 3. unbind()
- 이전에 연결된 이벤트 핸들러를 요소에서 제거한다

#### 4. on
- 선택한 요소에 하나 이상의 이벤트에 대한 이벤트 핸들러 함수를 연결한다.

## ◻jQuery Effects

### [1] Hide/Show

#### 1. hide() / show()

 	: Html elements를 숨기거나 보여준다

- hide(speed,callback) / show(speed,callback) 

    : parameter에 speed와 callback함수명이 올 수 있다.

   - speed : slow, fast, milliseconds(초단위)
   - callback함수명 : hidden/show를 한 후에 실행할 함수를 호출한다


#### 2. .toggle()

- 선택한 요소가 보이면 보이지 않게하고, 보이지 않으면 보이게 한다.

### [2] Fade

#### 1. fadeIn() / fadeOut()

- fadeIn() : 보여짐
- fadeOut() : 안보여짐

#### 2. fadeToggle( duration  ,  easing ,  complete )

- 보이는 요소는 보이지 않게하고, 보이지 않는 요소는 보이게 한다

  - duration : 애니메이션 실행 시간을 결정하는 문자열 또는 숫자

  - easing : 전환에 사용 할 여유 함수를 나타내는 문자열(swing, linear)

  - complete : 애니메이션이 완료되면 호출할 함수로, 일치하는 요소당 한 번 호출된다.

#### 3. fadeTo( duration,  opacity ,  complete  )

- 일치하는 요소의 불투명도를 조정한다.
  - duration : 애니메이션 실행 시간을 결정하는 문자열 또는 숫자
  - opacity : 대상 불투명도를 나타내는 0과 1 사이의 숫자
  - complete : 애니메이션이 완료되면 호출할 함수

### [3] Slide

​	: 슬라이드 효과를 준다.

#### 1. slideUp()

- 선택한 요소를 위쪽으로 서서히 사라지게 한다.

#### 2. slideDown()
- 선택한 요소를 아래쪽으로 서서히 나타나게 한다.

#### 3. slideToggle()
- 보이지 않는 요소는 아래쪽으로 서서히 나타나게 하고, 보이는 요소는 위쪽으로 서서히 사라지게 한다.
- .slideToggle( duration , easing , complete )

### [4] animation()

- 지정한 애니메이션을 수행하게 한다.
