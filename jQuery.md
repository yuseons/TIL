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