public class Goal_Parser_InterPretation {
    public static String interpret(String command) {
            command=command.replace("()","o");
            command=command.replace("(al)","al");
        return command;
    }

    public static void main(String[] args) {
        String command="G()()()(al)";
        System.out.println(interpret(command));
    }
}
