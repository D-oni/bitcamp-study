package com.eomcs.sql;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MybatisDaoFactory {
  InvocationHandler invocationHandler;
  //이 메서드는 DAO프록시의 메서드가 호출 될 때마다 실행된다.
 public MybatisDaoFactory(SqlSessionFactory sqlSessionFactory){
   invocationHandler=(proxy, method, args) -> {
       Class<?> clazz= proxy.getClass();
       Class<?> daoInterface = clazz.getInterfaces()[0];
       String interfaceName = daoInterface.getName();
       String methodName = method.getName();
       String sqlId = String.format("%s.%s", interfaceName,methodName);
       System.out.println(sqlId);

       SqlSession sqlSession = sqlSessionFactory.openSession();
       Class<?> returnType = method.getReturnType();
       if(returnType == List.class) {
         return (args == null) ? sqlSession.selectList(sqlId):
           sqlSession.selectList(sqlId,args[0]);
       } else if(returnType == int.class || returnType == void.class){
         return (args == null) ? sqlSession.update(sqlId):
           sqlSession.update(sqlId,args[0]);   //update()는 insert(),delete()와 같다.
       } else {
         return (args == null) ? sqlSession.selectOne(sqlId):
           sqlSession.selectOne(sqlId,args[0]);
       }    }
   ;

   }
 @SuppressWarnings("unchecked")
 public <T> T createDao(Class<T> daoInterface) { //타입파라미터 - 리턴 타입 앞에 넘어오는 값으로 타입캐스팅
   return (T) Proxy.newProxyInstance(
       this.getClass().getClassLoader(),
       new Class[] {daoInterface},  //이 인터페이스의 프록시 객체를 만든다.
       invocationHandler);
 }

}
