# 자바 핵심 개념 정리 3
<details>
<summary>POJO란 무엇일까요?</summary>
<div markdown="1">

## POJO

> Plain Old Java Object
> <br>오래된 방식의 간단한 자바 오브젝트
 
- **특정 기술에 종속되어 동작하는 것이 아닌 가장 순수한 형태의 기본 자바 클래스** (자바 표준 기술만을 사용)
    - *ex: ORM 기술을 사용하기 위해 Hibernate를 직접 의존하면 POJO라고 할 수 없음*

### POJO 등장 배경

> 중량 프레임워크(Java EE)를 사용하면서 해당 프레임워크에 종속된 무거운 객체를 만들게 된 것에 반발하면서 등장
 
- 만연하게 사용된 Java EE의 EJB(Enterprise JavaBeans)와 프로그램 규모의 증가로 특정 기술과 환경에 대한 자바 코드의 의존성이 커짐
    - *EJB는 특정 클래스의 상속이나 인터페이스 구현이 필수적인(의존성 ⬆️) 등 복잡하고, 객체지향성을 감소시키는 단점을 가짐*
- 코드의 가독성이 떨어지고 프로그램을 유지보수, 확장하기 어려워짐
- POJO는 이러한 문제(EJB의 복잡성)을 해결하기 위해 등장
    - *POJO는 순수 자바 클래스이므로 특정 인터페이스 구현이나 어노테이션 추가 등이 필요하지 않음*
- 이후 POJO가 엔터프라이즈 환경에서의 개발을 위한 프레임워크에서 널리 사용되게 됨 → POJO 프레임워크 등장

### POJO 프레임워크

> POJO 클래스를 기반으로 하는 프레임워크 (POJO를 지향하는 프레임워크)

- **장점**
    - **객체 지향적인 설계/구현이 가능**
    - **테스트 용이**
    - 생산성 증가 (자바 표준 기술 사용으로 다른 기술과의 호환성 ⬆️)
- Hibernate, Spring Framework가 대표적인 POJO 프레임워크
- 스프링에서는 POJO 클래스를 Bean이라고 부름. 이러한 Bean을 스프링 컨테이너에 등록하고, DI를 이용해 POJO를 구현

</div>
</details>
<br>

<details>
<summary>제너릭이 무엇인가요? 컬렉션 클래스에서 제너릭을 사용하는 이유를 설명해 주세요.</summary>
<div markdown="1">

## 제너릭

> 다양한 타입을 다루는 메소드나 컬렉션 클래스를 컴파일할 때 타입 체크해주는 기능
> <br>compile-time type check

- **제너릭 클래스**

```java
class GenericClass<T> {
	T member;
}
```

- **제너릭 메소드**

```java
// 1. 리턴타입이 제너릭인 경우
public T getMember() {}
// 2. 인자가 제너릭인 경우, 메소드 앞에 <T> 필요
public <T> void genericMethod(GenericClass<T> generic) {}
```

- **와일드 카드** → 유연한 타입 사용 가능
    - `<? extends T>` : T와 T의 자식 클래스 타입
    - `<? super T>` : T와 T의 부모 클래스 타입

### 제너릭을 사용하는 이유

- **코드의 재사용성이 증가함**
    - 메소드나 컬렉션 클래스에서 사용할 데이터 타입을 원하는 대로 지정할 수 있음 → 다양한 타입에 대해 재사용 가능
- **타입 안정성을 보장함**
    - 컴파일 시 타입 검사를 하기 때문에 런타임 에러 발생 가능성이 감소함
- **코드의 가독성이 높아짐**
    - 메소드나 컬렉션 클래스에 사용할 객체 타입을 명시적으로 정의하므로 가독성이 향상됨
- **코드의 성능이 향상됨**
    - 형변환의 번거로움이 줄어들어 성능과 간결성이 증가함

### 제너릭 사용 시 주의사항

- 제너릭에는 Primitive type 사용 불가. Reference type만 사용 가능
- static 멤버에는 제너릭 타입 파라미터 사용 불가
- 배열은 제너릭 타입으로 생성 불가

</div>
</details>
<br>

<details>
<summary>자바의 클래스 멤버 변수 초기화 순서에 대해 알려주세요.</summary>
<div markdown="1">

## 자바 클래스 멤버 변수 초기화 순서

1. 클래스 멤버(static)
    - 맨 처음 클래스 로딩 시 초기화
    - 클래스 멤버 간 초기화 순서
        1. 기본값으로 초기화 (ex: `static int num;` 은 0으로 초기화)
        2. 명시적으로 초기화 (ex: `static int num = 10;`)
        3. 초기화 블록 실행 (ex: `static { num = 10; }`)
2. 인스턴스 멤버(non-static)
    - 객체 생성 시 초기화
    - 인스턴스 멤버 간 초기화 순서
        1. 기본값으로 초기화
        2. 명시적으로 초기화
        3. 초기화 블록 실행
        4. 생성자 실행

> 자료형별 기본값: boolean - `false` , char - `'\u000'` , reference type - `null` , 그 외 - `0`

</div>
</details>
<br>

<details>
<summary>직렬화란 무엇인가요?</summary>
<div markdown="1">

## 직렬화

> 데이터 구조(객체)를 바이트로 변환하는 과정

- 객체를 파일로 저장하거나 네트워크로 전송하기 위해 거쳐야 하는 과정
    - 서블릿 세션(세션을 따로 저장하는 경우), 캐시, 자바 RMI 등에서 사용
- 바이트를 다시 객체로 변환하는 역직렬화(Deserialization)까지 아울러서 직렬화라고 하기도 함

⚠️ 주의사항

- 중요한 정보는 암호화 후 직렬화해야 함
- 역직렬화 시 데이터 유효성 검증 수행 필수

### 자바에서의 직렬화

1. 직렬화할 대상 클래스에서 `java.io.Serializable` 인터페이스 구현 (`Serializable` 인터페이스 자체는 비어있음)
2. `java.io.ObjectOutputStream` 를 사용해 객체를 바이트 스트림으로 변환
    
    ```java
    // 예시 코드
    try {
    	// 직렬화된 데이터를 사용할 출력 스트림
    	ByteArrayOutputStream byteOut = new ByteArrayOutputStream ();
    	// 직렬화를 수행하는 스트림 (객체 -> 바이트 스트림)
    	ObjectOutputStream out = new ObjectOutputStream(byteOut);
      // 직렬화할 객체를 전달
    	out.writeObject(obj);
    	// 직렬화된 객체를 바이트 배열로 변환
    	byte[] serializedObj = byteOut.toByteArray();
    }
    ```
    

참고: **[Java의 직렬화(Serialize)란?](https://go-coding.tistory.com/101)**

</div>
</details>
<br>

<details>
<summary>[예습] SOLID에 대해 알아봅시다.</summary>
<div markdown="1">

## SOLID

> 객체 지향 설계 5대 원칙


1. **SRP (Single Responsibility Principle)**

> 하나의 클래스는 하나의 책임만 가져야 한다.

- 클래스가 하나의 책임만 가지면 해당 클래스의 변경에 의한 파급 효과가 줄어듦

2. **OCP (Open-Closed Principle)**

> 소프트웨어 요소는 확장에는 열려있지만, 변경에는 닫혀있어야 한다.
 
- 요구사항의 변경에도 기존 요소(클래스, 모듈, 함수, …)의 코드에는 수정이 없어야 함
- 새로운 기능을 추가할 때 기존 구현체를 변경하기 보다는 새 구현 클래스를 만드는 것이 좋음
- 구현체가 아니라 인터페이스에 의존하도록 코드를 작성하는 것이 선행되어야 함 (→ DIP)

3. **LSP (Liskov Substitution Principle)**

> 프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입 인스턴스로 바꿀 수 있어야 한다.
 
- 시스템의 변화 없이 하위 클래스가 상위 클래스를 대체하려면, 인터페이스에서 정의한 규약을 하위 클래스가 모두 지켜야 함
- 프로그램 코드 전체에 일관성이 생기고 유지보수가 용이해짐

4. **ISP (Interface Segregation Principle)**

> 하나의 범용 인터페이스보다 특정 클라이언트를 위한 인터페이스 여러 개가 낫다.
 
- 인터페이스는 하나의 책임만을 가져야 함 → 클라이언트에게 필요한 메소드만 정의
- 변경에 의한 파급 효과가 줄어듦

5. **DIP (Dependency Inversion Principle)**

> 구체화가 아닌 추상화에 의존해야 한다.

- 하위 레벨 모듈이 상위 레벨 모듈(추상화)에 의존해야 함 (실제 사용 관계가 변하는 것은 아님)
- 인터페이스에 맞게 코드를 작성하고, 구현체는 유연하게 변경

</div>
</details>
<br>

<details>
<summary>[예습] DI는 무엇일까요?</summary>
<div markdown="1">

## DI

> **Dependency Injection 
> <br>의존 관계 주입**
 
- 클라이언트 객체가 의존하는 객체를 외부에서 주입 받아 사용하는 것
- DI를 사용하지 않는 경우, 클라이언트 객체가 스스로 필요할 때 의존하는 서버 객체를 생성, 연결, 실행함
- **장점**
    - **정적인 클래스 의존 관계를 변경하지 않고, 동적인 객체 인스턴스 의존 관계만을 변경할 수 있음** → 유연성 ⬆️
    - 객체 간의 결합도와 의존성이 낮아짐 → 유지보수성과 재사용성 ⬆️
- **DI 컨테이너** : DI를 수행하는 곳 (→ 객체의 생성, 관리, 의존 관계 연결 등을 수행)
- DI를 통해 IoC(Inversion of Control)를 수행할 수 있음

### DI 구현 방법

스프링에서는 `@Autowired`를 이용해 DI를 자동으로 수행해줌

1. **생성자 주입 (Constructor Injection)**
    - **불변, 필수 의존관계**에서 주로 사용
    - 객체 생성과 동시에 의존관계가 주입됨
    - 대부분 의존관계는 불변해야 하고, 누락을 막아야 하기 때문에 생성자 주입 방식을 사용하는 것이 좋음
2. **Setter 주입 (Method Injection)**
    - **가변, 선택 의존관계**에서 주로 사용
    - 객체 생성 이후 나중에 의존관계를 주입함
3. **필드 주입 (Field Injection/Property Injection)**
    - 필드에 바로 의존관계를 주입하므로 코드가 간결함
    - DI 컨테이너 없이 동작이 불가능하기 때문에 사용하지 않는 것이 좋음

</div>
</details>
<br>
