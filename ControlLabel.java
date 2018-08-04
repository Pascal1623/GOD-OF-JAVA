import java.awt.*;

public class ControlLabel {
    public static void main(String args[]){
        ControlLabel control=new ControlLabel();
        //control.printTimesTable();
        //control.printTimesTableSkip4Case1();
        control.printTimesTableSkip4Case2();
    }
    public void printTimesTable(){
        for(int level=2;level<=9;level++){
            for(int unit=1;unit<=9;unit++){
                System.out.print(level+"x"+unit+"="+level*unit+" ");
            }
            System.out.println();
        }
    }
    public void printTimesTableSkip4Case1(){
        for(int level=2;level<=9;level++){
            //if(level==4) continue;
            for(int unit=1;unit<=9;unit++){
                //if(level==4||unit==4) continue;
                if(unit==4) break;
                System.out.print(level+"x"+unit+"="+level*unit+" ");
            }
            System.out.println();
        }
    }
    public void printTimesTableSkip4Case2(){
        label:
        for(int level=2;level<10;level++){
            //if(level==4) continue;
            for(int unit=1;unit<10;unit++){
                if(unit==4) continue label;
                System.out.println(level+"x"+unit+"="+level*unit+" ");
            }
            System.out.println();
        }
    }
}
