class NestedTryDemo {

public static void main(String args[]){

try {

int a = Integer.parseInt(args[0]);

try {

int b = Integer.parseInt(args[1]);

System.out.println(a/b);

} catch (ArithmeticException e) {

System.out.println(“Divide by zero error!");

}

}catch (ArrayIndexOutOfBoundsException) {

System.out.println(“2 parameters are required!");

}finally{ System.out.println("try-block entered."); }

}

}