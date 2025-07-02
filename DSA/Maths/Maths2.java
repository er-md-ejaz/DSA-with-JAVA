import java.util.Arrays;

public class Maths2 {
    public static void main(String[] args) {
        Maths2 mt = new Maths2();
        // System.out.println(mt.countDigitUsingLog(16564));
        // System.out.println(mt.armstrongNumber(1634));
        // mt.printAllDivisors(56);
        // System.out.println(mt.primeNumber(18));
        mt.sieveAlgorithm(40);
        // System.out.println(mt.newtonRaphsonForSqRoot(5));
        // System.out.println("GCD: " +mt.GCD(0, 36));
        // System.out.println(mt.efficientEuclideanGCD(8, 36));

    }


    public int countDigitUsingLog(int n){
        if(n == 0){
            return 1;
        }
        return (int) (Math.log10(n)+1);
    }

    public boolean armstrongNumber(int n){
        int n1 = n;
        int digit = countDigitUsingLog(n);
        int n2=0;
        int unitDigit;
        while (n>0) {
            unitDigit = n % 10;
            n2 += Math.pow(unitDigit, digit);
            n /= 10;
        }
        if(n1 == n2){
            return true;
        }
        return false;
    }

    public void printAllDivisors(int n){
        int sqroot = (int)Math.sqrt(n);
        int counter = 1;
        int otherFactor;
        while (counter <= sqroot) {
            if(n%counter == 0){
                System.out.println(counter + " is root of " +n);
            }
            otherFactor = n / counter;
            if(otherFactor != counter){
                System.out.println(otherFactor + " is root of " +n);
            }
            counter++;
        }
    }

    public boolean primeNumber(int n){
        int sqroot = (int) Math.sqrt(n);
        int counter = 2;
        while(counter <= sqroot){
            if(n%counter == 0){
                return false;
            }
            counter++;
        }
        return true;
    }

    public void sieveAlgorithm(int n){
        boolean arr[] = new boolean[n+1];
        Arrays.fill(arr, true);
        int counter = 2;
        int sqroot = (int)Math.sqrt(n);
        while (counter <= (sqroot+1)) {
            if(arr[counter] == true){
                for(int factor = 2*counter; factor <= n; factor += counter){
                    arr[factor] = false;
                }
            }
            counter++;
        }

        for(int i=2; i<=n; i++){
            if(arr[i] == true){
                System.out.println(i);
            }
        }
    }

    public double newtonRaphsonForSqRoot(int n){
        double x = n;
        double tolerance=0.001;
        while (true){
            double root = 0.5*(x + (n/x));
            double ans = x - root;
            if(ans < tolerance){
                break;
            }
            x = root;
        }
        String f = String.format("%.2f", x);
        double finalRoot = Double.parseDouble(f);
        return finalRoot;
    }

    public int GCD(int n1, int n2){
        int min = (n1<=n2)?n1:n2;
        while (min > 0) {
            if(n1%min == 0 && n2%min == 0){
                return min;
            }
            min--;
        }
        int max = (n1>=n2)?n1:n2;
        return max;
    }


    public int euclideanGCD(int n1, int n2){
        while (n1!=0 && n2!=0) {
            if(n1>n2){
                n1 -= n2;
            }
            else{
                n2 -= n1;
            }
        }
        int result = n1;
        if(n1 == 0){
            result = n2;
        }
        return result;
    }


    public int efficientEuclideanGCD(int n1, int n2){
        while (n1!=0 && n2!=0) {
            if(n1>n2){
                n1 %= n2;
            }
            else{
                n2 %= n1;
            }
        }
        int result = n1;
        if(n1 == 0){
            result = n2;
        }
        return result;
    }


}
