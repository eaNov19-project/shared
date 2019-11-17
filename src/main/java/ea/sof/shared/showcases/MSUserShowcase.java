package ea.sof.shared.showcases;

import ea.sof.shared.models.Response;
import ea.sof.shared.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface MSUserShowcase {
    @PostMapping("/add")
    ResponseEntity<Response> addUser(@RequestBody User user);

    @PostMapping("/edit")
    ResponseEntity<Response> editUser(@RequestBody User user);

    @PostMapping("/get/{email}")
    ResponseEntity<Response> getUser(@PathVariable("email") String email);

}
