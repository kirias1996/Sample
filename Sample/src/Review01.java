public class Review01 {

	public static void main(String[] args) {
		int productPrice = 1500;
		double SALES_TAX=0.10;
		int getTax=tax(productPrice,SALES_TAX);
		System.out.println(productPrice+"円の商品の税込み価格は"+(productPrice+getTax)+"円(消費税は"+getTax+"円)です。");
	}
	
//	商品価格と消費税額を引数に消費税額を返すメソッド
	public static int tax(int productPrice,double salesTax) {
		return (int)(productPrice * salesTax);
	}

}
