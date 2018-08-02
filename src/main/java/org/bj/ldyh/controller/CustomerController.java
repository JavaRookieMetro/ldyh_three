package org.bj.ldyh.controller;

import javax.annotation.Resource;

import org.bj.ldyh.model.Customer;
import org.bj.ldyh.model.ResponseResult;
import org.bj.ldyh.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Customer")
public class CustomerController {

    @Resource
    private ICustomerService customerService;

    @RequestMapping("/search.do")
    @ResponseBody
    public ResponseResult searchCustomer(@RequestParam(value = "query",required = true) String query) {
        return customerService.getCustomerList(query);
    }

}
