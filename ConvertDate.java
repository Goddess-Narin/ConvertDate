import java.util.Scanner;

public class ConvertDate {

	public static void main(String[] args) {
		String shortDate;
        String nameOfMonth =" ";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter short date(YYYY-MM-DD): ");
        shortDate = input.nextLine();

        int day = Integer.parseInt(shortDate.substring(8));
        int month = Integer.parseInt(shortDate.substring(5,7));
        int year = Integer.parseInt(shortDate.substring(0,4));

        switch (month){
            case 1:
                nameOfMonth = "January";
                break;
            case 2:
                nameOfMonth = "February";
                break;
            case 3:
                nameOfMonth = "March";
                break;
            case 4:
                nameOfMonth =  "April";
                break;
            case 5:
                nameOfMonth = "May";
                break;
            case 6:
                nameOfMonth = "June";
                break;
            case 7:
                nameOfMonth = "July";
                break;
            case 8:
                nameOfMonth = "August";
                break;
            case 9:
                nameOfMonth = "September";
                break;
            case 10:
                nameOfMonth = "October";
                break;
            case 11:
                nameOfMonth = "November";
                break;
            case 12:
                nameOfMonth = "December";
                break;
            default:
                break;

        }

        System.out.println("Full Date: "+nameOfMonth+"-"+day+"-"+year);




        input.close();

	}

}
