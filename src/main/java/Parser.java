import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Parser {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Squad squad = objectMapper.readValue(Parser.class.getResourceAsStream("squad.json"),Squad.class);
        System.out.println(squad.getSquadName());
    }
}
