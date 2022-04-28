class Main {
  public static void main(String[] args) {
    System.out.println("Inserting Stack");
    Stack stack = new Stack(4);
    int v = stack.push(3);
    System.out.print("Pushed : "+v);
    System.out.print("Size = "+stack.size());
    System.out.print("Printing all Value in stack;\n");

    stack.all();
      
  }

  
}
