package ea.sof.shared.entities;


import ea.sof.shared.models.Answer;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class AnswerEntity {
    public AnswerEntity(){}

    public AnswerEntity(Answer model){
        this.id = model.getId();
        this.userId = model.getUserId();
        this.body = model.getBody();
        this.created = model.getCreated();
        this.lastEdited = model.getLastEdited();
        this.votes = model.getVotes();
        if (model.getTopComments() != null)
            this.topComments = model.getTopComments().stream().map(x -> new CommentAnswerEntity(x)).collect(Collectors.toList());
        this.questionId = model.getQuestionId();
        this.active = model.getActive();
    }

    private String id;
    private String userId;
    private String body;
    private LocalDateTime created;
    private LocalDateTime lastEdited;
    private Integer votes = 0;
    private List<CommentAnswerEntity> topComments = new ArrayList<>();
    private String questionId;
    private Integer active;


    public void addAnswerComment(CommentAnswerEntity commentAnswerEntity) {
        topComments.add(commentAnswerEntity);

        //remove the oldest
        while (topComments.size() > 3){
            topComments.remove(0);
        }
    }

}
