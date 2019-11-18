package ea.sof.shared.showcases;

import ea.sof.shared.models.Answer;
import ea.sof.shared.models.QuestionFollowers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

public interface MsAnswersShowcase {

    // Retrieve answer by id
    @GetMapping("/answers/{id}")
    ResponseEntity<Answer> getAnswer(@PathVariable("id") String id, @RequestHeader("service-secret") String serviceSecret);

    // Retrieve top 10 answers for given question
    @GetMapping("/answers/top10/{questionId}")
    ResponseEntity<List<Answer>> getAnswersByQuestionId(@PathVariable("questionId") String questionId, @RequestHeader("service-secret") String serviceSecret);
}
