package lab6;

public interface Validation {
    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ( !Character.isDigit(str.charAt(i)) ) {
                return false;
            }
        }
        return true;            
    }
    public static boolean isWithinRange(String str) {
        if ( Integer.parseInt(str) > 720) {
            return false;
        }
        return true;
    }
    public boolean validateFields();
}
