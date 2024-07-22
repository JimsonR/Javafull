import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.regex.*;
import java.util.*;

public class MCQExtractor {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\jimmy\\Downloads\\FMGE_150_MCQs.txt"; // Replace with your file path

        try {
            // Read all bytes from the file and convert to a string
            String content = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);

            // Regex pattern to capture the question and its options
            String patternString = "(\\d+\\.\\s\\([A-Za-z]+\\).+?)\\n\\s+A\\.(.+?)\\n\\s+B\\.(.+?)\\n\\s+C\\.(.+?)\\n\\s+D\\.(.+?)(?=\\n|$)";
            Pattern pattern = Pattern.compile(patternString, Pattern.DOTALL);
            Matcher matcher = pattern.matcher(content);

            // HashMap to store the questions and options
            Map<String, Map<String, String>> questionsMap = new HashMap<>();

            while (matcher.find()) {
                String question = matcher.group(1).trim();
                Map<String, String> options = new HashMap<>();
                options.put("A", matcher.group(2).trim());
                options.put("B", matcher.group(3).trim());
                options.put("C", matcher.group(4).trim());
                options.put("D", matcher.group(5).trim());

                questionsMap.put(question, options);

            }

            // Print the resulting map
            for (Map.Entry<String, Map<String, String>> entry : questionsMap.entrySet()) {
                System.out.println("Question: " + entry.getKey());
                for (Map.Entry<String, String> option : entry.getValue().entrySet()) {
                    System.out.println("   " + option.getKey() + ". " + option.getValue());
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
