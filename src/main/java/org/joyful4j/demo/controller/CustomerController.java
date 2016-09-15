package org.joyful4j.demo.controller;

import org.joyful4j.demo.model.Customer;
import org.joyful4j.demo.service.CustomerService;
import org.joyful4j.framework.annotation.Action;
import org.joyful4j.framework.annotation.Controller;
import org.joyful4j.framework.annotation.Inject;
import org.joyful4j.framework.bean.Param;
import org.joyful4j.framework.bean.View;


import javax.servlet.http.HttpServlet;
import java.util.List;

/**
 * Created by richey on 16-9-15.
 */
@Controller
public class CustomerController extends HttpServlet{

    @Inject
    private CustomerService customerService;

    @Action("get:/customer")
    public View index(Param param){
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer.jsp").addModel("customerList",customerList);
    }

}
