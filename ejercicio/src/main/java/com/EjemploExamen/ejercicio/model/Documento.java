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
@Table("DOCUMENTS")
public class Documento implements Serializable {
    @NotNull
    @Size(min=1, max=10)
    @Id
    private int doc_id;

    @NotNull
    @Size(min=1, max=40)
    private String doc;

    @NotNull
    @Size(min=1, max=30)
    private int user_id;

    public Documento()
    {

    }

    public Documento(int doc_id, String doc, int user_id) {
        this.setDocId(doc_id);
        this.setDoc(doc);
        this.setUserId(user_id);
    }

    public int getDocId() {
        return doc_id;
    }

    public void setDocId(int doc_id) {
        this.doc_id = doc_id;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }
}
