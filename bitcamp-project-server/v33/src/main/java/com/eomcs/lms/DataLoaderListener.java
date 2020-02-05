package com.eomcs.lms;

import java.util.Map;
import com.eomcs.lms.context.ApplicationContextListener;
import com.eomcs.lms.dao.BoardFileDao;
import com.eomcs.lms.dao.LessonFileDao;
import com.eomcs.lms.dao.MemberFileDao;

// 애플리케이션이 시작되거나 종료될 때
// 데이터를 로딩하고 저장하는 일을 한다.
//
public class DataLoaderListener implements ApplicationContextListener {


  @Override
  public void contextInitialized(Map<String, Object> context) {
    System.out.println("데이터를 로딩합니다.");


    BoardFileDao boardDao = new BoardFileDao("./board.ser2");
    LessonFileDao lessonDao = new LessonFileDao("./lesson.ser2");
    MemberFileDao memberDao = new MemberFileDao("./member.ser2");

    context.put("boardDao", boardDao);
    context.put("lessonDao", lessonDao);
    context.put("memberDao", memberDao);

  }

  @Override
  public void contextDestroyed(Map<String, Object> context) {
    System.out.println("데이터를 저장합니다.");


  }

}
