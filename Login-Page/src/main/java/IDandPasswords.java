import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords() {

        logininfo.put("Clu", "kevinflynn");
        logininfo.put("Tron", "ALEXBRADLEY");
        logininfo.put("Jet", "Tron2.0");
    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}
