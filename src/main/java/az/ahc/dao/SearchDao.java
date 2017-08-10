package az.ahc.dao;

import az.ahc.model.Department;
import az.ahc.model.Hospital;

import java.util.List;

/**
 * Created by Nahid
 */
public interface SearchDao {
    List<Department> getAllDepts();
    List<Department> getSearchDeptResult(String search);
    List<Department> getSearchHosptResult(String search);


}
