package ea.sof.shared.models;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Response {
    private Boolean success;
    private String message = "";

    private Object value;

    private Map<String, Object> data = new HashMap<>();

    public Response(){
        this.success = true;
    }

    public Response(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Response(Boolean success, String dataKey, Object dataObject){
        this.success = success;
        this.data.put(dataKey, dataObject);
    }

    public void addObject(String dataKey, Object dataObject){
        this.data.put(dataKey, dataObject);
    }
}
