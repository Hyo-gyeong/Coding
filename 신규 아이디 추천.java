class Solution {
    public String solution(String new_id) {
        String answer = "";
        //1단계
        new_id = new_id.toLowerCase();
        //2단계
        String special = "~!@#$%^&*()=+[{]}:?,<>/";
        for (int i = 0; i < special.length(); i++){
            String tmp = Character.toString(special.charAt(i));//0.converter
            if (new_id.contains(tmp) == true)//1.contains() method
                new_id = new_id.replace(tmp, "");//2.replace() method
        }
        //3단계
        while(new_id.contains(".."))
            new_id = new_id.replace("..", ".");
        System.out.println("3 : "+new_id);
        //4,5단계
        if (new_id.charAt(0) == '.')
            if(new_id.length() == 1)
                new_id = "aaa";
            else
                new_id = new_id.substring(1, new_id.length());
        if (new_id.charAt(new_id.length()-1) == '.')
            if (new_id.length() == 1)
                new_id = "aaa";
            else
                new_id = new_id.substring(0, new_id.length()-1);
        //6단계
        if(new_id.length() >= 16)
            new_id = new_id.substring(0,15);
        //5단계
        if (new_id.charAt(0) == '.')
            if(new_id.length() == 1)
                new_id = "aaa";
            else
                new_id = new_id.substring(1, new_id.length());
        if (new_id.charAt(new_id.length()-1) == '.')
            if (new_id.length() == 1)
                new_id = "aaa";
            else
                new_id = new_id.substring(0, new_id.length()-1);
        //7단계
        if (new_id.length() <= 1){
            char tmp = new_id.charAt(new_id.length()-1);
            new_id = new_id + tmp + tmp;//+= tmp + tmp 불가
        }
        else if(new_id.length() <= 2)
            new_id += new_id.charAt(new_id.length()-1);
        return new_id;
    }
}
-----------------------------------------------------------------------------------
memo)
0.Converter
-char to String
  char c='M';
  String s=Character.toString(c);
-String to char
  String g = "line";
  char c = g.charAt(0);  // returns 'l'
  char[] c_arr = g.toCharArray(); // returns a length 4 char array ['l','i','n','e']
-int to Integer
  int x = 123;
  Integer y = new Integer(x);
-int to String
  int i=200;  
  String s=String.valueOf(i);  
  
1.Find out if a "string" contains a sequence of characters -> char는 대입 불가.

2.The java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
-----------------------------------------------------------------------------------
