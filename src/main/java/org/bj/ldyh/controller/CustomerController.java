package org.bj.ldyh.controller;

import javax.annotation.Resource;

import org.bj.ldyh.model.Customer;
import org.bj.ldyh.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Customer")
public class CustomerController {

    @Resource
    private ICustomerService customerService;

    @RequestMapping("/showCustomer.do")
    public String showCustomer() {
        return "customer";
    }


    /**
     * 根据输入信息全字段查询对应用户信息
     * @param input
     * @param map
     * @return
     */
    @RequestMapping("/showAllCustomer.do")
    @ResponseBody
    public String showAllCustomer(String input,ModelMap map){
        List<Customer> customer =
                customerService.getAllCustomer(input);
        map.addAttribute("customer",customer);
        return "customer";
    }
}
