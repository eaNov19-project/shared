package ea.sof.shared.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommentQuestion {
    private String id;
    private String body;
    private LocalDateTime created = LocalDateTime.now();

    private String userId;
    private String userName;
    private String questionId;
    private Integer active;
}
