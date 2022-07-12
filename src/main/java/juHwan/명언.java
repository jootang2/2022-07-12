package juHwan;

public class 명언 {

    public int id;

    public String contents;

    public String author;

    public 명언(int id, String contents, String author) {

        this.id = id;
        this.contents = contents;
        this.author = author;

    }

    @Override
    public String toString() {
        return "명언{" +
                "id=" + id +
                ", contents='" + contents + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
