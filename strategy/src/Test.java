public class Test {

    public static void main(String args[]) throws InterruptedException {
        
        // we can provide any strategy to do the sorting 
        int[] array = {11, 4, 3, 2, 1 };
        
        
       Context ctx = new Context(new InsertionSort());        
        // we can change the strategy without changing Context class
        ctx = new Context(new InsertionSort());
        ctx.arrange(array);
        
        

        System.out.println("\n");
        ctx = new Context(new MergeSort());
        ctx.arrange(array);
      
        System.out.println("\n");
        ctx = new Context(new QuickSort());
        ctx.arrange(array);
        
        
        System.out.println("\n");
        ctx = new Context(new BubbleSort());
        ctx.arrange(array);
	// try it yourself then …
    }
}
