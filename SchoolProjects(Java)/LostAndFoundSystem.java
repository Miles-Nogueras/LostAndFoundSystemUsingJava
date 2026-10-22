import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class LostAndFoundSystem {


    public static void chooseOption(int choice){

        Scanner scanner = new Scanner(System.in);

        switch (choice){

             case 1:
                System.out.printf("You chose to report a lost item(Option #%d).\n" , choice);
                System.out.println("=====================================================");
                reportItemLost(); 
                break;
        
             case 2:
                System.out.printf("You chose to report a found item(Option #%d).\n" , choice);
                System.out.println("=====================================================");
                reportItemFound();
                break;
            
            case 3:
                claimItem();
                break;
            
            case 4:
                seeItemStatus();
                break;
            
            case 5:
                viewSocialMediaPagesOfOrgs();
                break;
            
            case 6:
                exitSystem();
                break;
            
            default:
                System.out.println("Invalid choice. Please enter a number from 1 to 6.");

     }
        scanner.close();
    }

    public static void reportItemLost(){
        Scanner scanner = new Scanner(System.in);

        String name, college, progAndSec, lostItem,recognizedMark, placeOfItem;
        String findLocation, numFloor, room, timeFrame;
        String contactNum, fbName, fbLink, otherContacts, confirmInfo ;
        
        System.out.println("We're sorry to hear that you lost something. Please fill in the applicable details, or type \"N/A\" for fields that do not apply.");
        System.out.println("=====================================================");
       
        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("College: ");
        college = scanner.nextLine();

        System.out.print("Program and Section: ");
        progAndSec = scanner.nextLine();

        System.out.print("Item/s lost: ");
        lostItem = scanner.nextLine();
        
        System.out.println("Describe any distinguishing marks or features of the item/s (e.g., scratches, stickers, name tags, engravings): ");
        recognizedMark = scanner.nextLine();

        System.out.println("Where do you think you lost the item? List the places you visited before you noticed it was missing: ");
        placeOfItem = scanner.nextLine();
        System.out.println("=====================================================");

        System.out.println("If your item is found, where can we usually find you?");
        findLocation = scanner.nextLine();
        findLocation = findLocation.toUpperCase();
        
            if(!findLocation.equals("N/A")){
                if(!findLocation.equals("NA")){
            System.out.println("If inside a building, which floor?");
            numFloor = scanner.nextLine();
            System.out.println("Room:");
            room = scanner.nextLine();
            System.out.println("During what hours can we usually find you there?");
            timeFrame = scanner.nextLine();
                }
             }

        System.out.println("=====================================================");
        System.out.println("Kindly drop your contact details below.");
        System.out.print("Contact Number:");
        contactNum = scanner.nextLine();

        System.out.print("Facebook Account Name:");
        fbName = scanner.nextLine();

        System.out.println("Facebook Account Link:");
        fbLink = scanner.nextLine();

        System.out.println("Other Contact Details:");
        otherContacts = scanner.nextLine();

        System.out.println("Thank you for your cooperation. We'll do our best to find your item and contact you once it's found.");
        System.out.println("=====================================================");                    
            
    }















    public static void reportItemFound(){
         Scanner scanner = new Scanner(System.in);

        String name, college, progAndSec, foundItem,recognizedMark, placeOfItem, identifyOwner;
        String founderLocation, numFloor, room, timeFrame;
        String contactNum, fbName, fbLink, otherContacts, confirmInfo ;
        
        System.out.println("It seems like you've found an item. Please fill in the applicable details, or type \"N/A\" for fields that do not apply.");
        System.out.println("=====================================================");
       
        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("College: ");
        college = scanner.nextLine();

        System.out.print("Program and Section: ");
        progAndSec = scanner.nextLine();

        System.out.print("Item/s found: ");
        foundItem = scanner.nextLine();
        
        System.out.println("Describe any distinguishing marks or features of the item/s (e.g., scratches, stickers, name tags, engravings).Type N/A if there are none: ");
        recognizedMark = scanner.nextLine();

        System.out.println("What details on the item/s could identify its owner (e.g., a name, ID, initials, or contact number)? Type N/A if there are none: ");
        identifyOwner = scanner.nextLine();



        System.out.println("Where did you find the item/s?(e.g., Near Lover's Lane, Near Heroes' Park, Federizo hall 2f, at gate 2) ");
        placeOfItem = scanner.nextLine();
        System.out.println("=====================================================");

        System.out.println("Where can the owner usually find you to claim the item?");
        founderLocation = scanner.nextLine();
        founderLocation = founderLocation.toUpperCase();
        
            if(!founderLocation.equals("N/A")){
                if(!founderLocation.equals("NA")){
            System.out.println("If inside a building, which floor?");
            numFloor = scanner.nextLine();
            System.out.println("Room:");
            room = scanner.nextLine();
            System.out.println("During what hours can we usually find you there?");
            timeFrame = scanner.nextLine();
                }
             }

        System.out.println("=====================================================");
        System.out.println("Kindly drop your contact details below.");
        System.out.print("Contact Number:");
        contactNum = scanner.nextLine();

        System.out.print("Facebook Account Name:");
        fbName = scanner.nextLine();

        System.out.println("Facebook Account Link:");
        fbLink = scanner.nextLine();

        System.out.println("Other Contact Details:");
        otherContacts = scanner.nextLine();

        System.out.println("Thank you for reporting the item you found. Your honesty helps someone get their belongings back."); 
        System.out.println("We'll contact you if the owner needs to reach you.");
        System.out.println("=====================================================");

    }

    public static void claimItem(){

    }

    public static void seeItemStatus(){

    }

    public static void viewSocialMediaPagesOfOrgs(){

    }

    public static void exitSystem(){
        System.out.println("Thank you and have a great day!");
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("Welcome to Bulacan State University's Lost and Found!");
        System.out.println("=====================================================");
        System.out.println("Enter your choice(1-6):");
        System.out.println("1. Report a lost item");
        System.out.println("2. Report a found item");
        System.out.println("3. Claim item");
        System.out.println("4. Check item status");
        System.out.println("5. View social media pages of other Local Student Councils");
        System.out.println("6. Exit");
        System.out.println("=====================================================");
        System.out.print("Your answer: ");
        int choice = scanner.nextInt();
        chooseOption(choice);
      
        
        scanner.close();
    }












}
