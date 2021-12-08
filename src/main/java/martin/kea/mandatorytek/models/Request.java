package martin.kea.mandatorytek.models;

import javax.persistence.*;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne
    private User source;

    @ManyToOne
    private User destination;

    @Column
    private String requestMethod;

    public Request(User source, User destination, String method) {
        this.source = source;
        this.destination = destination;
        requestMethod = method;
    }
}
