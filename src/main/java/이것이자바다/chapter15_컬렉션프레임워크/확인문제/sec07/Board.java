package 이것이자바다.chapter15_컬렉션프레임워크.확인문제.sec07;

public class Board {
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Board(String title, String content) {
        this.title = title;
        this.content = content;

    }
}
