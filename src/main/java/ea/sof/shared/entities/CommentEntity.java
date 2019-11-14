package ea.sof.shared.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Document(collection = "comments")
public abstract class CommentEntity {
//    @Id
    private String id;
    private String body;
    private LocalDate date;

    private String userId;
    private String questionId;

}
