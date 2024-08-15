public class IsHexadecimalString {

    public String str;

    public IsHexadecimalString(String str) {
        this.str = str;
    }
    
    public boolean isHexadecimalChar(char ch) {
        // Write your code here
        if((ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f')) {
            return true;
        }
        return false;
    }

    public boolean isHexadecimal() {
        // Write your code here
        if(str == null || str.length() == 0) {
            return false;
        }
        for(char ch : str.toCharArray()) {
            if(!isHexadecimalChar(ch) && !Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        IsHexadecimalString obj = new IsHexadecimalString("123F");
        System.out.println(obj.isHexadecimal()? "Yes" : "No");
    }

    
}