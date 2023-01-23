package Com.Review1st;
public class MissingNum {
    public static void main(String[] args) {
                int[] num = {7,8,4,6,1,3,2};

                int n,z;
                 n = num.length+1;
                 z = (n * ( n + 1 )) / 2;
                for(int a=0; a< num.length; a++){
                    z = z - num[a];
                }
                System.out.println("Here the  Missing number is:" + z );
            }
        }

