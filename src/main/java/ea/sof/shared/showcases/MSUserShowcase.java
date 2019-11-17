package ea.sof.shared.showcases;

import ea.sof.shared.models.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface MSUserShowcase {
    @PostMapping("/api/users/get/{email}")
    ResponseEntity<Response> getUser(@PathVariable("email") String email);
}
