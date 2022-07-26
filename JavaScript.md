# 🔸JavaScript

## ◻JavaScript 란?

- 동적인 처리를 목적으로 고안된 객체 기반의 스크립트 프로그래밍 언어이다.

- HTML과 Server Script(백앤드) 사이에서 접속자의 마우스 클릭, 키보드 입력등 이벤트 처리를 주로 담당한다.

- HTML + CSS <---> JavaScript <---> 백앤드
  출력 동작/이벤트 데이터베이스 접속 처리
  (Oracle, MySQL...)

## ◻특징

### -동적 타입 언어다.

- C++와 Java는 실행되기 전에 변수 타입이 결정되는 정적 타입 언어인 반면에 자바스크립트는 변수 타입이 없다. 그러므로 프로그램을 실행하는 도중에 변수에 저장되는 데이터 타입이 동적으로 바뀔 수 있는데, 이를 동적 타입 언어라고 한다.

### -알파벳 대문자와 소문자를 구분한다.

- console.log ≠ Console.log

## ◻변수 선언

### - var

: 변수 재선언 가능

```jsx
var 변수이름;

EX) var x;
```

- 변수를 선언하기만 하면 변수 안에는 undefined (정의 되지 않음) 라는 값이 들어간다.

### - let

: 변수 재선언 불가능, 변수 재할당 가능

### - const

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

### - 보간표현식

- 템플릿 리터럴 안에는 플레이스 홀더를 넣을 수 있다.
- 플레이스 홀더 : ${ } 로 표기

```jsx
var a = 2,
  b = 3;
console.log(`${a} + ${b} = ${a + b}`); // 2 + 3 = 5
```

## ◻값의 전달, 참조 전달

### [1] 값의 전달

: 함수에 원시값을 인수로 넘겼을 경우

```javascript
function add(x) {
  return (x = x + 1);
}
var a = 3;
var b = add(a);
console.log("a= " + a + "b= " + b); // a = 3, b = 4
```

: 변수 x와 변수 a 는 다른 영역의 메모리에 위치한 별개의 변수이다.

x의 값을 바꾸더라도 a의 값은 바뀌지 않는다.

### [2] 참조 전달

: 함수에 객체를 인수로 넘겼을 경우

```javascript
function add(p) {
  p.x = p.x + 1;
  p.y = p.y + 1;
  return p;
}
var a = { x: 3, y: 4 };
var b = add(a); //참조값을 전달함
console.log(a, b); //Object{x=4, y=5} Object{x=4, y=5}
```

: 변수 a에 객체 {x:3, y:4}의 참조가 저장되어 있으며, 이 참조 값을 인자 p에 대입한다.

- 함수에 객체를 인수로 넘겼을 때 전달되는 값은 참조값이다.

  변수 a 와 인자 p는 똑같은 객체를 참조하므로 함수 안에서 p.x와 p.y를 수정하면 a.x와 a.y도 수정된다.

- 함수에 객체를 인수로 넘기면 함수 안에서 원래의 객체를 바꿀 수 있다.

## ◻배열

: \- 비슷한 종류의 데이터를 한곳에 담아 저장하는 것을 자료구조이다.
\- 자료구조에서 인덱스가 지정된 영역이 이어져 있는 것을 배열이다.

### [1] 배열 리터럴로 생성

: 쉼표로 구분한 값을 대괄호로 묶어서 표현

- 변수의 요소에는 모든 타입의 값이 올 수 있다.

```javascript
var evens = [2, 4, 6, 8, "pi", true, { x: 1, y: 2 }, [2, 3, 4]];
```

- 왼쪽부터 순서대로 요소번호(인덱스)가 0, 1, 2 ... 순으로 매겨진다.

- 어떠한 요소도 작성하지 않으면 빈 배열이 생성된다.

  ```javascript
  var empty = [];
  ```

- 요소의 값을 생략하면 그 요소는 생성되지 않는다.

  ```javascript
  var a = [2, , 4];
  console.log(a); //[2, undefined, 4]
  ```

  : 인덱스가 1인 요소(두번째 요소)에 undefined가 표시되어 있지만 실제로는 없는 것이다.

### [2] length

: 배열길이 (`배열 요소의 최대 인덱스 값+1` )

- length 프로퍼티에 현재의 배열 요소 개수보다 작고 0보다 큰 정수 값을 대입하면 배열 길이가 줄어든다.

  그 배열 길이를 넘는 인덱스 번호에 할당된 배열 요소는 삭제된다.

- length 프로퍼티에 그 배열 길이보다 큰 정수 값을 대입하면 배열에 새로운 요소가 추가되는게 아니라 length 프로퍼티 값만 바뀐다.

```javascript
var a = [2, 4, 6, 8];
a.length = 2;
console.log(a); //[2, 4]
```

### [3] Array 생성자

#### 1. Array 생성자로 배열 생성

```javascript
var a = new Array(1, 2, 3, 4); //[1, 2, 3, 4] 배열을 생성
var b = new Array(); //빈 배열을 생성
```

#### 2. Array 생성자의 인수가 1개일 경우

- 배열길이를 뜻한다.

  ```javascript
  var c = new Array(5); //길이가 5인 배열을 생성
  console.log(c.length); //5
  ```

### [4] 배열 참조

- 대괄호 [ ] 를 사용하여 요소를 참조한다.

  ```javascript
  var a = new Array(1, 2, 3, 4);
  a[2]; //세 번째 요소인 3을 뜻함
  ```

### [5] 배열의 추가와 삭제

#### 1. 추가

##### 1.1 값을 넣으면 추가된다

```javascript
var a = [1, 2, 3];
a[3] = 4;
console.log(a); //[1, 2, 3, 4]
```

##### 1.2. push

```javascript
var a = [1, 2, 3];
a.push = 4;
console.log(a); //[1, 2, 3, 4]
```

#### 2. 삭제

##### 2.1 delete

- length의 값은 그대로다.
- 요소만 삭제된다.

```javascript
var a = [1, 2, 3];
delete a[1];
console.log(a); //[1, undefined, 3]
```

---

##### \- unshift()

: 새로운 요소를 배열의 맨 앞쪽에 추가하고, 새로운 길이를 반환한다.

##### \- shift()

: 배열에서 첫 번째 요소를 제거하고, 제거된 요소를 반환한다. 이 메서드는 배열의 길이를 변하게 한다.

=> unshift(), shift()는 요소를 추가/삭제 할 때 마다 기존 자리를 변경해야 하므로 시간이 걸린다.

##### \- splice()

: 배열의 기존 요소를 삭제 또는 교체하거나 새 요소를 추가하여 배열의 내용을 변경한다.

- splice(start:number, deleteCount?:number, 추가될 요소값:string[])

```javascript
array.splice(start[, deleteCount[, item1[, item2[, ...]]]]

//    splice(start:number, deleteCount:number, 추가될 요소값:string[])
```

- deleteCount는 생략 가능하며, 생략하면 start 뒤로 다 지워진다.

##### \- concat()

: 인자로 주어진 배열이나 값들을 기존 배열에 합쳐서 새 배열을 반환한다.

- 기존배열을 변경하지 않는다.
- 추가된 새로운 배열을 반환한다.

##### \- slice()

: 기존 배열에서 잘라내서 새로운 배열로 만들어낸다.

```javascript
  slice([begin[, end]])
//slice(시작 인덱스, 끝 인덱스(포함되지 않음))
```

##### \- sort()

: 오름차순으로 정렬해준다.

##### \- reverse()

: 현재의 배열 순서를 반대로 바꿔준다.

- **내림차순**을 하고자 한다면 **sort()한 후 reverse**하면 내림차순으로 정렬할 수 있다.

### [6] 배열은 객체 타입이다.(참조값)

- 배열은 객체 타입이므로 참조값이 저장되어 있는 것 이다.
- 배열의 변수의 값이 같은지 판별하는 것은 같은 객체를 가리키는지 판별하는 것이다.

```javascript
var a = [1, 2, 3]; //a와 b의 데이터는 같지만 저장된 위치가 다르다. -> 값이 다르다고 판정
var b = [1, 2, 3];
var c = a;
console.log(a == b); //false
console.log(a == c); //true
```

## ◻연산

#### 1. 정수/정수여도 결과는 소수점까지 나타낸다.

EX) 7/2 -> 3.5

#### 2. 소수점으로 나머지를 계산할 수 있다.

EX) 5%1.5 -> 0.5

#### 3. + 연산자 : 피연산자 중 하나가 문자열이면 나머지도 다 문자열로 만든다.

EX) 1 + "mon" -> 1mon

#### 4. 계산할 수 없는 경우 : NaN

- 계산할 수 없는 경우엔 NaN으로 출력된다.

- true는 1, false, null는 0으로 계산한다.

  ```javascript
  0 / 0; //NaN
  true + true; //2
  1 + null; //1
  1 + undefined; //NaN
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
setTimeout(function () {
  console.log("B");
}, 0);
console.log("C");

//A, C, B 순서로 표시됨
```

: setTimeout 함수는 인수로 받은 콜백 함수를 일정 시간 후 실행하도록 예약하는 처리만 하고 바로 다음 코드를 실행한다. 호출 스택에 실행 문맥이 남아 있을 경우 그 작업이 끝날 때까지 기다렸다가 실행한다.

### [1]callback 함수

- 콜백함수는 다른 함수에 매개변수로 넘겨준 함수를 뜻한다.
- setTimeout 함수는 callback 함수를 정의하여 일정 시간 후에 콜백함수를 자동으로 호출한다.

```javascript
function sleep(callback) {
  setTimeout(function () {
    callback();
  }, 1000);
}
sleep(function () {
  console.log("A");
  sleep(function () {
    console.log("B");
    sleep(function () {
      console.log("C");
    });
  });
});
//A, B, C 순서로 표시됨
```

- 콜백 함수를 여러 개 중첩하면 작업 내용을 이해하기가 어려워지는데, 이를 '콜백 지옥(Callback Hell)' 이라고 한다.
- 해결 방법 : Promise 사용

### [2] Promise

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

- promise가 잘 처리되면 resolve함수에 인수로 넘긴 값은 then 메서드로 전달되고, then 메서드에 넘긴 함수가 실행된다.

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

  : promise 안의 처리가 성공하면 onFullfilled 함수가 실행되고 실패하면 onRecjected 함수가 실행된다

```javascript
promise.then(
  function (value) {
    // 성공
    console.log(value);
  },
  function (error) {
    // 실패
    console.error(error);
  }
);
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

(then은 인수로 모든 Promise 객체가 실행한 resolve 함수의 인수가 담긴 배열을 받는다.)

3. 실패로 끝난 Promise 객체가 하나라도 있으면 가장 먼저 실패로 끝난 Promise 객체에서 실행한 reject 함수의 인수를 catch 함수에 인수로 넘긴다.

#### - Promise.race

- 가장 먼저 종료한 Promise 객체의 결과만 다음 작업으로 보낸다. 나머지 작업은 실행되긴 하지만 가장 먼저 종료한 작업의 결괏값만 반환한다.

```javascript
Promise.race(iterable);
```

## ◻대화상자 표시

#### 1. alert (경고 대화상자)

```javascript
alert("안녕하세요");
```

#### 2. prompt(입력 대화상자)

- 두 번째 인수로 초기값을 설정할 수 있다.
- prompt가 반환하는 값은 문자열이므로 숫자값을 구하려면 parseInt나 parseFloat 이용

```javascript
var name = prompt("이름을 입력하세요");
var name = prompt("이름을 입력하세요", "홍길동"); //초기값 설정 가능
```

#### 3. confirm(확인 대화상자)

- 논리값을 반환한다
- `확인`버튼을 누르면 `true`, `취소` 버튼을 누르면 `false`가 반환된다.

```javascript
var ret = confirm("입력한 값이 맞습니까?");
```

## ◻ 별도의 CSS 파일을 만들고 HTML 문서와 연결하기

- Style Sheet을 별도로 만들고 HTML문서와 연결

  1. style.css 파일을 만든다

     ```
     h1 {
       color: red;
     }
     ```

  2. HTML문서에 코드를 추가한다

     ```
     <link rel="stylesheet" href="style.css">
     ```

     - href ="파일이 있는 경로"

       ​ ="style.css" : HTML와 CSS가 같은 폴더 내에 있을 경우

       ​ ="css/style.css" : HTML이 있는 폴더 안에 CSS라는 폴더가 있고, 그 CSS 폴더 안에 style.css가 있을 경우

       ​ ="../style.css" : HTML이 있는 폴더의 밖에 style.css가 있는 경우

## ◻ document 객체

- HTML 요소를 객체 형태로 접근할 수 있도록 해준다

  ex) document.body : <body>요소를 반환

  ​ document.forms : <form>요소를 모두 반환

- HTML 요소와 관련된 작업을 도와주는 다양한 메소드를 제공한다

## ◻ FormData 객체

- Ajax로 폼 전송을 가능하게 해주는 객체이다.
  보통은 JSON 구조(KEY-VALUE)로 데이터를 전송하지만 이미지를 ajax로 업로드할 땐 FormData 객체를 사용한다.

```
let formData = new FormData([form]);

  // HTML에 form 요소가 있는 경우, 해당 폼 요소의 필드 전체가 자동 반영된다.
```

- fetch 등의 네트워크 메서드가 FormData 객체를 바디로 받는다.
  이때 브라우저가 보내는 HTTP 메시지는 인코딩되고 Content-Type 속성은 multipart/form-data로 지정된 후 전송된다.

### FormData 메서드

- `formData.append(name, value)` : name과 value를 가진 폼 필드를 추가한다.
- `formData.set(name, value)` : name과 value를 가진 폼 필드를 추가한다.
  append와의 차이점은 set은 name과 동일한 이름을 가진 필드를 모두 제거하고 새로운 필드 하나를 추가한다.
  set 메서드를 쓰면 name을 가진 필드가 단 한 개만 있게 된다.
  - `formData.set(name, blob, fileName)`
- `formData.append(name, blob, fileName)` : `<input type="file">`형태의 필드를 추가한다.
  - fileName : 사용자가 해당 이름을 가진 파일을 폼에 추가한 것처럼 설정해 준다.
- `formData.delete(name)` : name에 해당하는 필드를 삭제한다.
- `formData.get(name)` : name에 해당하는 필드의 값을 가져온다.
- `formData.has(name)` : name에 해당하는 필드가 있으면 true를, 그렇지 않으면 false를 반환한다.

- 폼은 name이 같은 필드 여러 개를 허용하기 때문에 append 메서드를 여러 번 호출해 이름이 같은 필드를 계속 추가해도 문제가 없다.

### FormData - 파일이 있는 form 전송

- form을 전송할 때 HTTP 메시지의 Content-Type 속성은 항상 multipart/form-data이고 메시지는 인코딩되어 전송된다.

### FormData - Blob 데이터가 있는 form 전송

- 이미지 같은 동적으로 생성된 바이너리 파일은 Blob 객체를 사용해 쉽게 전송할 수 있다. Blob 객체는 fetch 메서드의 body 매개변수에 바로 넘겨줄 수 있다.

> - 폼에 필드를 추가하고 여기에 이미지 이름 등의 메타데이터를 같이 실어 넘겨주는 게 좀 더 편리하다.

```
let formData = new FormData();
formData.append("image", imageBlob, "image.png");

// 폼에 <input type="file" name="image"> 태그가 있고, 로컬에 파일명이 "image.png"인 imageBlob 데이터를 추가한 것이다.
```

## ◻ 내장함수

: 자바스크립트에서 기본적으로 제공하는 함수

### 1. eval()

- 문자로 표현된 js 코드를 실행하는 함수
  - `eval(string)`

```javascript
var a = "20 + 20";
eval(a);
// 40
```

### 2. parseInt()

- 문자형 데이터를 정수형 데이터로 변환

  - `parseInt(String, radix)`

    ​ radix : 변환할 진수

```javascript
parseInt("7.0001"); //   7
parseInt("7 문자열"); //  7
parseInt("문자열 7"); //  NaN
```

### 3. parseFloat()

- 문자형 데이터를 실수형 데이터로 변환
  - `parseFloat(value)`

```javascript
parseFloat(" 7 "); // 7
parseFloat("7.0001"); // 7.0001
parseFloat("7 문자열"); // 7
parseFloat("문자열 7"); // NaN
```

### 4. isNaN()

- 전달된 값이 NaN인지의 여부를 boolean으로 반환
  - `isNaN(value)`

```javascript
isNaN(NaN); // true
isNaN("kashjd"); // true
isNaN(true); // false
isNaN(null); // false
isNaN(55); // false
```

### 5. isFinite()

- 전달된 값이 유한한 수인지 boolean으로 반환
  - `isFinite(value)`

```javascript
isFinite(Infinity); // false
isFinite(NaN); // false
isFinite(987654321); // true
isFinite(0); // true
```

### 6. String()

- 해당 객체를 문자열로 변환하는 함수
  - `String(value)`

```javascript
var a = 5;
typeof a; // "number"
var b = String(a);
typeof b; // "string"
```

### 7. Number()

- 문자열을 숫자로 변환

- 숫자로 변환할 수 없는 값인 경우 NaN을 반환

  - Number(object)

    ​ object : 문자열 또는 문자열을 값으로 하는 변수

```javascript
var a = "1";
var b = "2";
var c = a + b; // 12
var d = Number(a) + Number(b); // 3
```

### 8. Boolean()

- 해당 객체를 논리형으로 변환하는 함수
- Syntax: `Boolean(value)`

```javascript
Boolean(null); //  false
Boolean(5); //  true
Boolean("abc"); //  true
```

### 9. escape()

- 영문 알파벳, 숫자, 일부 특수문자(@ , \* , - , \_ , . , /) 를 제외한 모든 문자를 인코딩함

```javascript
var set1 = ";,/?:@&=+$";
var set2 = "-_.!~*'()";
var set3 = "ABC abc 123";
escape(set1); //   %3B%2C/%3F%3A@%26%3D+%24
escape(set2); //   -_.%21%7E*%27%28%29
escape(set3); //   ABC%20abc%20123
```

### 10. unescape()

- escape() 로 인코딩된 문자를 디코딩함

```javascript
unescape("%3B%2C/%3F%3A@%26%3D+%24"); // ";,/?:@&=+$"
```

### 11. encodeURI()

- A-Z a-z 0-9 ; , / ? : @ & = + $ - \_ . ! ~ \* ' ( ) # 를 제외한 나머지 문자를 escape함

```javascript
var set1 = ";,/?:@&=+$";
var set2 = "-_.!~*'()";
var set3 = "ABC abc 123";
encodeURI(set1); //   ;,/?:@&=+$
encodeURI(set2); //   -_.!~*'()
encodeURI(set3); //   ABC%20abc%20123
encodeURI("가나다"); //  %EA%B0%80%EB%82%98%EB%8B%A4
```

### 12. decodeURI()

- encodeURI()로 인코딩된 문자를 디코딩함

```javascript
decodeURI(";,/?:@&=+$"); //  ;,/?:@&=+$
decodeURI("%EA%B0%80%EB%82%98%EB%8B%A4"); //  가나다
```

### 13. encodeURICoponent()

- A-Z a-z 0-9 - \_ . ! ~ \* ' ( ) 를 제외한 나머지 문자를 escape함

```javascript
var set1 = ";,/?:@&=+$";
var set2 = "-_.!~*'()";
var set3 = "ABC abc 123";
encodeURIComponent(set1); //   %3B%2C%2F%3F%3A%40%26%3D%2B%24
encodeURIComponent(set2); //   -_.!~*'()
encodeURIComponent(set3); //   ABC%20abc%20123
encodeURIComponent("가나다"); //   %EA%B0%80%EB%82%98%EB%8B%A4
```

### 14. decodeURIComponent()

- encodeURICoponent()로 인코딩된 문자를 디코딩함

```javascript
decodeURIComponent("%3B%2C%2F%3F%3A%40%26%3D%2B%24"); //  ;,/?:@&=+$
decodeURIComponent("%EA%B0%80%EB%82%98%EB%8B%A4"); //  가나다
```

## ◻ Math의 함수

- Math.round() : 입력값을 반올림한 수와 가장 가까운 정수 값으로 반환

- Math.pow(base, exponent) : `base^exponent` ( base에 exponent를 제곱한 값) 을 반환

  - base : 밑 값

  - exponent : 밑 을 제곱하기 위해 사용하는 지수

## ◻ 클로저

\- 함수 안에 선언된 변수는 지역변수 이므로 함수 외부에서 사용할 수 없다.
\- 클로저는 위 규칙을 위반할 수 있다.
\- 흔히 함수 내에서 함수를 정의하고 사용하면 클로저라고 할 수 있다.
\- 정의한 함수를 리턴하고 사용은 바깥에서 한다.

```javascript
<!DOCTYPE html>
<html>
<head>
    <script>
        // 함수를 선언합니다.
        function test(name) {
            var output = 'Hello ' + name + ' .. !';
        }

        // 출력합니다.(호출안됨)
        alert(output);
    </script>
</head>
<body>

</body>
</html>

---------------------------------------------------------------------------------

<!DOCTYPE html>
<html>
<head>
    <script>
        // 함수를 선언합니다.
        function test(name) {
             let output = `Hello ${name} ...!`;

             return function() {
                   console.log(output);
              };
        }

        // 출력합니다. 호출됨
        test('JavaScript')();
    </script>
</head>
<body>

</body>
</html>
```

## ◻ 중첩함수와 자기호출 익명함수

### [1] 중첩 함수

​ : **함수 내부에 정의된 함수**를 중첩 함수 또는 내부 함수라고 한다

- 중첩 함수를 포함하는 함수는 외부 함수라 부른다.

- 중첩 함수는 자신을 포함하는 **외부 함수**를 돕는 **헬퍼함수의 역할**을 한다.

- 중첩함수는 외부함수의 변수에 접근가능하다.

- 함수 선언문의 경우 if 문이나 for문 등의 코드 블록 내에서도 정의 가능하지만 호이스팅으로 인해 혼란이 발생할 수 있으므로 바람직하지 않다.

- 중첩 함수는 스코프와 클로저와 깊은 관련이 있다는 것을 기억

```javascript
<script>
function outer(){ // 외부 함수
  const x = 1;
  // 중첩 함수, 내부함수
  function inner (){// 외부 함수를 돕는 헬퍼 함수 역할
   // 외부 함수의 변수를 참조할 수 있음
    const y = 3
   console.log(x + y);
  }
  inner()
}
outer()
</script>
```

### [2] 자기호출 익명함수

- 익명함수 : 말그대로 함수의 이름이 없는 함수를 말합니다.
- 자기호출 익명함수 : 말그대로 자기 스스로를 호출한다는 의미입니다

```javascript
//익명함수
function () {
...
}

// 소괄호를 사용한 자기호출 익명함수

(function (a){
 ...
})('Hello')

//--------------------------------

(function (a){
 ...
}('Hello'))
```

\- 아래 중첩함수 예제의 문제를 익명의 자기 호출 함수로 해결할 수 있다.

```javascript
<!DOCTYPE html>
<html>
<body>

<p>Counting with a local variable.</p>

<button type="button" onclick="myFunction()">Count!</button>

<p id="demo">0</p>

<script>
function add() {
    var counter = 0;
    function plus() {counter += 1;}
    plus();
    return counter;
}

function myFunction(){
    document.getElementById("demo").innerHTML = add();
}
</script>

</body>
</html>

--------------------------------------------------------------------------------
<!DOCTYPE html>
<html>
<body>

<p>Counting with a local variable.</p>

<button type="button" onclick="myFunction()">Count!</button>

<p id="demo">0</p>

<script>
var add = (function () {
    var counter = 0;
    return function () {return counter += 1;}
})();

function myFunction(){
    document.getElementById("demo").innerHTML = add();
}
</script>

</body>
</html>
```
