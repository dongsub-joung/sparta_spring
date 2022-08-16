# 3주차 Posting backend server 만들기 구현체 평가 목록

## 수정, 삭제 API의 request를 어떤 방식으로 사용하셨나요? (param, query, body)
### 수정
Update 매서드를 Service 클래스에서 구현하여 controller에서 사용해 랜더링하였다. 로직은 서비스에 실제로 움직이는건 컨트롤러에서 움직였다.
### 삭제
삭제의 경우 따로 나누어 구현하지 않았다.

---

## 어떤 상황에 어떤 방식의 request를 써야하나요?
![image](https://user-images.githubusercontent.com/59364300/184714527-74bee718-0ff4-446d-8473-e6fe36a1a616.png)

- DispatcherServlet
- HandlerMapping 

- [Ref](https://ibocon.tistory.com/208)

---

## RESTful한 API를 설계했나요? 어떤 부분이 그런가요? 어떤 부분이 그렇지 않나요?
- Representational State Transfer API

>    자원(Resource) - URL
>   행위(Verb) - Http Method
>    표현(Representations)

- [Ref]([https://ibocon.tistory.com/208](https://velog.io/@somday/RESTful-API-%EC%9D%B4%EB%9E%80))

---

## 적절한 관심사 분리를 적용하였나요? (Controller, Repository, Service)
delet를 service로 extract하는 것이 어떨까 생각이 들었다.

---

## 작성한 코드에서 빈(Bean)을 모두 찾아보세요!
`@Component`를 상속받은 클래스들은 Bean이다. 컴포넌트 스캔이 차례대로 빈에 추가해준다.


## API 명세서 작성 가이드라인을 검색하여 직접 작성한 명세서와 비교해보세요!
