package ea.sof.shared.queue_models;


import ea.sof.shared.models.CommentAnswer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnswerQueueModel {
    private String id;
    private String body;
    private Integer active;
}
