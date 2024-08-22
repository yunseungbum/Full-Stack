package Ex05_Project;

public class UserInfo {
	private String id;
    private int pwd;
    
    public UserInfo(String id, int pwd) {
        this.id = id;
        this.pwd = pwd;
    }
    public String getId() {return id;}
    public int getPwd() {return pwd;}
}