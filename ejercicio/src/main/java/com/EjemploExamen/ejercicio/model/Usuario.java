package com.EjemploExamen.ejercicio.model;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Builder
@Table("USERS")
public class Usuario implements Serializable {
    @NotNull
    @Size(min=1, max=30)
    @Id
    private int user_id;

    @NotNull
    @Size(min=1, max= 40)
    private String user;

    @NotNull
    @Size(min=1, max=35)
    private String comment;

    public Usuario()
    {

    }

    public Usuario(int user_id, String user, String comment)
    {
        this.setUserId(user_id);
        this.setUser(user);
        this.setComment(comment);
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
