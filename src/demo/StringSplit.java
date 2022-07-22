package demo;

public class StringSplit {
	public static void main(String[] args) {
		String url = "https://sfdev.aquasana.com/order-confirm?ID=AD0016381&token=EYRYBGMP_g15WNAtaVBqeJgrXvH5grqsmm7k-GBeyVs";
//			https://sfdev.aquasana.com/order-confirm?ID
//			AD0016381&token
//			EYRYBGMP_g15WNAtaVBqeJgrXvH5grqsmm7k-GBeyVs
		String orderID = url.split("=")[1];
		System.out.println(orderID);
//		System.out.println(orderID.split("&")[0]);
		System.out.println(orderID.substring(0, orderID.indexOf("&")));
	}

}
