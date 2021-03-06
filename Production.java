package com.belhard.practice.candies;
public abstract class Production
{
private String name;
private int weight;
public Production(String name,String type,int weight)
{
this.name=name;
this.type=type;
this.weight=weight;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}
public String getType()
{
return type;
}
public void setType(String type)
{
this.type=type;
}
public double getWeight()
{
return weight;
}
public void.setWeight(int weight)
{
this.weight=weight;
}
@Override
public boolean equals(Object o)
{
if(this==o) return true;
if(o==null || getClass()!=o.getClass())return false;
Production that=(Production) o;
if(weight!=weight) return false;
if(name!=null ? !name.equals(that.name) : that.name!=null) return false;
return type !=null ? type.equals(that.type) :that.type==null;
}
@Override
public int hashCode()
{
int result;
long temp;
result=name !=null ? name.hashCode() :0);
temp=Double.doubleToLongBits(cost);
result=31*result+(int) (temp^(temp>>>32));
result=31*result +weight;
return result;
}
@Override
public String toString()
{
return
     name+"   " +type+"   "+weight+"  ";
     }
     }
