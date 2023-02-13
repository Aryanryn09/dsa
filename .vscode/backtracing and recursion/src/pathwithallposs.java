import java.util.Arrays;

public class pathwithallposs {
    public static void main(String[] args) {

        boolean[][] board =
                {
                        {true, true, true},
                        {true, true, true},
                        {true, true, true}
                };
        int [][]path = new int[board.length][board[0].length ];
                                  //r            c
        allpathsteps("",0,0,board,1,path);

    }

    static void allpathsteps(String p,int r,int c,boolean[][] maze,int steps,int [][]path ){



        if(r<maze.length -1 && c<maze[0].length-1){

            path [r][c]=steps;

            for (int [] arr:path) {

                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }


        if(!maze[r][c]){
            return;

        }
        maze[r][c]=false;
        path [r][c]=steps;

        if(r<maze.length-1){
            allpathsteps(p+'d',r+1 ,c,maze,steps+1,path);
        }
        if(c<maze[0].length-1){
            allpathsteps(p+'r',r,c+1,maze,steps+1,path);
        }
        if(r>0) {
            allpathsteps(p + 'u',r-1, c , maze ,steps+1,path);
        }
        if(c>0) {
            allpathsteps(p + 'l',r, c-1 , maze ,steps+1,path);
        }
        maze[r][c]=false;
        path [r][c]=0;

    }
}
