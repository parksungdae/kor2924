package day21;

import java.util.Scanner;

public class BoardService1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String content1 = null;   String writer1 = null;        // 첫번째 게시물 내용물들
        String content2 = null;   String writer2 = null;        // 두번째 게시물 내용물들
        String content3 = null;   String writer3 = null;        // 세번째 게시물 내용물들

        while( true ) {
            System.out.print("1.게시물쓰기 2.게시물출력 선택 : ");// 출력
            int choose = scan.nextInt(); // 입력
            if( choose == 1 ) { // 만약에 입력한 값이 1 이면 '게시물 쓰기' 구현
                // 게시물을 저장할 내용 입력 받기
                System.out.print("새로운 게시물 내용: "); String content = scan.next();
                System.out.print("새로운 게시물 작성자: "); String writer = scan.next();
                // 게시물을 작성할 공간이 있는지 체크 , 임의로 게시물이 존재하지 않는 뜻  null(객체없다뜻) 또는 ""
                if( content1 == null ){ // 만약에 첫번째 게시물의 정보가 비어있으면
                    content1 = content;   writer1 = writer; // 입력받은 값들을 첫번째 게시물 변수에 저장
                } // if end
                else if( content2 == null ) { // 만약에 두번째 게시물의 정보가 비어 있으면
                    content2 = content; writer2 = writer;
                } // else if end
                else if ( content3 == null ) {
                    content3 = content; writer3 = writer;
                }else{
                    System.out.println("게시물 쓰기 실패 : 빈공간이 없습니다.");
                } // else end
            } // if end
            else if ( choose == 2 ) { // 만약에 입력한 값이 2 이면 '게시물 출력' 구현

                if( content1 != null ) {// 만약에 첫번째 게시물의 존재하면
                    System.out.printf("작성자 : %s , 내용 : %s \n" , writer1 , content1 );
                }
                if( content2 != null ) {// 만약에 두번째 게시물의 존재하면
                    System.out.printf("작성자 : %s , 내용 : %s \n" , writer2 , content2 );
                }
                if( content3 != null ) {// 만약에 세번째 게시물의 존재하면
                    System.out.printf("작성자 : %s , 내용 : %s \n" , writer3 , content3 );
                }

            } // if end
        } // while end
    } // main end
} // class end
