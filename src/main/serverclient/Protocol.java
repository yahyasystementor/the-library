package main.serverclient;

public class Protocol {

    public String reponse(String message){

        if (message == null || message.isBlank()){
            return "ERROR Empty message";
        }

        String[] parts = message.trim().split("\\s+", 2);

        String command = parts[0].toUpperCase();

        switch (command){

            case "PING":
                return "OK PONG";
            case "ECHO":
                if (parts.length < 2){
                    return "ERROR missing text";
                }
                return "OK " + parts[1];

            case "QUIT":
                return "Bye";

            default:
                return "ERROR unknown command";

        }
    }

}
