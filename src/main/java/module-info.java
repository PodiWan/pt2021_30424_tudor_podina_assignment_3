module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires java.sql;
    requires mysql.connector.java;

    opens org.utcn.View to javafx.fxml;
    exports org.utcn.View;
    exports org.utcn.App;
    exports org.utcn.Controller;
//    exports org.utcn.Model;
}