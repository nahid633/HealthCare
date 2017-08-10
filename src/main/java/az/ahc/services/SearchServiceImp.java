package az.ahc.services;

import az.ahc.dao.SearchDao;
import az.ahc.model.Department;
import az.ahc.model.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Nahid on 8/10/17.
 */
@Service("searchService")
@Transactional
public class SearchServiceImp implements SearchService {
    @Autowired
    SearchDao departmentDao;

    @Override
    public List<Department> getAllDepts() {
        return departmentDao.getAllDepts();
    }

    @Override
    public List<Department> getSearchDeptResult(String search) {
        return departmentDao.getSearchDeptResult(search);
    }

    @Override
    public List<Department> getSearchHosptResult(String search) {
        return departmentDao.getSearchHosptResult(search);
    }
}

