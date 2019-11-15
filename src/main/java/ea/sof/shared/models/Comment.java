package ea.sof.shared.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comment {
    private String id;
    private String body;
    private LocalDateTime date = LocalDateTime.now();

    private String userId;
    private String userName;
    private String questionId;

}
