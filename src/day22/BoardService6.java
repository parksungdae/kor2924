/*
BoardService6
 - BoardService5 모든 코드를 복사후 진행
 - 추가조건 : NewBoard 클래스 객체들을 캡슐화(접근제한자) 하시오.
 - 1. NewBoard는 앞전 Board 와 동일하게 내용[String타입] 과 작성자[String타입] 과 비밀번호[int타입] 로 구성된 게시물 클래스
 - 2. NewBoard의 모든 필드(멤버변수) 는 private 으로 선언한다.
 - 3. 외부에서 객체 생성시 생성자를 사용한다.
 - 4. getter(필드값호출함수) ,
      setter(필드값대입함수) ,
      toString(객체정보함수) 함수들을 이용하여 모든 필드의 데이터를 간접 접근한다.
      public : 공개용 , 모든 클래스/패키지 내에서 접근 가능
      private : 비공개용 , 현재 클래스내에서 접근 가능
        - 이유 : 객체의 자료는 중요하기 때문에 쉽게 저장/변경 하면 안된다. ( 유효성검사-1.원하는데이터인지 2.안전한데이터인지 )
        - 객체를 통해 필드 직접 접근을 차단하고 간접접근을 이용한 유효성검사를 시행한다.
    protected : 동일한 패키지 내에서 접근 가능 , 상속관계이면 다른 패키지에서도 접근 가능하다.
    (default) : 동일한 패키지 내에서 접근 가능 , 접근제한자를 생략했을때 기본적으로 적용되는 접근제한자

 */

package day22;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardService6 {
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

