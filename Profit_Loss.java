import java.util.Scanner;

class Profits{
    float Cost_Price;
    float Selling_Price;
    float Market_Price;

public Profits(float Cost_Price,float Selling_Price,float Market_Price){
    this.Cost_Price=Cost_Price;
    this.Selling_Price=Selling_Price;
    this.Market_Price=Market_Price;
}
public float profit(){
    return Selling_Price-Cost_Price;
}
public float loss(){
    return Cost_Price-Selling_Price;
}
public float discount(){
    return Market_Price-Selling_Price;
}
public float profit_prsent(){
    return (profit()/Cost_Price)*100;
}
public float loss_prsent(){
    return (loss()/Cost_Price)*100;
}
public float CostPriceProfit(){
    return (Selling_Price*100)/(100+profit_prsent());
}
public float CostPriceLoss(){
    return (Selling_Price*100)/(100-loss_prsent());
}
public float SellingPriceProfit(){
    return Cost_Price*(100+profit_prsent())/100;
}
public float SellingPriceLoss(){
    return Cost_Price*(100-loss_prsent())/100;
}
public void display() {
   System.out.println("Cost Price:"+Cost_Price+"Selling Price:"+Selling_Price+"Market Price:"+Market_Price);
   System.out.println("Profit:"+profit());
   System.out.println("Loss:"+loss());
   System.out.println("Discount:"+discount());
   System.out.println("Profit_Prsent:"+profit_prsent()+"%");
   System.out.println("Loss_Prsent:"+loss_prsent()+"%");
   System.out.println("Cost Price Profit:"+CostPriceProfit());
   System.out.println("Cost Price Loss:"+CostPriceLoss());
   System.out.println("Selling Price Profit:"+SellingPriceProfit());
   System.out.println("Selling Price Loss:"+SellingPriceLoss());
}
}
public class Profit_Loss {
    public static void main(String[] args) {
        try (Scanner a = new Scanner(System.in)) {
            System.out.println("Cost Price:");
            float Cost=a.nextFloat();
            System.out.println("Selling Price:");
            float Selling=a.nextFloat();
            System.out.println("Market Price:");
            float Market=a.nextFloat();
            Profits profits=new Profits(Cost,Selling,Market);
            profits.display();
        }

    }
    
}
