package ea.sof.shared.entities;

import java.time.LocalDateTime;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Document(collection = "comments")
public abstract class CommentAnswerEntity {
//    @Id
    private String id;
    private String body;
    private LocalDateTime date;

    private String userId;
    private String answerId;

}
