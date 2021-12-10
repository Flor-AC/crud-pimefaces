/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.service;

import com.service.daos.DepartamentoDAO;
import com.service.entity.Departamento;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alberto
 */
@WebService(serviceName = "DepartamentoService")
public class DepartamentoService {
    DepartamentoDAO departamentoDAO = new DepartamentoDAO();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "guardarDepartamento")
    public boolean guardarDepartamento(@WebParam(name = "pojo") Departamento pojo) {
        //TODO write your implementation code here:
        return departamentoDAO.insert(pojo);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "actualizarDepartamento")
    public boolean actualizarDepartamento(@WebParam(name = "pojo") Departamento pojo) {
        //TODO write your implementation code here:
        return departamentoDAO.update(pojo);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarDepartamento")
    public boolean eliminar(@WebParam(name = "id") long id) {
        //TODO write your implementation code here:
        return departamentoDAO.delete(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarUnDepartamento")
    public Departamento mostrarUnDepartamento(@WebParam(name = "id") long id) {
        //TODO write your implementation code here:
        return departamentoDAO.searchById(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarTodosDeprtamentos")
    public List<Departamento> mostrarTodosDeprtamentos() {
        //TODO write your implementation code here:
        return departamentoDAO.showAll();
    }

}
