import java.util.*;
public class Q1ActivitySelection{
    public static class Activities implements Comparable<Activities>{
        int s;
        int e;
        int i;
        Activities(int i,int s,int e){
            this.s=s;
            this.e=e;
            this.i=i;
        }
        @Override
        public int compareTo(Activities o) {
            return this.e-o.e;
        } 
    }
    public static int getNumberOfActivities(ArrayList<Activities> allActs,int N){
        ArrayList<Activities> selActs=new ArrayList<>();
        selActs.add(allActs.get(0));
        int lastEnd=allActs.get(0).e;
        for(int i=1;i<N;i++){
            if(allActs.get(i).s>=lastEnd){
                selActs.add(allActs.get(i));
                lastEnd=allActs.get(i).e;
            }
        }
        for(int i=0;i<selActs.size();i++) System.out.println(selActs.get(i).s+" "+selActs.get(i).e);
        return selActs.size();
    }
    public static void main(String[] args) {
        int start[]={1, 3, 0, 5, 8, 5};
        int end[]={2, 4, 6, 7, 9, 9};
        int N=start.length;
        ArrayList<Activities> allActs=new ArrayList<>();
        for(int i=0;i<N;i++)
            allActs.add(new Activities(i, start[i], end[i]));
        Collections.sort(allActs);
        System.out.println("Numner of Acts : "+getNumberOfActivities(allActs,N));
    }
}