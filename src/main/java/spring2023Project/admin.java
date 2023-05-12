package spring2023Project;

public class admin {

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPword() {
        return adminPword;
    }

    public void setAdminPword(String adminPword) {
        this.adminPword = adminPword;
    }

    private String adminName = "admin";
    private String adminPword = "admin1234";
}
