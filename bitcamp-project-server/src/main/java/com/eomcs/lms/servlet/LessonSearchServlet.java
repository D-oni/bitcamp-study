package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.sql.Date;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.service.LessonService;
import com.eomcs.util.RequestMapping;

@Component
public class LessonSearchServlet {

  LessonService lessonService;

  public LessonSearchServlet(LessonService lessonService) {
    this.lessonService = lessonService;
  }

  @RequestMapping("/lesson/search")
  public void service(Map<String, Object> params, PrintStream out) throws Exception {
    String keyword = (String) params.get("강의명 검색: ");
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>강의 상세정보</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>강의 상세정보</h1>");
    if (keyword.length() > 0) {
      params.put("title", keyword);
    }

    Date date = (Date) params.get("시작일 검색: ");
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>강의 상세정보</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>강의 상세정보</h1>");
    if (date != null) {
      params.put("startDate", date);
    }

    date = (Date) params.get("종료일 검색: ");
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>강의 상세정보</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>강의 상세정보</h1>");
    if (date != null) {
      params.put("endDate", date);
    }

    int value = (int) params.get( "총강의시간 검색: ");
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>강의 상세정보</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>강의 상세정보</h1>");
    if (value > 0) {
      params.put("totalHours", value);
    }

    value = (int) params.get("일강의시간 검색: ");
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<meta http-equiv='refresh' content='1;url=/board/list'>");
    out.println("<title>게시글 삭제</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>게시물 삭제 결과</h1>");
    if (value > 0) {
      params.put("dayHours", value);
    }
    out.println("------------------------------");
    out.println("[검색 결과]");
    out.println();

    List<Lesson> lessons = lessonService.search(params);
    for (Lesson l : lessons) {
      out.printf("%d, %s, %s ~ %s,%d, %d\n", l.getNo(), l.getTitle(), l.getStartDate(), l.getEndDate(),
          l.getTotalHours(),l.getDayHours());
    }
  }
}


