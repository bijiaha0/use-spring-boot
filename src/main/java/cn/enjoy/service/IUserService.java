package cn.enjoy.service;


public interface IUserService {
    boolean register(String username,String passwd);
    void batchAdd(String username,String passwd);
}