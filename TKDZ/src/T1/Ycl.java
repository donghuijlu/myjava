package T1;
import java.util.*;
class Tank{
		int x=0,y=0;  //横纵坐标
		int fangxiang=0;
		public int getFangxiang() {
			return fangxiang;
		}
		public void setFangxiang(int fangxiang) {
			this.fangxiang = fangxiang;
		}
		public int getSudu() {
			return sudu;
		}
		public void setSudu(int sudu) {
			this.sudu = sudu;
		}
		int sudu=1;
		
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getX(){
			return x;
		}
		public Tank(int x,int y){ //构造方法
			this.x=x;
			this.y=y;
		}
	}
class DiTank extends Tank{
	public DiTank(int x,int y){//构造方法
		super(x,y);
	}
	
}
class MyTank extends Tank{
	
	Vector<Zidan>aa=new Vector<Zidan>();
	Zidan zd=null;
	
	
		public MyTank(int x,int y){
			super(x,y);//父类构造方法
		}
		public void fszd(){
			switch(this.fangxiang){
			case 0:
				zd=new Zidan(x+10,y,0);
				aa.add(zd);
				break;
			case 1:
				zd=new Zidan(x,y+10,1);
				aa.add(zd);
				break;
			case 2:
				zd=new Zidan(x+10,y+30,2);
				aa.add(zd);
				break;
			case 3:
				zd=new Zidan(x+30,y+10,3);
				aa.add(zd);
				break;
				
			}
			Thread t=new Thread(zd);
			t.start();
		}
		public void xiangshang(){
			y-=sudu;
		}
		public void xiangzuo(){
			x-=sudu;
		}
		public void xiangxia(){
			y+=sudu;
		}
		public void xiangyou(){
			x+=sudu;
		}
	}
class Zidan implements Runnable{
	int x;
	int y;
	int fangxiang;
	int sudu=5;
	boolean shengming=true;
	
	public Zidan(int x,int y,int fangxiang){
		this.x=x;
		this.y=y;
		this.fangxiang=fangxiang;
		
	}
	public void run(){
		while(true){//凡是线程下面死循环都要有个睡眠
			try{
				Thread.sleep(50);
			}catch(Exception e){
				
			}
			switch(fangxiang){
			case 0:
				y-=sudu;
				break;
			case 1:
				x-=sudu;
				break;
			case 2:
				y+=sudu;
				break;
			case 3:
				x+=sudu;
				break;
			}
			if(x<0||x>400||y<0||y>300){
				this.shengming=false;
				break;
			}
		}
		
	}
}
