// 20220801_20220911

# Weekly I Learned (1 WEEK)

## 배운것

### API(Application Programming Interface)
#### 객체지향 5원칙
#### REST (Representational State Transfer-ful API)

> 자바를 할 수록 캡슐화, 은닉화를 구현해야 하는 많은 개발자들의 고충을 더 알 수 있게된다.


### JWT(JSON Web Token)
#### 정의
- 전자 서명 된 URL-safe (URL로 이용할 수있는 문자 만 구성된)의 JSON
-  RFC7519 표준
-  서버와 클라이언트 간 정보를 주고 받을 때 Http 리퀘스트 헤더에 JSON 토큰을 넣은 후 서버는 별도의 인증 과정없이 헤더에 포함되어 있는 JWT 정보를 통해 인증합니다.

[JWT (JSON Web Token) 이해와 활용](http://www.opennaru.com/opennaru-blog/jwt-json-web-token/)

> 아무래도 회원가입, 로그인, 로그아웃 기능을 구현이 중점인 만큼 json을 이용한 쿠키 토큰의 사용 방식을 알고 가는 것이 중요했다.

## 느낀 것
 신입 개발자에게 새로운 프로젝트를 모르는 언어로 던져주었을 때, 1주차와 같은 기분을 느낄 수 있을 것이다. 사실 이러한 것은 흔한 일이기 때문에 단련이 된다고 생각하면 단단해진 느낌이다. 언어부터(파이썬은 알고 있었지만), 프레임워크(플라크스는 모르는 상태)까지 처음부터 시작하는 프로젝트를 완성하는 개발자들의 썰을 우리는 익숙하게 알고 있다. 왜냐하면 인력과 시간이 부족하니까. 거기에 갈아 넣어지는 팀원과의 소통과 지루함, 촉박함까지 느낄 수 있었다. 사실 개발자는 이러한 직업군이라는 것을 알고 왔지만 그래도 힘들었던 주였다.  

## 내게 아쉬웠던 것

 다른 조에 비해서 기능과 구현율이 현저하게 떨어진다. 코드 재사용을 목적으로 만들어진 프로젝트라서 더욱 그랬다. 처음에 팀장으로서의 판단 미스일지도 몰랐을 것이다. 하지만 개발 일정과 팀원들의 경험, 성격, 대화를 종합해볼 때 나쁜 판단은 아니었음을 다시 한번 느낀다. 
 
 
 
---
 
 
 
# Weekly I Learned (2 WEEK) - 알고리즘 집중 주

## 느낀 점
자바를 1년만에 쓰는 것이라 걱정했었는데 알고리즘을 구현하면서 다시 금방 쓸 수 있게 되었다. 평소대로 알고리즘을 풀었는데 그 양이 조금 많은 편이었다.  

다만 아쉬웠던 것이 테스트에 합격 못해도 퇴소 권고를 받지 않는다는 조항이 있어서 그것때문에 시험이 어렵게 나올 것이라고 생각했지만 그러지 않은 편이었다.   

1주차와 마찬가지로 자율학습과 자기주도적 학습에 맡기는 것이여서 자습과 다름없는 시간이라고 느낄 무렵, 기술 매니저들의 순찰과 상담이 도움이 되었다.  

## 개념 정리

### Object-oriented programming

> 내가 생각하기에 현실의 모든 것을 객체로 개념화하여 표현하는 프로그래밍이다.

#### wiki
> "객체"들의 모임으로 파악하고자 하는 것이다. 각각의 객체는 메시지를 주고받고, 데이터를 처리할 수 있다. // 사람이 말로 표현 가능한 모든 것을 객체라 할 수 있다. 
> based on the concept of "objects", which can contain data and code

- 자료 추상화, 상속, 다중 상속, 다형성 개념, 동적 바인딩

### JVM(Java virtual machine)

![image](https://user-images.githubusercontent.com/59364300/184521712-b11ac8a6-69fe-4fe5-9f00-7c00fc64e108.png)

>  자바 바이트코드는 플랫폼에 독립적이며 모든 자바 가상 머신은 자바 가상 머신 규격에 정의된 대로 자바 바이트코드를 실행한다. 따라서 표준 자바 API까지 동일한 동작을 하도록 구현한 상태에서는 이론적으로 모든 자바 프로그램은 CPU나 운영 체제의 종류와 무관하게 동일하게 동작할 것을 보장한다. 

- ensures interoperability
![image](https://user-images.githubusercontent.com/59364300/184520785-1f408b0a-85b0-46e6-b3c9-d59d7c5da35c.png)

- HotSpot (virtual machine) // Java HotSpot Performance Engine
> via methods such as just-in-time compilation and adaptive optimization. 

## Ref
### OOP
- https://en.wikipedia.org/wiki/Object-oriented_programming


### JVM  
- https://en.wikipedia.org/wiki/Java_virtual_machine  
- https://ko.wikipedia.org/wiki/%EC%9E%90%EB%B0%94_%EA%B0%80%EC%83%81_%EB%A8%B8%EC%8B%A0




---




# Weekly I Learned (3 WEEK)

## 느낀 점

> 스프링의 기보적인 개념과 사용법에 학습시간이 늘었다. 하지만 드디어 무언가 핵심적인 것을 하는 생각에 의욕이 났던 주였다. 기본적으로 코딩테스트를 하루에 하나씩 하고 싶었지만 
> 막상 하루가 지날 수록 많아지는 새로운 것들에 의해 자료를 읽어야 하는 일이 많아졌다. 몰입을 위해서 계속해서 자료를 읽어야할 때도 있었다. 

> 막상 코드를 짜보니 이해가 되었고, 여러번 동일한 코드를 타이핑하니 더욱 이해가 되었던것 같다.

## 키워드 정리
### DI ( Dependency Injection )
- 객체를 직접 생성하는 게 아니라 외부에서 생성한 후 주입 시켜주는 방식
> 생성자나 new로 메모리에 할당하는 것이 아닌 싱글톤인 bean을 끌어다가 주입시켜주는 의미로 이해 

### IoC (Inversion of Control)
- 메소드나 객체의 호출작업을 개발자가 결정하는 것이 아니라, 외부에서 결정되는 것을 의미
> IOC 컨테이너가 관리하는 bean이 결정하는 것으로 이해

### Bean
- 스프링 컨테이너에 의해 관리되는 자바 객체(POJO)
> 스프링 컨테이너) 스프링 빈의 생명 주기를 관리하며, 생성된 스프링 빈들에게 추가적인 기능을 제공하는 역할을 한다.


## Ref
- https://velog.io/@gillog/Spring-DIDependency-Injection
- https://steady-coding.tistory.com/594




---



# Weekly I Learned (4 WEEK)

## 느낀 점
사실 스프링 부트를 시작했을 때부터 당황했다.. 이것을 정말 내가 해야하는 가?라는 물음이 생겼다..

## 개념 정리

### ORM
> Object–relational mapping
> 데이터베이스와 객체 지향 프로그래밍 언어 간의 호환되지 않는 데이터를 변환하는 프로그래밍 기법이다.

#### 장점
- 객체 지향적인 코드로 인해 더 직관적이고 비즈니스 로직에 더 집중할 수 있게 도와준다.
- 재사용 및 유지보수의 편리성이 증가한다.
- DBMS에 대한 종속성이 줄어든다.

#### 단점       
- 완벽한 ORM 으로만 서비스를 구현하기가 어렵다.
- 프로시저가 많은 시스템에선 ORM의 객체 지향적인 장점을 활용하기 어렵다.
      

- https://gmlwjd9405.github.io/2019/02/01/orm.html

### SQL
> Structured Query Language

- 데이터 정의 언어 (DDL : Data Definition Language)
- 데이터 조작 언어 (DML : Data Manipulation Language)
- 데이터 제어 언어 (DCL : Data Control Language)


### MVC

> Model, View, Controller

- Model View Controller (모델 뷰 컨트롤러)
- SW Architecture Design Pattern (SW 아키텍처 디자인 패턴)
- separates application functionalities (애플리케이션 기능 분리)
- promotes organized programming (조직화된 프로그래밍 작성)


- https://hanamon.kr/mvc%EB%9E%80-mvc-design-pattern/




---


# Weekly I Learned (5 WEEK)


## 느낀 점

코드를 가져다가 쓰는 것이 아니라 자신이 직접 타이핑하면서 연습해야 늘겠다 생각이 들었다.


## CORS
- (Cross Origin Resurce Sharing)

교차 출처 리소스 공유는 추가 HTTP 헤더를 사용하여, 한 출처에서 실행 중인 웹 애플리케이션이 다른 출처의 선택한 자원에 접근할 수 있는 권한을 부여하도록 브라우저에 알려주는 체제입니다. 웹 애플리케이션은 리소스가 자신의 출처(도메인, 프로토콜, 포트)와 다를 때 교차 출처 HTTP 요청을 실행합니다.


### Setting option

- 프론트 : withCredentials : true
- 서버 : Access-Control-Allow-Credentials : true



### ETC

- SOP(Same Origin Policy)




---


# Weekly I Learned (6 WEEK)

## 첫 협업을 하며 느낀 점 

### 스스로 아쉬웠던 점
- 쉴세없이 업데이트 되는 master 브런치에 pull을 주기적으로 하지 못한 것.


### 보완하고 싶은 점
- 깃 컨벤션을 연습하는 것.
