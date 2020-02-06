package com.eomcs.lms.dao.json;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

public abstract class AbstractJsonFileDao<T> {

  protected String filename;
  protected List<T> list;

  public AbstractJsonFileDao(String filename) {
    this.filename = filename;
    list = new ArrayList<>();
    loadData();
  }

  @SuppressWarnings("unchecked")
  protected void loadData() {
    File file = new File(filename);

    try (BufferedReader in = new BufferedReader(new FileReader(file))) {
      //현재 클래스정보
      Class<?> currType = this.getClass();
      System.out.println(currType);
      //제네릭 타입의 수퍼클래스 정보
      Type parentType = currType.getGenericSuperclass();
      System.out.println(parentType);
      //수퍼 클래스의 타입파라미터 중 T값 추출
      //=>수퍼클래스에 제네릭이 적용 된 경우
      ParameterizedType parentType2 = (ParameterizedType) parentType;

      Type[] typeParams = parentType2.getActualTypeArguments();
      //T타입정보는 배열의 0번에있다.
      Type itemType = typeParams[0];
      System.out.println(itemType);//T가 어떤타입인지 알아냄

      //크기가 0인 배열생성(배열의 타입을 꺼내기위해)
      T[] arr = (T[])Array.newInstance((Class)itemType, 0);

      //T타입의 배열정보를 가지고 JSON 데이터를 읽는다.
      //리턴값은 실제 T타입의 객체가 들어있는 배열이다.
      T[] dataArr = (T[])new Gson().fromJson(in,arr.getClass());
      for(T b : dataArr) {
        list.add(b);
      }
      System.out.printf("총 %d 개의 객체를 로딩했습니다.\n", list.size());

    } catch (Exception e) {
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
    }
  }

  protected void saveData() {
    File file = new File(filename);

    try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
      out.write(new Gson().toJson(list));
      System.out.printf("총 %d 개의 객체를 저장했습니다.\n", list.size());

    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());

    }
  }
  protected abstract<K> int indexOf(K key);
}
