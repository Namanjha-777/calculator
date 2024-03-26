
import java .util.*;
class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
          System.out.println("enter 1 for addition or 2 for subtraction or 3 for multiplication & 4 for divion");
          int ch = sc.nextInt();
            System.out.println("enter the no");
            int a = sc.nextInt();
            System.out.println("enter the no");
            int b = sc.nextInt();
          switch(ch){
              case 1:
                  int sum = a+b;
                  System.out.println("sum ="+sum);
              break;
              case 2:
                  int difference = a-b;
                  System.out.println("difference ="+difference);
              break;
              case 3:
                  int product = a*b;
                  System.out.println("product = "+product);
              break;
              case 4:
                  float division = a/b;
                  System.out.println("divide ="+division);
              break;
              default:
                  System.out.println("choose the no from 1-4");
                }
            }
        }