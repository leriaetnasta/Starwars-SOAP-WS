package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import lombok.*;

import java.util.Date;


@XmlRootElement(name = "StarwarsCharacter")
@XmlAccessorType(XmlAccessType.FIELD)

public class StarwarsCharacter {
    private int Id;
    private String Name;
    @XmlTransient
    private Date joinDate;

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public StarwarsCharacter(int id,String name,Date joinDate) {
        this.Id = id;
        this.Name = name;
        this.joinDate = joinDate;
    }
    public StarwarsCharacter() {
        this.Id = 0;
        this.Name = "StarwarsCharacter";
        this.joinDate = new Date();
    }
}
