package com.eomcs.lms.servlet;

<<<<<<< HEAD
import java.io.PrintStream;
import java.util.Scanner;
=======
import java.io.PrintWriter;
import java.util.Map;
>>>>>>> 02e44d21770baeefd7bfc8efdaa962f66a96d5b2
import org.springframework.stereotype.Component;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.service.LessonService;
import com.eomcs.util.Prompt;
import com.eomcs.util.RequestMapping;

@Component
public class LessonDetailServlet {

  LessonService lessonService;

  public LessonDetailServlet(LessonService lessonService) {
    this.lessonService = lessonService;
  }

  @RequestMapping("/lesson/detail")
<<<<<<< HEAD
  public void service(Scanner in, PrintStream out) throws Exception {
    int no = Prompt.getInt(in, out, "번호? ");

    Lesson lesson = lessonService.get(no);

    if (lesson != null) {
      out.printf("번호: %d\n", lesson.getNo());
      out.printf("수업명: %s\n", lesson.getTitle());
      out.printf("설명: %s\n", lesson.getDescription());
      out.printf("시작일: %s\n", lesson.getStartDate());
      out.printf("종료일: %s\n", lesson.getEndDate());
      out.printf("총수업시간: %d\n", lesson.getTotalHours());
      out.printf("일수업시간: %d\n", lesson.getDayHours());
=======
  public void service(Map<String, String> params, PrintWriter out) throws Exception {
    int no = Integer.parseInt(params.get("no"));
    Lesson lesson = lessonService.get(no);

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>수업 상세정보</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>수업 상세정보</h1>");

    if (lesson != null) {
      out.println("<form action='/lesson/update'>");
      out.printf("번호: <input name='no' readonly type='text' value='%d'><br>\n", //
          lesson.getNo());
      out.printf("강의명: <input name='title' type='text' value='%s'><br>\n", //
          lesson.getTitle());
      out.println("내용:<br>");
      out.printf("<textarea name='description' rows='5' cols='60'>%s</textarea><br>\n", //
          lesson.getDescription());
      out.printf("강의 시작일: <input name='startDate' type='date' value='%s'><br>\n", //
          lesson.getStartDate());
      out.printf("강의 종료일: <input name='endDate' type='date' value='%s'><br>\n", //
          lesson.getEndDate());
      out.printf("총 강의시간: <input name='totalHours' type='number' value='%d'><br>\n", //
          lesson.getTotalHours());
      out.printf("일 강의시간: <input name='dayHours' type='number' value='%d'><br>\n", //
          lesson.getDayHours());
      out.println("<p>");
      out.println("<button>변경</button>");
      out.printf("<a href='/lesson/delete?no=%d'>삭제</a>\n", //
          lesson.getNo());
      out.printf("<a href='/photoboard/list?lessonNo=%d'>사진게시판</a>\n", //
          lesson.getNo());
      out.println("</p>");
      out.println("</form>");
>>>>>>> 02e44d21770baeefd7bfc8efdaa962f66a96d5b2
    } else {
      out.println("해당 번호의 강의가 없습니다.");
    }
  }
}
