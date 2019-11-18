package ea.sof.shared.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    private String id;
    private String userId;
    private String title;
    private String body;
    private LocalDateTime created;
    private LocalDateTime lastEdited;
    private Integer upvotes = 0;
    private List<CommentQuestion> topComments;
    private List<Answer> topAnswers;

}
