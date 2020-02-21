package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Scanner;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;

public class LessonUpdateServlet implements Servlet {

  // DAO 클래스를 구체적으로 지정하기 보다는
  // 인터페이스를 지정함으로써
  // 향후 다른 구현체로 교체하기 쉽도록 한다.
  //
  LessonDao lessonDao;

  public LessonUpdateServlet(LessonDao lessonDao) {
    this.lessonDao = lessonDao;
  }

  @Override
  public void service(Scanner in, PrintStream out) throws Exception {

    out.println("번호? ");
    out.println("!{}!");
    out.flush();
    int no = Integer.parseInt(in.nextLine());

    Lesson old = lessonDao.findByNo(no);

    if (old == null) {
      out.println("해당 번호의 게시글이 없습니다.");
      return;
    }
    Lesson lesson = new Lesson();

    lesson.setNo(no);
    out.printf("수업명(%s)? \n", old.getTitle());
    out.println("!{}!");
    out.flush();

    out.printf("설명? \n", old.getTitle());
    out.println("!{}!");
    out.flush();

    out.printf("시작일(%s)? \n", old.getStartDate());
    out.println("!{}!");
    out.flush();

    out.printf("종료일(%s)? ", old.getEndDate());
    out.println("!{}!");
    out.flush();

    out.printf("총수업시간(%d)? ", old.getTotalHours());
    out.println("!{}!");
    out.flush();

    out.printf("일수업시간(%d)? ", old.getDayHours());
    out.println("!{}!");
    out.flush();


    if (lessonDao.update(lesson) > 0) {
      out.println("강의를 변경했습니다.");

    } else {
      out.println("해당 번호의 수업이 없습니다.");
    }
  }
}
