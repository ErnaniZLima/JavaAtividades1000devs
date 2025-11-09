package AtividadeForca;

public class Vidas {

    public static String valor(int vida) {
        switch (vida) {
            case 6:
                return "    +--+\r\n" +
                        "    |  |\r\n" +
                        "       |\r\n" +
                        "       |\r\n" +
                        "       |\r\n" +
                        "       |\r\n" +
                        "=========";

            case 5:
                return "    +--+\r\n" +
                        "    |  |\r\n" +
                        "    O  |\r\n" +
                        "       |\r\n" +
                        "       |\r\n" +
                        "       |\r\n" +
                        "=========";

            case 4:
                return "    +--+\r\n" +
                        "    |  |\r\n" +
                        "    O  |\r\n" +
                        "   /|  |\r\n" +
                        "       |\r\n" +
                        "       |\r\n" +
                        "=========";

            case 3:
                return "    +--+\r\n" +
                        "    |  |\r\n" +
                        "    O  |\r\n" +
                        "   /|\\ |\r\n" +
                        "       |\r\n" +
                        "       |\r\n" +
                        "=========";

            case 2:
                return "    +--+\r\n" +
                        "    |  |\r\n" +
                        "    O  |\r\n" +
                        "   /|\\ |\r\n" +
                        "   /   |\r\n" +
                        "       |\r\n" +
                        "=========";

            case 1:
                return "    +--+\r\n" +
                        "    |  |\r\n" +
                        "    O  |\r\n" +
                        "   /|\\ |\r\n" +
                        "   / \\ |\r\n" +
                        "       |\r\n" +
                        "=========";

        }
        return "====";
    }

}