package com.eomcs.lms.servlet;

<<<<<<< HEAD
import java.io.PrintStream;
import java.util.Scanner;
=======
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Map;
>>>>>>> 02e44d21770baeefd7bfc8efdaa962f66a96d5b2
import org.springframework.stereotype.Component;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.service.LessonService;
import com.eomcs.util.Prompt;
import com.eomcs.util.RequestMapping;

@Component
public class LessonAddServlet {

  LessonService lessonService;

  public LessonAddServlet(LessonService lessonService) {
    this.lessonService = lessonService;
  }

  @RequestMapping("/lesson/add")
<<<<<<< HEAD
  public void service(Scanner in, PrintStream out) throws Exception {
    Lesson lesson = new Lesson();

    lesson.setTitle(Prompt.getString(in, out, "강의명? "));
    lesson.setDescription(Prompt.getString(in, out, "내용? "));
    lesson.setStartDate(Prompt.getDate(in, out, "강의 시작일? "));
    lesson.setEndDate(Prompt.getDate(in, out, "강의 종료일? "));
    lesson.setTotalHours(Prompt.getInt(in, out, "총 강의시간? "));
    lesson.setDayHours(Prompt.getInt(in, out, "일 강의시간? "));

    if (lessonService.add(lesson) > 0) {
      out.println("강의를 저장했습니다.");

    } else {
      out.println("저장에 실패했습니다.");
    }
=======
  public void service(Map<String, String> params, PrintWriter out) throws Exception {
    Lesson lesson = new Lesson();
    lesson.setTitle(params.get("title"));
    lesson.setDescription(params.get("description"));
    lesson.setStartDate(Date.valueOf(params.get("startDate")));
    lesson.setEndDate(Date.valueOf(params.get("endDate")));
    lesson.setTotalHours(Integer.parseInt(params.get("totalHours")));
    lesson.setDayHours(Integer.parseInt(params.get("dayHours")));

    lessonService.add(lesson);

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<meta http-equiv='refresh' content='2;url=/lesson/list'>");
    out.println("<title>강의 입력</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>강의 입력 결과</h1>");
    out.println("<p>새 강의를 등록했습니다.</p>");
    out.println("</body>");
    out.println("</html>");
>>>>>>> 02e44d21770baeefd7bfc8efdaa962f66a96d5b2
  }
}
