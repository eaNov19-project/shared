package ea.sof.shared.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
public class Response {
    private Boolean success;
    private String message = "";
    private Map<String, Object> data = new HashMap<>();

    public Response(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
