# 31_2 - 애플리케이션을 시작하거나 종료할 때 데이터를 안내문구 출력하기.

## 학습목표

- 옵저버 디자인 패턴에 따라 옵저버를 정의할 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/GreetingListener.java 추가
- src/main/java/com/eomcs/lms/App.java 변경

## 실습  

### 훈련 1: 애플리케이션을 시작하거나 종료할 때 안내문구를 출력 할 옵저버를 만들라.

- GreetingListener.java 추가 (GreetingListener.java.01)
  - ApplicationContextListener를 구현한다.
  - 안내문구를 출력한다.
  

### 훈련 2: GreetingListener 옵저버를 App 객체에 등록한 후 실행되는 걸 확인하라.

- App.java 변경 (App.java.01)
  - DataLoaderListener 객체를 생성한 후 App 객체에 등록한다.
  - 실행하여 옵저버가 동작하는 지를 확인한다.
    

### 훈련 4: App 클래스가 옵저버의 결과물을 사용할 수 있게 하라!

ApplicationContextListener.java (변경)
  - contextInitialized()에 Map 파라미터를 추가한다.
  - contextDestroyed()에 Map 파라미터를 추가한다.

### 훈련 5: DataLoaderListener의 작업 결과를 Map 객체를 통해 공유하라.

DataLoaderListener.java (변경)
  - 데이터 로딩 결과를 Map 객체에 보관한다.

### 훈련 6: DataLoaderListener에서 준비한 List 객체를 Command에게 전달하라.

App.java (변경)
  - 애플리케이션이 시작될 때 옵저버를 실행한 후 Map 에 저장된 작업 결과를 꺼내
    Command 객체에 전달한다.
    

