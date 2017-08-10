package az.ahc.services;

import az.ahc.model.Department;
import az.ahc.model.Hospital;

import java.util.List;

/**
 * Created by Nahid on 8/10/17.
 */
public interface SearchService {
    List<Department> getAllDepts();
    List<Department> getSearchDeptResult(String search);
    List<Department> getSearchHosptResult(String search);

}
