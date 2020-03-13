package com.eomcs.lms.service;

import java.util.List;
import com.eomcs.lms.domain.Board;

public interface BoardService {

  void add(Board board) throws Exception;

  int delete(int no) throws Exception;

  Board findByNo(int no) throws Exception;

  List<Board> findAll() throws Exception;

  int update(Board board) throws Exception;




}
