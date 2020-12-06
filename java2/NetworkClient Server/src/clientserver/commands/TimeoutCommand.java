package clientserver.commands;

import java.io.Serializable;

public class TimeoutCommand implements Serializable {

    private final String timeoutMessage;

    public TimeoutCommand(String timeoutMessage) {
        this.timeoutMessage = timeoutMessage;
    }

}