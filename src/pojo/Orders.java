package pojo;

import java.util.Date;

/**
 * Created by admin on 2017/7/1.
 */
public class Orders {
    private int id;
    private String number;
    private Date createtine;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatetine() {
        return createtine;
    }

    public void setCreatetine(Date createtine) {
        this.createtine = createtine;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
