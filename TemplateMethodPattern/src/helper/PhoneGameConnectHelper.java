package helper;

public class PhoneGameConnectHelper extends AbsGameConnectHelper {
    @Override
    protected String doSecurity(String string) {
        return "decodedString";
    }

    @Override
    protected boolean authentication(String id, String password) {
        return true;
    }

    @Override
    protected int authorization(String id) {
        return 0;
    }

    @Override
    protected String connection(String info) {
        return "connect";
    }
}
