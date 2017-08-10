package az.ahc.services;
import az.ahc.dao.SearchDao;
import az.ahc.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by Nahid
 */
@Service("searchService")
public class SearchServiceImp implements SearchService {
    /**
     * Autowiring uses while placing an instance of one bean into the desired field in an instance of another bean
     */
    @Autowired
    SearchDao departmentDao;
    @Override
    public List<Department> getSearchDeptResult(String search) {
        return departmentDao.getSearchDeptResult(search);
    }
    @Override
    public List<Department> getSearchHosptResult(String search) {
        return departmentDao.getSearchHosptResult(search);
    }

    @Override
    public List<Department> getSearchResult(String search) {
        return departmentDao.getSearchResult(search);
    }
}

