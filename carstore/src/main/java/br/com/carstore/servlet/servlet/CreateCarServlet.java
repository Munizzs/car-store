package br.com.carstore.servlet.servlet;

import br.com.carstore.servlet.dao.CarDao;
import br.com.carstore.servlet.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String carName = request.getParameter("car-name");
        String carColor = request.getParameter("car-color");

        Car car = new Car(carName, carColor);

        new CarDao().createCar(car);

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
}
