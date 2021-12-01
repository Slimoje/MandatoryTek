package martin.kea.mandatorytek.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name="users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String email;

    @Column
    private String host;

    @Column
    private boolean internal;

    private List<User> friends;
    private List<User> blockedContacts;
    private List<Request> requests;
}
