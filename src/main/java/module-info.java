module followme {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.annotation;
    requires afterburner.fx;

    opens com.airhacks.followme to javafx.graphics;
  }