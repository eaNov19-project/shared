package ea.sof.shared.showcases;

import ea.sof.shared.models.Auth;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

public interface MsAuthShowcase {

    @GetMapping("/validate-token")
    ResponseEntity<?> validateToken(@RequestHeader(name="Authorization", required = false) String token);

    @PostMapping("/add-auth")
    ResponseEntity<?> addAuth(@RequestBody Auth auth);
}
