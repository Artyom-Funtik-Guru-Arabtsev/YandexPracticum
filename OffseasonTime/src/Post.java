import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    private String title; // заголовок
    private String content; // содержание
    private String[] tags; // теги
    private ArrayList<PostComment> comments; //комментарии

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }


    @Override
    public String toString() {
        String result = "Post{" +
                "title='" + title + "', ";
        if (content == null) {
            result += "content.length=null, ";
        } else {
            result += "content.length=" + content.length() + ", ";
        }
        result += "tags=" + Arrays.toString(tags) + ",\n";
        result += "comments=" + Arrays.toString(comments.toArray());
        return result+='}';
    }
}