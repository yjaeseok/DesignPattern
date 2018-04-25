package helper;

public abstract class AbsGameConnectHelper {

    protected abstract String doSecurity(String string);

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String id);

    protected abstract String connection(String info);

    // 템플릿 메소드
    public String requestConnection(String encodedString) {

        // 보안 작업 -> 암호화 된 문자열을 복호화
        String decodedString = doSecurity(encodedString);
        System.out.println("decodedString : " + decodedString);

        String id = "jake"; //decodedString.getId();
        String password = "1234"; ///decodedString.getPassword();

        System.out.println("id: " + id);
        System.out.println("password: " + password);

        if (!authentication(id, password)) {
            throw new Error("id 또는 비밀번호 불일치");
        }

        int level = authorization(id);
        switch (level) {
            case 0:
                System.out.println("관리자");
                break;
            case 1:
                System.out.println("일반 사용자");
                break;
            case 2:
                System.out.println("유료 사용자");
                break;
            default:
                throw new Error("알수 없는 사용자 level : " + level);
        }

        return connection(id);
    }
}
