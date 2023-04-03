## 가이드라인
- 다음 문서에서는 클래스에서 구현해야 하는 목록에 대해 작성합니다.
- 간단한 과제이며, 앞으로 서버를 구축할 때 기본이 되는 도메인의 설계와 연관된 내용입니다.
### Account
- 다음과 같은 필드를 갖습니다.
  - `String` userId
  - `String` name
  - `String` college
  - `String` department
  - `String` major

### Student
-  `Person` 클래스를 상속합니다.
- 다음과 같은 필드를 갖습니다.
    - `String` studentId
    - `Grade` grade
- `Grade`는 ENUM 타입으로 구현합니다.
  - 필드 key는 다음 값을 나타냅니다.
    - `FRESHMAN`, `SOPHOMORE`, `JUNIOR`, `SENIOR`
- 다음과 같은 메소드를 갖습니다.
  - `setGrade()` : grade를 변경합니다.
  - `getName()`  `getMajor()`  `getGrade()` : 각 타입의 데이터를 리턴합니다.

### Professor
-  `Person` 클래스를 상속합니다.
- 다음과 같은 필드를 갖습니다.
    - `String` professorId
    - `Status` status
- `Status`는 ENUM 타입으로 구현합니다.
    - 필드 key는 다음 값을 나타냅니다.
        - `ROSESWORD`, `ANGEL`, `NOT_BAD`, `BAD`
- 다음과 같은 메소드를 갖습니다.
    - `setStatus()` : grade를 변경합니다.
    - `setMajor()` : major를 변경합니다.
    - `getName()`  `getMajor()`  `getStatus()` : 각 타입의 데이터를 리턴합니다.

### Lecture
- 다음과 같은 필드를 갖습니다.
  - `String` lectureId
  - `String` major
  - `String` name
  - `String` professorId
  - `Integer` total

## File Tree
```
├── README.md
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── seminar
    │   │       ├── Lecture.java
    │   │       ├── Main.java
    │   │       └── account
    │   │           ├── Account.java
    │   │           ├── Grade.java
    │   │           ├── Status.java
    │   │           ├── Professor.java
    │   │           └── Student.java
    │   └── resources
    └── test
        ├── java
        └── resources
```