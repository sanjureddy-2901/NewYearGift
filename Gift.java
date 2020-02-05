package com.belhard.practice;
import com.belhard.practice.candues.Choclate;
import com.belhard.practice.candies.Sweets;
import com.belhard.practice.candies.Production;
import java .util.ArrayList;
public class Gift
{
public static void getGift()
{
Gift gift=new Gift();
ArrayList<production> list=gift.setGift();
gift.showGift(list);
int heft=gift.getTotalWeight(list);
System.out.println("\n Total Weight of all items is: "+heft+ "\n");
}
public ArrayList<Production>setGift()
{
ArrayList<Production> list=new ArrayList<Production>();
Choclate choclateOne=new Choclate("Mars","Choclate",50);
Choclate choclateTwo=new Choclate("Snickers","Choclate",95);
  Sweets sweetsOne=new Sweets("Jilebi","Sweets",40);
  Sweets sweetTwo=new Sweets("Kalakand","Sweets",45);
  Sweets sweetThree=new Sweets("Kajukatli","Sweets",35);
  list.add(choclateOne);
  list.add(choclateTwo);
  list.add(sweetsOne);
  list.add(sweetsTwo);
  list.add(sweetsThree);
  return list;
}
  private void showGift(ArrayList<Production>list)
  {
    System.out.println("here is a new years gift!!");
    int i=1;
    System.out.println("ID:  " + " NAME:  " + " TYPE  " + " WEIGHT:");
    for(Production value :list)
    {
      System.out.println(i+" .  "+value.toString());
      i++;
    }
  }
  private int getTotalWeight(ArrayList<Production>list)
  {
    int heft=0;
    for(Production value : list)
    {
      heft +=value.getWeight();
    }
    return heft;
  }
}
    
