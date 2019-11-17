package ea.sof.shared.models;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class QuestionFollowers {

    private String id;
    private String title;
    private Set<String> followerEmails = new HashSet<>();

}

