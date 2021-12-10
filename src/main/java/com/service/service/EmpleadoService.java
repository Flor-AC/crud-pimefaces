/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.service;

import com.service.daos.EmpleadoDAO;
import com.service.entity.Empleado;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alberto
 */
@WebService(serviceName = "EmpleadoService")
public class EmpleadoService {

     EmpleadoDAO empleadoService = new EmpleadoDAO();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "guardarEmpleado")
    public boolean guardarEmpleado(@WebParam(name = "pojo") Empleado pojo) {
        //TODO write your implementation code here:
        return empleadoService.insert(pojo);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "actualizarEmpleado")
    public boolean actualizarEmpleado(@WebParam(name = "pojo") Empleado pojo) {
        //TODO write your implementation code here:
        return empleadoService.update(pojo);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarEmpleado")
    public boolean eliminarEmpleado(@WebParam(name = "id") long id) {
        //TODO write your implementation code here:
        return empleadoService.delete(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarUnEmpleado")
    public Empleado mostrarUnEmpleado(@WebParam(name = "id") long id) {
        //TODO write your implementation code here:
        return empleadoService.searchById(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarTodosEmpleados")
    public List<Empleado> mostrarTodosEmpleados() {
        //TODO write your implementation code here:
        return empleadoService.showAll();
    }
}
