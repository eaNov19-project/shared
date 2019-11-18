package ea.sof.shared.entities;

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
    private String answerId;

}
