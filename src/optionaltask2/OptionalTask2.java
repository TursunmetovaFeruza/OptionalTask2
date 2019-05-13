
package optionaltask2;
import java.util.Scanner;
public class OptionalTask2 {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    int arr[]=new int [5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("\n");
/*OptionalTask 2.1
        Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        */
        System.out.println("First task");
    int minn=arr[0],maxn=arr[0];
    int min=String.valueOf(arr[0]).length();
    int max=String.valueOf(arr[0]).length();
        for (int i = 0; i < arr.length; i++) {
            if(String.valueOf(arr[i]).length()<min){
                min=String.valueOf(arr[i]).length();
                minn=arr[i];
            }
            if(String.valueOf(arr[i]).length()>max){
                max=String.valueOf(arr[i]).length();
                maxn=arr[i];
            }
        }
        System.out.println("Short number: "+minn+" length: "+min);
        System.out.println("Long number: "+maxn+" length: "+max);
        System.out.println("\n");
/*OptionalTask 2.2
    Вывести числа в порядке возрастания (убывания) значений их длины.
    */
        System.out.println("Second task");
        int x;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
              if(String.valueOf(arr[i]).length()<String.valueOf(arr[j]).length()){
              x=arr[i];
              arr[i]=arr[j];
              arr[j]=x;
            }   
            }
        }
        System.out.println("New array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n");
/*OptionalTask 2.3
     Вывести на консоль те числа, длина которых меньше (больше) средней
     длины по всем числам, а также длину.
     */
        System.out.println("Third task");
        int len=0;
        for (int i = 0; i < arr.length; i++) {
           len=len+String.valueOf(arr[i]).length();
        }
        int aver=len/arr.length;
        System.out.println("Length of all numbers: "+len);
        System.out.println("Average length: "+aver);
        for (int i = 0; i < arr.length; i++) {
            if(String.valueOf(arr[i]).length()>aver){
             System.out.println("Long number: "+arr[i]+" length: "+String.valueOf(arr[i]).length());   
            }
        }
        System.out.println("\n");
/*OptionalTask 2.4
     Найти число, в котором количество различных цифр минимально. 
     Если таких чисел несколько, найти первое из них.   
    */
        System.out.println("Fourth task");
        int MaxComp=1000;
        int MaxCompNum=0;
        for (int i = 0; i < arr.length; i++) {
            int compare=0;
            String s = "" + arr[i];
            char[] ch = s.toCharArray();
            for (int j = 0; j < ch.length-1; j++) {
                for (int k = j+1; k < ch.length; k++) {
                 if(ch[j]!=ch[k]){
                     compare ++;
                 }   
                } 
            }
            if(compare<MaxComp){
               MaxComp=compare;
                MaxCompNum=i;
            }
        }
        System.out.println("Number: "+arr[MaxCompNum]+" Number of different digits: "+MaxComp);
        System.out.println("\n");
/*OptionalTask 2.7
     Найти число, состоящее только из различных цифр. 
     Если таких чисел несколько, найти первое из них.
    */
        System.out.println("Seventh task");
        int MinComp=1;
       
        int MinCompNum=0;
        for (int i = 0; i < arr.length; i++) {
            int compare=0;
            String s = "" + arr[i];
            char[] ch = s.toCharArray();
            for (int j = 0; j < ch.length-1; j++) {
                for (int k = j+1; k < ch.length; k++) {
                 if(ch[j]==ch[k]){
                     compare ++;
                 }   
                } 
            }
            if(compare<MinComp){
                MinComp=compare;
                MinCompNum=i;
               
            }
        }
            if(MinComp==0){
            System.out.println(" Number: "+arr[MinCompNum]+" Number of identical digits: "+MinComp);
            }
            else{
                System.out.println("None");
            }
      
    }
    
}
