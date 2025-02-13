package gui;

import application.controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class StartWindow extends Application {


        @Override
        public void start(Stage stage) {
            stage.setTitle("Arcitecture Demo");
            BorderPane pane = new BorderPane();
            this.initContent(pane);

            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();
        }

        // -------------------------------------------------------------------------

        private void initContent(BorderPane pane) {
            TabPane tabPane = new TabPane();
            this.initTabPane(tabPane);
            pane.setCenter(tabPane);
        }

        private void initTabPane(TabPane tabPane) {
            tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

            Tab tabKonference = new Tab("Konference");
            tabPane.getTabs().add(tabKonference);

            KonferencePane konferencePane = new KonferencePane();
            tabKonference.setContent(konferencePane);

            Tab tabBookHotel = new Tab("Book Hotel");
            tabPane.getTabs().add(tabBookHotel);

            HotelPane hotelPane = new HotelPane();
            tabBookHotel.setContent(hotelPane);

            Tab tabTilføjLedsager = new Tab("Tilmeld Udflugt");
            tabPane.getTabs().add(tabTilføjLedsager);

            UdflugtPane ledsagerPane = new UdflugtPane();
            tabTilføjLedsager.setContent(ledsagerPane);

            Tab tabAdministration = new Tab("Administration");
            tabPane.getTabs().add(tabAdministration);

            AdministrationPane ap = new AdministrationPane();
            tabAdministration.setContent(ap);


        }
}