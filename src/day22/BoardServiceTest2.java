package day22;
import java.util.ArrayList;
import java.util.Scanner;

public class Board1 {
    // 필드 선언
    private String content;
    private String author;
    private int password;

    // 생성자
    public Board1(String content, String author, int password) {
        this.content = content;
        this.author = author;
        this.password = password;
    }

    // getter
    public String getContent() {
        return content;
    }
    public String getAuthor() {
        return author;
    }
    public int getPassword() {
        return password;
    }

    // setter
    public void setContent(String content) {
        this.content = content;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPassword(int password) {
        this.password = password;
    }

    // toString
    @Override
    public String toString() {
        return "게시물 내용: " + content + ", 작성자: " + author + ", 비밀번호: " + password;
    }
}

class BoardServiceTest2 {
    private static ArrayList<Board> boards = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 게시물 등록
        registerPosts();

        // 저장된 게시물 출력
        printPosts();

        scanner.close();
    }

    // 게시물 등록 메서드
    private static void registerPosts() {
        while (true) {
            System.out.print("게시물을 입력하시오 (종료하려면 'exit' 입력): ");
            String content = scanner.nextLine(); // 입력받은 변수 저장

            // 종료 조건
            if (content.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("작성자를 입력하시오: ");
            String author = scanner.nextLine();
            System.out.print("비밀번호를 입력하시오: ");
            int password = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼 비우기

            // 게시물 객체 생성 및 리스트에 추가
            Board board = new Board(content, author, password);
            boards.add(board);
        }
    }

    // 게시물 출력 메서드
    private static void printPosts() {
        System.out.println("저장된 게시물:");
        for (Board b : boards) {
            System.out.println(b);
        }
    }
}
