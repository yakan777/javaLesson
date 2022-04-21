public class Book{
	int page;
	int price;
	Book(int page,int price){
		this.page=page;
		this.price=price;
	}
	void showInfo(){
		System.out.printf("ページ数:%d%n価格:%d%n",this.page,this.price);
	}
}
class Note extends Book{
	String words="";
	Note(int page,int price){
		super(page,price);
	}
	void words(String word){
		this.words+=word;
	}
	@Override
	void showInfo(){
		System.out.printf("ページ数:%d%n価格:%d%n内容:%s%n",this.page,this.price,this.words);


	}
}
