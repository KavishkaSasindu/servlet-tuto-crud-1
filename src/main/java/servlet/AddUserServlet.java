package servlet;
import dao.UserDao;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import model.UserModel;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class AddUserServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        UserModel userModel = new UserModel();

        PrintWriter write = response.getWriter();

        try{
            /*catch request data-- user data*/
            String username = request.getParameter("username");
            String email = request.getParameter("email");

            userModel.setUsername(username);
            userModel.setEmail(email);

            UserDao userDao = new UserDao();

            boolean success = userDao.addUser(userModel);
            if (success){
                System.out.println("Data added success");
                write.println("Data Added success");
            }else{
                write.println("Data not added");
            }


        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
