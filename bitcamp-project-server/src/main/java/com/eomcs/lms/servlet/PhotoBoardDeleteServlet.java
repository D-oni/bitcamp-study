package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Scanner;
<<<<<<< HEAD
import com.eomcs.lms.service.PhotoBoardService;
=======
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.dao.PhotoFileDao;
>>>>>>> 81c676cdd8bbf48520b950703bd4f8005004938e
import com.eomcs.util.Prompt;

public class PhotoBoardDeleteServlet implements Servlet {

<<<<<<< HEAD
  PhotoBoardService photoBoardService;

  public PhotoBoardDeleteServlet(PhotoBoardService photoBoardService) {
    this.photoBoardService = photoBoardService;
=======
  PhotoBoardDao photoBoardDao;
  PhotoFileDao photoFileDao;

  public PhotoBoardDeleteServlet( //
      PhotoBoardDao photoBoardDao, //
      PhotoFileDao photoFileDao) {
    this.photoBoardDao = photoBoardDao;
    this.photoFileDao = photoFileDao;
>>>>>>> 81c676cdd8bbf48520b950703bd4f8005004938e
  }


  @Override
  public void service(Scanner in, PrintStream out) throws Exception {

    int no = Prompt.getInt(in, out, "번호? ");

<<<<<<< HEAD
    photoBoardService.delete(no);
    out.println("사진 게시글을 삭제했습니다.");

=======
    try {
      photoFileDao.deleteAll(no);

      if (photoBoardDao.delete(no) == 0) {
        throw new Exception("해당 번호의 사진 게시글이 없습니다.");
      }
      out.println("사진 게시글을 삭제했습니다.");

    } catch (Exception e) {
      out.println(e.getMessage());

    }
>>>>>>> 81c676cdd8bbf48520b950703bd4f8005004938e
  }
}
