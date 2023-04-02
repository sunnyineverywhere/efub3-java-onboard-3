# 자바 핵심 개념 정리 3
<details>
<summary>POJO란 무엇일까요?</summary>
<div markdown="1">
Plain Old Java Object: 객체 지향적인 원리에 충실하면서 환경과 기술에 종속되지 않고 필요에 따라 재활용될 수 있는 방식으로 설계된 오브젝트<br>
대표적인 POJO 프레임워크 : 스프링, 하이버네이트
</div>
</details>
<br>

<details>
<summary>제너릭이 무엇인가요? 컬렉션 클래스에서 제너릭을 사용하는 이유를 설명해 주세요.</summary>
<div markdown="1">
제네릭: 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 의미<br>
제네릭 사용 이유<br>
1. 코드 재사용성 증가<br>
2. 컴파일 시 타입 에러 발견 가능<br>
3. 컴파일러가 타입 변환 수행
</div>
</details>
<br>

<details>
<summary>자바의 클래스 멤버 변수 초기화 순서에 대해 알려주세요.</summary>
<div markdown="1">
클래스가 처음 로딩될 때 단 한번 초기화되며<br> 
순서는 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭 이다.
</div>
</details>
<br>

<details>
<summary>직렬화란 무엇인가요?</summary>
<div markdown="1">
직렬화(Serialization)란 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부의 자바 시스템에서도 사용할 수 있도록 바이트 형태로 데이터를 변환하는 기술이다.<br>
시스템적으로는 JVM의 메모리에 상주되어있는 객체 데이터를 바이트 형태로 변환하는 기술을 말한다.
</div>
</details>
<br>

<details>
<summary>[예습] SOLID에 대해 알아봅시다.</summary>
<div markdown="1">
SOLID는 객체 지향 설계의 5가지 원칙이다.<br>
하나의 클래스는 하나의 책임만 가져야 한다는 SRP(단일 책임의 원칙), 소프트웨어 요소는 확장에는 열려있으나 변경에는 닫혀있어야 한다는 OCP(개방 폐쇄 원칙), 서브 타입은 언제나 자신의 기반 타입으로 교체할 수 있어야 한다는 LSP(리스코프 치환 법칙), 클라이언트는 자신이 사용하지 않는 메소드에 의존 관계를 맺으면 안된다는 ISP(인터페이스 분리 원칙), 추상화된 것은 구체적인 것에 의존하면 안된다는 DIP(의존관계 역전 원칙)이 그 5가지 원칙이다.
</div>
</details>
<br>

<details>
<summary>[예습] DI는 무엇일까요?</summary>
<div markdown="1">
DI(Dependency Injection): 의존성 주입<br>
하나의 객체에 다른 객체의 의존성을 제공하는 기술<br>
스프링 컨테이너가 자동으로 연결해줌<br>
[의존성 주입의 장점] <br>
1. 객체 상호 간 의존성 관계를 줄여줌<br>
2. 코드의 재사용과 조합이 용이<br>
3. 가독성이 좋아짐<br>
</div>
</details>
<br>