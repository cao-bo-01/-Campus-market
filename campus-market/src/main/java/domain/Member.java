package domain;

public class Member {

    private String ename;
    private String zname;
    private String trait;
    private String hobby;
    private String photo;

    public Member() {
    }

    public Member(String ename, String zname, String trait, String hobby, String photo) {
        this.ename = ename;
        this.zname = zname;
        this.trait = trait;
        this.hobby = hobby;
        this.photo = photo;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
