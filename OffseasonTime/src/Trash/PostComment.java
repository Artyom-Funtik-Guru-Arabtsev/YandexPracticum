package Trash;

import java.util.Arrays;

public class PostComment {
    private String text; // содержание комментария
    private String[] whoLiked; // кто поддержал

    public void setText(String text) {
        this.text = text;
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }

    @Override
    public String toString() {
        String result = "Trash.PostComment{";
        if (text == null) result += "text=null, ";
        else result += "text='" + text + "', ";
        result += "whoLiked=" + Arrays.toString(whoLiked) + "}";
        return result;
    }
}
/*
comments=[Trash.PostComment{text='x!', whoLiked=[x, x]},
        Trash.PostComment{text='x', whoLiked=[x,x]},
        Trash.PostComment{text='x', whoLiked=null}]} */