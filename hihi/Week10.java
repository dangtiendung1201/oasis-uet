public class Week10 {
    List<String> getAllFunctions(String fileContent) {
        List<String> result = new ArrayList<>();
        String[] lines = fileContent.split("\n");
        
        for (String line : lines)
        {
            line = line.trim();
            result.add(line);
        }
        return result;
        
    }
}

                    
                    
