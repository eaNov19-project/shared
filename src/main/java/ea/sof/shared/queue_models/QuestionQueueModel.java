package ea.sof.shared.queue_models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class QuestionQueueModel implements Serializable {
    private String id;
    private String title;
    private String body;
    private Integer active;
}
