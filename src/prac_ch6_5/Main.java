package prac_ch6_5;

class DriveSystem {
    private double oil;

    DriveSystem(double oil) {
        System.out.printf("현재 연료: %.1fL\n", oil);
        this.oil = oil;
    }

    void driving(int distance) {
        double req_oil = (double)distance/10;
        System.out.printf("주행 시작: %dkm\n", distance);

        if(this.oil < req_oil) {
            System.out.printf("연료가 부족합니다. 필요한 연료: %.1fL, 현재 연료: %.1fL\n", req_oil, this.oil);
        }
        else {
            this.oil -= req_oil;
            System.out.printf("주행 완료: %dkm, 사용 연료: %.1fL, 남은 연료: %.1fL\n", distance, req_oil, this.oil);
        }
    }
    void setOiling(double oil) {
        System.out.printf("연료 %.1fL 주유 시도\n", oil);
        if (oil < 0) {
            System.out.println("마이너스 양의 연료는 주입되지 않습니다.");
        }
        else if(this.oil + oil > 10.0) {
            double spill_oil = this.oil + oil - 10.0;
            this.oil = this.oil + oil - spill_oil;
            System.out.printf("최대 용량을 초과하여 %.1fL는 주유되지 않았습니다. 현재 연료: %.1fL\n", spill_oil, 10.0);
        }
        else {
            this.oil += oil;
            System.out.printf("주유가 완료되었습니다. 현재 연료: %.1fL\n", this.oil);
        }
    }
    void getCheck() {
        int distance = (int)this.oil*10;
        System.out.printf("연료 경고: 남은 연료 %.1fL\n", this.oil);
        System.out.printf("현재 주행 가능 거리: %d\n", distance);
    }
}

public class Main {
    public static void main(String[] args) {
        DriveSystem drive = new DriveSystem(10.0);
        drive.driving(50);
        drive.driving(80);

        drive.setOiling(6.0);
        drive.driving(70);

        drive.getCheck();
    }
}
