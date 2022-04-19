public class Test{
	static int totalDraw=0;
	int score;
	Test(int score){
		this.score=score;
	}
	int score(){
		System.out.printf("あなたの点数は%dです",this.score);
		return this.score;
	}
	static int getTotalDraw(){
		return totalDraw;
	}
}
