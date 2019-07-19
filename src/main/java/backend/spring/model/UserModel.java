package backend.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@JsonIgnoreProperties
public class UserModel implements Serializable {

    @JsonIgnore
    @OneToOne
    private LoginModel loginModel;

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String namaDepanUser;
    private String namaBelakangUser;
    private String alamatUser;
    private String noHpUser;
    private String agamaUser;
    private String pendidikanUser;
    private String fotoUser;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        UserModel.serialVersionUID = serialVersionUID;
    }


    public LoginModel getLoginModel() {
        return loginModel;
    }

    public void setLoginModel(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
}
