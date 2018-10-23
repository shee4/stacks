import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class mainActivity {
    public static List<String> readFileInList(String fileName)
    {
        List<String> lines = Collections.emptyList();
        try
        {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return lines;
    }
    public static void main(String[]args){
        var list = readFileInList("C:\\Users\\Николай\\IdeaProjects\\homework\\src\\input.txt");
        for(var str:list){
            var elements = str.split(" ");
        }
       // gorit zhopa Kolya blyat u nas stek mozhet prinimat tolko odin tip
    }
}
