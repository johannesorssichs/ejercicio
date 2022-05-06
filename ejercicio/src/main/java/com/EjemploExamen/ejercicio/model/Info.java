package com.EjemploExamen.ejercicio.model;

import org.springframework.http.server.DelegatingServerHttpResponse;

import java.io.Serializable;
import java.util.List;

public class Info implements Serializable {
    private Usuario usuario;
    private List<Documento> documentos;

    public Info() {
    }

    public Info(Usuario usuario, List<Documento> documentos) {
        this.usuario = usuario;
        this.documentos = documentos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumento(Documento documento)
    {
        if documentos.size() != 0
        {
            documentos.add(documento);
        }
        else
        {
           List<Documento> documentos = new List<Documento>;
        }
    }

    public void setDocumentos(Iterable<Documento> documentos) {
        this.documentos = documentos;
    }
}
