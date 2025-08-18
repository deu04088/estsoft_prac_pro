package interface_test;

interface Alert {
    void notify(String something);
}

class Email implements Alert {
    @Override
    public void notify(String server){
        System.out.println("Notification was sent via Email: " + server);
    }
}

class Sms implements Alert {
    @Override
    public void notify(String api) {
        System.out.println("Notification was sent via API: " + api);
    }
}

class App implements Alert {
    @Override
    public void notify(String app) {
        System.out.println("Notification was sent via App: " + app);
    }
}

class main{
    public static void main(String[] args) {
        Alert email = new Email();
        Alert sms = new Sms();
        Alert app = new App();

        email.notify("deu04088@naver.com");
        sms.notify("010-1234-5677");
        app.notify("정부24");
    }
}

