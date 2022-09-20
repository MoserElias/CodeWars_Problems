public class HandshakeProblem {
    public static int GetParticipants(int handshakes) {
        int increment = 0;

        int res = 0;
        for (int i = 0; i < handshakes; i += increment++) {
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(GetParticipants(7));
    }
}
