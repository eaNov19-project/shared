package ea.sof.shared.showcases;

import ea.sof.shared.entities.AnswerEntity;
import ea.sof.shared.models.Answer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface MsAnswersShowcase {

    // Retrieve answer by id
    @GetMapping("/answers/{id}/entity")
    ResponseEntity<AnswerEntity> getAnswer(@PathVariable("id") String id);

    // Retrieve top 5 answers for given question
    @GetMapping("/answers/top5/{questionId}")
    ResponseEntity<List<AnswerEntity>> getTop5AnswersByQuestionId(@PathVariable("questionId") String questionId);
}
