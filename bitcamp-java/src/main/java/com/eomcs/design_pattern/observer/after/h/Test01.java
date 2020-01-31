package com.eomcs.design_pattern.observer.after.h;

// CarObserver 구현체를 만들 때,
// -인터페이스에 선언 된 모든 메서드를 구현해야 한다.
// -관심없는 메서드라도 구현해야한다.
// -예)
// SafeBeltCarObserver는 시동 걸 때 작업을 수행한다.
// 그래서 carStarted()메서드에 코드를 삽입하였다.
// 그런데 인터페이스를 구현하려면 모든 메서드를 정의해야하기때문에
// 관심이 없는데도 불구하고 carStopped()메서드로 구현하였다.
// 물론 코드가 없는 빈 메서드이다.

// 인터페이스를 좀 더 쉽게 구현하는 방법:
// -위와 같은 경우에,
// (여러개의 메서드 중에서 주로 일부메서드만 구현하는 경우)
// 추상클래스를 사용하여 메서드를 미리 구현 해 놓으면
// 인터페이스 구현체를 정의하기 편하다.
//
// 이번 실습은,
// -CarObsever를 미리 구현한 AbstractCarObserver를 만들고,
// 구현체는 이 추상 메서드를 상속받도록 한다.
public class Test01 {

  public static void main(String[] args) {
    Car car = new Car();

    car.addCarObserver(new SafeBeltCarObserver());
    car.addCarObserver(new EngineOilCarObserver());
    car.addCarObserver(new BreakOilCarObserver());
    car.addCarObserver(new LightOffCarObserver());

    // 썬루프를 닫는 옵저버를 추가한다.
    // - 기존 구조에서는 Car 클래스에 코드를 추가하였다!!!
    // - 옵저버 패턴으로 구조를 바꾼 후에는 이렇게 새 클래스를 정의하여 등록한다.
    car.addCarObserver(new SunRoofCloseCarObserver());

    car.start();

    car.run();

    car.stop();
    // 업그레이드를 수행한 다음 시간이 지난 후
    // 5) 시동 끌 때 썬루프를 자동으로 닫기
    // => Car의 stop() 메서드에 해당 코드 추가

  }

}


