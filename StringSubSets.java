public class StringSubSets{

    public static void subString(String st ,String ans, int i ){

        if(i==st.length()){

            if(ans.length()==0){
                System.out.println(" null ");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
          // if choice is yes
          subString(st,ans+st.charAt(i), i+1 );
          // if choice is No
          subString(st, ans,i+1 );
    }



    public static void main(String args[]){

        String st ="abc";
        String ans =" ";
subString(st,ans,0);

        }
    }
