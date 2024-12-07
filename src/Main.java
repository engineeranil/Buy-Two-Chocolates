public class Main {
    public static void main(String[] args) {
        int[] prices = {3,2,3};
        int money = 3;
        int remainMoney = 0;
        int index =0;
        int counter = 0;
        for(int i =0; i<prices.length; i++){
            int minMoney = prices[0];
            int minIndex = 0;
            for(int k=0; k<prices.length; k++){
                if(prices[k]<minMoney){
                    minMoney = prices[k];
                    minIndex=k;
                }
            }
            int max = 0;
            for(int j=0; j<prices.length; j++){
                if(prices[j]>max){
                    max = prices[j];
                }
            }

            remainMoney+=minMoney;
            counter++;
            if(counter==2){
                break;
            }
            prices[minIndex] = max;
        }

        if(remainMoney<money || money==remainMoney){
            money = money-remainMoney;
            System.out.println(money);
        }
       else {
            System.out.println(money);
        }
    }
}
