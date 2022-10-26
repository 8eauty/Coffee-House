import java.util.*;
class FoodOrder{
    int Espresso_with_Milk=60;
    int Espresso_with_Cream=75;
    int Espresso_with_Latte=100;
    int Cappuccino_with_Milk=80;
    int Cappuccino_with_Cream=90;
    int Cappuccino_with_Latte=125;
    int Latte_with_Milk=100;
    int Latte_with_Cream=125;
    int Latte_with_Latte=150;
    int ch;
    int quantity;
    int total;
String again;
Scanner s=new Scanner(System.in);
//function to diplay the menu of caffe
public void displayMenu(){
System.out.println("=================================");
System.out.printf("'%15s' %n","Espresso_with_Milk        60 Rs/-");
System.out.printf("'%15s' %n","Espresso_with_Cream       75 Rs/-");
System.out.printf("'%15s' %n","Espresso_with_Latte      120 Rs/-");
System.out.printf("'%15s' %n","Cappuccino_with_Milk      80 Rs/-");
System.out.printf("'%15s' %n","Cappuccino_with_Cream     90 Rs/-");
System.out.printf("'%15s' %n","Cappuccino_with_Latte    125 Rs/-");
System.out.printf("'%15s' %n","Latte_with_Milk          100 Rs/-");
System.out.printf("'%15s' %n","Latte_with_Cream         125 Rs/-");
System.out.printf("'%15s' %n","Latte_with_Latte         150 Rs/-");
System.out.println("================================");
}
//function to generate the bill of  total coffees 
public void generateBill(){
    System.out.println("****Thanku for Ordering*****");
   System.out.println("Your Bill Amount is:"+total+" "+"Rs/-") ;
}
//function used to order item according to your choices
public void order(){
    System.out.println("Enter Your Choice");
    ch=s.nextInt();
switch(ch){
    case 1:
    System.out.println("You have selected Espresso_with_Milk");
    System.out.println("Enter the quantity");
    quantity=s.nextInt();
    total=total+quantity*Espresso_with_Milk;
    break;
     case 2:
    System.out.println("You have selected Espresso_with_Cream");
    System.out.println("Enter the quantity");
    quantity=s.nextInt();
    total=total+quantity*Espresso_with_Cream;
    break;
     case 3:
    System.out.println("You have selected Espresso_with_Latte");
    System.out.println("Enter the quantity");
    quantity=s.nextInt();
    total=total+quantity*Espresso_with_Latte;
    break;
     case 4:
    System.out.println("You have selected Cappuccino_with_Milk");
    System.out.println("Enter the quantity");
    quantity=s.nextInt();
    total=total+quantity*Cappuccino_with_Milk;
    break;
     case 5:
    System.out.println("You have selected Cappuccino_with_Cream");
    System.out.println("Enter the quantity");
    quantity=s.nextInt();
    total=total+quantity*Cappuccino_with_Cream;
    break;
     case 6:
    System.out.println("You have selected Cappuccino_with_Latte");
    System.out.println("Enter the quantity");
    quantity=s.nextInt();
    total=total+quantity*Cappuccino_with_Latte;
    break;
     case 7:
    System.out.println("You have selected Latte_with_Milk");
    System.out.println("Enter the quantity");
    quantity=s.nextInt();
    total=total+quantity*Latte_with_Milk;
    break;
     case 8:
    System.out.println("You have selected Latte_with_Cream");
    System.out.println("Enter the quantity");
    quantity=s.nextInt();
    total=total+quantity*Latte_with_Cream;
    break;
     case 9:
    System.out.println("You have selected Latte_with_Latte");
    System.out.println("Enter the quantity");
    quantity=s.nextInt();
    total=total+quantity*Latte_with_Latte;
    break;
    default:
    break;

}
//added condition for extra coffees
System.out.println("Do you want to order anything else(Y/N)");
again=s.next();
if(again.equalsIgnoreCase("Y")){
    order();
}else if(again.equalsIgnoreCase("N")){
    generateBill();
}else{
    System.out.print("Invalid Choice");
}
}

}
class Main{
    public static void main(String[] args){
        FoodOrder food=new FoodOrder();
        food.displayMenu();
        food.order();
    }
}
