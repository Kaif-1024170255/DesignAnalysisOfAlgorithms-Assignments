import java.util.*;
public class Q3FractionalKnapsack {
    static class profitRatios implements Comparable<profitRatios>{
        double ratio;
        int v,w,i;
        profitRatios(double r,int v,int w,int idx){
            ratio=r;
            this.v=v;this.w=w;
            i=idx;
        }
        @Override
        public int compareTo(profitRatios p){
            return (int)p.ratio-(int)this.ratio;
        }
    }
    public static double getMaxProfit(int val[],int wts[],int W,int N){
        ArrayList<profitRatios> allItems=new ArrayList<>();
        for(int i=0;i<N;i++)
            allItems.add(new profitRatios((double)val[i]/wts[i],val[i],wts[i], i));
        Collections.sort(allItems);
        //Code:
        double profit=0;
        for(int i=0;i<N;i++){
            if(W>=allItems.get(i).w){
                W=W-allItems.get(i).w;
                profit=profit+allItems.get(i).v;
            }else{
                profit=profit+((double)W/allItems.get(i).w)*allItems.get(i).v;
                break;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int val[]={100,60,120};
        int wts[]={20,10,40};
        int W=50;
        int N=val.length;
        System.out.println("Max Profit : "+getMaxProfit(val,wts,W,N));
    }
}
