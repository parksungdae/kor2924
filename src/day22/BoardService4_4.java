package day22;
import java.util.Scanner;

public class BoardService4_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Board[] boardList = null;
        int count = 0;

        while (true){
            System.out.print("1.글쓰기 2.글출력 : ");
            int choose = scan.nextInt();
            if( choose == 1 ){
                // [1] 사용자로 저장할 데이터 입력 받는다.
                scan.nextLine();
                System.out.print("내용 : ");      String content = scan.nextLine();
                System.out.print("작성자 : ");     String writer = scan.next();
                System.out.print("비밀번호 : ");    int pwd = scan.nextInt();

                // [2] 입력 받은 데이터로 게시물 객체 생성
                Board board = new Board();  // - 게시물 객체 생성
                board.content = content; board.writer = writer; board.pwd = pwd;

                // [3]
                count++; // 게시물수 1증가
                Board[] newBoardList = new Board[ count ]; // 새로운 배열 생성
                // 기존 배열내 게시물들을 새로운 배열에 이동하기 / 배열 복사
                if( count != 1 ){ // 만약에 기존배열내 게시물이 존재하면
                    for( int index = 0 ; index <= boardList.length-1 ; index++ ){
                        newBoardList[index] = boardList[index];
                        // 기존배열내 게시물들을 새로운배열에 대입 /카피 복사
                    }
                }
                newBoardList[newBoardList.length-1 ] = board;
                // 새로운 배열내 마지막 인덱스( 배열명.length-1 )에 입력받은 게시물객체 등록
                boardList = newBoardList;
                // ** 새로운 배열을 기존배열에 대입한다.

            }else if (choose == 2){
                for( int index = 0 ; index <= boardList.length-1 ; index++ ){
                    if( boardList[index] != null ){
                        System.out.printf("작성자 : %s , 내용 : %s \n" ,
                                boardList[index].writer , boardList[index].content );
                    }
                }
            }
        }
    }
}

