public class PermutationsInString {

    public static void permutations(   String st,  String ans) {

        if(st.length()==0){

            System.out.println(ans);
            return;
        }
        for(int i=0 ; i<st.length();i++){
            char ch = st.charAt(i);
            String newStr = st.substring(0, i)+st.substring(i+1);
            permutations(newStr, ans+ch);
        }
        
    }

    public static void main(String args[]){
        String st = "abc";
        String ans = " ";
        permutations(st,ans);
    }
    
}
