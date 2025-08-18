package prac_ch8_1;

interface Normalizer {     //공백값 제거, 대소문자 변환
    void normalize(RegistrationForm form);
}
interface Rule {    //입력값 체크
    boolean validate(RegistrationForm form);
}

class RegistrationForm {
    String username;
    String email;
    String password;
    String passwordConfirm;

    RegistrationForm(String username, String email, String password, String passwordConfirm) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }
}

class TrimNormalizer implements Normalizer {
    @Override
    public void normalize(RegistrationForm form) {
        form.username = form.username.trim();
        form.email = form.email.trim();
        form.password = form.password.trim();
        form.passwordConfirm = form.passwordConfirm.trim();
        System.out.println("Normalizer(trim) 적용 완료");
    }
}

class EmailValidator implements Normalizer {
    @Override
    public void normalize(RegistrationForm form) {
        form.email = form.email.toLowerCase();
        System.out.println("Normalizer(toLowerCase) 적용 완료");
    }
}

class RequiredRule implements Rule {
    @Override
    public boolean validate(RegistrationForm form) {
        if (form.username == null || form.email == null || form.password == null || form.passwordConfirm == null || form.username.isEmpty() || form.email.isEmpty() || form.password.isEmpty() || form.passwordConfirm.isEmpty()) {
            System.out.println("빈칸을 모두 채워주세요");
            return false;
        }
        else {
            return true;
        }
    }
}

class MinLengthRule implements Rule {
    @Override
    public boolean validate(RegistrationForm form) {
        if(form.username.length() < 3) {
            System.out.println("[Error] username: 최소 길이 3 이상이어야 합니다.");
            return false;
        }
        else if(form.password.length() < 4) {
            System.out.println("[Error] password: 최소 길이 4 이상이어야 합니다.");
            return false;
        }
        else {
            return true;
        }
    }
}

class EmailFormatRule implements Rule {
    @Override
    public boolean validate(RegistrationForm form) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if(!form.email.matches(regex)) {
            System.out.println("[Error] 이메일 형식이 맞지 않습니다.");
            return false;
        }
        return form.email.matches(regex);
    }
}

class PasswordConfirmRule implements Rule {
    @Override
    public boolean validate(RegistrationForm form) {
        if(form.password != form.passwordConfirm) {
            System.out.println("[Error] 비밀번호와 확인 비밀번호가 일치하지 않습니다.");
            return false;
        }
        else {
            return true;
        }
    }
}

class StrongPasswordRule implements Rule {
    @Override
    public boolean validate(RegistrationForm form) {
        String regex = "^(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-={}\\[\\]|;:\"<>,.?/]).{8,}$";
        if(!form.password.matches(regex)) {
            System.out.println("[Error] 비밀번호가 요구사항에 맞지 않습니다. (영문, 특수문자, 숫자 조합 8자리 이상)");
            return false;
        }
        return form.password.matches(regex);
    }
}

class RegistrationService {
    private Normalizer[] normalizer;
    private Rule[] rules;
    private boolean result;

    public RegistrationService(Normalizer[] normalizer, Rule[] rules) {
        this.normalizer = normalizer;
        this.rules = rules;
    }

    public boolean register(RegistrationForm form) {
        normalizer[0] = new TrimNormalizer();
        normalizer[1] = new EmailValidator();

        if(rules.length == 4) {
            rules[0] = new RequiredRule();
            rules[1] = new MinLengthRule();
            rules[2] = new EmailFormatRule();
            rules[3] = new PasswordConfirmRule();
        }
        else {
            rules[0] = new RequiredRule();
            rules[1] = new MinLengthRule();
            rules[2] = new EmailFormatRule();
            rules[3] = new PasswordConfirmRule();
            rules[4] = new StrongPasswordRule();
        }

        System.out.println("== 데이터 정규화 ==");
        for(Normalizer n : normalizer) {
            n.normalize(form);
        }

        System.out.println("== 데이터 검증 ==");
        for(Rule r : rules) {
            if(!(r.validate(form))) {
                result = false;
                break;
            }
            result = r.validate(form);
        }

        if(result) {
            System.out.printf("등록 성공: %s / %s\n", form.username, form.email);
            return true;
        }
        else {
            System.out.println("등록 실패: 입력값을 확인하세요.");
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Normalizer[] normalizers = new Normalizer[2];
        Rule[] basicRules = new Rule[4];
        Rule[] hardRules = new Rule[5];

        RegistrationService service = new RegistrationService(normalizers, basicRules);
        RegistrationForm form1 = new RegistrationForm("   deu04088", "deu04088@gmail.com", "@deu04088", "@deu04088");
        service.register(form1);
        RegistrationForm form2 = new RegistrationForm("deu04088", "deu04088@gmail.com", "@deu04088", "@deu040");
        service.register(form2);

        service = new RegistrationService(normalizers, hardRules);
        RegistrationForm form3 = new RegistrationForm("deu04088", "deu04088@gmail.com", "deu04088", "deu04088");
        service.register(form3);
        RegistrationForm form4 = new RegistrationForm("   ", "deu04088@gmail.com", "@deu04088", "@deu04088");
        service.register(form4);
    }
}
