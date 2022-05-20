# 🔸JavaScript



[TOC]



## ◻JavaScript 란?

- 동적인 처리를 목적으로 고안된 객체 기반의 스크립트 프로그래밍 언어이다.

- HTML과 Server Script(백앤드) 사이에서 접속자의 마우스 클릭, 키보드 입력등 이벤트 처리를 주로 담당한다.

- HTML + CSS       <--->       JavaScript      <--->     백앤드
  출력                               동작/이벤트      데이터베이스 접속 처리
                                                                       (Oracle, MySQL...) 
  
   

## ◻특징

### -동적 타입 언어다.

- C++와 Java는 실행되기 전에 변수 타입이 결정되는 정적 타입 언어인 반면에 자바스크립트는 변수 타입이 없다. 그러므로 프로그램을 실행하는 도중에 변수에 저장되는 데이터 타입이 동적으로 바뀔 수 있는데, 이를 동적 타입 언어라고 한다.

###  -알파벳 대문자와 소문자를 구분한다.

- console.log ≠ Console.log

 

## ◻변수 선언

###  		- var

: 변수 재선언 가능

```jsx
var 변수이름;

EX) var x;
```

- 변수를 선언하기만 하면 변수 안에는 undefined (정의 되지 않음) 라는 값이 들어간다.

###  - let

 : 변수 재선언 불가능, 변수 재할당 가능

###  - const

 : 변수재선언 ,재할당 불가능



- 재할당이 필요없는 경우, const를 사용해 불필요한 변수의 재사용을 방지

- 재할당이 필요한 경우, let을 사용하는 것이 좋음  

  


## ◻변수 선언의 끌어올림(hoisting)

- 프로그램은 작성한 순서에 따라 윗줄부터 차례대로 실행된다.

  하지만 변수 선언을 프로그램 중간에서 변수를 선언하더라도 첫머리에 선언된 것처럼 다른 문장 앞에 생성된다.

  ```jsx
  console.log(x); /*undefined*/       →              var x;
  var x;                    /*변수 선언의 끌어올림*/    console.log(x);
  ```

- 선언과 동시에 대입하는 코드는 끌어올리지 않는다.

```jsx
console.log(x); // undefined -> 변수 선언은 끌어올리지만 x=2는 끌어올리지 않음
var x = 2;
console.log(x); // 5
```

 

## ◻문자열

- 문자열은 작은따옴표나 큰따옴표를 문자열의 앞뒤에 붙여서 표현한다.

- 자바스크립트를 HTML 요소에 끼워 넣을 때는 자바스크립트 프로그램을 문자열로 작성한다.

  - HTML 코드에는 큰따옴표를 사용하고 자바스크립트 코드에는 작은따옴표를 사용하여 구분하면 좋다.

  ```jsx
  <input type="button" value="Click" onclick="alert('Thanks!')">
  ```

 

## ◻템플릿 리터럴

: 백틱( ` )으로 묶은 문자열이다.

- 백틱으로 엮으면 입력한 그대로 문자열이 표현되므로 이스케이프 시퀀스(\n)을 사용하지 않고 일반적인 줄 바꿈을 사용할 수 있다.

```jsx
var t = `Hello
World`;
```

###  			- 보간표현식

- 템플릿 리터럴 안에는 플레이스 홀더를 넣을 수 있다.
- 플레이스 홀더 : ${ } 로 표기

```jsx
var a = 2,
  b = 3;
console.log(`${a} + ${b} = ${a + b}`); // 2 + 3 = 5
```



## ◻값의 전달, 참조 전달

### [1] 값의 전달

​	: 함수에 원시값을 인수로 넘겼을 경우 

```javascript
function add(x) {return x = x+1;}
var a = 3;
var b = add(a);
console.log("a= " + a + "b= " +b);   // a = 3, b = 4
```

​	: 변수 x와 변수 a 는 다른 영역의 메모리에 위치한 별개의 변수이다.

 	 x의 값을 바꾸더라도 a의 값은 바뀌지 않는다.

### [2] 참조 전달

​	: 함수에 객체를 인수로 넘겼을 경우

```javascript
function add(p) {p.x = p.x + 1; p.y = p.y + 1; return p;}
var a = {x:3, y:4};
var b = add(a);  //참조값을 전달함
console.log(a,b); //Object{x=4, y=5} Object{x=4, y=5}

```

​	: 변수 a에 객체 {x:3, y:4}의 참조가 저장되어 있으며, 이 참조 값을 인자 p에 대입한다.

- 함수에 객체를 인수로 넘겼을 때 전달되는 값은 참조값이다.

  변수 a 와 인자 p는 똑같은 객체를 참조하므로 함수 안에서 p.x와 p.y를 수정하면 a.x와 a.y도 수정된다.

- 함수에 객체를 인수로 넘기면 함수 안에서 원래의 객체를 바꿀 수 있다.



## ◻배열

###  [1] 배열 리터럴로 생성

: 쉼표로 구분한 값을 대괄호로 묶어서 표현

- 변수의 요소에는 모든 타입의 값이 올 수 있다.

```javascript
var evens = [2, 4, 6, 8, "pi", true, {x:1, y:2}, [2, 3, 4] ];
```

- 왼쪽부터 순서대로 요소번호(인덱스)가 0, 1, 2 ... 순으로 매겨진다.

- 어떠한 요소도 작성하지 않으면 빈 배열이  생성된다.

  ```javascript
  var empty = [];
  ```

- 요소의 값을 생략하면 그 요소는 생성되지 않는다.

  ```javascript
  var a = [2, , 4];
  console.log(a);     //[2, undefined, 4]
  ```

  ​	: 인덱스가 1인 요소(두번째 요소)에 undefined가 표시되어 있지만 실제로는 없는 것 이다.

###  [2] length 프로퍼티

- length 프로퍼티에 현재의 배열 요소 개수보다 작고 0보다 큰 정수 값을 대입하면 배열 길이가 줄어든다. 

  그 배열 길이를 넘는 인덱스 번호에 할당된 배열 요소는 삭제된다.

- length 프로퍼티에 그 배열 길이보다 큰 정수 값을 대입하면 배열에 새로운 요소가 추가되는게 아니라 length 프로퍼티 값만 바뀐다.

```javascript
var a = [2, 4, 6, 8];
a.length = 2;     
console.log(a);  //[2, 4]
```



## ◻타이머 함수

- setTimeout(함수, 시간) : 일정 시간 후 함수 실행

- setInterval(함수, 시간) : 일정 시간 간격으로 함수 반복 실행

- clearTimeout(id) : 실행되고 있는 timeout 을 중지

- clearInterval(id) : 실행되고 있는 interval 을 중지



## ◻비동기 처리

- 비동기적으로 실행되는 코드는 순차적으로 실행되지 않는다.

```javascript
console.log("A");
setTimeout(function() { console.log("B"); }, 0);
console.log("C");

//A, C, B 순서로 표시됨
```

: setTimeout 함수는 인수로 받은 콜백 함수를 일정 시간 후 실행하도록 예약하는 처리만 하고 바로 다음 코드를 실행한다. 호출 스택에 실행 문맥이 남아 있을 경우 그 작업이 끝날 때까지 기다렸다가 실행한다.

###  [1]callback 함수

- 콜백함수는 다른 함수에 매개변수로 넘겨준 함수를 뜻한다.
-  setTimeout 함수는 callback 함수를 정의하여 일정 시간 후에 콜백함수를 자동으로 호출한다.

```javascript
function sleep(callback){
    setTimeout(function(){
        callback();
    }, 1000);
}
	sleep(function(){
        console.log("A");
        sleep(function(){
            console.log("B");
            sleep(function(){
                console.log("C");
            });
        });
    });
//A, B, C 순서로 표시됨
```

- 콜백 함수를 여러 개 중첩하면 작업 내용을 이해하기가 어려워지는데, 이를 '콜백 지옥(Callback Hell)' 이라고 한다.
- 해결 방법 : Promise 사용



###  [2] Promise

: 비동기 처리를 실행하고 그 처리가 끝난 후에 다음 처리를 실행하기 위한 용도로 Promise를 사용한다.

#### - Promise의 상태

- Pending(대기) : 비동기 처리 로직이 아직 완료되지 않은 상태
- Fulfilled(이행) : 비동기 처리가 완료되어 프로미스가 결과 값을 반환해준 상태
- Rejected(실패) : 비동기 처리가 실패하거나 오류가 발생한 상태

#### - Promise 생성자

- Promise를 사용하려면 먼저 Promise 객체를 생성해야한다

```javascript
var promise = new Promise(function(resolve, reject) { ... } );
            
            //new Promise(executor)
```

- Promise 는 매개변수로 executor 를 받게 된다. Promise를 생성하면 executor 콜백함수가 자동으로 실행된다.
  - -executor : resolve 및 reject 인수를 전달할 실행 함수


- Promise를 생성하여 비동기 처리를 구현 후 resolve(), reject() 콜백 함수를 호출하여 그결과를 전달한다.


  - -resolve : 함수 안의 처리가 성공적으로 끝났을 때 호출해야하는 콜백 함수

    -reject : 함수 안의 처리가 실패했을 때 호출해야 하는 콜백 함수

- Promise 사용하는 곳에서 결과를 then, catch, finally 등으로 받을 수 있다.

#### - then

-  promise가 잘 처리되면 resolve함수에 인수로 넘긴 값은 then 메서드로 전달되고, then 메서드에 넘긴 함수가 실행된다.

- then 메서드

  ```javascript
  promise.then(onFullfilled);
  ```

  - onFullfilled : promise 안의 처리가 정상적으로 끝났을 떄 호출되는 함수

#### - catch

- promise가 실패하면 reject 함수에 인수로 넘긴 값은 catch 메서드로 전달되고,. catch 메서드에 넘긴 함수가 실행된다.

- catch 메서드

  ```javascript
  promise.catch(onRejected);
  ```

  - onRejected : promise 안의 처리가 실패로 끝났을 떄 호출되는 함수

#### -then(onFullfilled, onRejected)

- ```
  promise.then(onFullfilled, onRejected);
  ```

  ​	: promise 안의 처리가 성공하면 onFullfilled 함수가 실행되고 실패하면 onRecjected 함수가 실행된다

```javascript
promise
.then(function(value){
	   // 성공
	console.log(value);
},
      function(error) {
	   // 실패 
	console.error(error);
});
```



#### - finally()

- finally()는 Promise가 resolve나 reject가 되던 상관없이 지정된 함수를 실행한다.



#### - Promise.all

: 비동기 처리 여러 개를 병렬로 실행할 수 있다. 모든 처리가 성공적으로 끝나야만 다음 작업을 실행하도록 만들 수 있다.

```javascript
Promise.all(iterable); //iterable : 반복 가능한 객체
```

1. Promise.all는 요소로 들어있는 모든 Promise 객체를 병렬로 실행한다.
2. 인수로 넘긴 모든 Promise 객체가 resolve 함수를 호출하면 then은 지정한 함수를 실행한다.

​		(then은 인수로 모든 Promise 객체가 실행한 resolve 함수의 인수가 담긴 배열을 받는다.)

3. 실패로 끝난 Promise 객체가 하나라도 있으면 가장 먼저 실패로 끝난 Promise 객체에서 실행한 reject 함수의 인수를 catch 함수에 인수로 넘긴다.



#### - Promise.race

- 가장 먼저 종료한 Promise 객체의 결과만 다음 작업으로 보낸다. 나머지 작업은 실행되긴 하지만 가장 먼저 종료한 작업의 결괏값만 반환한다.

```javascript
Promise.race(iterable);
```

