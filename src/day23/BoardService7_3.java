package day23;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService7_3 {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Board> boardList = new ArrayList<>(); //정적(static)변수

    static void boardWrite() {
        scan.nextLine();
        System.out.print("내용 : ");      String content = scan.nextLine();
        System.out.print("작성자 : ");     String writer = scan.next();
        System.out.print("비밀번호 : ");    int pwd = scan.nextInt();
        Board board = new Board( content , writer , pwd );
        boardList.add( board );
    }
    static void boarPrint() {
        for( int index = 0 ; index <= boardList.size()-1 ; index++ ){
            System.out.printf("작성자 : %s , 내용 : %s \n" ,
                    boardList.get( index).getContent() ,
                    boardList.get(index).getWriter() );
        }
    }
    public static void main(String[] args) {
        while (true)
            System.out.print("1.글쓰기 2.글출력 : ");
        int choose = scan.nextInt();
        if( choose == 1 ){
            boardWrite();
        } else if( choose == 2 ) {
            boarPrint();

        }
    }
}
}


