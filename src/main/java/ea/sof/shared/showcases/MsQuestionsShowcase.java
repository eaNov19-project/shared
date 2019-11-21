package ea.sof.shared.showcases;

import ea.sof.shared.Np;
import ea.sof.shared.models.QuestionFollowers;
import ea.sof.shared.models.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

public interface MsQuestionsShowcase {
    @GetMapping("/questions/{questionId}/followers")
    ResponseEntity<Response> getFollowersByQuestionId(@PathVariable("questionId") String questionId, @RequestHeader(Np.SecretHeader) String serviceSecret);
}
