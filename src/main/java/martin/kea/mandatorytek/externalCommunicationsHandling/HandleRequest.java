package martin.kea.mandatorytek.externalCommunicationsHandling;

import martin.kea.mandatorytek.models.Request;
import martin.kea.mandatorytek.models.User;
import martin.kea.mandatorytek.repositories.RequestRepository;
import martin.kea.mandatorytek.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HandleRequest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RequestRepository requestRepository;

    public String handleAddRequest(String source, String sourceHost, String destination, String destinationHost) {
        User userSource = new User(source, sourceHost);

        User userDestination = new User(destination, destinationHost);

        if(userRepository.existsByEmail(sourceHost)) {
            Request newRequest = new Request(userSource, userDestination, "Add");

            requestRepository.save(newRequest);

            return "Friend request is sent.";
            }
        return "This user does not exist.";
    }

    public String handleAcceptRequest() {
        return null;
    }

    public String handleDenyRequest() {
        return null;
    }

    public String handleRemoveRequest() {
        return null;
    }

    public String handleBlockRequest() {
        return null;
    }

}
