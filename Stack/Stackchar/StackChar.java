package Stack.Stackchar;

public class StackChar {
    private  String newString;
    private char[] charString;
    private int contage;
    private boolean isTrue;

    public StackChar(String one ){
        this.newString = one;
    }

    public boolean isPalindrome(){
        this.newString = this.newString.replace(" ", "");
        this.charString = new char[this.newString.length()];
        this.contage = this.newString.length()-1;
      
        for(int i =0;i<this.newString.length();i++){
        this.charString [i] = this.newString.charAt(i);
       }

       for(int k =0;k<charString.length;k++){
        if (k == this.contage) {
            break;
        }
        if (this.charString[k] == this.charString[this.contage] ) {
            this.isTrue = true;
        }
        this.contage--;
       }

       if (isTrue == true) {
        return this.isTrue;
       }
         return false;
       

       
    }
}
