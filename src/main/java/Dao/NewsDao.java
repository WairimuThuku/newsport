package Dao;

import Models.DepartmentNews;
import Models.News;

import java.util.List;

public interface NewsDao {
    //create

    void addNews(News news);
    void addDepartmentNews(DepartmentNews departmentnews);

    //read
    List<News> getAll();

    News findById(int id);

    //update

    //delete

    void clearAll();
}