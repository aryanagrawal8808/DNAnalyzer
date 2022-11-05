package DNAnalyzer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Utils {
    /**
     * Reads the contents of a file, stripping out newlines and converting
     * everything to lowercase.
     *
     * @param file the file to read
     * @return String with the contents of the file (newlines removed and converted
     *         to lowercase)
     * @throws IOException if there is an error reading the file
     */
    public static String readFile(final File file) {
        try {
            return Files.readString(file.toPath()).replace("\n", "").toLowerCase();
        } catch (IOException e) {
            return null;
        }
    }
}
