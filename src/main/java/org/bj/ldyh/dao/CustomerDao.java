package org.bj.ldyh.dao;

import java.util.List;
import org.bj.ldyh.model.Customer;

public interface CustomerDao {
	/**
	 * 根据输入信息模糊查询所有用户
	 * @param input
	 * @return
	 */
	public List<Customer> showAllCustomer(String input);

}
