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
Choclate choclateOne=new Choc
