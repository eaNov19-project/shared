package ea.sof.shared.queue_models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnswerQueueModel {
    private String id;
    private String questionId;
    private String body;
    private Integer active;
    private Integer votes = 0;
}
