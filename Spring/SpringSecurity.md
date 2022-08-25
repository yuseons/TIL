# 🔸 Spring Security

## Spring Security 란?

- Spring Security는 Spring 기반의 **애플리케이션의 보안(인증과 권한, 인가 등)을 담당**하는 스프링 하위 프레임워크이다.

- Spring Security는 인증(Authentication)과 인가(Authorization)를 Filter의 흐름에 따라 처리를 하고 있다.

- 보안과 관련해서 체계적으로 많은 옵션을 제공
  -> 일일이 보안 관련 로직을 작성하지 않아도 됨

<img  src="https://github.com/yuseons/TIL/blob/master/image/SpringSecurity.png">

## Filter

### 1. ServletContainer의 Filter

<img  src="https://github.com/yuseons/TIL/blob/master/image/Filter.png">

- 서블릿 컨테이너의 Filter는 Dispatch Survlet으로 가기 전에 먼저 적용된다.
- Filter들은 여러개가 연결되어 있어 Filter chain이라고도 불린다.
- 모든 Request들은 Filter chain을 거쳐야지 Survlet에 도착하게 된다.

### 2. Security의 Filter

<img  src="https://github.com/yuseons/TIL/blob/master/image/Filter2.png">

- Spring Security는 DelegatingFilterProxy 라는 필터를 만들어 메인 Filter Chain에 끼워넣고, 그 아래 다시 SecurityFilterChain 그룹을 등록한다.
  - URL에 따라 적용되는 Filter Chain을 다르게 한다.
  - 해당 Filter를 무시하고 통과하게 할 수도 있다.
- WebSecurityConfigurerAdapte
  - Filter chian을 구성하는 Configuration클래스로 해당 클래스의 상속을 통해 Filter Chain을 구성할 수 있다.
- `configure(HttpSecurity http)`를 override하여 filter들을 세팅한다.

## 인증(Authentication), 인가(Authorizatoin)

- Spring Security는 인증 절차를 거친 후에 인가 절차를 진행

- 인증(Authentication)
  - 해당 사용자가 본인이 맞는지를 확인하는 절차
- 인가(Authorization)

  - 인증된 사용자가 요청한 자원에 접근 가능한지 결정하는 절차
  - 사용자가 어떤 일을 할 수 있는지 권한 설정하는 절차

- Spring Security는 인증과 인가를 위해 Principal을 아이디로, Credential을 비밀번호로 사용하는 Credential 기반의 인증 방식을 사용한다.
  - Principal(접근 주체) : 보호받는 Resource에 접근하는 대상
  - Credential(비밀번호) : Resource에 접근하는 대상의 비밀번호

<br>

### Spring Security 의존성 추가

- spring security의 의존성이 **추가되지 않은 경우** 해당 url을 접속하였을 때 **아무런 보안, 인증 없이 접속이 가능**하다.
- security의존성을 추가하면 특정 url에 접속을 할 때 인증을 받게 된다.
