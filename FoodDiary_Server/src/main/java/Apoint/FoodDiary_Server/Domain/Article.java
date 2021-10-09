package Apoint.FoodDiary_Server.Domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Article {

    private long articleId;
    private String email;
    private String title;
    private String image;
    private String comment;

}
