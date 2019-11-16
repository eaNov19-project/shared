package ea.sof.shared.showcases;

import ea.sof.shared.models.Auth;
import ea.sof.shared.models.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

public interface MsAuthShowcase {

    @GetMapping("/auth/validate-token")
    ResponseEntity<Response> validateToken(@RequestHeader(name="Authorization", required = false) String token);

    @PostMapping("/auth/add-auth")
    ResponseEntity<Response> addAuth(@RequestBody Auth auth);

    @PostMapping("/auth/login")
    ResponseEntity<Response> login(@RequestBody Auth auth);
}
