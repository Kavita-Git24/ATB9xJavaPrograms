package Nov.ex_14112024_Static_Enum;

public enum APIConstantsEndpoints {
    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dashboard"),
    CHATBOT_NAME("https://app.vwo.com/chat");
    private String name;
    APIConstantsEndpoints(String name)
    {
        this.name=name;
    }

    String getvalue()
    {
        return name;
    }
}
