# ๐ธJavaScript

## โปJavaScript ๋?

- ๋์ ์ธ ์ฒ๋ฆฌ๋ฅผ ๋ชฉ์ ์ผ๋ก ๊ณ ์๋ ๊ฐ์ฒด ๊ธฐ๋ฐ์ ์คํฌ๋ฆฝํธ ํ๋ก๊ทธ๋๋ฐ ์ธ์ด์ด๋ค.

- HTML๊ณผ Server Script(๋ฐฑ์ค๋) ์ฌ์ด์์ ์ ์์์ ๋ง์ฐ์ค ํด๋ฆญ, ํค๋ณด๋ ์๋ ฅ๋ฑ ์ด๋ฒคํธ ์ฒ๋ฆฌ๋ฅผ ์ฃผ๋ก ๋ด๋นํ๋ค.

- HTML + CSS <---> JavaScript <---> ๋ฐฑ์ค๋
  ์ถ๋ ฅ ๋์/์ด๋ฒคํธ ๋ฐ์ดํฐ๋ฒ ์ด์ค ์ ์ ์ฒ๋ฆฌ
  (Oracle, MySQL...)

## โปํน์ง

### -๋์  ํ์ ์ธ์ด๋ค.

- C++์ Java๋ ์คํ๋๊ธฐ ์ ์ ๋ณ์ ํ์์ด ๊ฒฐ์ ๋๋ ์ ์  ํ์ ์ธ์ด์ธ ๋ฐ๋ฉด์ ์๋ฐ์คํฌ๋ฆฝํธ๋ ๋ณ์ ํ์์ด ์๋ค. ๊ทธ๋ฌ๋ฏ๋ก ํ๋ก๊ทธ๋จ์ ์คํํ๋ ๋์ค์ ๋ณ์์ ์ ์ฅ๋๋ ๋ฐ์ดํฐ ํ์์ด ๋์ ์ผ๋ก ๋ฐ๋ ์ ์๋๋ฐ, ์ด๋ฅผ ๋์  ํ์ ์ธ์ด๋ผ๊ณ  ํ๋ค.

### -์ํ๋ฒณ ๋๋ฌธ์์ ์๋ฌธ์๋ฅผ ๊ตฌ๋ถํ๋ค.

- console.log โ  Console.log

## โป๋ณ์ ์ ์ธ

### - var

: ๋ณ์ ์ฌ์ ์ธ ๊ฐ๋ฅ

```jsx
var ๋ณ์์ด๋ฆ;

EX) var x;
```

- ๋ณ์๋ฅผ ์ ์ธํ๊ธฐ๋ง ํ๋ฉด ๋ณ์ ์์๋ undefined (์ ์ ๋์ง ์์) ๋ผ๋ ๊ฐ์ด ๋ค์ด๊ฐ๋ค.

### - let

: ๋ณ์ ์ฌ์ ์ธ ๋ถ๊ฐ๋ฅ, ๋ณ์ ์ฌํ ๋น ๊ฐ๋ฅ

### - const

: ๋ณ์์ฌ์ ์ธ ,์ฌํ ๋น ๋ถ๊ฐ๋ฅ

- ์ฌํ ๋น์ด ํ์์๋ ๊ฒฝ์ฐ, const๋ฅผ ์ฌ์ฉํด ๋ถํ์ํ ๋ณ์์ ์ฌ์ฌ์ฉ์ ๋ฐฉ์ง

- ์ฌํ ๋น์ด ํ์ํ ๊ฒฝ์ฐ, let์ ์ฌ์ฉํ๋ ๊ฒ์ด ์ข์

## โป๋ณ์ ์ ์ธ์ ๋์ด์ฌ๋ฆผ(hoisting)

- ํ๋ก๊ทธ๋จ์ ์์ฑํ ์์์ ๋ฐ๋ผ ์์ค๋ถํฐ ์ฐจ๋ก๋๋ก ์คํ๋๋ค.

  ํ์ง๋ง ๋ณ์ ์ ์ธ์ ํ๋ก๊ทธ๋จ ์ค๊ฐ์์ ๋ณ์๋ฅผ ์ ์ธํ๋๋ผ๋ ์ฒซ๋จธ๋ฆฌ์ ์ ์ธ๋ ๊ฒ์ฒ๋ผ ๋ค๋ฅธ ๋ฌธ์ฅ ์์ ์์ฑ๋๋ค.

  ```jsx
  console.log(x); /*undefined*/       โ              var x;
  var x;                    /*๋ณ์ ์ ์ธ์ ๋์ด์ฌ๋ฆผ*/    console.log(x);
  ```

- ์ ์ธ๊ณผ ๋์์ ๋์ํ๋ ์ฝ๋๋ ๋์ด์ฌ๋ฆฌ์ง ์๋๋ค.

```jsx
console.log(x); // undefined -> ๋ณ์ ์ ์ธ์ ๋์ด์ฌ๋ฆฌ์ง๋ง x=2๋ ๋์ด์ฌ๋ฆฌ์ง ์์
var x = 2;
console.log(x); // 5
```

## โป๋ฌธ์์ด

- ๋ฌธ์์ด์ ์์๋ฐ์ดํ๋ ํฐ๋ฐ์ดํ๋ฅผ ๋ฌธ์์ด์ ์๋ค์ ๋ถ์ฌ์ ํํํ๋ค.

- ์๋ฐ์คํฌ๋ฆฝํธ๋ฅผ HTML ์์์ ๋ผ์ ๋ฃ์ ๋๋ ์๋ฐ์คํฌ๋ฆฝํธ ํ๋ก๊ทธ๋จ์ ๋ฌธ์์ด๋ก ์์ฑํ๋ค.

  - HTML ์ฝ๋์๋ ํฐ๋ฐ์ดํ๋ฅผ ์ฌ์ฉํ๊ณ  ์๋ฐ์คํฌ๋ฆฝํธ ์ฝ๋์๋ ์์๋ฐ์ดํ๋ฅผ ์ฌ์ฉํ์ฌ ๊ตฌ๋ถํ๋ฉด ์ข๋ค.

  ```jsx
  <input type="button" value="Click" onclick="alert('Thanks!')">
  ```

## โปํํ๋ฆฟ ๋ฆฌํฐ๋ด

: ๋ฐฑํฑ( ` )์ผ๋ก ๋ฌถ์ ๋ฌธ์์ด์ด๋ค.

- ๋ฐฑํฑ์ผ๋ก ์ฎ์ผ๋ฉด ์๋ ฅํ ๊ทธ๋๋ก ๋ฌธ์์ด์ด ํํ๋๋ฏ๋ก ์ด์ค์ผ์ดํ ์ํ์ค(\n)์ ์ฌ์ฉํ์ง ์๊ณ  ์ผ๋ฐ์ ์ธ ์ค ๋ฐ๊ฟ์ ์ฌ์ฉํ  ์ ์๋ค.

```jsx
var t = `Hello
World`;
```

### - ๋ณด๊ฐํํ์

- ํํ๋ฆฟ ๋ฆฌํฐ๋ด ์์๋ ํ๋ ์ด์ค ํ๋๋ฅผ ๋ฃ์ ์ ์๋ค.
- ํ๋ ์ด์ค ํ๋ : ${ } ๋ก ํ๊ธฐ

```jsx
var a = 2,
  b = 3;
console.log(`${a} + ${b} = ${a + b}`); // 2 + 3 = 5
```

## โป๊ฐ์ ์ ๋ฌ, ์ฐธ์กฐ ์ ๋ฌ

### [1] ๊ฐ์ ์ ๋ฌ

: ํจ์์ ์์๊ฐ์ ์ธ์๋ก ๋๊ฒผ์ ๊ฒฝ์ฐ

```javascript
function add(x) {
  return (x = x + 1);
}
var a = 3;
var b = add(a);
console.log("a= " + a + "b= " + b); // a = 3, b = 4
```

: ๋ณ์ x์ ๋ณ์ a ๋ ๋ค๋ฅธ ์์ญ์ ๋ฉ๋ชจ๋ฆฌ์ ์์นํ ๋ณ๊ฐ์ ๋ณ์์ด๋ค.

x์ ๊ฐ์ ๋ฐ๊พธ๋๋ผ๋ a์ ๊ฐ์ ๋ฐ๋์ง ์๋๋ค.

### [2] ์ฐธ์กฐ ์ ๋ฌ

: ํจ์์ ๊ฐ์ฒด๋ฅผ ์ธ์๋ก ๋๊ฒผ์ ๊ฒฝ์ฐ

```javascript
function add(p) {
  p.x = p.x + 1;
  p.y = p.y + 1;
  return p;
}
var a = { x: 3, y: 4 };
var b = add(a); //์ฐธ์กฐ๊ฐ์ ์ ๋ฌํจ
console.log(a, b); //Object{x=4, y=5} Object{x=4, y=5}
```

: ๋ณ์ a์ ๊ฐ์ฒด {x:3, y:4}์ ์ฐธ์กฐ๊ฐ ์ ์ฅ๋์ด ์์ผ๋ฉฐ, ์ด ์ฐธ์กฐ ๊ฐ์ ์ธ์ p์ ๋์ํ๋ค.

- ํจ์์ ๊ฐ์ฒด๋ฅผ ์ธ์๋ก ๋๊ฒผ์ ๋ ์ ๋ฌ๋๋ ๊ฐ์ ์ฐธ์กฐ๊ฐ์ด๋ค.

  ๋ณ์ a ์ ์ธ์ p๋ ๋๊ฐ์ ๊ฐ์ฒด๋ฅผ ์ฐธ์กฐํ๋ฏ๋ก ํจ์ ์์์ p.x์ p.y๋ฅผ ์์ ํ๋ฉด a.x์ a.y๋ ์์ ๋๋ค.

- ํจ์์ ๊ฐ์ฒด๋ฅผ ์ธ์๋ก ๋๊ธฐ๋ฉด ํจ์ ์์์ ์๋์ ๊ฐ์ฒด๋ฅผ ๋ฐ๊ฟ ์ ์๋ค.

## โป๋ฐฐ์ด

: \- ๋น์ทํ ์ข๋ฅ์ ๋ฐ์ดํฐ๋ฅผ ํ๊ณณ์ ๋ด์ ์ ์ฅํ๋ ๊ฒ์ ์๋ฃ๊ตฌ์กฐ์ด๋ค.
\- ์๋ฃ๊ตฌ์กฐ์์ ์ธ๋ฑ์ค๊ฐ ์ง์ ๋ ์์ญ์ด ์ด์ด์ ธ ์๋ ๊ฒ์ ๋ฐฐ์ด์ด๋ค.

### [1] ๋ฐฐ์ด ๋ฆฌํฐ๋ด๋ก ์์ฑ

: ์ผํ๋ก ๊ตฌ๋ถํ ๊ฐ์ ๋๊ดํธ๋ก ๋ฌถ์ด์ ํํ

- ๋ณ์์ ์์์๋ ๋ชจ๋  ํ์์ ๊ฐ์ด ์ฌ ์ ์๋ค.

```javascript
var evens = [2, 4, 6, 8, "pi", true, { x: 1, y: 2 }, [2, 3, 4]];
```

- ์ผ์ชฝ๋ถํฐ ์์๋๋ก ์์๋ฒํธ(์ธ๋ฑ์ค)๊ฐ 0, 1, 2 ... ์์ผ๋ก ๋งค๊ฒจ์ง๋ค.

- ์ด๋ ํ ์์๋ ์์ฑํ์ง ์์ผ๋ฉด ๋น ๋ฐฐ์ด์ด ์์ฑ๋๋ค.

  ```javascript
  var empty = [];
  ```

- ์์์ ๊ฐ์ ์๋ตํ๋ฉด ๊ทธ ์์๋ ์์ฑ๋์ง ์๋๋ค.

  ```javascript
  var a = [2, , 4];
  console.log(a); //[2, undefined, 4]
  ```

  : ์ธ๋ฑ์ค๊ฐ 1์ธ ์์(๋๋ฒ์งธ ์์)์ undefined๊ฐ ํ์๋์ด ์์ง๋ง ์ค์ ๋ก๋ ์๋ ๊ฒ์ด๋ค.

### [2] length

: ๋ฐฐ์ด๊ธธ์ด (`๋ฐฐ์ด ์์์ ์ต๋ ์ธ๋ฑ์ค ๊ฐ+1` )

- length ํ๋กํผํฐ์ ํ์ฌ์ ๋ฐฐ์ด ์์ ๊ฐ์๋ณด๋ค ์๊ณ  0๋ณด๋ค ํฐ ์ ์ ๊ฐ์ ๋์ํ๋ฉด ๋ฐฐ์ด ๊ธธ์ด๊ฐ ์ค์ด๋ ๋ค.

  ๊ทธ ๋ฐฐ์ด ๊ธธ์ด๋ฅผ ๋๋ ์ธ๋ฑ์ค ๋ฒํธ์ ํ ๋น๋ ๋ฐฐ์ด ์์๋ ์ญ์ ๋๋ค.

- length ํ๋กํผํฐ์ ๊ทธ ๋ฐฐ์ด ๊ธธ์ด๋ณด๋ค ํฐ ์ ์ ๊ฐ์ ๋์ํ๋ฉด ๋ฐฐ์ด์ ์๋ก์ด ์์๊ฐ ์ถ๊ฐ๋๋๊ฒ ์๋๋ผ length ํ๋กํผํฐ ๊ฐ๋ง ๋ฐ๋๋ค.

```javascript
var a = [2, 4, 6, 8];
a.length = 2;
console.log(a); //[2, 4]
```

### [3] Array ์์ฑ์

#### 1. Array ์์ฑ์๋ก ๋ฐฐ์ด ์์ฑ

```javascript
var a = new Array(1, 2, 3, 4); //[1, 2, 3, 4] ๋ฐฐ์ด์ ์์ฑ
var b = new Array(); //๋น ๋ฐฐ์ด์ ์์ฑ
```

#### 2. Array ์์ฑ์์ ์ธ์๊ฐ 1๊ฐ์ผ ๊ฒฝ์ฐ

- ๋ฐฐ์ด๊ธธ์ด๋ฅผ ๋ปํ๋ค.

  ```javascript
  var c = new Array(5); //๊ธธ์ด๊ฐ 5์ธ ๋ฐฐ์ด์ ์์ฑ
  console.log(c.length); //5
  ```

### [4] ๋ฐฐ์ด ์ฐธ์กฐ

- ๋๊ดํธ [ ] ๋ฅผ ์ฌ์ฉํ์ฌ ์์๋ฅผ ์ฐธ์กฐํ๋ค.

  ```javascript
  var a = new Array(1, 2, 3, 4);
  a[2]; //์ธ ๋ฒ์งธ ์์์ธ 3์ ๋ปํจ
  ```

### [5] ๋ฐฐ์ด์ ์ถ๊ฐ์ ์ญ์ 

#### 1. ์ถ๊ฐ

##### 1.1 ๊ฐ์ ๋ฃ์ผ๋ฉด ์ถ๊ฐ๋๋ค

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

#### 2. ์ญ์ 

##### 2.1 delete

- length์ ๊ฐ์ ๊ทธ๋๋ก๋ค.
- ์์๋ง ์ญ์ ๋๋ค.

```javascript
var a = [1, 2, 3];
delete a[1];
console.log(a); //[1, undefined, 3]
```

---

##### \- unshift()

: ์๋ก์ด ์์๋ฅผ ๋ฐฐ์ด์ ๋งจ ์์ชฝ์ ์ถ๊ฐํ๊ณ , ์๋ก์ด ๊ธธ์ด๋ฅผ ๋ฐํํ๋ค.

##### \- shift()

: ๋ฐฐ์ด์์ ์ฒซ ๋ฒ์งธ ์์๋ฅผ ์ ๊ฑฐํ๊ณ , ์ ๊ฑฐ๋ ์์๋ฅผ ๋ฐํํ๋ค. ์ด ๋ฉ์๋๋ ๋ฐฐ์ด์ ๊ธธ์ด๋ฅผ ๋ณํ๊ฒ ํ๋ค.

=> unshift(), shift()๋ ์์๋ฅผ ์ถ๊ฐ/์ญ์  ํ  ๋ ๋ง๋ค ๊ธฐ์กด ์๋ฆฌ๋ฅผ ๋ณ๊ฒฝํด์ผ ํ๋ฏ๋ก ์๊ฐ์ด ๊ฑธ๋ฆฐ๋ค.

##### \- splice()

: ๋ฐฐ์ด์ ๊ธฐ์กด ์์๋ฅผ ์ญ์  ๋๋ ๊ต์ฒดํ๊ฑฐ๋ ์ ์์๋ฅผ ์ถ๊ฐํ์ฌ ๋ฐฐ์ด์ ๋ด์ฉ์ ๋ณ๊ฒฝํ๋ค.

- splice(start:number, deleteCount?:number, ์ถ๊ฐ๋  ์์๊ฐ:string[])

```javascript
array.splice(start[, deleteCount[, item1[, item2[, ...]]]]

//    splice(start:number, deleteCount:number, ์ถ๊ฐ๋  ์์๊ฐ:string[])
```

- deleteCount๋ ์๋ต ๊ฐ๋ฅํ๋ฉฐ, ์๋ตํ๋ฉด start ๋ค๋ก ๋ค ์ง์์ง๋ค.

##### \- concat()

: ์ธ์๋ก ์ฃผ์ด์ง ๋ฐฐ์ด์ด๋ ๊ฐ๋ค์ ๊ธฐ์กด ๋ฐฐ์ด์ ํฉ์ณ์ ์ ๋ฐฐ์ด์ ๋ฐํํ๋ค.

- ๊ธฐ์กด๋ฐฐ์ด์ ๋ณ๊ฒฝํ์ง ์๋๋ค.
- ์ถ๊ฐ๋ ์๋ก์ด ๋ฐฐ์ด์ ๋ฐํํ๋ค.

##### \- slice()

: ๊ธฐ์กด ๋ฐฐ์ด์์ ์๋ผ๋ด์ ์๋ก์ด ๋ฐฐ์ด๋ก ๋ง๋ค์ด๋ธ๋ค.

```javascript
  slice([begin[, end]])
//slice(์์ ์ธ๋ฑ์ค, ๋ ์ธ๋ฑ์ค(ํฌํจ๋์ง ์์))
```

##### \- sort()

: ์ค๋ฆ์ฐจ์์ผ๋ก ์ ๋ ฌํด์ค๋ค.

##### \- reverse()

: ํ์ฌ์ ๋ฐฐ์ด ์์๋ฅผ ๋ฐ๋๋ก ๋ฐ๊ฟ์ค๋ค.

- **๋ด๋ฆผ์ฐจ์**์ ํ๊ณ ์ ํ๋ค๋ฉด **sort()ํ ํ reverse**ํ๋ฉด ๋ด๋ฆผ์ฐจ์์ผ๋ก ์ ๋ ฌํ  ์ ์๋ค.

### [6] ๋ฐฐ์ด์ ๊ฐ์ฒด ํ์์ด๋ค.(์ฐธ์กฐ๊ฐ)

- ๋ฐฐ์ด์ ๊ฐ์ฒด ํ์์ด๋ฏ๋ก ์ฐธ์กฐ๊ฐ์ด ์ ์ฅ๋์ด ์๋ ๊ฒ ์ด๋ค.
- ๋ฐฐ์ด์ ๋ณ์์ ๊ฐ์ด ๊ฐ์์ง ํ๋ณํ๋ ๊ฒ์ ๊ฐ์ ๊ฐ์ฒด๋ฅผ ๊ฐ๋ฆฌํค๋์ง ํ๋ณํ๋ ๊ฒ์ด๋ค.

```javascript
var a = [1, 2, 3]; //a์ b์ ๋ฐ์ดํฐ๋ ๊ฐ์ง๋ง ์ ์ฅ๋ ์์น๊ฐ ๋ค๋ฅด๋ค. -> ๊ฐ์ด ๋ค๋ฅด๋ค๊ณ  ํ์ 
var b = [1, 2, 3];
var c = a;
console.log(a == b); //false
console.log(a == c); //true
```

## โป์ฐ์ฐ

#### 1. ์ ์/์ ์์ฌ๋ ๊ฒฐ๊ณผ๋ ์์์ ๊น์ง ๋ํ๋ธ๋ค.

EX) 7/2 -> 3.5

#### 2. ์์์ ์ผ๋ก ๋๋จธ์ง๋ฅผ ๊ณ์ฐํ  ์ ์๋ค.

EX) 5%1.5 -> 0.5

#### 3. + ์ฐ์ฐ์ : ํผ์ฐ์ฐ์ ์ค ํ๋๊ฐ ๋ฌธ์์ด์ด๋ฉด ๋๋จธ์ง๋ ๋ค ๋ฌธ์์ด๋ก ๋ง๋ ๋ค.

EX) 1 + "mon" -> 1mon

#### 4. ๊ณ์ฐํ  ์ ์๋ ๊ฒฝ์ฐ : NaN

- ๊ณ์ฐํ  ์ ์๋ ๊ฒฝ์ฐ์ NaN์ผ๋ก ์ถ๋ ฅ๋๋ค.

- true๋ 1, false, null๋ 0์ผ๋ก ๊ณ์ฐํ๋ค.

  ```javascript
  0 / 0; //NaN
  true + true; //2
  1 + null; //1
  1 + undefined; //NaN
  ```

## โปํ์ด๋จธ ํจ์

- setTimeout(ํจ์, ์๊ฐ) : ์ผ์  ์๊ฐ ํ ํจ์ ์คํ

- setInterval(ํจ์, ์๊ฐ) : ์ผ์  ์๊ฐ ๊ฐ๊ฒฉ์ผ๋ก ํจ์ ๋ฐ๋ณต ์คํ

- clearTimeout(id) : ์คํ๋๊ณ  ์๋ timeout ์ ์ค์ง

- clearInterval(id) : ์คํ๋๊ณ  ์๋ interval ์ ์ค์ง

## โป๋น๋๊ธฐ ์ฒ๋ฆฌ

- ๋น๋๊ธฐ์ ์ผ๋ก ์คํ๋๋ ์ฝ๋๋ ์์ฐจ์ ์ผ๋ก ์คํ๋์ง ์๋๋ค.

```javascript
console.log("A");
setTimeout(function () {
  console.log("B");
}, 0);
console.log("C");

//A, C, B ์์๋ก ํ์๋จ
```

: setTimeout ํจ์๋ ์ธ์๋ก ๋ฐ์ ์ฝ๋ฐฑ ํจ์๋ฅผ ์ผ์  ์๊ฐ ํ ์คํํ๋๋ก ์์ฝํ๋ ์ฒ๋ฆฌ๋ง ํ๊ณ  ๋ฐ๋ก ๋ค์ ์ฝ๋๋ฅผ ์คํํ๋ค. ํธ์ถ ์คํ์ ์คํ ๋ฌธ๋งฅ์ด ๋จ์ ์์ ๊ฒฝ์ฐ ๊ทธ ์์์ด ๋๋  ๋๊น์ง ๊ธฐ๋ค๋ ธ๋ค๊ฐ ์คํํ๋ค.

### [1]callback ํจ์

- ์ฝ๋ฐฑํจ์๋ ๋ค๋ฅธ ํจ์์ ๋งค๊ฐ๋ณ์๋ก ๋๊ฒจ์ค ํจ์๋ฅผ ๋ปํ๋ค.
- setTimeout ํจ์๋ callback ํจ์๋ฅผ ์ ์ํ์ฌ ์ผ์  ์๊ฐ ํ์ ์ฝ๋ฐฑํจ์๋ฅผ ์๋์ผ๋ก ํธ์ถํ๋ค.

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
//A, B, C ์์๋ก ํ์๋จ
```

- ์ฝ๋ฐฑ ํจ์๋ฅผ ์ฌ๋ฌ ๊ฐ ์ค์ฒฉํ๋ฉด ์์ ๋ด์ฉ์ ์ดํดํ๊ธฐ๊ฐ ์ด๋ ค์์ง๋๋ฐ, ์ด๋ฅผ '์ฝ๋ฐฑ ์ง์ฅ(Callback Hell)' ์ด๋ผ๊ณ  ํ๋ค.
- ํด๊ฒฐ ๋ฐฉ๋ฒ : Promise ์ฌ์ฉ

### [2] Promise

: ๋น๋๊ธฐ ์ฒ๋ฆฌ๋ฅผ ์คํํ๊ณ  ๊ทธ ์ฒ๋ฆฌ๊ฐ ๋๋ ํ์ ๋ค์ ์ฒ๋ฆฌ๋ฅผ ์คํํ๊ธฐ ์ํ ์ฉ๋๋ก Promise๋ฅผ ์ฌ์ฉํ๋ค.

#### - Promise์ ์ํ

- Pending(๋๊ธฐ) : ๋น๋๊ธฐ ์ฒ๋ฆฌ ๋ก์ง์ด ์์ง ์๋ฃ๋์ง ์์ ์ํ
- Fulfilled(์ดํ) : ๋น๋๊ธฐ ์ฒ๋ฆฌ๊ฐ ์๋ฃ๋์ด ํ๋ก๋ฏธ์ค๊ฐ ๊ฒฐ๊ณผ ๊ฐ์ ๋ฐํํด์ค ์ํ
- Rejected(์คํจ) : ๋น๋๊ธฐ ์ฒ๋ฆฌ๊ฐ ์คํจํ๊ฑฐ๋ ์ค๋ฅ๊ฐ ๋ฐ์ํ ์ํ

#### - Promise ์์ฑ์

- Promise๋ฅผ ์ฌ์ฉํ๋ ค๋ฉด ๋จผ์  Promise ๊ฐ์ฒด๋ฅผ ์์ฑํด์ผํ๋ค

```javascript
var promise = new Promise(function(resolve, reject) { ... } );

            //new Promise(executor)
```

- Promise ๋ ๋งค๊ฐ๋ณ์๋ก executor ๋ฅผ ๋ฐ๊ฒ ๋๋ค. Promise๋ฅผ ์์ฑํ๋ฉด executor ์ฝ๋ฐฑํจ์๊ฐ ์๋์ผ๋ก ์คํ๋๋ค.

  - -executor : resolve ๋ฐ reject ์ธ์๋ฅผ ์ ๋ฌํ  ์คํ ํจ์

- Promise๋ฅผ ์์ฑํ์ฌ ๋น๋๊ธฐ ์ฒ๋ฆฌ๋ฅผ ๊ตฌํ ํ resolve(), reject() ์ฝ๋ฐฑ ํจ์๋ฅผ ํธ์ถํ์ฌ ๊ทธ๊ฒฐ๊ณผ๋ฅผ ์ ๋ฌํ๋ค.

  - -resolve : ํจ์ ์์ ์ฒ๋ฆฌ๊ฐ ์ฑ๊ณต์ ์ผ๋ก ๋๋ฌ์ ๋ ํธ์ถํด์ผํ๋ ์ฝ๋ฐฑ ํจ์

    -reject : ํจ์ ์์ ์ฒ๋ฆฌ๊ฐ ์คํจํ์ ๋ ํธ์ถํด์ผ ํ๋ ์ฝ๋ฐฑ ํจ์

- Promise ์ฌ์ฉํ๋ ๊ณณ์์ ๊ฒฐ๊ณผ๋ฅผ then, catch, finally ๋ฑ์ผ๋ก ๋ฐ์ ์ ์๋ค.

#### - then

- promise๊ฐ ์ ์ฒ๋ฆฌ๋๋ฉด resolveํจ์์ ์ธ์๋ก ๋๊ธด ๊ฐ์ then ๋ฉ์๋๋ก ์ ๋ฌ๋๊ณ , then ๋ฉ์๋์ ๋๊ธด ํจ์๊ฐ ์คํ๋๋ค.

- then ๋ฉ์๋

  ```javascript
  promise.then(onFullfilled);
  ```

  - onFullfilled : promise ์์ ์ฒ๋ฆฌ๊ฐ ์ ์์ ์ผ๋ก ๋๋ฌ์ ๋ ํธ์ถ๋๋ ํจ์

#### - catch

- promise๊ฐ ์คํจํ๋ฉด reject ํจ์์ ์ธ์๋ก ๋๊ธด ๊ฐ์ catch ๋ฉ์๋๋ก ์ ๋ฌ๋๊ณ ,. catch ๋ฉ์๋์ ๋๊ธด ํจ์๊ฐ ์คํ๋๋ค.

- catch ๋ฉ์๋

  ```javascript
  promise.catch(onRejected);
  ```

  - onRejected : promise ์์ ์ฒ๋ฆฌ๊ฐ ์คํจ๋ก ๋๋ฌ์ ๋ ํธ์ถ๋๋ ํจ์

#### -then(onFullfilled, onRejected)

- ```
  promise.then(onFullfilled, onRejected);
  ```

  : promise ์์ ์ฒ๋ฆฌ๊ฐ ์ฑ๊ณตํ๋ฉด onFullfilled ํจ์๊ฐ ์คํ๋๊ณ  ์คํจํ๋ฉด onRecjected ํจ์๊ฐ ์คํ๋๋ค

```javascript
promise.then(
  function (value) {
    // ์ฑ๊ณต
    console.log(value);
  },
  function (error) {
    // ์คํจ
    console.error(error);
  }
);
```

#### - finally()

- finally()๋ Promise๊ฐ resolve๋ reject๊ฐ ๋๋ ์๊ด์์ด ์ง์ ๋ ํจ์๋ฅผ ์คํํ๋ค.

#### - Promise.all

: ๋น๋๊ธฐ ์ฒ๋ฆฌ ์ฌ๋ฌ ๊ฐ๋ฅผ ๋ณ๋ ฌ๋ก ์คํํ  ์ ์๋ค. ๋ชจ๋  ์ฒ๋ฆฌ๊ฐ ์ฑ๊ณต์ ์ผ๋ก ๋๋์ผ๋ง ๋ค์ ์์์ ์คํํ๋๋ก ๋ง๋ค ์ ์๋ค.

```javascript
Promise.all(iterable); //iterable : ๋ฐ๋ณต ๊ฐ๋ฅํ ๊ฐ์ฒด
```

1. Promise.all๋ ์์๋ก ๋ค์ด์๋ ๋ชจ๋  Promise ๊ฐ์ฒด๋ฅผ ๋ณ๋ ฌ๋ก ์คํํ๋ค.
2. ์ธ์๋ก ๋๊ธด ๋ชจ๋  Promise ๊ฐ์ฒด๊ฐ resolve ํจ์๋ฅผ ํธ์ถํ๋ฉด then์ ์ง์ ํ ํจ์๋ฅผ ์คํํ๋ค.

(then์ ์ธ์๋ก ๋ชจ๋  Promise ๊ฐ์ฒด๊ฐ ์คํํ resolve ํจ์์ ์ธ์๊ฐ ๋ด๊ธด ๋ฐฐ์ด์ ๋ฐ๋๋ค.)

3. ์คํจ๋ก ๋๋ Promise ๊ฐ์ฒด๊ฐ ํ๋๋ผ๋ ์์ผ๋ฉด ๊ฐ์ฅ ๋จผ์  ์คํจ๋ก ๋๋ Promise ๊ฐ์ฒด์์ ์คํํ reject ํจ์์ ์ธ์๋ฅผ catch ํจ์์ ์ธ์๋ก ๋๊ธด๋ค.

#### - Promise.race

- ๊ฐ์ฅ ๋จผ์  ์ข๋ฃํ Promise ๊ฐ์ฒด์ ๊ฒฐ๊ณผ๋ง ๋ค์ ์์์ผ๋ก ๋ณด๋ธ๋ค. ๋๋จธ์ง ์์์ ์คํ๋๊ธด ํ์ง๋ง ๊ฐ์ฅ ๋จผ์  ์ข๋ฃํ ์์์ ๊ฒฐ๊ด๊ฐ๋ง ๋ฐํํ๋ค.

```javascript
Promise.race(iterable);
```

## โป๋ํ์์ ํ์

#### 1. alert (๊ฒฝ๊ณ  ๋ํ์์)

```javascript
alert("์๋ํ์ธ์");
```

#### 2. prompt(์๋ ฅ ๋ํ์์)

- ๋ ๋ฒ์งธ ์ธ์๋ก ์ด๊ธฐ๊ฐ์ ์ค์ ํ  ์ ์๋ค.
- prompt๊ฐ ๋ฐํํ๋ ๊ฐ์ ๋ฌธ์์ด์ด๋ฏ๋ก ์ซ์๊ฐ์ ๊ตฌํ๋ ค๋ฉด parseInt๋ parseFloat ์ด์ฉ

```javascript
var name = prompt("์ด๋ฆ์ ์๋ ฅํ์ธ์");
var name = prompt("์ด๋ฆ์ ์๋ ฅํ์ธ์", "ํ๊ธธ๋"); //์ด๊ธฐ๊ฐ ์ค์  ๊ฐ๋ฅ
```

#### 3. confirm(ํ์ธ ๋ํ์์)

- ๋ผ๋ฆฌ๊ฐ์ ๋ฐํํ๋ค
- `ํ์ธ`๋ฒํผ์ ๋๋ฅด๋ฉด `true`, `์ทจ์` ๋ฒํผ์ ๋๋ฅด๋ฉด `false`๊ฐ ๋ฐํ๋๋ค.

```javascript
var ret = confirm("์๋ ฅํ ๊ฐ์ด ๋ง์ต๋๊น?");
```

## โป ๋ณ๋์ CSS ํ์ผ์ ๋ง๋ค๊ณ  HTML ๋ฌธ์์ ์ฐ๊ฒฐํ๊ธฐ

- Style Sheet์ ๋ณ๋๋ก ๋ง๋ค๊ณ  HTML๋ฌธ์์ ์ฐ๊ฒฐ

  1. style.css ํ์ผ์ ๋ง๋ ๋ค

     ```
     h1 {
       color: red;
     }
     ```

  2. HTML๋ฌธ์์ ์ฝ๋๋ฅผ ์ถ๊ฐํ๋ค

     ```
     <link rel="stylesheet" href="style.css">
     ```

     - href ="ํ์ผ์ด ์๋ ๊ฒฝ๋ก"

       โ ="style.css" : HTML์ CSS๊ฐ ๊ฐ์ ํด๋ ๋ด์ ์์ ๊ฒฝ์ฐ

       โ ="css/style.css" : HTML์ด ์๋ ํด๋ ์์ CSS๋ผ๋ ํด๋๊ฐ ์๊ณ , ๊ทธ CSS ํด๋ ์์ style.css๊ฐ ์์ ๊ฒฝ์ฐ

       โ ="../style.css" : HTML์ด ์๋ ํด๋์ ๋ฐ์ style.css๊ฐ ์๋ ๊ฒฝ์ฐ

## โป document ๊ฐ์ฒด

- HTML ์์๋ฅผ ๊ฐ์ฒด ํํ๋ก ์ ๊ทผํ  ์ ์๋๋ก ํด์ค๋ค

  ex) document.body : <body>์์๋ฅผ ๋ฐํ

  โ document.forms : <form>์์๋ฅผ ๋ชจ๋ ๋ฐํ

- HTML ์์์ ๊ด๋ จ๋ ์์์ ๋์์ฃผ๋ ๋ค์ํ ๋ฉ์๋๋ฅผ ์ ๊ณตํ๋ค

## โป FormData ๊ฐ์ฒด

- Ajax๋ก ํผ ์ ์ก์ ๊ฐ๋ฅํ๊ฒ ํด์ฃผ๋ ๊ฐ์ฒด์ด๋ค.
  ๋ณดํต์ JSON ๊ตฌ์กฐ(KEY-VALUE)๋ก ๋ฐ์ดํฐ๋ฅผ ์ ์กํ์ง๋ง ์ด๋ฏธ์ง๋ฅผ ajax๋ก ์๋ก๋ํ  ๋ FormData ๊ฐ์ฒด๋ฅผ ์ฌ์ฉํ๋ค.

```
let formData = new FormData([form]);

  // HTML์ form ์์๊ฐ ์๋ ๊ฒฝ์ฐ, ํด๋น ํผ ์์์ ํ๋ ์ ์ฒด๊ฐ ์๋ ๋ฐ์๋๋ค.
```

- fetch ๋ฑ์ ๋คํธ์ํฌ ๋ฉ์๋๊ฐ FormData ๊ฐ์ฒด๋ฅผ ๋ฐ๋๋ก ๋ฐ๋๋ค.
  ์ด๋ ๋ธ๋ผ์ฐ์ ๊ฐ ๋ณด๋ด๋ HTTP ๋ฉ์์ง๋ ์ธ์ฝ๋ฉ๋๊ณ  Content-Type ์์ฑ์ multipart/form-data๋ก ์ง์ ๋ ํ ์ ์ก๋๋ค.

### FormData ๋ฉ์๋

- `formData.append(name, value)` : name๊ณผ value๋ฅผ ๊ฐ์ง ํผ ํ๋๋ฅผ ์ถ๊ฐํ๋ค.
- `formData.set(name, value)` : name๊ณผ value๋ฅผ ๊ฐ์ง ํผ ํ๋๋ฅผ ์ถ๊ฐํ๋ค.
  append์์ ์ฐจ์ด์ ์ set์ name๊ณผ ๋์ผํ ์ด๋ฆ์ ๊ฐ์ง ํ๋๋ฅผ ๋ชจ๋ ์ ๊ฑฐํ๊ณ  ์๋ก์ด ํ๋ ํ๋๋ฅผ ์ถ๊ฐํ๋ค.
  set ๋ฉ์๋๋ฅผ ์ฐ๋ฉด name์ ๊ฐ์ง ํ๋๊ฐ ๋จ ํ ๊ฐ๋ง ์๊ฒ ๋๋ค.
  - `formData.set(name, blob, fileName)`
- `formData.append(name, blob, fileName)` : `<input type="file">`ํํ์ ํ๋๋ฅผ ์ถ๊ฐํ๋ค.
  - fileName : ์ฌ์ฉ์๊ฐ ํด๋น ์ด๋ฆ์ ๊ฐ์ง ํ์ผ์ ํผ์ ์ถ๊ฐํ ๊ฒ์ฒ๋ผ ์ค์ ํด ์ค๋ค.
- `formData.delete(name)` : name์ ํด๋นํ๋ ํ๋๋ฅผ ์ญ์ ํ๋ค.
- `formData.get(name)` : name์ ํด๋นํ๋ ํ๋์ ๊ฐ์ ๊ฐ์ ธ์จ๋ค.
- `formData.has(name)` : name์ ํด๋นํ๋ ํ๋๊ฐ ์์ผ๋ฉด true๋ฅผ, ๊ทธ๋ ์ง ์์ผ๋ฉด false๋ฅผ ๋ฐํํ๋ค.

- ํผ์ name์ด ๊ฐ์ ํ๋ ์ฌ๋ฌ ๊ฐ๋ฅผ ํ์ฉํ๊ธฐ ๋๋ฌธ์ append ๋ฉ์๋๋ฅผ ์ฌ๋ฌ ๋ฒ ํธ์ถํด ์ด๋ฆ์ด ๊ฐ์ ํ๋๋ฅผ ๊ณ์ ์ถ๊ฐํด๋ ๋ฌธ์ ๊ฐ ์๋ค.

### FormData - ํ์ผ์ด ์๋ form ์ ์ก

- form์ ์ ์กํ  ๋ HTTP ๋ฉ์์ง์ Content-Type ์์ฑ์ ํญ์ multipart/form-data์ด๊ณ  ๋ฉ์์ง๋ ์ธ์ฝ๋ฉ๋์ด ์ ์ก๋๋ค.

### FormData - Blob ๋ฐ์ดํฐ๊ฐ ์๋ form ์ ์ก

- ์ด๋ฏธ์ง ๊ฐ์ ๋์ ์ผ๋ก ์์ฑ๋ ๋ฐ์ด๋๋ฆฌ ํ์ผ์ Blob ๊ฐ์ฒด๋ฅผ ์ฌ์ฉํด ์ฝ๊ฒ ์ ์กํ  ์ ์๋ค. Blob ๊ฐ์ฒด๋ fetch ๋ฉ์๋์ body ๋งค๊ฐ๋ณ์์ ๋ฐ๋ก ๋๊ฒจ์ค ์ ์๋ค.

> - ํผ์ ํ๋๋ฅผ ์ถ๊ฐํ๊ณ  ์ฌ๊ธฐ์ ์ด๋ฏธ์ง ์ด๋ฆ ๋ฑ์ ๋ฉํ๋ฐ์ดํฐ๋ฅผ ๊ฐ์ด ์ค์ด ๋๊ฒจ์ฃผ๋ ๊ฒ ์ข ๋ ํธ๋ฆฌํ๋ค.

```
let formData = new FormData();
formData.append("image", imageBlob, "image.png");

// ํผ์ <input type="file" name="image"> ํ๊ทธ๊ฐ ์๊ณ , ๋ก์ปฌ์ ํ์ผ๋ช์ด "image.png"์ธ imageBlob ๋ฐ์ดํฐ๋ฅผ ์ถ๊ฐํ ๊ฒ์ด๋ค.
```

## โป ๋ด์ฅํจ์

: ์๋ฐ์คํฌ๋ฆฝํธ์์ ๊ธฐ๋ณธ์ ์ผ๋ก ์ ๊ณตํ๋ ํจ์

### 1. eval()

- ๋ฌธ์๋ก ํํ๋ js ์ฝ๋๋ฅผ ์คํํ๋ ํจ์
  - `eval(string)`

```javascript
var a = "20 + 20";
eval(a);
// 40
```

### 2. parseInt()

- ๋ฌธ์ํ ๋ฐ์ดํฐ๋ฅผ ์ ์ํ ๋ฐ์ดํฐ๋ก ๋ณํ

  - `parseInt(String, radix)`

    โ radix : ๋ณํํ  ์ง์

```javascript
parseInt("7.0001"); //   7
parseInt("7 ๋ฌธ์์ด"); //  7
parseInt("๋ฌธ์์ด 7"); //  NaN
```

### 3. parseFloat()

- ๋ฌธ์ํ ๋ฐ์ดํฐ๋ฅผ ์ค์ํ ๋ฐ์ดํฐ๋ก ๋ณํ
  - `parseFloat(value)`

```javascript
parseFloat(" 7 "); // 7
parseFloat("7.0001"); // 7.0001
parseFloat("7 ๋ฌธ์์ด"); // 7
parseFloat("๋ฌธ์์ด 7"); // NaN
```

### 4. isNaN()

- ์ ๋ฌ๋ ๊ฐ์ด NaN์ธ์ง์ ์ฌ๋ถ๋ฅผ boolean์ผ๋ก ๋ฐํ
  - `isNaN(value)`

```javascript
isNaN(NaN); // true
isNaN("kashjd"); // true
isNaN(true); // false
isNaN(null); // false
isNaN(55); // false
```

### 5. isFinite()

- ์ ๋ฌ๋ ๊ฐ์ด ์ ํํ ์์ธ์ง boolean์ผ๋ก ๋ฐํ
  - `isFinite(value)`

```javascript
isFinite(Infinity); // false
isFinite(NaN); // false
isFinite(987654321); // true
isFinite(0); // true
```

### 6. String()

- ํด๋น ๊ฐ์ฒด๋ฅผ ๋ฌธ์์ด๋ก ๋ณํํ๋ ํจ์
  - `String(value)`

```javascript
var a = 5;
typeof a; // "number"
var b = String(a);
typeof b; // "string"
```

### 7. Number()

- ๋ฌธ์์ด์ ์ซ์๋ก ๋ณํ

- ์ซ์๋ก ๋ณํํ  ์ ์๋ ๊ฐ์ธ ๊ฒฝ์ฐ NaN์ ๋ฐํ

  - Number(object)

    โ object : ๋ฌธ์์ด ๋๋ ๋ฌธ์์ด์ ๊ฐ์ผ๋ก ํ๋ ๋ณ์

```javascript
var a = "1";
var b = "2";
var c = a + b; // 12
var d = Number(a) + Number(b); // 3
```

### 8. Boolean()

- ํด๋น ๊ฐ์ฒด๋ฅผ ๋ผ๋ฆฌํ์ผ๋ก ๋ณํํ๋ ํจ์
- Syntax: `Boolean(value)`

```javascript
Boolean(null); //  false
Boolean(5); //  true
Boolean("abc"); //  true
```

### 9. escape()

- ์๋ฌธ ์ํ๋ฒณ, ์ซ์, ์ผ๋ถ ํน์๋ฌธ์(@ , \* , - , \_ , . , /) ๋ฅผ ์ ์ธํ ๋ชจ๋  ๋ฌธ์๋ฅผ ์ธ์ฝ๋ฉํจ

```javascript
var set1 = ";,/?:@&=+$";
var set2 = "-_.!~*'()";
var set3 = "ABC abc 123";
escape(set1); //   %3B%2C/%3F%3A@%26%3D+%24
escape(set2); //   -_.%21%7E*%27%28%29
escape(set3); //   ABC%20abc%20123
```

### 10. unescape()

- escape() ๋ก ์ธ์ฝ๋ฉ๋ ๋ฌธ์๋ฅผ ๋์ฝ๋ฉํจ

```javascript
unescape("%3B%2C/%3F%3A@%26%3D+%24"); // ";,/?:@&=+$"
```

### 11. encodeURI()

- A-Z a-z 0-9 ; , / ? : @ & = + $ - \_ . ! ~ \* ' ( ) # ๋ฅผ ์ ์ธํ ๋๋จธ์ง ๋ฌธ์๋ฅผ escapeํจ

```javascript
var set1 = ";,/?:@&=+$";
var set2 = "-_.!~*'()";
var set3 = "ABC abc 123";
encodeURI(set1); //   ;,/?:@&=+$
encodeURI(set2); //   -_.!~*'()
encodeURI(set3); //   ABC%20abc%20123
encodeURI("๊ฐ๋๋ค"); //  %EA%B0%80%EB%82%98%EB%8B%A4
```

### 12. decodeURI()

- encodeURI()๋ก ์ธ์ฝ๋ฉ๋ ๋ฌธ์๋ฅผ ๋์ฝ๋ฉํจ

```javascript
decodeURI(";,/?:@&=+$"); //  ;,/?:@&=+$
decodeURI("%EA%B0%80%EB%82%98%EB%8B%A4"); //  ๊ฐ๋๋ค
```

### 13. encodeURICoponent()

- A-Z a-z 0-9 - \_ . ! ~ \* ' ( ) ๋ฅผ ์ ์ธํ ๋๋จธ์ง ๋ฌธ์๋ฅผ escapeํจ

```javascript
var set1 = ";,/?:@&=+$";
var set2 = "-_.!~*'()";
var set3 = "ABC abc 123";
encodeURIComponent(set1); //   %3B%2C%2F%3F%3A%40%26%3D%2B%24
encodeURIComponent(set2); //   -_.!~*'()
encodeURIComponent(set3); //   ABC%20abc%20123
encodeURIComponent("๊ฐ๋๋ค"); //   %EA%B0%80%EB%82%98%EB%8B%A4
```

### 14. decodeURIComponent()

- encodeURICoponent()๋ก ์ธ์ฝ๋ฉ๋ ๋ฌธ์๋ฅผ ๋์ฝ๋ฉํจ

```javascript
decodeURIComponent("%3B%2C%2F%3F%3A%40%26%3D%2B%24"); //  ;,/?:@&=+$
decodeURIComponent("%EA%B0%80%EB%82%98%EB%8B%A4"); //  ๊ฐ๋๋ค
```

## โป Math์ ํจ์

- Math.round() : ์๋ ฅ๊ฐ์ ๋ฐ์ฌ๋ฆผํ ์์ ๊ฐ์ฅ ๊ฐ๊น์ด ์ ์ ๊ฐ์ผ๋ก ๋ฐํ

- Math.pow(base, exponent) : `base^exponent` ( base์ exponent๋ฅผ ์ ๊ณฑํ ๊ฐ) ์ ๋ฐํ

  - base : ๋ฐ ๊ฐ

  - exponent : ๋ฐ ์ ์ ๊ณฑํ๊ธฐ ์ํด ์ฌ์ฉํ๋ ์ง์

## โป ํด๋ก์ 

\- ํจ์ ์์ ์ ์ธ๋ ๋ณ์๋ ์ง์ญ๋ณ์ ์ด๋ฏ๋ก ํจ์ ์ธ๋ถ์์ ์ฌ์ฉํ  ์ ์๋ค.
\- ํด๋ก์ ๋ ์ ๊ท์น์ ์๋ฐํ  ์ ์๋ค.
\- ํํ ํจ์ ๋ด์์ ํจ์๋ฅผ ์ ์ํ๊ณ  ์ฌ์ฉํ๋ฉด ํด๋ก์ ๋ผ๊ณ  ํ  ์ ์๋ค.
\- ์ ์ํ ํจ์๋ฅผ ๋ฆฌํดํ๊ณ  ์ฌ์ฉ์ ๋ฐ๊นฅ์์ ํ๋ค.

```javascript
<!DOCTYPE html>
<html>
<head>
    <script>
        // ํจ์๋ฅผ ์ ์ธํฉ๋๋ค.
        function test(name) {
            var output = 'Hello ' + name + ' .. !';
        }

        // ์ถ๋ ฅํฉ๋๋ค.(ํธ์ถ์๋จ)
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
        // ํจ์๋ฅผ ์ ์ธํฉ๋๋ค.
        function test(name) {
             let output = `Hello ${name} ...!`;

             return function() {
                   console.log(output);
              };
        }

        // ์ถ๋ ฅํฉ๋๋ค. ํธ์ถ๋จ
        test('JavaScript')();
    </script>
</head>
<body>

</body>
</html>
```

## โป ์ค์ฒฉํจ์์ ์๊ธฐํธ์ถ ์ต๋ชํจ์

### [1] ์ค์ฒฉ ํจ์

โ : **ํจ์ ๋ด๋ถ์ ์ ์๋ ํจ์**๋ฅผ ์ค์ฒฉ ํจ์ ๋๋ ๋ด๋ถ ํจ์๋ผ๊ณ  ํ๋ค

- ์ค์ฒฉ ํจ์๋ฅผ ํฌํจํ๋ ํจ์๋ ์ธ๋ถ ํจ์๋ผ ๋ถ๋ฅธ๋ค.

- ์ค์ฒฉ ํจ์๋ ์์ ์ ํฌํจํ๋ **์ธ๋ถ ํจ์**๋ฅผ ๋๋ **ํฌํผํจ์์ ์ญํ **์ ํ๋ค.

- ์ค์ฒฉํจ์๋ ์ธ๋ถํจ์์ ๋ณ์์ ์ ๊ทผ๊ฐ๋ฅํ๋ค.

- ํจ์ ์ ์ธ๋ฌธ์ ๊ฒฝ์ฐ if ๋ฌธ์ด๋ for๋ฌธ ๋ฑ์ ์ฝ๋ ๋ธ๋ก ๋ด์์๋ ์ ์ ๊ฐ๋ฅํ์ง๋ง ํธ์ด์คํ์ผ๋ก ์ธํด ํผ๋์ด ๋ฐ์ํ  ์ ์์ผ๋ฏ๋ก ๋ฐ๋์งํ์ง ์๋ค.

- ์ค์ฒฉ ํจ์๋ ์ค์ฝํ์ ํด๋ก์ ์ ๊น์ ๊ด๋ จ์ด ์๋ค๋ ๊ฒ์ ๊ธฐ์ต

```javascript
<script>
function outer(){ // ์ธ๋ถ ํจ์
  const x = 1;
  // ์ค์ฒฉ ํจ์, ๋ด๋ถํจ์
  function inner (){// ์ธ๋ถ ํจ์๋ฅผ ๋๋ ํฌํผ ํจ์ ์ญํ 
   // ์ธ๋ถ ํจ์์ ๋ณ์๋ฅผ ์ฐธ์กฐํ  ์ ์์
    const y = 3
   console.log(x + y);
  }
  inner()
}
outer()
</script>
```

### [2] ์๊ธฐํธ์ถ ์ต๋ชํจ์

- ์ต๋ชํจ์ : ๋ง๊ทธ๋๋ก ํจ์์ ์ด๋ฆ์ด ์๋ ํจ์๋ฅผ ๋งํฉ๋๋ค.
- ์๊ธฐํธ์ถ ์ต๋ชํจ์ : ๋ง๊ทธ๋๋ก ์๊ธฐ ์ค์ค๋ก๋ฅผ ํธ์ถํ๋ค๋ ์๋ฏธ์๋๋ค

```javascript
//์ต๋ชํจ์
function () {
...
}

// ์๊ดํธ๋ฅผ ์ฌ์ฉํ ์๊ธฐํธ์ถ ์ต๋ชํจ์

(function (a){
 ...
})('Hello')

//--------------------------------

(function (a){
 ...
}('Hello'))
```

\- ์๋ ์ค์ฒฉํจ์ ์์ ์ ๋ฌธ์ ๋ฅผ ์ต๋ช์ ์๊ธฐ ํธ์ถ ํจ์๋ก ํด๊ฒฐํ  ์ ์๋ค.

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
