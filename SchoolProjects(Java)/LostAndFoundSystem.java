import java.util.Scanner;

public class LostAndFoundSystem {


    public static void chooseOption(int choice){

        Scanner scanner = new Scanner(System.in);

        switch (choice){

             case 1:
                System.out.println("=========================================================================================================================================================");
                System.out.printf("You chose to report a lost item(Option #%d).\n" , choice);
                System.out.println("=========================================================================================================================================================");
                reportItemLost(); 
                break;
        
             case 2:
                System.out.println("=========================================================================================================================================================");
                System.out.printf("You chose to report a found item(Option #%d).\n" , choice);
                System.out.println("=========================================================================================================================================================");
                reportItemFound();
                break;
            
            case 3:
                System.out.println("=========================================================================================================================================================");
                System.out.printf("We're glad to assist you in claiming your item. Please provide the necessary details below.(Option #%d)\n" , choice);
                System.out.println();
                System.out.println("================================ Claim Form ===============================================");
                claimItem();
                break;
            
            case 4:
                System.out.println("Would you like to view the social media pages of other organizations for assistance? Kindly click on the options below.");
                viewSocialMediaPagesOfOrgs();
                break;
            
            case 5:
                exitSystem();
                break;
            
            default:
                System.out.println("=========================================================================================================================================================");
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
        System.out.println("=========================================================================================================================================================");
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
        System.out.println("=========================================================================================================================================================");

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

        System.out.println("=========================================================================================================================================================");
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
        System.out.println("=========================================================================================================================================================");                  
            
    }

    public static void reportItemFound(){
         Scanner scanner = new Scanner(System.in);

        String name, college, progAndSec, foundItem,recognizedMark, placeOfItem, identifyOwner;
        String founderLocation, numFloor, room, timeFrame;
        String contactNum, fbName, fbLink, otherContacts, confirmInfo ;
        
        System.out.println("It seems like you've found an item. Please fill in the applicable details, or type \"N/A\" for fields that do not apply.");
        System.out.println("=========================================================================================================================================================");
       
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
        System.out.println("=========================================================================================================================================================");

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

        System.out.println("=========================================================================================================================================================");
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
        System.out.println("=========================================================================================================================================================");
    }

    public static void claimItem(){

        Scanner scanner = new Scanner(System.in);

        String name, college, progAndSec;
        String claimedItem, claimingDate;

        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("College: ");
        college = scanner.nextLine();

        System.out.print("Program and Section: ");
        progAndSec = scanner.nextLine();

        System.out.print("Claimed Item: ");
        claimedItem = scanner.nextLine();

        System.out.print("Date and Time of Claiming the Item: ");
        claimingDate = scanner.nextLine();

        System.out.println("\n===== CLAIM REQUEST SUBMITTED =====");
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println("Program and Section: " + progAndSec);
        System.out.println("Claimed Item: " + claimedItem);
        System.out.println("Date of Claiming: " + claimingDate);
        System.out.println("Status: WAITING FOR VERIFICATION");
        System.out.println("Please coordinate with the Local Student Council.");
        System.out.println("=====================================================");
    }

    public static void viewSocialMediaPagesOfOrgs(){

         Scanner scanner = new Scanner (System.in);
    
        int chooseOrgs;
         int collegeChoice;

            do {
            System.out.println("\n================================ Organizations ===============================================");
            System.out.println("1. Local Student Council (LSC)");
            System.out.println("2. Student Government (SG)");
            System.out.println("3. Return to Main Menu");
            System.out.print("Choose an option: ");
            chooseOrgs = scanner.nextInt();

                switch (chooseOrgs) {
                    case 1:
                    System.out.println("\n===== LOCAL STUDENT COUNCIL =====");
                    System.out.println("1. College of Information and Communication Technology (CICT)");
                    System.out.println("2. College of Hospitality and Tourism Management (CHTM)");
                    System.out.println("3. College of Science (CS)");
                    System.out.println("4. College of Professional Teacher Education (CPTED)");
                    System.out.println("5. College of Architecture and Fine Arts (CAFA)");
                    System.out.println("6. College of Arts and Letters (CAL)");
                    System.out.println("7. College of Business Education and Accountancy (CBEA)");
                    System.out.println("8. College of Criminal Justice Education (CCJE)");
                    System.out.println("9. College of Industrial Technology (CIT)");
                    System.out.println("10. College of Law (CLaw)");
                    System.out.println("11. College of Nursing (CN)");
                    System.out.println("12. College of Engineering (COE)");
                    System.out.println("13. College of Sports, Exercise and Recreation (CSER)");
                    System.out.println("14. College of Social Sciences and Philosophy (CSSP)");
                    System.out.println("15. Laboratory High School (LHS)");
                    System.out.print("Choose a college: ");
                    collegeChoice = scanner.nextInt();

                        if (collegeChoice == 1) {
                        System.out.println("\nCollege of Information and Communication Technology (CICT)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/CICTLSCofficialpage");
                        System.out.println("Email: bulsu.cictlsc@gmail.com");

                        } else if (collegeChoice == 2) {
                        System.out.println("\nCollege of Hospitality and Tourism Management (CHTM)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/CHTMLSC");
                        System.out.println("Email: chtmlsc2526@gmail.com");

                        } else if (collegeChoice == 3) {
                        System.out.println("\nCollege of Science (CS)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/BulSUSG.CSLSC");
                        System.out.println("Email: cslsc.bulsusg@gmail.com");

                        } else if (collegeChoice == 4) {
                        System.out.println("\nCollege of Professional Teacher Education (CPTED)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/BulSUCPTEDLSC");
                        System.out.println("Email: coedlsc.bulsu@gmail.com");

                        } else if (collegeChoice == 5) {
                        System.out.println("\nCollege of Architecture and Fine Arts (CAFA)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/BulSUCAFALSC");
                        System.out.println("Email: bulsucafalsc@gmail.com");

                        } else if (collegeChoice == 6) {
                        System.out.println("\nCollege of Arts and Letters (CAL)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/callsc.bulsu");
                        System.out.println("Email: callsc.bulsu@gmail.com");

                        } else if (collegeChoice == 7) {
                        System.out.println("\nCollege of Business Education and Accountancy (CBEA)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/BulSUCBEALSC");
                        System.out.println("Email: bulsucbealsc@gmail.com");

                        } else if (collegeChoice == 8) {
                        System.out.println("\nCollege of Criminal Justice Education (CCJE)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/CCJELSCOfficialPage");
                        System.out.println("Email: bulsuccjelsc@gmail.com");

                        } else if (collegeChoice == 9) {
                        System.out.println("\nCollege of Industrial Technology (CIT)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/BulSUCITLSC");
                        System.out.println("Email: bulsu.cit.lsc2627@gmail.com");

                        } else if (collegeChoice == 10) {
                        System.out.println("\nCollege of Law (CLaw)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/lsg.bulsu");
                        System.out.println("Email: [Official Email]");

                        } else if (collegeChoice == 11) {
                        System.out.println("\nCollege of Nursing (CN)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/BulSUCONLSC");
                        System.out.println("Email: bulsuconlsc2024@gmail.com");

                        } else if (collegeChoice == 12) {
                        System.out.println("\nCollege of Engineering (COE)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/BulSUCOELSC");
                        System.out.println("Email: bulsuengineerlsc@gmail.com");

                        } else if (collegeChoice == 13) {
                        System.out.println("\nCollege of Sports, Exercise and Recreation (CSER)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/CserLSC");
                        System.out.println("Email: [Official Email]");

                        } else if (collegeChoice == 14) {
                        System.out.println("\nCollege of Social Sciences and Philosophy (CSSP)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/cssplsc.bulsusg");
                        System.out.println("Email: cssp.bulsusg@gmail.com");

                        } else if (collegeChoice == 15) {
                        System.out.println("\nLaboratory High School (LHS)");
                        System.out.println("\n--- OFFICIAL CONTACT DETAILS ---");
                        System.out.println("Facebook: https://www.facebook.com/bulsulhslocalstudentcouncil");
                        System.out.println("Email: bulsulhslocalstudentcouncil@gmail.com");

                        } else {
                        System.out.println("Invalid choice. Please try again.");
                        }

                    if (collegeChoice >= 1 && collegeChoice <= 15) {
                    System.out.println("\nIf you have questions or concerns, you may contact the organization through its official social media pages.");
                    System.out.println("Please make sure to contact the official page of the organization.");
                }

                    break;

                case 2:
                    System.out.println("\n===== STUDENT GOVERNMENT =====");
                    System.out.println("Facebook: https://www.facebook.com/BulSUSG2026");
                    System.out.println("Email: studentgovernment@bulsu.edu.ph");
                    System.out.println(
                    "If you have questions or concerns, you may contact "
                    + "the Student Government through its official social media pages."
                );
                System.out.println(
                    "Please make sure to contact the official page of the organization."
                );
                break;

                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                System.out.println("Invalid choice. Please try again.");
        }

    } while (chooseOrgs != 3);

    }

    public static void exitSystem(){
        System.out.println("Thank you and have a great day!");
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================================================================================================================================================");
        System.out.println("Welcome to Bulacan State University's \"Lost it, Post it, Found it!\" system");
        System.out.println("=========================================================================================================================================================");
        System.out.println("1. Report a lost item");
        System.out.println("2. Report a found item");
        System.out.println("3. Claim item");
        System.out.println("4. View social media pages of other organizations for assistance");
        System.out.println("5. Exit");
        System.out.println("=========================================================================================================================================================");
        System.out.print("Your answer: ");
        int choice = scanner.nextInt();
        chooseOption(choice);
      
        
        scanner.close();
    }












}
