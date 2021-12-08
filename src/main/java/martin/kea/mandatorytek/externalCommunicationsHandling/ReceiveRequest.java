package martin.kea.mandatorytek.externalCommunicationsHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class ReceiveRequest {

    @Autowired
    HandleRequest handleRequest;

    @RequestMapping(method = RequestMethod.POST, path = "/friendship")
    public ResponseEntity<String> postGreetingRoot(@RequestBody Object req){
        Scanner scan = new Scanner(req.toString());
        String method = scan.next();
        String source = scan.next();
        String sourceHost = scan.next();
        String destination = scan.next();
        String destinationHost = scan.next();
        double version = scan.nextDouble();
        switch (method) {
            case "Add":
                handleRequest.handleAddRequest(source, sourceHost, destination, destinationHost);
                break;
            case "Accept":
                handleRequest.handleAcceptRequest();
                break;
            case "Deny":
                handleRequest.handleDenyRequest();
                break;
            case "Remove":
                handleRequest.handleRemoveRequest();
                break;
            case "Block":
                handleRequest.handleBlockRequest();
                break;
            default:
                System.out.println();
                break;
    }
        System.out.println("Root request: " + req);
        return ResponseEntity.ok("Hello from Server 2 (using POST)");
    }


}
