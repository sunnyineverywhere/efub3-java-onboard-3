# 자바 핵심 개념 정리 3
<details>
<summary>POJO란 무엇일까요?</summary>
<div markdown="1">
POJO(Plain Old Java Object)는 오래된 방식의 간단한 자바 오브젝트라는 말로서, Java EE 등의 중량 프레임워크들을 사용하게 되면서 
해당 프레임워크에 종속된 '무거운' 객체를 만들게 된 것에 반발해서 사용하게 된 용어이다.<br>
즉, POJO는 단순한 자바 오브젝트를 의미하며, 객체지향적인 원리에 충실하면서 환경과 기술에 종속되지 않고 필요에 따라 재활용될 수 있는 방식으로 설계된 오브젝트이다.
</div>
</details>
<br>

<details>
<summary>제너릭이 무엇인가요? 컬렉션 클래스에서 제너릭을 사용하는 이유를 설명해 주세요.</summary>
<div markdown="1">
제너릭(Generic)은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법이다. 
사용자 호출에 의해 타입이 지정되기 때문에 하나의 값이 데이터 형식에 의존하지 않고 여러 데이터 타입을 가질 수 있다. 
제너릭은 클래스 외부에서 타입을 지정해주기 때문에 관리가 편하며, 코드의 재사용성을 높여준다는 장점이 있다.<br>
컬렉션(Collection)은 객체를 쉽게 삽입, 삭제, 검색할 수 있는 가변 크기의 컨테이너이다. 
컬렉션 클래스는 제너릭으로 구현되어 특정 타입이 아닌 여러 타입으로 변환이 가능하고, 잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 방지한다.
</div>
</details>
<br>

<details>
<summary>자바의 클래스 멤버 변수 초기화 순서에 대해 알려주세요.</summary>
<div markdown="1">
<클래스 변수의 초기화><br>
: 클래스가 처음 메모리에 로딩될 때 단 한 번 차례대로 수행<br>
기본값 -> 명시적 초기화 -> 클래스 초기화 블록<br>
<인스턴스 변수의 초기화><br>
: 인스턴스를 생성할 때마다 차례대로 수행<br>
기본값 -> 명시적 초기화 -> 인스턴스 초기화 블록 -> 생성자<br>

* 명시적 초기화: 변수를 선언과 동시에 초기화하는 것
* 초기화 블록: 명시적 초기화보다 복잡한 초기화 작업에 사용됨
</div>
</details>
<br>

<details>
<summary>직렬화란 무엇인가요?</summary>
<div markdown="1">
직렬화(Serialize)는 자바 시스템 내부에서 사용되는 Object 또는 Data를 외부의 자바 시스템에서도 사용할 수 있도록 byte 형태로 데이터를 변환하는 기술이다.<br>
java.io.Serializable 인터페이스를 상속받은 객체는 직렬화가 가능하다.
</div>
</details>
<br>

<details>
<summary>[예습] SOLID에 대해 알아봅시다.</summary>
<div markdown="1">
객체지향 설계에서 지켜야 하는 5개의 소프트웨어 개발 원칙을 SOLID 원칙이라고 한다.<br>

- 단일 책임 원칙 (SRP: Single Responsibility Principle)
- 개방 폐쇄 원칙 (OCP: Open-Closed Principle)
- 리스코프 치환 원칙 (LSP: Liskov Substitution Principle)
- 인터페이스 분리 원칙 (ISP: Interface Segregation Principle)
- 의존 역전 원칙 (DIP: Dependency Inversion Principle)
</div>
</details>
<br>

<details>
<summary>[예습] DI는 무엇일까요?</summary>
<div markdown="1">
DI(Dependency Injection)는 의존성 주입 또는 의존관계 주입을 의미한다.
DI는 객체의 생성과 사용 관심사를 분리하는 프로그래밍 설계 방식이며, 자바에서는 추상화 도구(인터페이스, 추상 클래스)를 사용하여 의존성을 주입하는 코드를 만들 수 있다.<br>
의존성을 주입하는 이유는 생성과 사용에 대한 관심을 분리함으로써 생성에 대한 책임을 다른 이에게 위임하고, 필요에 따라 객체 생성 방식을 선택하는 것이 가능해지기 때문이다. 
그리고 이러한 의존성 주입을 통해 테스트가 용이해지고, 다양한 패턴 적용이 유연해지며 최종적으로 설계의 유연성을 부여할 수 있다.
</div>
</details>
<br>