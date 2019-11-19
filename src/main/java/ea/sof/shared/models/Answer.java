package ea.sof.shared.models;


import ea.sof.shared.entities.CommentAnswerEntity;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Answer {

    private String id;
    private String userId;
    private String userEmail;
    private String body;
    private LocalDateTime created;
    private LocalDateTime lastEdited;
    private Integer votes = 0;
    private Integer active = 1;
    private List<CommentAnswer> topComments = new ArrayList<>();
    private String questionId;

}
