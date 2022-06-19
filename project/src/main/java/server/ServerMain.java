package server;

import io.javalin.Javalin;
import server.controller.CalculateController;

public class ServerMain {
    public void ServerRoutes() {
        Javalin app = Javalin.create().start(7070);
        app.get("/{operation}/{num1}/{num2}", CalculateController.fetchCalculate);
    }
}
