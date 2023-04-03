# 자바 핵심 개념 정리 3
<details>
<summary>POJO란 무엇일까요?</summary>
<div markdown="1">
</div>
Plain Old Java Object로 오래된 방식의 간단한 자바 오브젝트이다. 즉, 특정 기술에 종속되지 않는 순수한 자바 객체를 의미한다. 
진정한 POJO란 객체지향적인 원리에 충실하면서, 환경과 기술에 종속되지 않고 필요에 따라 재활용 될 수 있는 방식으로 설계된 오브젝트를 말한다고도 한다.
</details>
<br>

<details>
<summary>제너릭이 무엇인가요? 컬렉션 클래스에서 제너릭을 사용하는 이유를 설명해 주세요.</summary>
<div markdown="1">
</div>
제너릭이란 데이터의 타입을 일반화한다는 것을 의미한다. 제너릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법이다.
<br><br>
이를 사용하는 이유인 제너릭의 장점은<br>
1. 여러 타입의 파라미터를 삽입해 생성할 수 있기 때문에 코드를 간결하게 사용하고 재서용성을 높인다.<br>
2. 컴파일시 타입 에러를 발견할 수 있다.<br>
3. 컴파일 단계에서 컴파일러가 타입 캐스팅을 수행해주기 때문에 불필요하게 코드에서 타입 캐스팅을 해줄 필요가 없다.
</details>
<br>

<details>
<summary>자바의 클래스 멤버 변수 초기화 순서에 대해 알려주세요.</summary>
<div markdown="1">
</div>
1. static 변수 선언부: 클래스가 로드될 때 변수가 가장 먼저 초기화된다.<br>
2. 필드 변수 선언부: 객체가 생성될 때 block보다 앞서 초기화된다.<br>
3. 생성자 block: 객체가 생성될 때 JVM이 내부적으로 locking한다. 필드 변수중 final 변수의 가시화는 block이 끝난 다음 진행된다. 필드 변수 선언부에서 이미 초기화되었다면 그 값들을 덮어쓴다.
</details>
<br>

<details>
<summary>직렬화란 무엇인가요?</summary>
<div markdown="1">
</div>
직렬화란 자바 시스템 내부에서 사용되는 object 또는 data를 외부의 자바 시스템에서도 사용할 수 있도록 byte형태로 데이터를 변환하는 기술이다. 
</details>
<br>

<details>
<summary>[예습] SOLID에 대해 알아봅시다.</summary>
<div markdown="1">
</div>
SOLID란 객체지향 설계의 5원칙이다.<br>
1. SRP(Single Responsibility Principle): 단일 책임 원칙<br>
2. OCP(Open Closed Priciple): 개방 폐쇄 원칙<br>
3. LSP(Listov Substitution Priciple): 리스코프 치환 원칙<br>
4. ISP(Interface Segregation Principle): 인터페이스 분리 원칙<br>
5. DIP(Dependency Inversion Principle): 의존 역전 원칙<br>
</details>
<br>

<details>
<summary>[예습] DI는 무엇일까요?</summary>
<div markdown="1">
DI란 Dependency Injection의 약어로 의존성 주입을 의미한다.<br>
즉, 하나의 객체에 다른 객체의 의존성을 제공하는 기술이다.
</div>
</details>
<br>