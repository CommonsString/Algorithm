package threadSome;

/**
 * suspend()线程挂起
 * resume()线程继续执行
 * 挂起之后，线程必须要进行resume操作，才能继续执行。
 * 挂起之后，suspend不会释放任何资源。
 * 利用wait和notify实现改进版挂起和继续执行
 */
public class ThreadOne{
	
	public static Object obj = new Object(); //资源
	
	public static class ChangeObject extends Thread{
		volatile boolean suspend = false;
		public void suspendMe(){
			this.suspend = true;
		}
		public void resumeMe(){
			this.suspend = false;
			synchronized(this){
				notify(); //继续执行
			}
		}
		
		//线程核心
		@Override
		public void run() {
			while(true){
				synchronized(this){ //指向运行时的对象
					while(suspend){
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						} //改进方法
					}
				}
				synchronized(obj){
					System.out.println("在ChangeObject！");
				}
				Thread.yield();
			}
		}
	}
	
	public static class ReadObject extends Thread{
		@Override
		public void run() {
			while(true){
				synchronized(obj){
					System.out.println("in ReadObject!");
				}
				Thread.yield();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ChangeObject one = new ChangeObject();
		ReadObject two = new ReadObject();
		one.start();
		two.start();
		
		Thread.sleep(1000);
		
		one.suspendMe();
		System.out.println("suspend t1 2 sed!");
		
		
	}
	
}
