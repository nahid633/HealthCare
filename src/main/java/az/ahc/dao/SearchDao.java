package az.ahc.dao;

import az.ahc.model.Department;

import java.util.List;

/**
 * Created by Nahid
 */
public interface SearchDao {
    List<Department> getSearchDeptResult(String search);
    List<Department> getSearchHosptResult(String search);
    List<Department> getSearchResult(String search);


}
