package com.eomcs.reflect.ex06.c;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
<<<<<<< HEAD
    switch(method.getName()) {
      case "m1":
        return 100;
      case "m2":
        return "Hello";
=======
    switch (method.getName()) {
      case "m1":
        return 100;
      case "m2":
        return "Hello!";
>>>>>>> 81c676cdd8bbf48520b950703bd4f8005004938e
    }
    return null;
  }
}
