package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV2 {
    public static void hello(Process process){
        System.out.println("프로그램 시작");

        //코드 조각 시작 (변하는 부분)(외부에서 전달)
        process.run();
        //코드 조각 종료
        System.out.println("프로그램 종료");
    }
    public static void main(String[] args){
        class Dice implements Process{ //static 클래스
            @Override
            public void run(){
                int randomValue = new Random().nextInt(6)+1;
                System.out.println("주사위 = " + randomValue);
            }
        }
        class Sum implements Process{
            @Override
            public void run() {
                for(int i= 0; i<3; i++){
                    System.out.println("i= "+ i);
                }
            }
        }

        hello(new Dice());
        hello(new Sum());
    }
}
