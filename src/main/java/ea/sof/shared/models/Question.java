package ea.sof.shared.models;

import ea.sof.shared.entities.AnswerEntity;
import ea.sof.shared.entities.CommentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    private String id;
    private String userId;
    private String title;
    private String body;
    private LocalDate created;
    private LocalDate lastEdited;
    private Integer upvotes = 0;
    private List<Comment> topComments;
    private List<Answer> topAnswers;

}
