//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

class Test {
        Test(int deyNumber, int mothSize){
            
            System.out.print("\tMo");
            System.out.print("\tTu");
            System.out.print("\tWe");
            System.out.print("\tTh");
            System.out.print("\tFr");
            System.out.print("\tSa");
            System.out.println("\tSu");


            int counterDey = deyNumber;
            int counter = 0;

            for (int i = 0; i < deyNumber; i++) {
                System.out.print("\t");
            }

            while (counterDey <mothSize){
                counter++;
                counterDey++;
                System.out.print("\t" + counter);

                if(counterDey%7 ==0) System.out.println();
            }
            System.out.println();
        }
}