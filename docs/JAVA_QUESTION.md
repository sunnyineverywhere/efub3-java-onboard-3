# 자바 핵심 개념 정리 3
<details>
<summary>POJO란 무엇일까요?</summary>
<div markdown="1">
<b>Plain Old Java Object</b>

특정 기술에 종속되지 않은 순수한 자바 객체를 말한다.  
특정 기술을 사용하기 위해 프레임워크에 의존하게 되면 POJO라고 할 수 없다.  
특정 기술과 환경에 의존하면 코드 가독성, 유지보수, 확장성에 어려움이 생기므로 객체지향의 장점을 잃어버린 
자바를 되살리기 위해 나온 용어이다.  

진정한 POJO란 객체지향적인 원리에 충실하면서, 환경과 기술에 종속되지 않고 필요에 따라 재활용될 수 있는 방식으로 설계된 오브젝트이다
</div>
</details>
<br>

<details>
<summary>제너릭이 무엇인가요? 컬렉션 클래스에서 제너릭을 사용하는 이유를 설명해 주세요.</summary>
<div markdown="1">
제너릭스란 컬렌션 클래스( ex)ArrayList )가 다룰 객체를 미리 명시해줌으로써 형변환을 하지 않고 사용하는 것.  

제네릭(Generic)은 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 
의미한다. 한마디로 특정(Specific) 타입을 미리 지정해주는 것이 아닌 필요에 의해 
지정할 수 있도록 하는 일반(Generic) 타입이다.  

1. 제네릭을 사용하면 잘못된 타입이 들어올 수 있는 것을 컴파일 단계에서 방지할 수 있다.

2. 클래스 외부에서 타입을 지정해주기 때문에 따로 타입을 체크하고 변환해줄 필요가 없다. 즉, 관리하기가 편하다.

3. 비슷한 기능을 지원하는 경우 코드의 재사용성이 높아진다.

</div>
</details>
<br>

<details>
<summary>자바의 클래스 멤버 변수 초기화 순서에 대해 알려주세요.</summary>
<div markdown="1">

<b>초기화 시기</b>

1. 클래스 : 클래스가 처음 로드될 때 한 번 초기화.

2. 인스턴스 : 새로운 인스턴스가 생성될 때마다 각각의 인스턴스가 초기화.

<b>초기화 순서</b>

1. 클래스 변수의 기본값 ( ex > static int num; ) => int의 기본값은 0이다.

2. 클래스 변수의 명시적 초기화 ( ex > static int num = 10; )

3. 클래스 초기화 블럭 ( ex > static { num = 20; } )

4. 인스턴스 변수의 기본값 ( ex > String title; ) => String의 기본값은 null이다.(참조형 변수)

5. 인스턴스 변수의 명시적 초기화 ( ex > String title = "나는 제목이다" )

6. 인스턴스 초기화 블럭 ( ex > { title = "난 사실 제목 아니다" } )

7. 인스턴스 생성자 ( ex > DOC(String title) { this.title = title } )



* 멤버 변수는 늘 클래스가 먼저 초기화되고 그 다음 인스턴스가 초기화된다.
</div>
</details>
<br>

<details>
<summary>직렬화란 무엇인가요?</summary>
<div markdown="1">  

<b>Computer Science에서 직렬화</b> 
직렬화란 현재 데이터(structure, object)의 상태를 영속적으로 저장하거나 다른 환경으로
전달(네트워크 통신 등)하기 위해 어떠한 정해진 포맷으로 변환하는 과정을 말합니다.

<b>Java에서 직렬화</b>  
* 자바 직렬화란 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부의 자바 시스템에서도 사용할 수 있도록 바이트(byte) 형태로 데이터 변환하는 기술과 바이트로 변환된 데이터를 다시 객체로 변환하는 기술(역직렬화)을 아울러서 말합니다.

* 시스템 적으로는 JVM(Java Virtual Machine)의 메모리에 상주(heap 또는 stack) 되어 있는 객체 데이터를 바이트 형태로 변환하는 기술과 직렬화된 바이트 형태의 데이터를 객체로 변환해서 JVM으로 상주시키는 형태를 말합니다.

[출처 https://techblog.woowahan.com/2550/](https://techblog.woowahan.com/2550/)
</div>
</details>
<br>

<details>
<summary>[예습] SOLID에 대해 알아봅시다.</summary>
<div markdown="1">

* SRP 단일 책임 원칙: 한 클래스는 하나의 책임만 가져야 한다. 
* OCP 개방 폐쇄 원칙: 소프트웨어는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다. 
* LSP 리스포크 치환 원칙: 프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 변경할 수 있어야 한다. 
* ISP 인터페이스 분리 원칙: 특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다.
* DIP 의존관계 역전 원칙: 프로그래머는 추상화(인터페이스)에만 의존해야지, 구체화(클래스)에 의존하면 안된다. 의존성 주입은 이 원칙을 따르는 방법 중 하나이다. 


</div>
</details>
<br>

<details>
<summary>[예습] DI는 무엇일까요?</summary>
<div markdown="1">

B가 변했을 때 A가 변하면 A와 B는 의존 관계이다.  

DI(Dependency Injection, 의존 관계 주입)이란 의존 관계를 외부에서 결정하여 주입하는 것. 

<pre><code>//PizzaChef와 PizzaRecipe는 의존 관계에 있다. 
//새로운 레시피인 CheezePizzaRecipe로 변경하고 싶다면 생성자를 변경해야만 함. 

public class PizzaChef{
	private PizzaRecipe pizzaRecipe;
	
	public PizzaChef() {
		this.pizzaRecipe = new PizzaRecipe();
	}
}
</code></pre>  
<br><br>
인터페이스를 만들어 다양한 피자 레시피를 추상화한다. 
<pre><code>
public interface PizzaRecipe{
	
}

public class CheesePizzaRecipe implements PizzaRecipe{
	
}</code></pre>
<br>생성자에서 외부로부터 pizzaRecipe를 주입받도록 한다. 
<pre><code>public class PizzaChef{
	
	private PizzaRecipe pizzaRecipe;
	
	public PizzaChef(PizzaRecipe pizzaRecipe) {
		this.pizzaRecipe = pizzaRecipe;
	}
	
}
</code></pre>
<pre><code>//DI 컨테이너에서의 동작
PizzaChef = new PizzaChef(new CheesePizzaRecipe());
</code></pre>
</div>
</details>
<br>