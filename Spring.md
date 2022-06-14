# 🔸Spring

## ◻ Framework

### [1] Framework란?

\- 프레임워크의 사전적 의미는 뼈대, 틀이고 소프트웨어 관점에서 접근하면 아키텍처에 해당하는 골격 코드이다.

\- 애플리케이션을 개발할 때 가장 중요한 것이 전체 애플리케이션의 구조를 결정하는 아키텍처인데, 이 아키텍처에 해당하는 골격 코드를 프레임워크가 제공한다.

\- 프레임워크를 이용하여 개발하면 개발자에게 모든 것을 위임하는 것이 아니라 애플리케이션의 기본 아키텍처는 프레임워크가 제공하고, 그 뼈대에 살을 붙이는 작업만 개발자가 한다.

### [2] Framework의 장점

\- 잘 만들어진 프레임워크를 사용하면 애플리케이션에 대한 분석, 설계, 구현 모두 재사용성이 증가하는데, 이를 통해 다음과 같은 장점을 얻을 수 있다.

#### 1. 빠른 구현 시간

\- 아키텍처에 해당하는 골격 코드를 제공받기 때문에 개발자는 비즈니스 로직만 구현하면 되고 제안된 시간에 많은 기능을 구현할 수 있다.

#### 2. 쉬운 관리

\- 같은 프레임워크가 적용된 애플리케이션들은 아키텍처가 같아서 관리가 쉽다.

 결과적으로 유지보수에 들어가는 인력과 시간도 줄일 수 있다.

#### 3. 개발자들의 역량 획일화

\- 숙련된 개발자와 초급 개발자는 지식과 경험이 달라 두 개발자의 소스의 품질은 다를 수밖에 없다.

 하지만 프레임워크를 사용하면 숙련된 개발자와 초급 개발자가 생성한 코드가 비슷하다.

\- 초급 개발자도 프레임워크를 통해서 세련되고 효율적인 코드를 생성해 낼 수 있다.

\- 관리자 입장에서 개발 인력을 더욱 효율적으로 구성할 수 있다.

#### 4. 검증된 아키텍처의 재사용과 일관성 유지

\- 프레임워크에서 제공하는 아키텍처를 사용하므로 아키텍처에 관한 별다른 고민이나 검증 없이 소프트웨어를 개발할 수 있다.

\- 개발된 시스템은 시간이 지나도 유지 보수 과정에서 아키텍처가 왜곡되거나 변형되지 않는다.

## ◻ Spring Framework

### [1] 스프링 프레임워크(Spring Framework)란?

: Spring Framework는 자바 플랫폼을 위한 오픈 소스 애플리케이션 프레임워크로서 스프링(Spring)이라고도 한다.

\- 스프링 프레임워크는 로드 존슨(Rod Johnson)이 2004년에 만든 오픈소스 프레임워크이다.

\- 스프링은 EJB(Enterprise Java Beans: 시스템 구현을 위한 서버 측 컴포넌트 모델) 컨테이너 사용으로 인한 개발 생산성과 유지 보수성 저하와 테스트와 배포의 어려움을 해결하기 위해 개발되었다.

\- 웹 개발에 주로 이용되는 다양한 모듈과 함께 좋은 객체지향 웹 애플리케이션을 개발할 수 있도록 도와준다.

\- 스프링 프레임워크는 많은 디자인 패턴을 적용되어 배포되므로 프레임 워크를 이용하는 것 자체가 디자인 패턴을 사용하는 것이다.

### [2] Spring Framework의 특징

#### 1. 경량(Lightweight)

\- 일반적인 J2EE 프레임워크 등 다른 프레임워크와 달리 객체 간의 관계를 구성할 때 별도의 API를 등을 사용하지 않고 기존에 존재하는 라이브러리 등을 사용하기에 객체가 가볍다.

#### 2. 제어 역행(IoC: Inversion of Control)

\- 기존엔 자바 애플리케이션을 개발할 때 자바 객체를 생성하고 서로 간 의존 관계를 연결 작업에 대한 제어권은 보통 개발되는 애플리케이션에 있었다.

\- Servlet, EJB 등을 사용하는 경우 Servlet Container, EJB Container에 제어권이 넘어가서 객체의 생명주기(Life Cycle)를 Container들이 전담하게 된다.

\- **IoC의 제어 역행**이란 **객체의 생성에서부터 생명주기의 관리까지 모든 객체에 대한 제어권이 바뀌었다는 것을 의미**한다.

\- 어떤 모듈이 사용할 모듈을 개발자가 결정하는 것이 아니라, 다른 모듈에게 선택권을 넘겨준다는 것을 의미한다.

 외부에서 필요한 객체를 결정하기 때문에 개발자는 직접 연결 처리를 할 필요가 없고, 인터페이스를 이용해서 편리하게 개발할 수 있다.

#### 3. 의존성 관리(DI : Dependency Injection)

- Dependency Injection : 프로그래밍에서 모듈 간의 의존성을 모듈의 내부가 아닌 외부(컨테이너)에서 주입시켜주는 기능으로, IoC(Inversion of Control, 제어의 역행)의 한 종류이다.

\- 의존성(Dependency)이라는 것은 하나의 객체가 다른 객체 없이 제대로 된 역할을 할 수 없다는 의미이다.

\- **각각의 계층이나 서비스들 간에 의존성이 존재할 경우 프레임워크가 자동으로 관리**한다.

![DI](https://github.com/yuseons/TIL/blob/master/image/DI.jpg))

#### 4. 관점 지향 프로그래밍(AOP : Aspect-Oriented Programming)

\- 트랜잭션이나 로깅, 보안과 같이 여러 모듈에서 공통적으로 사용하는 기능의 경우 해당 기능을 분리하여 관리할 수 있다.

\- 핵심적인 관점, 부가적인 관점으로 나누어서 보고 그 관점을 기준으로 각각 모듈화하는 것이다.

 기능을 핵심 관심 사항(Core Concern)과 공통 관심 사항(Cross-Cutting Concern)으로 분리시키고 각각을 모듈화한다

 부가 기능을 애스펙트(Aspect)로 정의하여, 핵심 기능에서 부가 기능을 분리함으로써 핵심 기능을 설계하고 구현할 때 객체지향적인 가치를 지킬 수 있게 도와주는 개념이다.

\- 공통 모듈의 반복적인 코드를 줄이고, 핵심 비즈니스 로직에만 집중할 수 있는 방법을 제공한다.

\- 코드 = **핵심 관심사항** + **횡단 관심사항**

 핵심 관심 : 시스템의 핵심 가치와 목적이 드러난 기존 비즈니스 로직

 횡단 관심 : 로깅이나 예외, 트랜잭션 처리 같은 코드같이 비즈니스 컴포넌트에 공통적으로 추가되고 실행되어야 하는 코드들

![AOP](https://github.com/yuseons/TIL/blob/master/image/AOP.jpg)

#### 5. 컨테이너

\- 컨테이너는 특정 객체의 생성과 관리를 담당하며 객체 운용에 필요한 기능을 제공한다.

\- 컨테이너는 일반적으로 서버 안에 포함되어 배포 및 구동된다.

\- 대표적인 컨테이너로는 Servlet 객체를 생성하고 관리하는 Servlet 컨테이너와 EJB 객체를 생성하고 관리하는 EJB 컨테이너가 있다.

\- Servlet 컨테이너는 톰캣 서버에도 포함되어 있다.

\- 애플리케이션 운용에 필요한 객체를 생성하고 객체 간의 의존관계를 관리한다는 점에서 스프링도 일종의 컨테이너라 할 수 있다.

### [3] Spring Framework의 문제점

\- 설정할 게 너무 많다.

\- 의존성 관리가 힘들다

\- 배포가 어렵다

## ◻ Spring Boot

\- 스프링은 다양한 기술들을 구현하기 위해 사용할 라이브러리가 많아졌고 그에 따라 관련
설정이 더욱 복잡해졌다.

이런 이유로 스프링을 처음 시작하는 사람들 대부분이 스프링의 복잡하고 방대한 설정
에 대해 부담을 느끼는 경우가 많다.

복잡한 설정은 필연적으로 오류를 발생할 가능성이 높다.

기존 스프링을 통한 개발의 이런 문제점을 해결하기 위해 스프링 부트가 탄생했다.

기존 스프링이 학습에 어려움이 있기에 쉽게 배울 수 있도록 개발된 것이 스프링 부트
이다.

\- 스프링 부트는 스프링을 쉽게 사용할 수 있도록 필요한 여러 가지 복잡한 설정을 대부분 미리 세팅 해놓았을 뿐만 아니라 WAS도 별도의 설정 없이 바로 웹 개발에 들어갈 수 있도록 해준다.

\- 개발자가 일일이 모든 설정을 할 필요 없이 자주 사용되는 기본 설정을 알아서 해준다.

### 스프링 부트의 특징

- 웹서버를 내장하고 있어 복잡한 외적인 환경 설정과 실행을 간소화 했다.
  따라서, 직접적인 개발과 상관이 적은 개발환경 설정보다는 개발 자체에 더 집중
  할 수 있다.

- 스프링 부트로 프로젝트 생성을 위해 제공하는 스타터는 필요한 라이브러리들을 관련된 것끼리 묶어서 패키지를 제공한다.

- 스프링 부트가 자동으로 관련된 라이브러리들을 다운로드하고 라이브러리 사이의
  의존성을 문제를 해결한다.

- 모든 빈( Bean)설정은 XML 이 아닌 어노테이션(annotation) 으로 처리한다.

- 기본으로 고정적인 환경 설정 값을 제공하지만, 설정값을 변경하고 싶다면 유연하고 신속하게 변경할 수 있다.
- 프로젝트의 커다란 클래스들에 공통적인 비-함수적(non-functional) 기능의 범위를 제공한다.
  - 임베디드 서버, 시큐리티, 매트릭스, 모니터링, 외부로 노출된 환경 설정값들이 이에 해당한다.
- XML 설정이 전혀 필요 없으며 어떠한 코드도 생성하지 않아도 된다.

## ◻ IoC(Invesion of Control)컨테이너

: 객체를 생성하고 관리하고 책임지고 의존성을 관리해주는 컨테이너

\- 인스턴스 생성부터 소멸까지의 인스턴스 생명주기 관리를 개발자가 아닌 컨테이너가 대신 해준다.

\- 객체관리 주체가 프레임워크(Container)가 되기 때문에 개발자는 로직에 집중할 수 있다.

### [1] IoC의 분류

- DL(Dependency Lookup) : 저장소에 저장되어 있는 Bean에 접근하기 위해 컨테이너가 제공하는 API를 이용하여 Bean을 Lockup한다.
- DI (Dependency Injection) : 각 클래스간의 의존관계를 빈 설정(Bean Definition) 정보를 바탕으로 컨테이너가 자동으로 연결해준다.
  - Setter Injection (수정자 주입)
  - Constructor Injection (생성자 주입)
  - Method Injection (필드 주입)

### [2] IoC 컨테이너의 종류

\- IoC 컨테이너(스프링 컨테이너)가 관리하는 객체를 빈(Bean)이라고 하고,

이 빈들을 관리한다는 의미로 컨테이너를 빈 팩토리(BeanFactory) 라고 부른다.

\- 객체의 생성과 객체 사이의 런타임 관계를 DI 관점에서 볼 때 컨테이너를 BeanFactory라고 한다.

\- BeanFactory에 여러가지 컨테이너 기능을 추가한 애플리케이션컨텍스트(ApplicationContext) 가 있다.

![img](https://blog.kakaocdn.net/dn/x4WUU/btq9gXndYek/CwB8xqIdfQh1ox2P9H6bV1/img.png)

## ◻ 클래스 유형

### [1] 결합도(Coupling)가 높은 클래스

\- 결합도란 하나의 클래스가 다른 클래스와 얼마나 많이 연결되어 있는지를 나타내는 표현이며,

결합도가 높은 프로그램은 유지 보수가 어렵다.

- SamsungTV와 LgTV의 시청에 필요한 필수 기능 네개가 있다.

- TVUser 클래스에서 두개 TV클래스를 사용하면 두 클래스의 메소드 원형이 다르기 때문에 TV 교체시 다 변경해야 하므로 유지보수가 힘들어 지고, TV교체를 결정하기 쉽지 않다.

```java
// SamsungTV.java

package coupling;

public class SamsungTV {
        public void powerOn() {
                System.out.println("SamsungTV.....전원 켠다.");
        }
        public void powerOff() {
                System.out.println("SamsungTV.....전원 끈다.");
        }
        public void volumeUp() {
                System.out.println("SamsungTV.....소리 올린다.");
        }
        public void volumeDown() {
                System.out.println("SamsungTV.....소리 내린다.");
        }

}
```

```java
// LgTV.java

package coupling;

public class LgTV {
        public void turnOn() {
                System.out.println("LgTV.....전원 켠다.");
        }
        public void turnOff() {
                System.out.println("LgTV.....전원 끈다.");
        }
        public void soundUp() {
                System.out.println("LgTV.....소리 올린다.");
        }
        public void soundDown() {
                System.out.println("LgTV.....소리 내린다.");
        }
}
```

```java
// TVUser

package coupling;

public class TVUser {

        public static void main(String[] args) {
                SamsungTV  tv = new SamsungTV();
                tv.powerOn();
                tv.powerOff();
                tv.volumeUp();
                tv.volumeDown();

                LgTV tv2 = new LgTV();
                tv2.turnOn();
                tv2.turnOff();
                tv2.soundUp();
                tv2.soundDown();
        }
}
```

### [2] 다형성 이용

\- 결합도를 낮추기 위해서 객체지향 언어의 핵심 개념인 다형성(Polymorphism)을 이용한다.

\- 다형성을 이용하려면 상속과 메소드 재정의(Overriding), 형변환이 필요하다.

![TV](https://github.com/yuseons/TIL/blob/master/image/TV.jpg))

\>> 결합도 높은 위의 예제를 수정한다.

```java
// TV.java

package polymorphism;

public interface TV {
   void powerOn() ;
   void powerOff();
   void volumeUp();
   void volumeDown();
}
```

```java
// SamsungTV.java

package polymorphism;

public class SamsungTV implements TV {

  public void powerOn() {
    System.out.println("SamsungTV.....전원 켠다.");
  }

  public void powerOff() {
    System.out.println("SamsungTV.....전원 끈다.");
  }

  public void volumeUp() {
    System.out.println("SamsungTV.....소리 올린다.");
  }

  public void volumeDown() {
    System.out.println("SamsungTV.....소리 내린다.");
  }
}
```

```java
// LgTV.java

package polymorphism;

public class LgTV implements TV {

  public void powerOn() {
    System.out.println("LgTV.....전원 켠다.");
  }

  public void powerOff() {
    System.out.println("LgTV.....전원 끈다.");
  }

  public void volumeUp() {
    System.out.println("LgTV.....소리 올린다.");
  }

  public void volumeDown() {
    System.out.println("LgTV.....소리 내린다.");
  }

}
```

```java
// TVUser.java

package polymorphism;

public class TVUser {

  public static void main(String[] args) {
    TV  tv = new SamsungTV();
    tv.powerOn();
    tv.powerOff();
    tv.volumeUp();
    tv.volumeDown();

    TV  tv2 = new LgTV();
    tv2.powerOn();
    tv2.powerOff();
    tv2.volumeUp();
    tv2.volumeDown();
  }
}
```

### [3] 디자인 패턴 이용

\- 결합도를 낮추는 또 하나의 방법으로 디자인패턴을 이용할 수 있다.

![tv2](https://github.com/yuseons/TIL/blob/master/image/TV2.jpg)

- TV를 교체할 때, 클라이언트 소스(TVUser.java)를 수정하지 않고

  TV를 교체 한다면 유지 보수는 더욱 편해진다.

- Factory패턴을 적용하여, 클라이언트에서 사용할 객체 생성을 캡슐화하여

  TVUser와 TV 사이를 느슨한 결합 상태로 만들어준다.

```java
// TV.java

package factory;

public interface TV {
   void powerOn() ;
   void powerOff();
   void volumeUp();
   void volumeDown();
}
```

```java
// SamsungTV.java

package factory;

public class SamsungTV implements TV {

  public void powerOn() {
    System.out.println("SamsungTV.....전원 켠다.");
  }

  public void powerOff() {
    System.out.println("SamsungTV.....전원 끈다.");
  }

  public void volumeUp() {
    System.out.println("SamsungTV.....소리 올린다.");
  }

  public void volumeDown() {
    System.out.println("SamsungTV.....소리 내린다.");
  }
}
```

```java
// LgTV.java

package factory;

public class LgTV implements TV {

  public void powerOn() {
    System.out.println("LgTV.....전원 켠다.");
  }

  public void powerOff() {
    System.out.println("LgTV.....전원 끈다.");
  }

  public void volumeUp() {
    System.out.println("LgTV.....소리 올린다.");
  }

  public void volumeDown() {
    System.out.println("LgTV.....소리 내린다.");
  }

}
```

```java
// BeanFactory.java

package factory;

public class BeanFactory {
  public static TV getBean(String beanName) {
    if(beanName.equals("samsung")) {
      return new SamsungTV();
    }else if(beanName.equals("lg")) {
      return new LgTV();
    }
    return null;
  }
}
```

```java
// TVUser.java

package factory;

public class TVUser {

  public static void main(String[] args) {
    TV  tv = BeanFactory.getBean(args[0]);
    tv.powerOn();
    tv.powerOff();
    tv.volumeUp();
    tv.volumeDown();

  }
}
```

### [4] 스프링 IoC 이용

- Ioc 컨테이너는 각 컨테이너에서 관리할 객체들를 위한 별도의 설정클래스(TVConfig.java)를 사용한다.

- 설정클래스는 HelloAppApplication 클래스와 같은 패키지에 만든다.

  - HelloAppApplication 클래스는 시작 클래스이며, 프로젝트가 시작될때
    설정클래스에서 생성된 빈을 가져와 사용한다.

- `@Configuration` 어노테이션이 붙은 클래스는 스프링 설정으로 사용됨을
  의미한다.

- `@Bean` 어노테이션이 붙은 메서드의 리턴값은 빈 객체로 사용됨을 의미한다.
- `@Bean(name="samsung")`은 빈으로 등록될 빈의 이름을 지정한다.
  별도이 이름을 지정하지 않으면 메서드 이름이 빈의 이름으로 등록된다.

![TV3](https://github.com/yuseons/TIL/blob/master/image/TV3.jpg)

```java
    // TV.java

    package ioc;

    public interface TV {
       void powerOn() ;
       void powerOff();
       void volumeUp();
       void volumeDown();
    }
```

```java
    // SamsungTV.java

    package ioc;

    public class SamsungTV implements TV {

      public SamsungTV() {
       System.out.println(">>>SamsungTV 객체 생성");
     }

      public void powerOn() {
        System.out.println("SamsungTV.....전원 켠다.");
      }

      public void powerOff() {
        System.out.println("SamsungTV.....전원 끈다.");
      }

      public void volumeUp() {
        System.out.println("SamsungTV.....소리 올린다.");
      }

      public void volumeDown() {
        System.out.println("SamsungTV.....소리 내린다.");
      }
    }
```

```java
    // LgTV.java

    package ioc;

    public class LgTV implements TV {

      public LgTV() {
        System.out.println(">>>> LgTV 객체 생성");
      }
      public void powerOn() {
        System.out.println("LgTV.....전원 켠다.");
      }

      public void powerOff() {
        System.out.println("LgTV.....전원 끈다.");
      }

      public void volumeUp() {
        System.out.println("LgTV.....소리 올린다.");
      }

      public void volumeDown() {
        System.out.println("LgTV.....소리 내린다.");
      }

    }
```

```java
    // com.example.demo.TVConfig.java

    package com.example.demo;

    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;

    import ioc.LgTV;
    import ioc.SamsungTV;
    import ioc.TV;

    @Configuration
    public class TVConfig {
        @Bean
        public TV lgCreate() {
            LgTV tv = new LgTV();

            return tv;
        }
        @Bean(name="samsung")
        public TV SamsungCreate() {

             return new SamsungTV();
        }

    }
```

```java
    // HelloAppApplication .java

    package com.example.demo;

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.context.ApplicationContext;
    import org.springframework.context.annotation.AnnotationConfigApplicationContext;

    import ioc.SamsungTV;
    import ioc.TV;

    @SpringBootApplication
    public class HelloAppApplication {

            public static void main(String[] args) {
                    SpringApplication.run(HelloAppApplication.class, args);

                    // 추가적인 입력 부분
                    // 1.IoC 컨테이너 생성
                    ApplicationContext context =
                            new AnnotationConfigApplicationContext(TVConfig.class);

                   // 2.LgTV Bean 가져오기
                    TV lg = (TV)context.getBean("lgCreate");
                    lg.powerOn();
                    lg.volumeUp();
                    lg.volumeDown();
                    lg.powerOff();

                    // 3.SamsungTV Bean 가져오기
                    TV samsung = (TV)context.getBean("samsung", SamsungTV.class);
                    samsung.powerOn();
                    samsung.volumeUp();
                    samsung.volumeDown();
                    samsung.powerOff();
            }

    }
```

## ◻ 스프링 부트 프로젝트의 주요 파일 및 구조

- src/main/java : 자바소스 폴더

- SampleApplication : 애플리케이션을 시작할 수 있는 main메소드가 존재하는 스프링 구성 메인 클래스

- src/main/resources/static : HTML, 스타일 시트, 자바스크립트, 이미지 등의 정적 리소스 폴더

- application.properties : 애플리케이션 및 스프링의 설정 등에서 사용할 여러 가지 프로퍼티 (property)정의

- Project and External Dependencies : Gradle에 명시된 프로젝트의 필수 라이브러리 모음

- src : JSP등 리소스 디렉토리

- build.gradle
  \- Gradle 빌드 명세, 프로젝트에 필요한 라이브러리 관리, 빌드 배포 설정

  \- 스프링 부트의 버전을 명시

  \- 자바 버전 명시

  - 의존성 옵션

    - implementation : 의존 라이브러리 수정시 본 모듈까지만 재빌드(재컴파일)
    - api : 의존 라이브러리 수정시 본 모듈을 의존하는 모듈들도 재빌드(재컴파일)
    - compileOnly : compile 시에만 빌드하고 빌드 결과물에는 포함하지 않음. runtime 시 필요없는 라이브러리인 경우 (runtime 환경에 이미 라이브러리 제공되고 있는가 하는 등의 경우)
    - runtimeOnly : runtime 시에만 필요한 라이브러리인 경우
    - providedRuntime : 실행시 제공되는 library
    - testImplementation : 테스트시 관련 library 제공

## ◻ Annotation

- Annotation은 **클래스와 메서드**에 추가하여 **다양한 기능**을 부여하는 역할을 한다.

- Annotation을 활용하여 Spring Framework는 해당 클래스가 어떤 역할인지 정하기도 하고,

  Bean을 주입하기도 하며, 자동으로 getter나 setter를 생성하기도 한다.

- 특별한 의미를 부여하거나 기능을 부여하는 등 다양한 역할을 수행한다.

- **코드량이 감소하고 유지 보수하기 쉬우며, 생산성이 증가**된다.

### @Component

- 개발자가 생성한 Class를 Spring의 Bean으로 등록할 때 사용한다.
- Spring은 해당 Annotation을 보고 Spring의 Bean으로 등록한다.

`@Component("TV")`: 컨테이너가 객체를 생성 해준다. Bean 이름은 TV로 등록된다.

### @ComponentScan

- 컴포넌트 클래스를 검색하고 검색된 컴포넌트 및 클래스를 스프링 애플리케이션 컨텍스트에 등록한다.
- Spring Framework는 @Component, @Service, @Repository, @Controller, @Configuration 중 1개라도 등록된 클래스를 찾으면, Context에 bean으로 등록한다.

### @Bean

- 개발자가 제어가 불가능한 외부 라이브러리와 같은 것들을 Bean으로 만들 때 사용한다.

### @Controller

- Spring에게 해당 Class가 Controller의 역할을 한다고 명시할떄 사용한다.

### @Qualifier

- 동일한 인터페이스를 구현한 클래스가 여러개 있는 경우 이름을 지정하여 명확하게 클래스를 인식할 수 있다.

### @RequestHeader

- Request의 header값을 컨트롤러 메서드의 파라미터로 전달한다.
- 메서드 파라미터가 String가 아니라면 타입변환을 자동으로 적용한다.
- 헤더가 존재하지 않으면 에러가 발생한다.
- required 속성을 이용해 필수여부를 설정할 수 있다.
- defaultValue 속성을 이용해 기본 값을 설정할 수 있다.

### @RequestMapping

- `@RequestMapping(value=”“)`
- 웹브라우저 주소창에 url를 입력하면 이 어노테이션에 등록된 메서드가 호출된다.
- Class 단위에 사용하면 하위 메소드에 모두 적용된다.
- 메소드에 적용되면 해당 메소드에서 지정한 방식으로 URI를 처리한다.

### @PathVariable

- Parameter를 URL형식으로 받기  

### @RequestParam 

- @RequestParam은 1개의 HTTP 요청 파라미터를 받기 위해서 사용한다. 

- Form페이지에서 넘어오는 파라미터를 받을수 있다. 

- ```java
     public String edit( @RequestParam("id") int id,  
                         @RequestParam("title") String title,  
                         @RequestParam("file") MultipartFile file ) {...}     
    ```
  
- URL파라미터로 전달받은 value를 메서드의 파라미터로 받을 수 있게 해준다.

  - EX) `/web?name="value"`  => url이 전달될 때 name 파라미터(name에 담긴 value)를 받아오게 된다.

- @RequestParam은 필수 여부가 true이기 때문에 기본적으로 반드시 해당 파라미터가 전송되어야 한다.

- 해당 파라미터가 없다면 HTTP 400 - Bad Request 가 전달된다. 

  - 이를 방지하고자 default 값을 설정해 준다.

   

- 파라미터가 필수가 아니라면 required = false 로 지정하면 된다.  

- 파라미터가 없으면 NULL이 들어가며, default로 받을 값을 defaultValue 옵션을 통해 설정할 수도 있다.

- ```java
  public void view( @RequestParam(value = "id",  
                                  required = false,  
                                  defaultValue = "0" )  int id) {..}.     
  
  ```

  
  
- @RequestParam을 생략하여 사용할수 있다.

  - Map타입으로 데이터를 받을경우는 반드시 @RequestParam을 명시해야 데이터를 받아온다.

  - ```java
      <input type="text" name="id" /><br>
      <input type="password" name="passwd" /> 
            
      public String add( @RequestParam Map<String, String> params ) {...} 
    ```

### @RequestBody

- 클라이언트가 보내는 HTTP 요청 본문(JSON 및 XML 등)을 Java 오브젝트로 변환한다.
- HTTP 요청 본문 데이터는 Spring에서 제공하는 HttpMessageConverter를 통해 타입에 맞는 객체로 변환된다.

### @ModelAttribute

- 클라이언트가 보내는 HTTP 파라미터들을 Object(DTO) 형태로 받을때 사용
- `/modelattribute?name=req&age=1` 같은 Query String 형태 혹은 요청 본문에 삽입되는 Form 형태의 데이터를 처리한다.
- @RequestBody가 json을 받는 것과 달리 @ModenAttribute 의 경우에는 json을 받아 처리할 수 없다.

### @ResponseBody

- @ResponseBody은 메소드에서 리턴되는 값이 View 로 출력되지 않고 HTTP요청의 바디내용으로 매핑하여 클라이언트로 전송한다.

- @ResponseBody 가 붙은 파라미터가 있으면 HTTP요청의 미디어타입과 파라미터의 타입을 먼저 확인한다.

- html 태그없이 문자열 데이터만 응답된다 (Json, xml등 Rest Api형태 응답)

### @Autowired

- 스프링 DI에서 사용되는 어노테이션이다.
- 의존성 주입을 할 때 사용하는 Annotation으로 의존 객체의 타입에 해당하는 bean을 찾아 주입하는 역할을 한다.
- @Autowired는 필드, 생성자, Setter에 붙일 수 있다.
  - 단, @Autowired를 필드, Setter에 붙여서 사용할 경우 반드시 기본 생성자가 정의되어 있어야 한다.
- 스프링에서 Bean 인스턴스가 생성된 이후 @Autowired를 설정한 메서드가 자동으로 호출되고, 인스턴스가 자동으로 주입된다.
- Spring Framework가 Class를 보고 Type에 맞게(Type을 먼저 확인 후, 없으면 Name 확인) Bean을 주입한다.

- @Type을 통한 주입

  - @Autowired 가 Type으로 찾아서 주입하므로 동일한 Bean 타입의 객체가 여러개 있을 경우, Bean을 찾기 위해 @Qualifier 어노테이션을 같이 사용해야 한다.

- <context:component scan > 태그
  - @Autowired로 의존 관계를 주입받을 경우, 해당 클래스 (@Autowired당하는 클래스) 를 반드시 Component Auto Scanning을 설정해야 한다
  - Component Auto Scanning 코드

```
<context:component-scan base-package="factory.userfactory" />
```



### @SessionAttributes 

- 세션상에서 model의 정보를 유지하고 싶을 경우 사용한다.



### - @RequestMapping , @GetMapping , @PostMapping

#### [1] @RequestMapping

- 클래스와 메서드 모두에서 사용한다.
  - 대부분의 경우 메소드 레벨에서 애플리케이션은 HTTP 메소드 특정 변형 @GetMapping, @PostMapping, @PutMapping, @DeleteMapping 또는 @PatchMapping 중 하나를 사용하는 것을 선호한다.

#### [2] @GetMapping

- 메소드에만 사용한다.
- HTTP GET 요청을 특정 핸들러 메소드에 맵핑하기위한 Annotation으로, **주소에 파라미터가 노출 된다. **

#### [3]@PostMapping

- @PostMapping은 **주소에 파라미터가 노출되지 않는다.**

![get,post](https://github.com/yuseons/TIL/blob/master/image/get%2Cpost.png)



## ◻ 의존성 관리

### 스프링의 의존성 관리 방법

- 스프링 프레임워크는 객체 생성과 의존관계를 컨테이너가 자동으로 관리한다.
- 스프링 IoC의 핵심 원리이고 두 가지 형태로 지원한다.

![Dependency Injection](https://github.com/yuseons/TIL/blob/master/image/Dependency%20Injection.jpg)

- Dependency Lookup : 컨테이너가 객체생성하고 클라이언트가 검색(Lookup)하여 사용하는 방식
- 대부분의 실제 애플리케이션 개발과정에선 Dependency Injection을 사용한다.
- Dependency Injection : 객체 사이의 의존 관계를 프로그램 코드에 포함된 어노테이션 정보를 바탕으로 컨테이너가 자동으로 처리해 준다.
- 의존성 설정을 바꾸고 싶을 땐 프로그램 코드의 어노테이션 정보만 수정하여 변경사항을 적용할 수 있어 유지 보수가 향상된다.



## ◻스프링 MVC의 주요 구성 요소 

\- MVC 패턴의 구조는 Model, Controller, View 세 가지로 나누어 진다.

\- Model: 비즈니스 로직과 DB 등에 대한 처리를 수행한다.

\- Controller : 뷰와 모델을 이어주는 역할을 맡는다. 

뷰의 요청에 따라 모델의 상태를 바꾸고, 이를 다시 뷰에 전달한다.

\- View : 사용자에게 보이는 영역이다. 

컨트롤러를 통해 모델에 질의를 보내고, 그 값을 사용자에게 적절하게 보여준다.



### - Spring 웹 계층

\- 스프링에는 5가지 요소가 존재한다.

![SpringWebLayer](https://github.com/yuseons/TIL/blob/master/image/SpringWebLayer.jpg)

#### 1. Web Layer

- 외부 요청과 응답에 대한 전반적인 영역이다.

- 컨트롤러(@Controller)와 JSP/Freemarker 등의 뷰 템플릿 영역이다.
- 이외에도 필터(@filter), 인터셉터, 컨트롤러 어드바이스 등 외부 요청과 응답에 대한 전반적인 영역도 Web Layer에 포함된다.


#### 2. Service Layer

- 서비스 영역(@Service)이다.

- Web Layer와 Repository Layer를 연결하는 역할을 하며, 두 계층이 직접적으로 연결되지 않게 한다.
  - 일반적으로 컨트롤러와 저장소(Repository, Dao)의 중간에 위치한다.

- 트랜잭션(@Transactional, 데이터베이스의 상태를 변환시키는 하나의 논리적 기능을 수행하기 위한 작업의 단위)이 사용되어야 하는 영역이다.


#### 3. Repository Layer

- 데이터베이스와 직결되는 계층으로, DB와 같은 데이터 저장소(repository)에 접근하는 영역이다.
- DAO 혹은 @Repository 어노테이션을 사용한 DAO 구현 클래스가 이 계층에 속한다.
- DB에 데이터를 CRUD(Create, Read, Update, Delete)하는 곳이다.
  

#### 4. DTOs

- DTO(Data Transfer Object)는 단순히 데이터를 저장하는 컨테이너로, 계층 간의 데이터 교환을 위한 객체이다.
  - DTOs는 이들이 존재하는 영역을 의미한다.
- 주로 DB에서 데이터를 받아 Service 혹은 Controller 등으로 보낼 때 사용한다. 
- Repository Layer에서 결과로 넘겨 준 객체 등이 DTO에 해당한다.


#### 5. Domain model

- 개발 대상, 즉 도메인을 모든 사람이 동일한 관점에서 이해할 수 있고 공유할 수 있도록 단순화한 것을 도메인 모델이라고 한다.
  - 예를 들어, 택시 앱의 배차, 탑승, 요금 등이 도메인에 해당한다.
- JPA를 사용한다면, @Entity가 사용되는 영역 역시 도메인 모델이라 할 수 있다.
- 무조건 데이터베이스의 테이블과 관계가 있어야 하는 것은 아니다. VO처럼 값 객체들도 이 영역에 해당하기 때문이다.



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
- DB설정및 mapper 설정 등을 한다.
- DB 설정은 별도의 properties 파일로 분리할 수 있다.
- mapper는 SQL query를 xml문서로 분리한 것이다.

 

#### 2. 매퍼(Mapper)

- 두 가지 종류의 매퍼로 정의할 수 있다.
- 첫째,  SQL을 XML에 정의된 XML파일로 생성한다.
- 두번째, SQL을 메소드에 어노테이션으로 정의한 인터페이스로 생성한다.



#### 3. 매핑구문(Mapped Statements)

- SQL을 DB에 실행할 구문을 의미한다.

- 매핑 구문은 어노테이션 정의 방법과 XML정의 방식 두 가지가 있다.



#### 4. Mybatis Java API

- SqlSession은 Mapper xml에 등록된 SQL구분을 실행한다.

- SqlSession 객체는 SQL구분을 실행하기 위한 여러가지 메소드를 제공한다. 

  selectOne(), selectList(), insert(), update(), delete() 등
