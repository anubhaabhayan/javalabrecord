class Main {
  public static void main(String[] args) {
  
    int num = 11;
    System.out.println("Kumari Priya 079");
    System.out.println("Integer value: " + num);

      double data = num;
    System.out.println("Double value: " + data);
  }
}

// Double into int (manually convert)
class Abc {
  public static void main(String[] args) {
    double num = 11.99;
     System.out.println("Kumari Priya 079");
     System.out.println("The double value: " + num);
     int data = (int)num;
     System.out.println("The integer value: " + data);
  }
}
//int to string 
valueOf() method is present in the String class of java. lang package. valueOf() in Java is used to convert any non String variable or Object such as int, double, char, and others to a newly created String object.


 class Xyz {
 public static void main(String[] args) ;
 int num = 100;
 System.out.println("The integer value is: " + num);
String data = String.valueOf(num);
 System.out.println("The string value is: " + data);
  }
 }


// string to Int
parseInt() method is used to convert a string to an integer in Java, with the syntax int num = Integer. parseInt(str); .


class Xyz {
 public static void main(String[] args) ;
 String data = "100";
 System.out.println("The string value is: " + data);
 int num = Integer.parseInt(data);
System.out.println("The integer value is: " + num);
  }
}
