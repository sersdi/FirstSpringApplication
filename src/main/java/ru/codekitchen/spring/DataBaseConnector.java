package ru.codekitchen.spring;

//  @Scope - аннотация, которая определяет жизненный цикл бина и возможное кол-во создаваемых бинов
//  Примеры @Scope: Singleton и Prototype. В веб-версии существуют скопы: request, session, global-session, application
//  Singleton - скоп по умолчанию. Если в явном виде не указан другой scope, то будет использоваться singleton.
//  Singleton - design pattern,который гарантирует, что у класса есть только один экземпляр и предоставляет к нему глобальную точку доступа
//      1) Бины с таким scop-ом создаются сразу же после сканирования пакетов Application Context-ом(Spring контейнером)
//      2) Бины с таким scop-ом создаются строго в единственном экземпляре и являются общими для всех кто их запросит
//      3) Такой скоп подходит для бинов, которые являются stateless, то есть не хранят состояние
                        // создаем Singleton класс по правилам:
// 1) В классе объявить private static поле
// 2) Необходимо определить конструктор и сделать его приватным
// 3) Создать public static метод который будет точкой доступ к экземпляру этого класса

//                           Prototype-scope
// 1) Бины с таким скопом создаются только при обращении к Application Context при помощи метода getBean()
// 2) При каждом таком обращении к Application Context создаётся новый бин
// 3) Такой scope подходит для бинов, которые являются stateful, то есть хранят состояние
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

    // Паблик геттер, который проверяет если в переменной instance NULL(нет экземпляра класса), то создает экземпляр класса DataBaseConnector
    // Если экземпляр класса создан, то он не создает ещё, а возвращает уже существующий(return instance)
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
