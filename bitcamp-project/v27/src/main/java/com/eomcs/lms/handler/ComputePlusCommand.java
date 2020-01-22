// "/board/add" 명령어 처리
package com.eomcs.lms.handler;

import java.util.List;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.Prompt;

public class ComputePlusCommand implements Command {

  List<Board> boardList;

  Prompt prompt;

  public ComputePlusCommand(Prompt prompt) {
    this.prompt = prompt;
  }

  @Override
  public void execute() {
    int a = prompt.inputInt("수1?");
    int b = prompt.inputInt("수2?");
    System.out.printf("계산결과는  %d입니다", a + b);
  }

}


