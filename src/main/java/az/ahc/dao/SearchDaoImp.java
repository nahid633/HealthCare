package az.ahc.dao;

import az.ahc.model.Department;
import az.ahc.model.Hospital;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Nahid on 8/10/17.
 */
@Repository("departmentDao")
public class SearchDaoImp extends AbstractDao<Integer,Department> implements SearchDao {
    @Override
    public List<Department> getAllDepts() {
        return  getEntityManager().createQuery("SELECT u from Department u").getResultList();
    }
    @Override
    public List<Department> getSearchDeptResult(String search) {
        Query query =getEntityManager().createQuery("SELECT d FROM Department d WHERE d.dept_name LIKE  :search");
        query.setParameter("search","%"+search+"%");
        return query.getResultList();
    }
    @Override
    public List<Department> getSearchHosptResult(String search) {
        Query query =getEntityManager().createQuery("SELECT d FROM Department d WHERE concat(d.hospital.hospital_name,d.hospital.hospital_address,d.hospital.hospital_index,d.hospital.hospital_tel) LIKE  :search");
        query.setParameter("search","%"+search+"%");
        return query.getResultList();
    }

}
