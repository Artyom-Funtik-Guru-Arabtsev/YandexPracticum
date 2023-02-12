public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        for (int i = 0; i < grades.length; i++){
            String[] gradeM = grades[i].split(" ");
            grades[i] = String.join(",", gradeM[0].toLowerCase(), gradeM[1].toLowerCase(),gradeM[2].toLowerCase(), gradeStringToInt(gradeM[4]));
        }
        return String.join(";",grades);
    }

}