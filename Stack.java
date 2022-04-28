class Stack{
  private int[] arr;
  private int top;
  private int capacity;

  public Stack(int capacity){

    arr = new int[capacity];
    this.capacity = capacity;
    this.top = -1;
  }

  public boolean isFull(){
    return (top == capacity)? true : false;
  }

  public void all(){
    for(int i = 0; i <= top -1; i++){
      System.out.print(arr[top]);
    }
  }
  public boolean isEmpty(){
    return (this.top == -1)? true : false;
  }


  public int size(){
    return this.capacity;
  }
  public int push(int value){
    if(isFull() == true){
      System.out.print("Stack OverFlow");
    }
    System.out.print("Inserting");
     return  this.arr[++top] = value;
  }
  
}