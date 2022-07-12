package juHwan;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private ArrayList<명언> WiseSayings;
    private Scanner sc;
    private int number;

    public App() {
        sc = new Scanner(System.in);
        number = 0;
        WiseSayings = new ArrayList<>();

    }

    public void run(){



        System.out.println("=== 명언 SSG ===");

        outer:

        while (true) {
            System.out.print("명령) ");
            String command = sc.next();


            switch (command) {


                case "등록":
                    write();
                    break;

                case "목록":
                    list();
                    break;

                case "종료":
                    break outer;
            }
        }
        sc.close();
    }

    private void list(){
        System.out.println("번호 / 작가 / 명언");
        System.out.println("-----------------");
        for(int i = WiseSayings.size()-1 ; i >= 0 ; i--){
            System.out.println(WiseSaying.id);
        }


    }
    private void write() {
        int id = ++number;
        System.out.print("명언 : ");
        String contents = sc.next();
        System.out.print("작가 : ");
        String author = sc.next();


        명언 WiseSaying = new 명언(id , contents, author);


        WiseSayings.add(WiseSaying);


        System.out.printf("%d번 명언이 등록되었습니다.\n",id);
    }




}
