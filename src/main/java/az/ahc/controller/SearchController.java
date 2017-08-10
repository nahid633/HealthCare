package az.ahc.controller;
import az.ahc.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * Created by Nahid
 */

/**
 * Marks a class as Controller
 */
@Controller
public class SearchController {
    /**
     * Autowiring uses while placing an instance of one bean into the desired field in an instance of another bean
     */
    @Autowired
    private SearchService departmentService;

    /**
     * Mappes the url to /home With GET Method
     * */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public void getRequests(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().getServletContext()
                .getRequestDispatcher("/WEB-INF/views/search.jsp")
                .forward(request, response);
    }
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public void getSearchRequests(HttpServletRequest request, HttpServletResponse response,@RequestParam("search") String  search,@RequestParam("filter") String  filter)  throws ServletException, IOException {
        if(filter.equals("both")){

            request.setAttribute("result",departmentService.getSearchResult(search));
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