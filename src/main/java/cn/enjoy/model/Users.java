package cn.enjoy.model;

import java.io.Serializable;

public class Users implements Serializable {
    private Integer id;

    private String passwd;

    private String username;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public Users withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public Users withPasswd(String passwd) {
        this.setPasswd(passwd);
        return this;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getUsername() {
        return username;
    }

    public Users withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", passwd=").append(passwd);
        sb.append(", username=").append(username);
        sb.append("]");
        return sb.toString();
    }
}