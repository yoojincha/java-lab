public class Question5 {
      public static void main(String[] args) {
      char [] chs = new char[] {'A', 'B', ' ', 'C', 'D'};
      MyString str1 = new MyString(chs);
      chs[0] = 'Z';   
      
      System.out.print("str1 문자열 : ");
      MyString.println(str1);  // AB CD   
      System.out.print("str1 문자열의 길이 : ");
      System.out.println(str1.length());  // 5
      
      MyString str2 = new MyString(new char[] {'A', 'B', ' ', 'C', 'D', 'E'});
      System.out.print("str2 문자열 : ");
      MyString.println(str2);  // AB CDE   
      if (str1.equals(str2))
         System.out.println("str1 과 str2 문자열은 같습니다");
      else
         System.out.println("str1 과 str2 문자열은 다릅니다");
      
      MyString str3 = new MyString(new char[] {' ','\t','A', 'b', ' ', 'C', 'd',' '});
    //  MyString str4 = str3.trim().toUpperCase();     
      MyString str4 =  new MyString(new char[] {'A', 'B', ' ', 'C', 'D'});
      System.out.print("str4 문자열 : ");
      MyString.println(str4);  // AB CD   
      if (str1.equals(str4))
         System.out.println("str1 과 str4 문자열은 같습니다");
      else
         System.out.println("str1 과 str4 문자열은 다릅니다");
                                        
      MyString sub = new MyString(new char[] {'B', ' ', 'C'});
      System.out.print("sub 문자열 : ");
      MyString.println(sub);  // B C   
            
      if (str1.contains(sub)) 
         System.out.println("str1은 sub 문자열을 포함합니다 ");
      else
         System.out.println("str1은 sub 문자열을 포함하지 않습니다.");
      }
}

class MyString{
   char[] ArrString = new char[10];
  
   public MyString(char[] C){ //MyString 클래스 생성자
      int i =0;
      for(i=0; i<C.length; ++i){  // char타입으로 한글자씩 복사
         this.ArrString[i]=C[i];
      }
      this.ArrString[i] = '@'; //문자열의 끝 표시
   }

   public char[] trim() {  //공백제거 함수
      return this.ArrString;
   }
   public char[] toUpperCase() { //대문자 전환 함수
      return this.ArrString;
   }

   public boolean equals(MyString sub) { //같은 문자열 검사 함수
      for(int i =0; i<10; ++i){
         if(this.ArrString[i] != sub.ArrString[i]){ //문자가 다른 경우 false
            return false;
         }
         if(sub.ArrString[i]=='@'){ //끝문자까지 같은 경우 true
            return true;
         }
      }
      return true;
   }
   
   public boolean contains(MyString sub) { //sub가 포함 된 문자열 여부 검사 함수
      int j = sub.length();
      int t =0;
      
      for(int i=0,k=0; i<10; ++i){
         if(this.ArrString[i]==sub.ArrString[k]){  //같은 글자 발견시
            for(t=i;k==j;++k,++t){
               if(this.ArrString[t]!=sub.ArrString[k]){ //다른글자 발견시 for문 break.
                  break;
               }
            }
            if(t==k){  //sub 문자열이 포함 된 경우 true return.
               return true;
            }
            else{
               t=0;
               k=0;
            }
         }
      }    
      return true;
   }

   public int length() { //배열 길이 계산 함수
      int t =0;
      for( ;t<10;t++){
         if(ArrString[t]=='@'){ //끝문자 까지 검사
            break;
         }
      }
      return t;
   }

   public static void println(MyString str1) { //배열 출력함수
      for(int i =0 ; i<10; ++i){
         if(str1.ArrString[i]=='@'){ //끝문자 발견시 문자열 끝남
            break;
         }
         System.out.print(str1.ArrString[i]);   
      }
      System.out.println();
   }
}