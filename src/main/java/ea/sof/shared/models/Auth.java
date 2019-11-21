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

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    private Integer userId;
    private String email;
    private String password;

}
