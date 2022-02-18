package Dao;

import Models.Departments;
import Models.News;
import Models.Users;

import java.util.List;

public interface DepartmentsDao {

    //create
    void add(Departments department);
    void addUserToDepartment(Users user, Departments department);
    //read

    List<Departments> getAll();
    Departments findById(int id);
    List<Users> getAllUsersInDepartment(int department_id);
    List<News> getDepartmentNews(int id);
    //update
    //delete
    void clearAll();

}