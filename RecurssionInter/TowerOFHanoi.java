package RecurssionInter;

public class TowerOFHanoi {
    public static void towerHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerHanoi(n-1,src,dest,helper);
        System.out.println("tansfer disk "+n+" from "+src+" to "+dest);
        towerHanoi(n-1,helper,src,dest);
    }
    public static void main(String args[]){
        int n = 4;
        towerHanoi(n, "A", "B", "C");

    }
}
