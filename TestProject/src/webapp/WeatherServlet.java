package webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;




@WebServlet(name = "WeatherServlet")
public class WeatherServlet<object> extends HttpServlet {
    public static void main(String[] args) {

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, String> map = (Map<String, String>) request.getParameterMap();

       /* for(Map.Entry<String, String> entry: map.entrySet()){
            cityWeather.put(entry.getKey(),join(entry.getValue()));
        }
        cityWeather.putAll(map);
        return Collections.unmodifiableMap(map);*/

        String cityId = (String[]) map.get(key);

        URL cityId = 'url'

    }

    private static final Map<String, String> cityWeather = new HashMap<>();
    static {

        cityWeather.put("1", "Sunny");
        cityWeather.put("2", "Rainy");
        cityWeather.put("3", "Stormy");
        cityWeather.put("4", "Windy");
        cityWeather.put("5", "Snow");

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

}

