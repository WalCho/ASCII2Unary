import java.util.*;

class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        in.close();
        byte[] bytes = message.getBytes();
        StringBuilder messageToBinary = new StringBuilder();
        for (int aByte : bytes) {
            for (int j = 0; j < 7; j++) {
                aByte <<= 1;
                messageToBinary.append((aByte & 128) == 0 ? 0 : 1);
            }
        }
        System.err.println(messageToBinary);
        StringBuilder result = new StringBuilder();
        for (int i=0; i<messageToBinary.length(); i++) {
            if (messageToBinary.charAt(i) == '1') {
                result.append(" 0 ");
                for (int j=i; j<messageToBinary.length(); j++) {
                    if (messageToBinary.charAt(j) == '1') {
                        result.append("0");
                        i = j;
                    } else {
                        break;
                    }
                }
            } else {
                result.append(" 00 ");
                for (int j=i; j<messageToBinary.length(); j++) {
                    if (messageToBinary.charAt(j) == '0') {
                        result.append("0");
                        i = j;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(result.toString().trim());
    }
}
