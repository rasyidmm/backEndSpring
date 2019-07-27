package backend.spring.dto;

public class RegisterUserDTO {

    private String namaDepanUser;
    private String namaBelakangUser;
    private String alamatUser;
    private String noHpUser;
    private String agamaUser;
    private String pendidikanUser;
    private String fotoUser;
    private String usernameLogin;
    private String passwordLogin;


    public String getNamaDepanUser() {
        return namaDepanUser;
    }

    public void setNamaDepanUser(String namaDepanUser) {
        this.namaDepanUser = namaDepanUser;
    }

    public String getNamaBelakangUser() {
        return namaBelakangUser;
    }

    public void setNamaBelakangUser(String namaBelakangUser) {
        this.namaBelakangUser = namaBelakangUser;
    }

    public String getAlamatUser() {
        return alamatUser;
    }

    public void setAlamatUser(String alamatUser) {
        this.alamatUser = alamatUser;
    }

    public String getNoHpUser() {
        return noHpUser;
    }

    public void setNoHpUser(String noHpUser) {
        this.noHpUser = noHpUser;
    }

    public String getAgamaUser() {
        return agamaUser;
    }

    public void setAgamaUser(String agamaUser) {
        this.agamaUser = agamaUser;
    }

    public String getPendidikanUser() {
        return pendidikanUser;
    }

    public void setPendidikanUser(String pendidikanUser) {
        this.pendidikanUser = pendidikanUser;
    }

    public String getFotoUser() {
        return fotoUser;
    }

    public void setFotoUser(String fotoUser) {
        this.fotoUser = fotoUser;
    }

    public String getUsernameLogin() {
        return usernameLogin;
    }

    public void setUsernameLogin(String usernameLogin) {
        this.usernameLogin = usernameLogin;
    }

    public String getPasswordLogin() {
        return passwordLogin;
    }

    public void setPasswordLogin(String passwordLogin) {
        this.passwordLogin = passwordLogin;
    }
}
