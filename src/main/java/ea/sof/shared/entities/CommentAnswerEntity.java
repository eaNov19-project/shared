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
	public CommentAnswerEntity(CommentAnswer model) {
		if (model == null) return;

		this.id = model.getId();
		this.body = model.getBody();
        this.created = model.getCreated();
        this.userId = model.getUserId();
        this.questionId = model.getQuestionId();
        this.answerId = model.getAnswerId();
        this.active = model.getActive();
	}

	private String id;
	private String body;
	private LocalDateTime created;

	private String userId;
	private String questionId;
	private String answerId;
	private Integer active;

	public CommentAnswer toCommentAnswerModel() {
		CommentAnswer commentAnswer = new CommentAnswer();
		commentAnswer.setId(this.id);
		commentAnswer.setUserId(this.userId);
		commentAnswer.setBody(this.body);
		commentAnswer.setCreated(this.created);
		commentAnswer.setAnswerId(this.answerId);
		commentAnswer.setQuestionId(this.questionId);
		commentAnswer.setActive(this.active);
		return commentAnswer;
	}
}
