package com.eomcs.lms.handler;

import com.eomcs.lms.domain.Board;
import com.eomcs.util.LinkedList;
import com.eomcs.util.Prompt;

public class BoardHandler {
  
 LinkedList<Board> boardList;
  
  public Prompt prompt;

  
  public BoardHandler(Prompt prompt) {
    this.prompt = prompt;
    this.boardList = new LinkedList<>();
  }

  public void listBoard() {
    // BoardList의 보관된 값을 받을 배열을 준비한다. 
    Board[] arr = new Board[this.boardList.size()];

    // toArray()에게 빈 배열을 넘겨서 복사 받는다.
    this.boardList.toArray(arr);

    for (Board b : arr) {
      System.out.printf("%d, %s, %s, %d\n", 
          b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }

  }

  public void addBoard() {
    Board board = new Board();
    
    board.setNo(prompt.inputInt("번호? "));
    board.setTitle(prompt.inputString("제목? "));
    board.setDate(prompt.inputDate("등록일? "));
    board.setViewCount(prompt.inputInt("조회수? "));

    boardList.add(board);
    System.out.println("저장하였습니다.");
  }

  public void detailBoard() {
 int index = indexOfBoard(prompt.inputInt("번호? "));
    
    if (index == -1) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }
    Board board = this.boardList.get(index);
    System.out.printf("번호: %d\n", board.getNo());
    System.out.printf("제목: %s\n", board.getTitle());
    System.out.printf("등록일: %s\n", board.getDate());
    System.out.printf("조회수: %d\n", board.getViewCount());
  }

  public void updateBoard() {
int index = indexOfBoard(prompt.inputInt("번호? "));
    
    if (index == -1) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    Board oldBoard = this.boardList.get(index);
    Board newBoard = new Board();
    
    newBoard.setNo(oldBoard.getNo());
    
    
    newBoard.setTitle(prompt.inputString(
        String.format("제목(%s)? ", oldBoard.getTitle()), 
        oldBoard.getTitle()));
    
    newBoard.setDate(prompt.inputDate(
        String.format("등록일(%s)? ", oldBoard.getDate()), 
        oldBoard.getDate()));
    
    newBoard.setViewCount(prompt.inputInt(
        String.format("조회수(%s)? ", oldBoard.getViewCount()), 
        oldBoard.getViewCount()));

    /*
    int oldValue = oldLesson.getDayHours();
    String label = "일수업시간(" + oldValue + ")? ";
    int newValue = inputInt(label, oldValue);
    newLesson.setDayHours(newValue);
    */
    
    if (oldBoard.equals(newBoard)) {
      System.out.println("수업 변경을 취소하였습니다.");
      return;
    }
    
    this.boardList.set(index, newBoard);
    System.out.println("게시글을 변경했습니다.");
  }
  
  public void deleteBoard() {
    int index = indexOfBoard(prompt.inputInt("번호? "));
    
    if (index == -1) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }
    
    this.boardList.remove(index);
    
    System.out.println("게시글을 삭제했습니다.");
  }
  
  private int indexOfBoard(int no) {
    for (int i = 0; i < this.boardList.size(); i++) {
      if (this.boardList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }
  
}







