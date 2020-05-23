package MegaByteConverter.exercise;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes >= 0) {

            long megaBytes = kiloBytes / 1024;
            long remMega = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remMega + " KB");
        } else {
            System.out.println("Invalid Value");
        }

    }

}