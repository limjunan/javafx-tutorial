public class Duke {
    private String commandType;

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Returns a canned reply for the given input, and records a rough
     * "command type" from its first word so the GUI can style the
     * reply bubble differently depending on what kind of command it
     * was (see MainWindow/DialogBox for how that's used).
     */
    public String getResponse(String input) {
        String firstWord = input.trim().split("\\s+", 2)[0].toLowerCase();
        switch (firstWord) {
        case "todo":
        case "deadline":
        case "event":
            commandType = "AddCommand";
            break;
        case "mark":
        case "unmark":
            commandType = "ChangeMarkCommand";
            break;
        case "delete":
            commandType = "DeleteCommand";
            break;
        default:
            commandType = "UnknownCommand";
        }
        return "Duke heard: " + input;
    }

    public String getCommandType() {
        return commandType;
    }
}
