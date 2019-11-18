package ea.sof.shared.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnswerEntity {
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
