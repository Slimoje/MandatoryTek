package martin.kea.mandatorytek.models;

import java.util.List;

public class User {
    private String email;
    private String host;
    private boolean internal;

    private List<User> friends;
    private List<User> blockedContacts;
    private List<Request> requests;
}
