package ru.codekitchen.spring;

//Singleton - design patter,который гарантирует, что у класса есть только один экземпляр и предоставляет к нему глобальную точку доступа
                        // создаем Singleton класс по правилам:
// 1) В классе объявить private static поле
// 2) Необходимо определить конструктор и сделать его приватным
// 3) Создать public static метод который будет точкой доступ к экземпляру этого класса

public class DataBaseConnector {
    private static DataBaseConnector instance;

    private final String dataBaseHost;
    private final String dataBasePort;
    private final String dataBaseUser;
    private final String dataBasePassword;


    private DataBaseConnector() {
        this.dataBaseHost = "http://localhost";
        this.dataBasePort = "5432";
        this.dataBaseUser = "admin";
        this.dataBasePassword = "12345678";
    }

    // Паблик геттер, который проверяет если в переменной instance NULL(нет экземляра класса), то создает экземпляр класса DataBaseConnector
    // Если экземпляр класса создан то он не создает ещё, а возвращает уже существующий(return instance)

    public static DataBaseConnector getInstance() {
        if(instance == null){
            instance = new DataBaseConnector();
        }
        return instance;
    }

    public void executeSql(String sql){
        System.out.println("Connecting: " +
                dataBaseHost + ":" + dataBasePort + "?username=" + dataBaseUser + "&password=" + dataBasePassword);
        System.out.println("Executing: "+ sql);
        System.out.println("Provided query was successfully executed");
    }
}
