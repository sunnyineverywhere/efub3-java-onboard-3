# 자바 핵심 개념 정리 3
<details>
<summary>POJO란 무엇일까요?</summary>
<div markdown="1">
  POJO는 "Plain Old Java Object"의 줄임말로, 마틴 파울러가 EJB(Enterprise JavaBeans)에 반발하여 간단한 자바 오브젝트로 돌아가자는 뜻에서 언급한 말이다. 현재는 특정 자바 모델이나 기능, 프레임워크 들을 따르지 않는 자바 오브젝트를 지칭하는 말로 사용된다.
</div>
</details>
<br>

<details>
<summary>제너릭이 무엇인가요? 컬렉션 클래스에서 제너릭을 사용하는 이유를 설명해 주세요.</summary>
<div markdown="1">
  제네릭이란 여러 종류의 타입을 다룰 수 있도록 클래스나 메서드를 일반화시키는 기법을 말한다. 또 컬렉션은 많은 수의 데이터를 사용 목적에 적합한 자료구조로 묶어 하나로 그룹화한 객체를 말한다. 컬렉션 클레스에서 제너릭을 사용하면 사용자는 사용하고자 하는 데이터 타입을 지정하여 사용하는 이점을 누릴 수 있다.
</div>
</details>
<br>

<details>
<summary>자바의 클래스 멤버 변수 초기화 순서에 대해 알려주세요.</summary>
<div markdown="1">
  
   - 클래스 변수는 클래스가 처음 로딩될 때 한 번 초기화되고, 인스턴스 변수는 인스턴스가 생성될 때마다 인스턴스별로 초기화가 이뤄진다.

  - 클래스가 로드될 때 클래스 변수는 기본값에서 명시적 초괴화, 초기화 블록에 의한 초기화가 수행된다. 인스턴스가 객체가 생성될 때 생성자 block보다 앞서 필드 변수가 초기화 되고, 인스턴스 변수가 인스턴스가 생성될 때 기본값에서 명시적 초기화, 초기화 블록에 의한 초기화가 수행되고, 그 후 생성자가 호출됨에 따라 생성자에 의한 초기화가 처리된다.
</div>
</details>
<br>
<details>
<summary>직렬화란 무엇인가요?</summary>
<div markdown="1">
  
   - 직렬화란 현재 데이터를 영속적으로 저장하거나 다른 환경으로 전달하기 위해 정해진 포맷으로 데이터를 정해진 포맷으로 변환하는 것을 말한다.
  - 자바에서는 type이 primitive type이거나 java.io.Serializalbe 인터페이스를 상속받아 직렬화할 수 있다.
</div>
</details>
<br>

<details>
<summary>[예습] SOLID에 대해 알아봅시다.</summary>
<div markdown="1">
  
  # 좋은 객체 지향 설계의 5가지 원칙(SOLID)

## 1. SRP(단일 책임 원칙, Single Responsibility Principle)

- 한 클래스는 하나의 책임만 가져야 한다.
- ‘변경’을 기준으로 삼음 → 변경 있을 때 파급효과가 적으면 잘 따른 것

## 2. OCP(개방-폐쇄 원칙, Open/Closed Principle)

- 확장에는 열려있으나 변경에는 닫혀있어야 한다.
- 다형성을 이용

```java
public class MemberService {
	//private MemberRepository = new MemoryMemberRepository();
private MemberRepository = new JdbcMemberRepository();
}
```

- 위의 코드의 한계: 다형성을 활용했으나 구현 객체를 변경하기 위해서는 클라이언트 코드를 변경해야하기 때문에 OCP원칙을 지킬 수 없음
- 해결책: 객체를 생성하고 연관 관계를 맺어주는 별도의 조립, 설정자 이용(스프링 컨테이너를 사용하면 됨)

## 3. LSP(리스코프 치환 원칙, Liskob Substitution Principle)

- 다형성에서 하위 클래스는 인터페이스 규약을 모두 지켜야 한다.

## 4. ISP(인터페이스 분리 원칙, Interface Segregation Principle)

- 특정 클라이언트를 위한 인터페이스 여러 개가 하나의 범용 인터페이스보다 낫다.
- 이유: 인터페이스가 명확해지고, 대체 가능성을 높이기 때문

## 5. DIP(의존관계 역전 원칙, Dependancy Inversion Principle)

- 추상화에 의존해야지 구체화에 의존하면 안 된다.
- = 인터페이스에 의존해야지 구현 클래스에 의존하면 안 된다.
- =역할에 의존하게 해야 한다.
</div>
</details>
<br>

<details>
<summary>[예습] DI는 무엇일까요?</summary>
<div markdown="1">
  
  - 의존관계 주입
  - 의존관계를 외부에서 주입해주는 것 같다고해서 그렇게 부름
  - 생성자주입을 통해서 또는 @Autowired를 통해 구현
</div>
</details>
<br>
