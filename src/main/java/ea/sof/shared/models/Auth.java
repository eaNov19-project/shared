package ea.sof.shared.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Auth {
    private String email;
    private String password;
}
