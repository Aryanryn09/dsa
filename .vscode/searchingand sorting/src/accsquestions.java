public class accsquestions {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(maxwealth(accounts));
    }

    static int maxwealth(int[][] accounts) {
        int sumwealth = 0;

        for (int person = 0; person < accounts.length; person++) {
//          int sumwealth=0;
            for (int account = 0; account < accounts[person].length; account++) {
                sumwealth += accounts[person][account];
                sumwealth = Integer.MIN_VALUE;
                if (sumwealth > accounts[person][account]) {
                    sumwealth = accounts[person][account];


                }
            }


        }
        return sumwealth;
    }
}

