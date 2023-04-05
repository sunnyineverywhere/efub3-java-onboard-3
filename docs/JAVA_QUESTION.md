# 자바 핵심 개념 정리 3
<details>
<summary>POJO란 무엇일까요?</summary>
<div markdown="1">
POJO는 Plain Old Java Object의 약자로 오래된 방식의 간단한 자바 객체로 특정 기술에 종속되지 않는 순수한 자바 객체를 의미한다. 객체 지향의 특성이 잘 드러나는 객체이다.
</div>
</details>
<br>

<details>
<summary>제너릭이 무엇인가요? 컬렉션 클래스에서 제너릭을 사용하는 이유를 설명해 주세요.</summary>
<div markdown="1">
제너릭은 특정 타입만 다루지 않고 여러 타입으로 변할 수 있도록 클래스나 메서드를 일반화시키는 기법이다. 컬렉션 클래스에서 특정 타입만 저장하는 것이 아니라 여러 타입의 값을 다룰 수 있도록 하기 위해 특정 타입이 선언되지 않은 제네릭을 사용한다.
</details>
<br>

<details>
<summary>자바의 클래스 멤버 변수 초기화 순서에 대해 알려주세요.</summary>
<div markdown="1">
자바의 클래스에서 클래스 변수의 기본값 초기화가 가장 먼저 수행되고, 그 다음은 변수의 명시적 초기화가 수행되고, 클래스 초기화 블록이 수행된다.
</div>
</details>
<br>

<details>
<summary>직렬화란 무엇인가요?</summary>
<div markdown="1">
직렬화는 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부의 자바 시스템에서도 사용할 수 있도록 byte 형태로 데이터 변환하는 기술과 바이트로 변환된 데이터를 다시 객체로 변환하는 기술을 아울러서 말한다. 시스템적으로는 JVM의 메모리에 상주되어 있는 객체 데이터를 byte 형태로 변환하는 기술과 직렬화된 byte 형태의 데이터를 객체로 변환해서 JVM으로 상주시키는 형태를 말한다.
</div>
</details>
<br>

<details>
<summary>[예습] SOLID에 대해 알아봅시다.</summary>
<div markdown="1">
SOLID는 SRP, OCP, LSP, ISP, DIP로 이루어진 용어다. SRP(Single Responsibility Principle)는 단일 책임 원칙으로 하나의 클래스는 하나의 책임만 가져야 함을 의미한다. OCP(Open-Closed Principle)는 개방-폐쇄 원칙으로 확장에는 열려 있으나 변경에는 닫혀 있어야 함을 의미한다. LSP(Liskov’s Substitution Principle)는 리스코프 치환 법칙으로 프로그램의 객체는 프로그램의 정확성을 해치지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 함을 의미한다. ISP(Interface Segregation Principle)는 클라이언트가 자신이 이용하지 않는 메서드에 의존하지 않아야 함을 의미한다. 즉, 클라이언트를 기준으로 인터페이스가 나눠져야 한다는 것이다. DIP(Dependency Inversion Principle)는 의존관계 역전 원칙으로 상위 모듈이 하위 모듈에 의존하면 안 되고, 추상적인 적은 구체적인 것에 의존하면 안 되고 구체적인 것이 추상적인 것에 의존해야 함을 의미한다.
</div>
</details>
<br>

<details>
<summary>[예습] DI는 무엇일까요?</summary>
<div markdown="1">
DI는 Dependency Injection의 약자로 의존관계를 외부에서 생성한 후 주입하는 방식이다. 의존관계 주입으로는 주고 생성자 주입 방법과 수정자 주입 방법을 사용한다. 의존관계 주입은 사용될 때 결합도가 줄어들고, 유연성이 높아지고, 테스트하기 쉬워지고, 가독성이 높아진다는 장점을 가진다.
</div>
</details>
<br>