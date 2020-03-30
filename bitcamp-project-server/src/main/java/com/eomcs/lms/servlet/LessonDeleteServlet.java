package com.eomcs.lms.servlet;

<<<<<<< HEAD
import java.io.PrintStream;
import java.util.Scanner;
=======
import java.io.PrintWriter;
import java.util.Map;
>>>>>>> 02e44d21770baeefd7bfc8efdaa962f66a96d5b2
import org.springframework.stereotype.Component;
import com.eomcs.lms.service.LessonService;
import com.eomcs.util.Prompt;
import com.eomcs.util.RequestMapping;

@Component
public class LessonDeleteServlet {

  LessonService lessonService;

  public LessonDeleteServlet(LessonService lessonService) {
    this.lessonService = lessonService;
  }

  @RequestMapping("/lesson/delete")
<<<<<<< HEAD
  public void service(Scanner in, PrintStream out) throws Exception {
    int no = Prompt.getInt(in, out, "번호? ");

=======
  public void service(Map<String, String> params, PrintWriter out) throws Exception {
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<meta http-equiv='refresh' content='2;url=/lesson/list'>");
    out.println("<title>강의 삭제</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>강의 삭제 결과</h1>");

    int no = Integer.parseInt(params.get("no"));
>>>>>>> 02e44d21770baeefd7bfc8efdaa962f66a96d5b2
    if (lessonService.delete(no) > 0) { // 삭제했다면,
      out.println("강의를 삭제했습니다.");

    } else {
      out.println("해당 번호의 강의가 없습니다.");
    }
<<<<<<< HEAD
=======

    out.println("</body>");
    out.println("</html>");
>>>>>>> 02e44d21770baeefd7bfc8efdaa962f66a96d5b2
  }
}
