package VarArgs;


class varArgs{
    public static void main(String[] args){
        System.out.println(sumAll(2,5,8,7,6,9,4,1));
        System.out.println(sumAll(5));

    }

    public static int sumAll(int x, int ...arr){
        int result = x;
        for(int elem : arr){
            result += elem;
        }
        return result;
    }
}