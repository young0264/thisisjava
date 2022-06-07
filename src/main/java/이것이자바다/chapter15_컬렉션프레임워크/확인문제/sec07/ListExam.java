package 이것이자바다.chapter15_컬렉션프레임워크.확인문제.sec07;

import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for (Board board : list) {
            System.out.println(board.getTitle() +"-" + board.getContent());
        }

    }

}

