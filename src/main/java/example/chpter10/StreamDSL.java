package example.chpter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 설명작성란
 *
 * @author : 유호철
 * @see
 * @since 1.0
 */
public class StreamDSL {
    public static void main(String[] args) throws IOException {
        int errorCnt = 0;
        List<String> errors = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(""));
        String line = reader.readLine();

        while (errorCnt < 40 && line != null) {
            if (line.startsWith("ERROR")) {
                errors.add(line);
                errorCnt++;
            }
            line = reader.readLine();
        }

        List<String> error = Files.lines(Paths.get(""))
            .filter(a -> a.startsWith("ERROR"))
            .limit(40)
            .collect(Collectors.toList());
    }
}
