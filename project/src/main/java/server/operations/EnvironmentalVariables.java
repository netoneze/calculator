package server.operations;

public enum EnvironmentalVariables {
    API_PATH("http://localhost:7070/");

    private String env;

    EnvironmentalVariables(String env) {
        this.env = env;
    }

    public String getEnv() {
        return env;
    }
}
