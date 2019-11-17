package ea.sof.shared.models;


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
    private String body;
    private LocalDateTime date;
    private Integer upvotes = 0;
    private List<CommentAnswer> topComments = new ArrayList<>();
    private String questionId;

    private String userId;
    private String userName;
}
