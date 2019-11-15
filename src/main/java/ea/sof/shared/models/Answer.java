package ea.sof.shared.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    private String id;
    private String body;
    private LocalDate date;
    private Integer upvotes = 0;
    private List<Comment> topComments = new ArrayList<>();

    private String userId;
    private String userName;
}
