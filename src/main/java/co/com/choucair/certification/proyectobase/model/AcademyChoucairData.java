package co.com.choucair.certification.proyectobase.model;

public class AcademyChoucairData {

    private String strUser;
    private String strPassword;
    private String strCourse;

    public AcademyChoucairData(String strUser, String strPassword, String strCourse) {
        this.strUser = strUser;
        this.strPassword = strPassword;
        this.strCourse = strCourse;
    }

    public String getStrUser() {
        return strUser;
    }

    public void setStrUser(String strUser) {
        this.strUser = strUser;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrCourse() {
        return strCourse;
    }

    public void setStrCourse(String strCourse) {
        this.strCourse = strCourse;
    }
}
