package _919practice;

/**
 *
 * 定义一个Student类，属性有学号、姓名和成绩
 * 方法为增加记录setRecord和得到记录getRecord
 *
 * Created by ${lvwenyang} on {}
 */
public class Student {

   private int id;
   private String name;
   private int score;

   //setRecord给出三个属性的赋值
   public void setRecord(int ID, String name,int score){
      this.id = ID;
      this.name = name;
      this.score = score;
   }

   //getRecord通过学号得到成绩
   public int getRecord(int id){
      if (this.id==id){
         System.out.println(this.score);
         return this.score;
      }else {
         return -1;
      }
   }

   public static void main(String[] args) {
      Student s1=new Student();
      Student s2=new Student();
      s1.setRecord(1,"lv",99);
      s2.setRecord(2,"wen",100);
      s1.getRecord(1);
      s2.getRecord(2);

   }

}
