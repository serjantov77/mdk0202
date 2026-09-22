package task4;

import java.util.Arrays;

public class PostComment {
    private String text;
    private String whoLiked;

    public void setText(String text) {
        this.text = text;
    }

    public void setWhoLiked(String[] whoLiked) {
        if (whoLiked != null) {
            this.whoLiked = Arrays.toString(whoLiked);
        } else {
            this.whoLiked = null;
        }
    }

    @Override
    public String toString() {
        return "PostComment{" +
                "text='" + text + '\'' +
                ", whoLiked=" + whoLiked +
                '}';
    }
}