/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.factory;

import com.service.daos.DepartamentoDAO;
import com.service.daos.EmpleadoDAO;
import com.service.daos.UsuariosDAO;



/**
 *
 * @author victorm
 */
public class FactoryMethod {
    public enum TypeDAO {
        EMPLEADO, DEPARTAMENTO , USUARIO
    }

    public static IDAO create(TypeDAO t) {
        IDAO dao = null;

        switch (t) {
            case EMPLEADO:
                dao = new EmpleadoDAO();
                break;
            case DEPARTAMENTO:
                dao = new DepartamentoDAO();
                break;
            case USUARIO:
                dao = new UsuariosDAO();
                break;
        }

        return dao;
    }
}
