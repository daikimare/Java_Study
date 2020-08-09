class RunnableHello implements Runnable{
  public void run(){
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      System.out.println("Hello");
    }
  }public static void main(String arg[]) {
      RunnableHello t1 = new RunnableHello();
      RunnableHello t2 = new RunnableHello();
      RunnableHello t3 = new RunnableHello();
      System.out.println("Start.");
      new Thread(t1).start();
      new Thread(t2).start();
      new Thread(t3).start();
    }
}