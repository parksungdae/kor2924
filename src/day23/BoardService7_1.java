package day23;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService7_1 {
    static Scanner scan = new Scanner(System.in); //정적(static)변수
    static ArrayList<Board> boardList = new ArrayList<>(); //정적(static)변수

    static void boardWrite() { //메소드 정의
        scan.nextLine();
        System.out.print("내용 : ");      String content = scan.nextLine();
        System.out.print("작성자 : ");     String writer = scan.next();
        System.out.print("비밀번호 : ");    int pwd = scan.nextInt();
        Board board = new Board( content , writer , pwd );  // - 게시물 객체 생성
        boardList.add( board );
    }
    static void boarPrint() { //메소드 정의
        for( int index = 0 ; index <= boardList.size()-1 ; index++ ){
            System.out.printf("작성자 : %s , 내용 : %s \n" ,
                    boardList.get( index).getContent() ,
                    boardList.get(index).getWriter() );
        }
    }

    public static void main(String[] args) {

        while (true){
            System.out.print("1.글쓰기 2.글출력 : ");
            int choose = scan.nextInt();
            if( choose == 1 ){
                boardWrite(); //등록함수 호출
            } else if( choose == 2 ) {
                boarPrint(); //출력함수 호출

            }
        }
    }
}


