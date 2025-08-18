package prac_ch6_6;

class microwave {
    private boolean status;
    private int time;

    void openDoor() {
        if(this.time != 0){
            System.out.println("문을 열 수 없습니다. 조리 중입니다.");
        }
        else {
            this.status = false;
            System.out.println("문을 열었습니다.");
        }
    }
    void closeDoor() {
        this.status = true;
        System.out.println("문을 닫았습니다.");
    }
    void startCook(){
        if(this.status == false) {
            System.out.println("조리를 시작할 수 없습니다. 문이 열려 있습니다.");
        }
    }
    void stopCook(){
        System.out.printf("조리를 중지했습니다. 남은 시간: %d\n", this.time);
    }
    void setTime(int time){
        if(this.status == false) {
            System.out.println("시간을 추가할 수 없습니다. 문이 열려 있습니다.");
        }
        else {
            this.time += time;
            System.out.printf("시간 %d가 추가되었습니다. 남은 시간: %d\n", time, this.time);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        microwave mic = new microwave();
    }
}
