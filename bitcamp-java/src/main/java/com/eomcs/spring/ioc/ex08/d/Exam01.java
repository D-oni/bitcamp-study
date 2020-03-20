// 의존 객체 주입 자동화하기 - BeanPostProcessor 응용
package com.eomcs.spring.ioc.ex08.d;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.eomcs.spring.ioc.SpringUtils;

public class Exam01 {

  public static void main(String[] args) {
    //Spring IoC 컨테이너가 생성한 객체의 클래스명을 로그로 남기고 싶다.
    //=> LogBeanPosrProcessor를 만들어 처리한다.
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "com/eomcs/spring/ioc/ex08/d/application-context.xml");

    SpringUtils.printBeanList(iocContainer);




    // Car 객체를 꺼내 Engine 객체가 주입되었는지 확인해보자!
    System.out.println(iocContainer.getBean("c1"));
  }

}





