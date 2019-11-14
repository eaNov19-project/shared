package ea.sof.shared.entities;


import org.springframework.data.annotation.Id;

public abstract class AnswerEntity {
    private String id;

    private String body;
    private String userId;
    private String questionId;


}
