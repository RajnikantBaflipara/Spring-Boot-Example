package org.example.rajnish.service;

import org.springframework.stereotype.Service;
@Service
public class UserService {
	public Integer multiply(int a, int b){
		int res = a*b;
		System.out.println(a+ "*" + b +"= " + res);
		return res;
	}

	public Integer devide(int a, int b){
		int res = a/b;
		System.out.println(a+ "/" + b +"= " + res);
		return res;
	}
}  