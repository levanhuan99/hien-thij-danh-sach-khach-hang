import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ShowListCustomersServlet",urlPatterns = "/customers-list")
public class ShowListCustomersServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> list=new ArrayList<>();
        list.add(new Customer("huan",18,"ha noi"));
        list.add(new Customer("dan",19,"ha noi"));
        list.add(new Customer("trung",20,"ha noi"));
        list.add(new Customer("hieu",21,"ha noi"));
        request.setAttribute("list",list);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("customer-list.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
