package ea.sof.shared.queue_models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentQuestionQueueModel {
    private String id;
    private String body;
    private Integer active;
}
