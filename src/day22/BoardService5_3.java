package day22;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardService5_3 {
    public static void main(String[] args) {
        //입력객체
        Scanner scan = new Scanner(System.in);
        // - 컬렉션 프레임워크중 ArrayList 클래스를 이용한 배열타입 대체한다.
        // 배열(고정길이) vs 컬렉션프레임워크(가변길이)
        ArrayList< Board > boardList = new ArrayList<>();
        // ArrayList<제네릭타입> : 리스트객체에 저장할 여러개 객체들의 타입

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

                // [3]컬렉션 프레임워크인 리스트객체에 게시물 저장한다.
                boardList.add( board );

            }else if (choose == 2){ // 배열내 존재하는 게시물 모두 출력하기
                for( int index = 0 ; index <= boardList.size()-1 ; index++ ){
                    System.out.printf("작성자 : %s , 내용 : %s \n" ,
                            boardList.get(index).writer , boardList.get(index).content);
                } // for end
            }
        } // w end
    } // m end
}

