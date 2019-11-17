package ea.sof.shared.entities;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class CommentQuestionEntity {

    private String id;
    private String userId;
    private String body;
    private LocalDateTime created;
    private String questionId;
}
