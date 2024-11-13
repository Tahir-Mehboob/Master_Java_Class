package com.amigoscode;

public class Basic_Exercise {

    // Compare Two String

    static String compareTwoStringConstents(String st1 , String st2) {
        String s1 = st1;
        String s2  =st2;
        String  result;

        if(s1.equals(s2)) {
            result = "both String are equals";
        }
        else {
            result = "string are Not equals";
        }
        return  result;
    }

    static void firstLetterCapitalOfAnyWord(String word){
        // getting first letter by using charAt() method
        char firstLetter = word.charAt(0);

        // apply switch for match and replace with capital letter
        switch (firstLetter){
            case 'a':
            case 'A':
                firstLetter = 'A';
                break;

            case 'b':
            case 'B':
                firstLetter = 'B';
                break;

            case 'c':
            case 'C':
                firstLetter = 'C';
                break;

            case 'd':
            case 'D':
                firstLetter = 'D';
                break;

            case 'e':
            case 'E':
                firstLetter = 'E';
                break;

            case 'f':
            case 'F':
                firstLetter = 'F';
                break;

            case 'g':
            case 'G':
                firstLetter = 'G';
                break;

            case 'h':
            case 'H':
                firstLetter = 'H';
                break;

            case 'i':
            case 'I':
                firstLetter = 'I';
                break;

            case 'j':
            case 'J':
                firstLetter = 'J';
                break;

            case 'k':
            case 'K':
                firstLetter = 'K';
                break;

            case 'l':
            case 'L':
                firstLetter = 'L';
                break;

            case 'm':
            case 'M':
                firstLetter = 'M';
                break;

            case 'n':
            case 'N':
                firstLetter = 'N';
                break;

            case 'o':
            case 'O':
                firstLetter = 'O';
                break;
            case 'p':
            case 'P':
                firstLetter = 'P';
                break;
            case 'q':
            case 'Q':
                firstLetter = 'Q';
                break;
            case 'r':
            case 'R':
                firstLetter = 'R';
                break;
            case 's':
            case 'S':
                firstLetter = 'S';
                break;
            case 't':
            case 'T':
                firstLetter = 'T';
                break;
            case 'u':
            case 'U':
                firstLetter = 'U';
                break;
            case 'v':
            case 'V':
                firstLetter = 'V';
                break;
            case 'w':
            case 'W':
                firstLetter = 'W';
                break;
            case 'x':
            case 'X':
                firstLetter = 'X';
                break;
            case 'y':
            case 'Y':
                firstLetter = 'Y';
                break;
            case 'z':
            case 'Z':
                firstLetter = 'Z';
                break;
            default:
                System.out.println("Invalid character '" + firstLetter + "'");
        }

        // getting remaining letter
        String remainingLetter = word.substring(1);

        System.out.println(firstLetter+remainingLetter);
    }

    // 2nd approach of capitalize first letter of any word

    static void capitalLetterOfAnyWord(String word){
         // store original word
        String originalWord = word;

        String transformedWord = originalWord.substring(0,1).toUpperCase() + originalWord.substring(1);

        System.out.println( originalWord+" = "+transformedWord);
    }

    static void printingTable(int tableNumber,int times){
        for (int i=1 ; i<=times; i++){
            System.out.println(tableNumber + "x" + i + "=" + (tableNumber*i) );
        }
    }

    // printing array element with loop

    static void printingArrayElements(){
        String [] names={
                "Tahir","Salman","Sameer","Saad","Faraz","Fahad","Ali"
        };

        for(int i=0 ; i<names.length ; i++){
            System.out.println(names[i]);
        }

        // reverse print array element
        System.out.println("\nAfter Reverse \n");
        for(int i=names.length-1; i>=0 ;i-- ) {
            System.out.println(names[i]);
        }
    }

    // while loop practice

    static  void practiceWhileLoop(){

        int i = 0;
        boolean keepLooping = true;

        while (keepLooping){
            System.out.println("Hello while Loop " + i++);
            keepLooping = false;

        }
    }

    static void practiceDoWhileLoop(){

        int i=1;
        boolean keepLooping = true;
        do{
            System.out.println("Do you want to continue the loop"+ i++);
            keepLooping = false;
        }while(keepLooping);

    }


}
