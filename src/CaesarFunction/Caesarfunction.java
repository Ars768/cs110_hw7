package CaesarFunction;

public class Caesarfunction {
	public char[] Uppercase = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public char[] Lowercase = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public StringBuilder CodeText(String str, int amount){
        amount %= 26;
        StringBuilder Codedstr = new StringBuilder(str);
        for (int a = 0; a < str.length(); a++) {
            for (int b = 0; b < 26; b++) {
                if(str.charAt(a) == ' '){
                   break;
                }
                else if (str.charAt(a) == Uppercase[b]) {
                    if(b+amount >= 26){                   
                    	Codedstr.setCharAt(a, Uppercase[b+amount-26]);
                    }
                    else{
                    	Codedstr.setCharAt(a, Uppercase[b+amount]);
                    }
                    break;
                }
                else if (str.charAt(a) == Lowercase[b]) {
                    if(b+amount >= 26){                   
                    	Codedstr.setCharAt(a, Lowercase[b+amount-26]);
                    }
                    else{
                    	Codedstr.setCharAt(a, Lowercase[b+amount]);
                    }
                    break;    
                }           
            }
        }
        return Codedstr;
    }
}