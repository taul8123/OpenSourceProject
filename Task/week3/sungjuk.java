import java.util.Scanner;

public class sungjuk {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //학번 이름 국어 영어 수학 자바  + 총점 평균 학점
        student[] students = new student[5];
        for(int i=0;i<5;i++){
            students[i] = new student();
        }
        for(int i=0;i<5; i++){
            int total = 0;
            System.out.println("학번, 이름, 국어, 영어, 수학, 자바를 공백으로 분리해 입력해 주세요.");
            students[i].hakbun = scan.next();
            students[i].name = scan.next();
            total += students[i].korean = scan.nextInt();
            total += students[i].english = scan.nextInt();
            total += students[i].math = scan.nextInt();
            total += students[i].java = scan.nextInt();
            students[i].total = total;
            students[i].avg = (double) total / 4;
            if (90 < students[i].avg){
                students[i].hakjum = "A";
            }
            else if (80 < students[i].avg) {
                students[i].hakjum = "B";
            }
            else if (70 < students[i].avg){
                students[i].hakjum = "C";
            }
            else{
                students[i].hakjum = "F";
            }
        }
        for (int i=0; i<5 ; i++){
            System.out.println("\n\n\n");
            System.out.println("학번 : " + students[i].hakbun);
            System.out.println("이름 : " + students[i].name);
            System.out.println("국어 : " + students[i].korean);
            System.out.println("영어 : " + students[i].english);
            System.out.println("수학 : " + students[i].math);
            System.out.println("자바 : " + students[i].java);
            System.out.println("총점 : " + students[i].total);
            System.out.println("평균 : " + students[i].avg);
            System.out.println("학점 : " + students[i].hakjum);
        }
    }
}

