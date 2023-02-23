import java.util.Scanner;
class payment_book
{
   void payment_del()
   {
     Scanner li = new Scanner(System.in);     
     int card_number;
      int exp_data;
      int ccv;
      String name_of_account;
      System.out.println("enter the Account number");
      card_number = li.nextInt();
      System.out.println("enter the Exp date");
      exp_data = li.nextInt();
      System.out.println("enter the CVV number");
      ccv = li.nextInt();
     System.out.println("Thank You for Buying Book......Payment Done ");



   }
}
class main_info extends lib
{
   void sell_book()
   {
    Scanner io = new Scanner(System.in);
     System.out.println(" Welcome to sell your book page ");
     String book_name;
     int Edition;
     int book_price;
     int writer_book;
     System.out.println("Enter Your Book Name ");
     book_name = io.nextLine();
     System.out.println("Enter Your Book Edition ");
     Edition=io.nextInt();
     System.out.println("Enter Your Book Price ");
     book_price = io.nextInt();
     System.out.println("Enter Your Book Writer ");
     writer_book=io.nextInt();
     System.out.println("your book Name : "+book_name);
     System.out.println("your book Edition : "+Edition);
     System.out.println("your book Price : "+book_price);
     System.out.println("your book Writer : "+writer_book);

   }
   void Upcoming_book()
   {
      System.out.println(" Welcome To Book lover ");
      System.out.println(" Your want to know the upcoming book !!!!!!!!");
      System.out.println(" 1. The Book Of Knowledge");
      System.out.println("Date : 12 Feb 2023");
      System.out.println("Price : 963/-");
      System.out.println(" 2. The Book Of Skill");
      System.out.println("Date : 12 Mar 2023");
      System.out.println("Price : 253/-");
      System.out.println(" 3. The Book Of Code");
      System.out.println("Date : 12 Jan 2023");
      System.out.println("Price : 897/-");
      System.out.println(" 4. The Book Of java");
      System.out.println("Date : 12 Jul 2023");
      System.out.println("Price : 458/-");
      System.out.println(" 5. The Book Of c");
      System.out.println("Date : 12 Apr 2023");
      System.out.println("Price : 897/-");
      System.out.println(" 6. The Book Of c++");
      System.out.println("Date : 12 Dec 2023");
      System.out.println("Price : 150/-");
      System.out.println("Stay Tune For More Update");


   }
   void Buy_book()
   {
    payment_book fi = new payment_book();
    Scanner po = new Scanner(System.in);
    System.out.println(" WELCOME TO BUY BOOK PAGE ");
    System.out.println("1. The kill Mood");
    System.out.println("2. The hill life");
    System.out.println("3. The hill lifeThe hill life ");
    System.out.println("enter your book option");
    String book_name22 =po.nextLine();
    String a1="The kill Mood";
    String a2="The hill life";
    String a3="The hill code";
    switch (book_name22) {
     case "The kill Mood":
     {
          fi.payment_del();
     }
          
          break;
     case "The kill life":
          {
               fi.payment_del();
          }
               
               break;     
     case "The kill code":
               {
                    fi.payment_del();
               }
                    
                    break;
     default:
          break;
    }

    
   }

   void staff_book()
   {
    System.out.println("1 .Librarian");
    System.out.println("2. Library technician");
    System.out.println("3. Library assistant ");
    System.out.println("4. Library clerk");
    System.out.println("5. Library manager");
    System.out.println("6. Senior librarian");
    System.out.println("7. Research assistant");
    System.out.println("8. Director of public relations");
    System.out.println("9. Customer service representative");
    System.out.println("10. Cashier");

   }
    void lib_info()
    {
        System.out.println("INFOMATION ABOUT LIBRARY");
    }

     void book_info()
    {
     Scanner hi = new Scanner(System.in);
      String subject_name;
      System.out.println(" enter the subject");
      subject_name = hi.nextLine();
     switch (subject_name) 
     {
          case "science":
          {
          System.out.println("6th floor / S-32");
          } 
               
               break;
          case " hisotry":
          {
               System.out.println("5th floor / S-25");
          }
                    
                    break;     
                    
          case "geography":
          System.out.println("4th floor / S-72");
                         
                         break;
          case" Maths":
          System.out.println("3th floor / S-22");
                              
                    break;
          default:
          System.out.println("Sorry this subject is not here ....pls contact the office fro more details");
               break;
     }
    }


}



class lib
{
    String name1;
    String name2;
    void del()
    {   main_info li = new main_info();
        Scanner di =new Scanner(System.in);
        System.out.println(" Enter the First Name ");
        name1 =di.nextLine();
        System.out.println("Enter the Last Name ");
        name2 = di.nextLine();
        System.out.println(" welcome " +name1 +name2 );
        System.out.println("1. Sell Your Book ");
        System.out.println("2. Upcoming Book  ");
        System.out.println("3. Buy The Book ");
        System.out.println("4. Staff Details  ");
        System.out.println("5. Library Infromation ");
        System.out.println("6. Book Code With book Shelf ");
        System.out.println("7. Exit ");
        int cho1;
        System.out.println("Enter Your Option");
        cho1=di.nextInt();
        switch (cho1) 
        {
            case 1:
            {
                 li.sell_book();
                 break;
            }
            case 2:
            {
                 li.Upcoming_book();
                 break;
            }
            case 3:
            {
                 li.Buy_book();
                 break;
            }
            case 4:
            {
                 li.staff_book();
                 break;
            }
            case 5:
            {
                 li.lib_info();
                 break;
            }
            case 6:
            {
                 li.book_info();
                 break;
            }
                
          
        
            default:
            {
               System.out.println(" enter the right option ");
            }
                break;
        }

        

    }
    
}
public class lib_sys 
{
  public static void main(String[] args) 
  {
     lib ki = new lib();
     ki.del();
  }   
}




