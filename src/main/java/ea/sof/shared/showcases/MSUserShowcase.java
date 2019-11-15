package ea.sof.shared.showcases;

import ea.sof.shared.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface MSUserShowcase {
    @PostMapping("/add")
    ResponseEntity<?> addUser(@RequestBody User user);

    @PostMapping("/edit")
    ResponseEntity<?> editUser(@RequestBody User user);

    @PostMapping("/get")
    ResponseEntity<?> getUser(@PathVariable String username);

}
