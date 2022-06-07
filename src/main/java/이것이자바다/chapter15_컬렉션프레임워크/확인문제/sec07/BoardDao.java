package 이것이자바다.chapter15_컬렉션프레임워크.확인문제.sec07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
        public List<Board> getBoardList() {
            List<Board> list = new ArrayList<>();
            list.add(new Board("제목1", "내용1"));
            list.add(new Board("제목2", "내용2"));
            list.add(new Board("제목3", "내용3"));
            return list;



    }
}
