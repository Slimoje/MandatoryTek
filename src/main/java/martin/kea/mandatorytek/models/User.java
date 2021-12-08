package martin.kea.mandatorytek.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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

    @ManyToMany
    private List<User> friends;

    @ManyToMany
    private List<User> blockedContacts;

    @OneToMany(mappedBy = "destination", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Request> requests;

    public User(String email, String host) {
        this.email = email;
        this.host = host;
    }
}
