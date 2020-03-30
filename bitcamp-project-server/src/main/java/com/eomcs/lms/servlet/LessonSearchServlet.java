package com.eomcs.lms.servlet;

<<<<<<< HEAD
import java.io.PrintStream;
import java.sql.Date;
=======
import java.io.PrintWriter;
>>>>>>> 02e44d21770baeefd7bfc8efdaa962f66a96d5b2
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import org.springframework.stereotype.Component;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.service.LessonService;
import com.eomcs.util.Prompt;
import com.eomcs.util.RequestMapping;

@Component
public class LessonSearchServlet {

  LessonService lessonService;

  public LessonSearchServlet(LessonService lessonService) {
    this.lessonService = lessonService;
  }

  @RequestMapping("/lesson/search")
<<<<<<< HEAD
  public void service(Scanner in, PrintStream out) throws Exception {
    HashMap<String, Object> params = new HashMap<>();
    String keyword = Prompt.getString(in, out, "강의명 검색: ");
    if (keyword.length() > 0) {
      params.put("title", keyword);
    }

    Date date = Prompt.getDate(in, out, "시작일 검색: ");
    if (date != null) {
      params.put("startDate", date);
    }

    date = Prompt.getDate(in, out, "종료일 검색: ");
    if (date != null) {
      params.put("endDate", date);
    }

    int value = Prompt.getInt(in, out, "총강의시간 검색: ");
    if (value > 0) {
      params.put("totalHours", value);
    }

    value = Prompt.getInt(in, out, "일강의시간 검색: ");
    if (value > 0) {
      params.put("dayHours", value);
    }
    out.println("------------------------------");
    out.println("[검색 결과]");
    out.println();
=======
  public void service(Map<String, String> params, PrintWriter out) throws Exception {
    HashMap<String, Object> map = new HashMap<>();
    String value = params.get("title");
    if (value.length() > 0) {
      map.put("title", value);
    }

    value = params.get("startDate");
    if (value.length() > 0) {
      map.put("startDate", value);
    }

    value = params.get("endDate");
    if (value.length() > 0) {
      map.put("endDate", value);
    }

    value = params.get("totalHours");
    if (value.length() > 0) {
      map.put("totalHours", Integer.parseInt(value));
    }

    value = params.get("dayHours");
    if (value.length() > 0) {
      map.put("dayHours", Integer.parseInt(value));
    }

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("  <meta charset='UTF-8'>");
    out.println("  <title>강의 검색</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("  <h1>강의 검색 결과</h1>");
    out.println("  <table border='1'>");
    out.println("  <tr>");
    out.println("    <th>번호</th>");
    out.println("    <th>강의</th>");
    out.println("    <th>기간</th>");
    out.println("    <th>총강의시간</th>");
    out.println("  </tr>");
>>>>>>> 02e44d21770baeefd7bfc8efdaa962f66a96d5b2

    List<Lesson> lessons = lessonService.search(map);
    for (Lesson l : lessons) {
<<<<<<< HEAD
      out.printf("%d, %s, %s ~ %s, %d\n", l.getNo(), l.getTitle(), l.getStartDate(), l.getEndDate(),
          l.getTotalHours());
=======
      out.printf("  <tr>"//
          + "<td>%d</td> "//
          + "<td><a href='/lesson/detail?no=%d'>%s</a></td> "//
          + "<td>%s ~ %s</td> "//
          + "<td>%d</td>"//
          + "</tr>\n", //
          l.getNo(), //
          l.getNo(), //
          l.getTitle(), //
          l.getStartDate(), //
          l.getEndDate(), //
          l.getTotalHours() //
      );
>>>>>>> 02e44d21770baeefd7bfc8efdaa962f66a96d5b2
    }
    out.println("</table>");
    out.println("</body>");
    out.println("</html>");
  }
}


