package ea.sof.shared.entities;

import ea.sof.shared.models.CommentQuestion;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentQuestionEntity {

    private String id;
    private String userId;
    private String body;
    private LocalDateTime created;
    private String questionId;
    private Integer active;
    public CommentQuestion toCommentQuestionModel(){
        CommentQuestion commentQuestion = new CommentQuestion();
        commentQuestion.setId(this.id);
        commentQuestion.setUserId(this.userId);
        commentQuestion.setBody(this.body);
        commentQuestion.setCreated(this.created);
        commentQuestion.setQuestionId(this.questionId);
        commentQuestion.setActive(this.active);
        return commentQuestion;
    }
}
