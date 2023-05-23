package web.model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String Username;
    private String CurrenFirstName;
    private String CurrentLastName;
    private String CurrentMiddleName;
    private String ExternalUserId;
    private String UserId;
}
