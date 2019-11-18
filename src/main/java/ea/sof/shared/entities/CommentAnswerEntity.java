package ea.sof.shared.entities;

import ea.sof.shared.models.CommentAnswer;
import ea.sof.shared.models.CommentQuestion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentAnswerEntity {
    private String id;
    private String body;
    private LocalDateTime date;

    private String userId;
    private String questionId;
    private String answerId;
    private String questionId;
    private Integer active;
    public CommentAnswer toCommentAnswerModel(){
        CommentAnswer commentAnswer = new CommentAnswer();
        commentAnswer.setId(this.id);
        commentAnswer.setUserId(this.userId);
        commentAnswer.setBody(this.body);
        commentAnswer.setCreated(this.date);
        commentAnswer.setAnswerId(this.answerId);
        commentAnswer.setQuestionId(this.questionId);
        commentAnswer.setActive(this.active);
        return commentAnswer;
    }
}
