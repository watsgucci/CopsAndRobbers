import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    // **********    Global variables:
    static int count = 0;
    static String[] empty = {"1-0","1-1","1-2","1-3","1-4","1-5","1-6","1-7","1-8","1-9","1-10","1-11","1-12","1-13",
            "3-1","3-2","3-3","3-4","3-5","3-6","3-7","3-8","3-9","3-10","3-11","3-12","3-13","3-14",
            "5-0","5-1","5-2","5-3","5-4","5-5","5-6","5-7","5-8","5-9","5-10","5-11","5-12","5-13"};
    static ArrayList<String> emptyList = new ArrayList<>(Arrays.asList(empty));
    static String figure1Str = "0-0"; // user's figure position as String
    static String owlStr = "1-3";
    static String bunyStr = "3-6";
    static int[] figure1Int = {0, 0}; // user's figure position as int
    static int dice = 64; // dice value, will be change once dice thrown
    static String userName = ""; // user's name, is used to welcome user
    static String[][] figure = {
            {"("+Colr.blue+"⊙"+Colr.reset+"‿"+Colr.blue+"⊙"+Colr.reset+") ",
            ">"+Colr.lightRed+")⧚⧚)"+Colr.reset+"-",
            Colr.green+"╱╱ ╲╲ "+Colr.reset},
            {" {"+Colr.yellow+"o"+Colr.reset+","+Colr.yellow+"o"+Colr.reset+"}",
            "./)_) ",
            Colr.red+"  \" \" "+Colr.reset},
            {"(\\(\\  ",
            "(-.-) ",
            "o_()()"},
    };

    // *************   End of Global variables


    public static void main(String[] args){
        // This is main controlling port, where we invoke necessary functions
        // we can temporary avoid function while project is in development by commenting out

        userName = Scene.intro();

        display(); // has to be inside while(isGameNotOver) loop

        userMove(dice); // this should be invoked when dice thrown
    }

    public static void display(){
        // I'm working on how to clear console from previous picture
        System.out.println(Colr.clear);

        // Here We have to sout some status information

        count = 0;
        for(int y=0;y<7;y++){
            for(int i=0;i<3;i++) {
                for (int x = 0; x < 15; x++) {
                    if(i==1){count(y, x);}
                    System.out.print(
                            figure1Str.equals(y+"-"+x)?figure[0][i]:
                                    owlStr.equals(y+"-"+x)?figure[1][i]:
                                            bunyStr.equals(y+"-"+x)?figure[2][i]:
                                    emptyList.contains(y+"-"+x)?"      ":box(i)
                    );
                }
                System.out.println();
            }
        }
    }

    public static void count(int y, int x){
        if(y<1){
            count++;
        }else if(y==1){
            count=16;
        }else if(y==2&&x==0){
            count=31;
        }else if(y==2&&x>0){
            count--;
        }else if(y==3){
            count=32;
        }else if(y==4){
            count++;
        }else if(y==5){
            count=48;
        }else if(y==6&&x==0){
            count=63;
        }else if(y==6&&x>0){
            count--;
        }
    }

    public static String box(int i){
        String[] boxString = {
                "╔════╗",
                "║ "+(count<10?Colr.red+"0"+count+Colr.reset:Colr.red+count+Colr.reset)+" ║",
                "╚════╝"
        };
        return boxString[i];
    }

    public static void userMove(int n){ // n represent steps to move
        for (int i=0;i<n;i++){
            if(figure1Int[0]==0&&figure1Int[1]<14){
                figure1Int[1]++;
            }else if(figure1Int[0]<2&&figure1Int[1]==14){
                figure1Int[0]++;
            }else if(figure1Int[0]==2&&figure1Int[1]!=0){
                figure1Int[1]--;
            }else if(figure1Int[0]<4&&figure1Int[1]==0){
                figure1Int[0]++;
            }else if(figure1Int[0]==4&&figure1Int[1]<14){
                figure1Int[1]++;
            }else if(figure1Int[0]<6&&figure1Int[1]==14){
                figure1Int[0]++;
            }else if(figure1Int[0]==6&&figure1Int[1]!=0){
                figure1Int[1]--;
            }else {
                break;
            }
            figure1Str = ""+figure1Int[0]+"-"+figure1Int[1];
            display();
            try {
                Thread.sleep(300L);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(figure1Int[0]==6&&figure1Int[1]==0){
                Scene.win();
            }
        }
    }

}
