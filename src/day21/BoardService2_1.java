package day21;
import java.util.Scanner;
public class BoardService2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] content = new String[100];
        String[] writer = new String[100];

        while(true){ // 루프 시작
            System.out.print("1.게시물 쓰기 2.게시물 출력 : ");
            int choose = scan.nextInt();
            if( choose == 1 ){
                System.out.print("새로운 게시물 제목: "); String cont = scan.next();
                System.out.print("새로운 게시물 작성자: "); String writ = scan.next();
                boolean save = false;
                for( int index = 0 ; index <= content.length-1 ; index++ ){
                    if( content[index] == null ){
                        content[index] = cont; writer[index] = writ;
                        save = true;
                        break;
                    } // if end
                } // for end
                // for 종료후에 save 변수값이 true 성공 , false 이면 실패
                if( save ){   System.out.println("게시물 쓰기 성공");    }
                else{ System.out.println("게시물 쓰기 실패 : 빈공간이 없습니다.");  }
            } // if end

            if( choose == 2 ){
                for( int index = 0 ; index <= content.length-1 ; index++  ){
                    if( content[index] !=null ){
                        System.out.printf("작성자 : %s , 내용 : %s \n" , writer[index] , content[index] );
                    } // if end
                } // for end
            } // if end
        } // while end
    } // main end
} // class end
