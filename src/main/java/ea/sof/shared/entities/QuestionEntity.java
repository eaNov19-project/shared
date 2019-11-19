package ea.sof.shared.entities;

import ea.sof.shared.models.Answer;
import ea.sof.shared.models.CommentQuestion;
import ea.sof.shared.models.Question;
import ea.sof.shared.queue_models.QuestionQueueModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@NoArgsConstructor
@Setter
@Getter
public class QuestionEntity {
	private String id;
	private String userId;
	private String userEmail;
	private String title;
	private String body;
	private LocalDateTime created;
	private LocalDateTime lastEdited;
	private Integer votes = 0;
	private List<CommentQuestionEntity> topComments = new ArrayList<>();
	private List<AnswerEntity> topAnswers = new ArrayList<>();

	private Set<String> followerEmails = new HashSet<>();

	public Question toQuestionModel() {
		Question questionModel = new Question();
		questionModel.setId(this.id);
		questionModel.setUserId(this.userId);
		questionModel.setUserEmail(this.userEmail);
		questionModel.setTitle(this.title);
		questionModel.setBody(this.body);
		questionModel.setCreated(this.created);
		questionModel.setLastEdited(this.lastEdited);
		questionModel.setUpvotes(this.votes);

		List<CommentQuestion> topComments = this.topComments.stream().map(cqe -> cqe.toCommentQuestionModel()).collect(Collectors.toList());
		questionModel.setTopComments(topComments);

		return questionModel;
	}

	public QuestionQueueModel toQuestionQueueModel() {
		QuestionQueueModel questionQueueModel = new QuestionQueueModel();
		questionQueueModel.setId(this.id);
		questionQueueModel.setTitle(this.title);
		questionQueueModel.setBody(this.body);
		return questionQueueModel;
	}

	public void addAnswer(AnswerEntity answerEntity) {
		topAnswers.add(answerEntity);
		topAnswers = topAnswers.stream().sorted(Comparator.comparingInt(AnswerEntity::getVotes).reversed()).limit(5).collect(Collectors.toList());
	}

	public void addQuestionComment(CommentQuestionEntity commentQuestionEntity) {
		topComments.add(commentQuestionEntity);

		//remove the oldest
		while (topComments.size() > 3) {
			topComments.remove(0);
		}
	}

}
