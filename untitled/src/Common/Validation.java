package Common;


public class Validation {


    public boolean isNumericDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isNumericInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public boolean isValid(String data, String regex) {
        if (!data.trim().matches(regex)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isName(String data) {
        if (data.isEmpty())
            return false;
        return true;
    }

    public boolean isSemester(String data) {
        if (data.equalsIgnoreCase("spring") ||
                data.equalsIgnoreCase("fall") ||
                data.equalsIgnoreCase("summer"))
            return true;
        return false;
    }

    public boolean isCourse(String data) {
        if (data.equalsIgnoreCase("java") ||
                data.equalsIgnoreCase("c/c++") ||
                data.equalsIgnoreCase(".net"))
            return true;
        return false;
    }
}
