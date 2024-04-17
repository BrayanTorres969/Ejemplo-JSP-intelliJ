package com.pe.pruebaWeb.dao;

import com.pe.pruebaWeb.models.Usuario;

import java.util.List;

public interface IUsuario {

    public List<Usuario> findAll();

    public void register(Usuario usuario);

    public void update(Usuario usuario);

    public Usuario searchByName(String name);

    public void delete(int id);
}
