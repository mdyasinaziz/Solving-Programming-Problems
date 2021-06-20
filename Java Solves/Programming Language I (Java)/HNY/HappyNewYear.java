public class HappyNewYear{
    public static void main (String [] args){
        char[] charArray = {'H', 'a', 'p', 'p', 'y', ' ' , 'N', 'e', 'w', ' ' ,  'Y' , 'e', 'a', 'r', ' ' ,'H', 'a', 'p', 'p', 'y', ' ' , 
            'N', 'e', 'w', ' ' ,  'Y' , ' ', 'a', 'r' };
        int arrayCount = 0;
        int spaceCount = 70;
        for (int i = 1; i <= 11 ; i++){
            for (int j = 1; j <= spaceCount; j++){
                System.out.print(" ");
            }
            spaceCount--;
            for (int k = 0; k <= arrayCount; k++){
                System.out.print(charArray[k]);   
            }
            arrayCount = arrayCount + 2 ;
            System.out.println();
        }
        spaceCount = 61;
        arrayCount = arrayCount - 4;
        for (int i = 1; i <= 11 ; i++){
            for (int j = 1; j <= spaceCount; j++){
                System.out.print(" ");
            }
            spaceCount++;
            for (int k = 0; k <= arrayCount; k++){
                System.out.print(charArray[k]);   
            }
            arrayCount = arrayCount - 2 ;
            System.out.println();
        }
        for (int i = 1 ; i <= 65 ; i++){
            System.out.print(" ");
        }
        System.out.println("Dear Bhaia");
        for (int i = 1 ; i <= 41 ; i++){
            System.out.print(" ");
        }
        System.out.println("Today is the first blank page of a 365 page book, Write a good one");
         for (int i = 1 ; i <= 44 ; i++){
            System.out.print(" ");
        }
        System.out.println("New Dreams, new hopes, new experiences and new joys, wishing");
         for (int i = 1 ; i <= 61 ; i++){
            System.out.print(" ");
        }
        System.out.println("You A Happy New Year");
        System.out.println();
        
         String st[]=new String[11];
                st[0]="    *       *         *         *     *       #######    ########      #    ########        *       *         *         *     *   ";
                st[1]="       *      *       *       *    *                #    #      #     ##    #      #           *      *       *       *    *      ";
                st[2]="  *       *     *     *     *    *       *          #    #      #   #  #    #      #      *       *     *     *     *    *       *";
                st[3]="        *    *     *  *   *   *    *                #    #      #      #    #      #            *    *     *  *   *   *    *      ";
                st[4]="        *    *     * ***  *   *    *                #    #      #      #    #      #            *    *     * ***  *   *    *      ";
                st[5]="* * * * * * * * *  * *** * * * * * * * * *    #######    #      #      #    ########    * * * * * * * * *  * *** * * * * * * * * *";
                st[6]="                *  * *** *  *                 #          #      #      #    #      #                    *  * *** *  *             ";
                st[7]="        *    *    *   *   *   *    *          #          #      #      #    #      #            *    *    *   *   *   *    *      ";
                st[8]="  *       *     *     *     *    *       *    #          #      #      #    #      #      *       *     *     *     *    *       *";
                st[9]="       *      *       *       *    *          #          #      #      #    #      #           *      *       *       *    *      ";
                st[10]="     *       *        *          *     *      #######    ########   ######  ########        *       *         *         *     *  ";
                for (int i = 0 ; i <= 10 ; i ++){
                    System.out.println(st[i]);
                }
         
        
    }
}

