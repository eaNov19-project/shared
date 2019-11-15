package ea.sof.shared.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Document(collection = "comments")
public abstract class CommentQuestionEntity {
//    @Id
    private String id;
    private String body;
    private LocalDateTime date;

    private String userId;
    private String questionId;

}
