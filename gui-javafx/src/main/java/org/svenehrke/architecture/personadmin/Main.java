package org.svenehrke.architecture.personadmin;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {


	public static void main(String[] args) {
		launch(args);
	}

	PersonAdminSystemConfig config = new PersonAdminSystemConfig();

	@Override
	public void init() throws Exception {
		super.init();    //To change body of overridden methods use File | Settings | File Templates.
	}

	@Override
	public void start(final Stage stage) throws Exception {

		stage.setTitle("TableView Demo");

		VBox pane = new VBox();
		pane.setPadding(new Insets(10));

		ObservableList<String2Bean> items = FXCollections.observableArrayList(people());
		final TableView<String2Bean> tableView = new TableView<>(items);
		tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

		final TableColumn<String2Bean, String> firstNameColumn = new TableColumn<>("First Name");
		firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("string1"));
		final TableColumn<String2Bean, String> lastNameColumn = new TableColumn<>("Last Name");
		lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("string2"));

		tableView.getColumns().addAll(firstNameColumn, lastNameColumn);

		pane.getChildren().addAll(tableView);

		Scene scene = new Scene(pane, 300, 500, Color.DODGERBLUE);
		stage.setScene(scene);
		stage.show();
	}

	public static ObservableList<String2Bean> people0(int howMany) {
		ObservableList<String2Bean> result = FXCollections.observableArrayList();
		for (int i = 0; i < howMany; i++) {
			result.add(new String2Bean("firstname " + i, "lastname " + i));

		}
		return result;
	}
	public ObservableList<String2Bean> people() {
		ObservableList<String2Bean> result = FXCollections.observableArrayList();
//		config.getExternalPersonSource().persons().forEach(s2b -> result.add(s2b));
		config.getExternalPersonSource().persons().forEach(result::add);
		return result;
	}


}
