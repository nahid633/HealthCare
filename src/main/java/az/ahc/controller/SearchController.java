package az.ahc.controller;
import az.ahc.model.Department;
import az.ahc.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
/**
 * Created by Nahid
 */
@Controller
public class SearchController {
    @Autowired
    private SearchService departmentService;
    @RequestMapping(value = "/departments", method = RequestMethod.GET)
    public ResponseEntity<List<Department>> listAllDepts() {
        List<Department> departments = departmentService.getAllDepts();
        if (departments.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }
    @RequestMapping(value = "/hospitals/{search}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Department>> getSearchedHospitals(@PathVariable("search") String search) {
        List<Department> departments = departmentService.getSearchHosptResult(search);
        if (departments == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }
    @RequestMapping(value = "/departments/{search}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Department>> getSearchedDepartments(@PathVariable("search") String search) {
        List<Department> departments = departmentService.getSearchDeptResult(search);
        if (departments == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public void getRequests(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().getServletContext()
                .getRequestDispatcher("/WEB-INF/views/search.jsp")
                .forward(request, response);
    }
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public void getSearchRequests(HttpServletRequest request, HttpServletResponse response,@RequestParam("search") String  search,@RequestParam("filter") String  filter)  throws ServletException, IOException {
        if(filter.equals("both")){
            //
            request.setAttribute("result",departmentService.getSearchHosptResult(search));
        }
        else if(filter.equals("hospital")){
            request.setAttribute("result",departmentService.getSearchHosptResult(search));
        }else if(filter.equals("department")) {
            request.setAttribute("result",departmentService.getSearchDeptResult(search));
        }
        else{
            request.setAttribute("noResult","No Result Found...");
        }
        request.getSession().getServletContext()
                .getRequestDispatcher("/WEB-INF/views/search.jsp")
                .forward(request, response);
    }
}