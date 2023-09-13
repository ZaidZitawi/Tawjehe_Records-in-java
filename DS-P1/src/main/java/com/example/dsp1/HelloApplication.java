package com.example.dsp1;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    LinkedList W = new LinkedList();
    @Override
    public void start(Stage stage) throws IOException {

        File WestBank = new File("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1\\src\\main\\java\\com\\example\\dsp1\\West Bank");
        File Gaza = new File("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1\\src\\main\\java\\com\\example\\dsp1\\Gaza");
//        File test = new File("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1\\src\\main\\java\\com\\example\\dsp1\\test");

        BorderPane borderPane = new BorderPane();
        GridPane grid = new GridPane();
        Scene scene = new Scene(borderPane, 500, 600);
        grid.setAlignment(Pos.CENTER);
        borderPane.setCenter(grid);//Man Of The Match
        borderPane.setBackground(new Background(new BackgroundFill(Color.LIGHTSEAGREEN, new CornerRadii(0), Insets.EMPTY)));


        Label l = new Label("User Name");
        Label l1 = new Label("Password");
        TextField textField = new TextField();
        TextField textField1 = new TextField();
        Button btn = new Button("Log in");
        Image m = new Image("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1\\src\\Photos\\PS ministry.png");
        ImageView mImage = new ImageView(m);
        mImage.setFitWidth(150);
        mImage.setFitHeight(150);

        grid.add(l, 0, 0);
        grid.add(l1, 0, 1);
        grid.add(textField, 1, 0);
        grid.add(textField1, 1, 1);
        grid.add(btn, 1, 2);
        grid.add(mImage, 4, 0);

        borderPane.getChildren().addAll(l, l1, textField, textField1, btn, mImage);
        grid.getChildren().addAll(l, l1, textField, textField1, btn, mImage);

//        ComboBox <String> comboBox=new ComboBox<>();// coooooooomboooo
//        comboBox.setPromptText("Choose The Area");
//        comboBox.getItems().addAll("West Bank", "Gaza");
//        ComboBox <String> comboBox2=new ComboBox<>();// coooooooomboooo
//        comboBox.setPromptText("Choose The Area");
//        comboBox.getItems().addAll("Literary", "Science");


        //Scene==>BorderPane==>group==>gridPane==>vBox

        VBox vBox = new VBox(10);
        VBox vBox1 = new VBox(10);
        VBox vBox2 = new VBox(10);
        GridPane gridPane = new GridPane();
        Group group = new Group(gridPane);
        gridPane.add(vBox, 0, 0);
        gridPane.add(vBox1, 1, 0);
        gridPane.add(vBox2, 2, 0);
        gridPane.setAlignment(Pos.BOTTOM_CENTER);
        BorderPane borderPane1 = new BorderPane(group);
        borderPane1.setCenter(group);
        Scene scene1 = new Scene(borderPane1, 1000, 800);
        borderPane1.setBackground(new Background(new BackgroundFill(Color.LIGHTGOLDENRODYELLOW, new CornerRadii(0), Insets.EMPTY)));

        btn.setOnAction(e -> stage.setScene(scene1));// Set on Action button

        vBox.setPadding(new Insets(1, 1, 10, 1));
        vBox1.setPadding(new Insets(1, 1, 10, 1));
        vBox2.setPadding(new Insets(1, 1, 10, 1));
//00000000000000000000000000000000000Images
        Image Main = new Image("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1\\src\\Photos\\PS ministry.png");
        ImageView MainImage = new ImageView(Main);
        Image AddStu = new Image("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1\\src\\Photos\\add-user.png");
        ImageView AddStuImage = new ImageView(AddStu);
        Image DeleteStu = new Image("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1\\src\\Photos\\delete-friend.png");
        ImageView DeleteStuImage = new ImageView(DeleteStu);
        Image SearchStu = new Image("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1\\src\\Photos\\search-engine.png");
        ImageView SearchStuImage = new ImageView(SearchStu);
        Image Top10 = new Image("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1\\src\\Photos\\top-10.png");
        ImageView Top10Image = new ImageView(Top10);
        Image Mean = new Image("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1\\src\\Photos\\average.png");
        ImageView MeanImage = new ImageView(Mean);
        Image Mode = new Image("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1\\src\\Photos\\mode.png");
        ImageView ModeImage = new ImageView(Mode);
        Image Percentage = new Image("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1\\src\\Photos\\business-and-finance.png");
        ImageView PercentageImage = new ImageView(Percentage);
        Image Display = new Image("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1\\src\\Photos\\printer.png");
        ImageView DisplayImage = new ImageView(Display);
        Image Exit = new Image("C:\\Users\\DELL\\IdeaProjects\\demo\\Data_Stcture_Project1\\src\\Images\\exit.png");
        ImageView ExitImage = new ImageView(Exit);
//00000000000000000000000000000000000000000Images

        Label label = new Label("Tawjehe Records for the year 2023");
        label.setFont(new Font("Arial Black", 15));
        label.setLayoutX(170);
        label.setLayoutY(-200);
        Button button = new Button("Add New Recorde", AddStuImage);
        Button button1 = new Button("Delete Record", DeleteStuImage);
        Button button2 = new Button("Search a Record", SearchStuImage);
        Button button3 = new Button("Display the Top 10", Top10Image);
        Button button4 = new Button("Calculate the Average", MeanImage);
        Button button5 = new Button("Calculate Mode", ModeImage);
        Button button6 = new Button("Percentage of Students", PercentageImage);
        Button button7 = new Button("Read File", DisplayImage);
        Button button8 = new Button("Exit", ExitImage);


        button.setPrefSize(200, 100);
        button1.setPrefSize(200, 100);
        button2.setPrefSize(200, 100);
        button3.setPrefSize(200, 100);
        button4.setPrefSize(200, 100);
        button5.setPrefSize(200, 100);
        button6.setPrefSize(200, 100);
        button7.setPrefSize(200, 100);
        button8.setPrefSize(200, 100);
        MainImage.setFitHeight(150);
        MainImage.setFitWidth(150);
        MainImage.setLayoutX(235);
        MainImage.setLayoutY(-150);
        AddStuImage.setFitHeight(80);
        AddStuImage.setFitWidth(80);
        DeleteStuImage.setFitHeight(80);
        DeleteStuImage.setFitWidth(80);
        SearchStuImage.setFitHeight(80);
        SearchStuImage.setFitWidth(80);
        Top10Image.setFitHeight(80);
        Top10Image.setFitWidth(80);
        MeanImage.setFitHeight(80);
        MeanImage.setFitWidth(80);
        ModeImage.setFitHeight(80);
        ModeImage.setFitWidth(80);
        PercentageImage.setFitWidth(80);
        PercentageImage.setFitHeight(80);
        DisplayImage.setFitWidth(80);
        DisplayImage.setFitHeight(80);
        ExitImage.setFitWidth(80);
        ExitImage.setFitHeight(80);
        button.setContentDisplay(ContentDisplay.TOP);
        button1.setContentDisplay(ContentDisplay.TOP);
        button2.setContentDisplay(ContentDisplay.TOP);
        button3.setContentDisplay(ContentDisplay.TOP);
        button4.setContentDisplay(ContentDisplay.TOP);
        button5.setContentDisplay(ContentDisplay.TOP);
        button6.setContentDisplay(ContentDisplay.TOP);
        button7.setContentDisplay(ContentDisplay.TOP);
        button8.setContentDisplay(ContentDisplay.TOP);


        // groups

        group.getChildren().addAll(label, MainImage);
        vBox.getChildren().addAll(button, button3, button6);
        vBox1.getChildren().addAll(button1, button4, button7);
        vBox2.getChildren().addAll(button2, button5, button8);


        //Add new record
        GridPane gridPane1 = new GridPane();
        BorderPane borderPane2 = new BorderPane();
        gridPane1.setAlignment(Pos.CENTER);
        borderPane2.setCenter(gridPane1);
        Scene scene2 = new Scene(borderPane2, 1000, 800);
        borderPane2.setBackground(new Background(new BackgroundFill(Color.LIGHTGOLDENRODYELLOW, new CornerRadii(0), Insets.EMPTY)));
        Label ARLabel = new Label("Seat Number");
        Label ARLabel1 = new Label("Branch");
        Label ARLabel2 = new Label("Average");
        TextField ARTextField = new TextField();
        TextField ARTextField1 = new TextField();
        TextField ARTextField2 = new TextField();
        Button ARButton = new Button("Add");
        Button ARButton2 = new Button("Back");

        ARButton.setOnAction(e -> {
            W.addFirst(new Student(Integer.parseInt(ARTextField.getText()), ARTextField1.getText(), Double.parseDouble(ARTextField2.getText())));
            W.print();
        });
        ARButton2.setOnAction(e -> stage.setScene(scene1));

        gridPane1.add(ARLabel, 0, 0);
        gridPane1.add(ARLabel1, 0, 1);
        gridPane1.add(ARLabel2, 0, 2);
        gridPane1.add(ARTextField, 1, 0);
        gridPane1.add(ARTextField1, 1, 1);
        gridPane1.add(ARTextField2, 1, 2);
        gridPane1.add(ARButton, 1, 3);
        gridPane1.add(ARButton2, 3, 3);
        button.setOnAction(e -> stage.setScene(scene2));


        //Delete record
        GridPane gridPane2 = new GridPane();
        BorderPane borderPane3 = new BorderPane();
        gridPane2.setAlignment(Pos.CENTER);
        borderPane3.setCenter(gridPane2);
        Scene scene3 = new Scene(borderPane3, 1000, 800);
        borderPane3.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, new CornerRadii(0), Insets.EMPTY)));
        button1.setOnAction(e -> stage.setScene(scene3));
        Label DRLabel = new Label("Seat Number");
        TextField DRTextField = new TextField();
        Button DRButton = new Button("Add");
        Button DRButton2 = new Button("Back");
        button1.setOnAction(e -> stage.setScene(scene3));
        DRButton.setOnAction(e -> {
            W.deleteLast();
            W.print();
        });
        gridPane2.add(DRLabel, 0, 0);
        gridPane2.add(DRTextField, 1, 0);
        gridPane2.add(DRButton, 1, 1);
        gridPane2.add(DRButton2, 3, 1);
        DRButton2.setOnAction(e -> stage.setScene(scene1));


        //Search Stu
        GridPane gridPane3 = new GridPane();
        BorderPane borderPane4 = new BorderPane();
        gridPane3.setAlignment(Pos.CENTER);
        borderPane4.setCenter(gridPane3);
        Scene scene4 = new Scene(borderPane4, 1000, 800);
        borderPane4.setBackground(new Background(new BackgroundFill(Color.LIGHTGOLDENRODYELLOW, new CornerRadii(0), Insets.EMPTY)));
        Label SLabel = new Label("Seat Number");
        Label SLabel1 = new Label("Branch");
        Label SLabel2 = new Label("Average");
        TextField STextField = new TextField();
        TextField STextField1 = new TextField();
        TextField STextField2 = new TextField();
        TextField STextField3 = new TextField();
        Button SButton = new Button("West Bank");
        Button SButton1 = new Button("Gaza");
        Button SButton2 = new Button("Back");
        SButton2.setOnAction(e -> stage.setScene(scene1));
        gridPane3.add(SLabel, 0, 0);
        gridPane3.add(SLabel1, 0, 1);
        gridPane3.add(SLabel2, 0, 2);
        gridPane3.add(STextField, 1, 0);
        gridPane3.add(STextField1, 1, 1);
        gridPane3.add(STextField2, 1, 2);
        gridPane3.add(SButton, 1, 3);
        gridPane3.add(SButton1, 2, 3);
        gridPane3.add(SButton2, 3, 3);
        gridPane3.add(STextField3, 1, 5);

        button2.setOnAction(e -> stage.setScene(scene4));


        //Top 10
        GridPane gridPane4 = new GridPane();
        BorderPane borderPane5 = new BorderPane();
        gridPane4.setAlignment(Pos.CENTER);
        borderPane5.setCenter(gridPane4);
        Scene scene5 = new Scene(borderPane5, 1000, 800);
        borderPane5.setBackground(new Background(new BackgroundFill(Color.LIGHTGOLDENRODYELLOW, new CornerRadii(0), Insets.EMPTY)));
        Label TopLabel = new Label("Top 10 Students");

        TextField TopTextField = new TextField();
        TopTextField.setPrefSize(150, 200);
        Button TopButton3 = new Button("Back");
        Button TopButton = new Button("West Bank");
        Button TopButton1 = new Button("Gaza");
        Button TopButton2 = new Button("All");
        TopButton3.setOnAction(e -> stage.setScene(scene1));
        gridPane4.add(TopLabel, 1, 0);
        gridPane4.add(TopTextField, 1, 1);
        gridPane4.add(TopButton, 0, 2);
        gridPane4.add(TopButton1, 1, 2);
        gridPane4.add(TopButton2, 2, 2);
        gridPane4.add(TopButton3, 1, 3);
        button3.setOnAction(e -> stage.setScene(scene5));


        // Calculate Average
        GridPane gridPane5 = new GridPane();
        BorderPane borderPane6 = new BorderPane();
        gridPane5.setAlignment(Pos.CENTER);
        borderPane6.setCenter(gridPane5);
        Scene scene6 = new Scene(borderPane6, 1000, 800);
        borderPane6.setBackground(new Background(new BackgroundFill(Color.LIGHTGOLDENRODYELLOW, new CornerRadii(0), Insets.EMPTY)));
        Label AverageLabel = new Label("The Average of Scores ");
        TextField AverageTextField = new TextField();
        AverageTextField.setPrefSize(150, 200);
        Button AverageButton = new Button("West Bank");
        Button AverageButton1 = new Button("Gaza");
        Button AverageButton2 = new Button("All");
        Button AverageButton3 = new Button("Back");
        AverageButton3.setOnAction(e -> stage.setScene(scene1));
        gridPane5.add(AverageLabel, 1, 0);
        gridPane5.add(AverageButton, 0, 1);
        gridPane5.add(AverageButton1, 1, 1);
        gridPane5.add(AverageButton2, 2, 1);
        gridPane5.add(AverageTextField, 1, 2);
        gridPane5.add(AverageButton3, 1, 3);
        button4.setOnAction(e -> stage.setScene(scene6));


        // Calculate Mode
        GridPane gridPane6 = new GridPane();
        BorderPane borderPane7 = new BorderPane();
        gridPane6.setAlignment(Pos.CENTER);
        borderPane7.setCenter(gridPane6);
        Scene scene7 = new Scene(borderPane7, 1000, 800);
        borderPane7.setBackground(new Background(new BackgroundFill(Color.LIGHTGOLDENRODYELLOW, new CornerRadii(0), Insets.EMPTY)));
        Label ModeLabel = new Label("The Mode of Scores");
        TextField ModeTextField = new TextField();
        ModeTextField.setPrefSize(150, 200);
        Button ModeButton = new Button("West Bank");
        Button ModeButton1 = new Button("Gaza");
        Button ModeButton2 = new Button("All");
        Button ModeButton3 = new Button("Back");
        ModeButton3.setOnAction(e -> stage.setScene(scene1));
        gridPane6.add(ModeLabel, 1, 0);
        gridPane6.add(ModeButton, 0, 1);
        gridPane6.add(ModeButton1, 1, 1);
        gridPane6.add(ModeButton2, 2, 1);
        gridPane6.add(ModeTextField, 1, 2);
        gridPane6.add(ModeButton3, 1, 3);
        button5.setOnAction(e -> stage.setScene(scene7));


        //calculate number and percentage for student above specific grade
        GridPane gridPane7 = new GridPane();
        BorderPane borderPane8 = new BorderPane();
        gridPane7.setAlignment(Pos.CENTER);
        borderPane8.setCenter(gridPane7);
        Scene scene8 = new Scene(borderPane8, 1000, 800);
        borderPane8.setBackground(new Background(new BackgroundFill(Color.LIGHTGOLDENRODYELLOW, new CornerRadii(0), Insets.EMPTY)));
        Label perLabel = new Label("Please Enter a Specific to calculate number and percentage of student who scored greater");
        TextField perTextField = new TextField();
        perTextField.setPrefSize(150, 200);
        TextField perTextField1 = new TextField();
        Button perButton = new Button("West Bank");
        Button perButton1 = new Button("Gaza");
        Button perButton2 = new Button("All");
        Button perButton3 = new Button("Back");
        perButton3.setOnAction(e -> stage.setScene(scene1));
        gridPane7.add(perLabel, 1, 0);
        gridPane7.add(perTextField1, 1, 1);
        gridPane7.add(perButton, 0, 2);
        gridPane7.add(perButton1, 1, 2);
        gridPane7.add(perButton2, 2, 2);
        gridPane7.add(perTextField, 1, 3);
        gridPane7.add(perButton3, 1, 4);
        button6.setOnAction(e -> stage.setScene(scene8));

        //Display
        GridPane gridPane8 = new GridPane();
        BorderPane borderPane9 = new BorderPane();
        gridPane8.setAlignment(Pos.CENTER);
        borderPane9.setCenter(gridPane8);
        Scene scene9 = new Scene(borderPane9, 1000, 800);
        borderPane9.setBackground(new Background(new BackgroundFill(Color.LIGHTGOLDENRODYELLOW, new CornerRadii(0), Insets.EMPTY)));
        Label DisLabel = new Label("Please Choose a Specific Data To Read");
        TextArea textArea = new TextArea();
        textArea.setPrefSize(500, 400);
        Button DisButton = new Button("All West Bank");
        Button DisButton1 = new Button("All Gaza");
        Button DisButton2 = new Button(" Scientific Stream in West Bank");
        Button DisButton3 = new Button("Literary Stream in West Bank");
        Button DisButton4 = new Button("Scientific Stream in Gaza");
        Button DisButton5 = new Button("Literary Stream in Gaza");
        Button DisButton6 = new Button("Back");
        textArea.setScrollTop(50);
        textArea.setScrollTop(Double.MAX_VALUE);
        DisButton6.setOnAction(e -> stage.setScene(scene1));

        DisButton.setOnAction(e -> {
            W = ReadData(WestBank);
            textArea.setText(W.toString());
        });

        DisButton1.setOnAction(e -> {
            W = ReadData(Gaza);
            textArea.setText(W.toString());
        });

        DisButton2.setOnAction(e -> {
            W= ReadSciData(WestBank, "Scientific");
            textArea.setText(W.toString());
        });

        DisButton3.setOnAction(e -> {
            W = ReaLitData(WestBank, "Literary");
            textArea.setText(W.toString());
        });

        DisButton4.setOnAction(e -> {
            W = ReadSciData(Gaza, "Scientific");
            textArea.setText(W.toString());
        });

        DisButton5.setOnAction(e -> {
            W = ReaLitData(Gaza, "Literary");
            textArea.setText(W.toString());
        });

        gridPane8.add(DisLabel, 1, 0);
        gridPane8.add(textArea, 1, 1);
        gridPane8.add(DisButton, 0, 2);
        gridPane8.add(DisButton1, 1, 2);
        gridPane8.add(DisButton2, 2, 2);
        gridPane8.add(DisButton3, 0, 3);
        gridPane8.add(DisButton4, 1, 3);
        gridPane8.add(DisButton5, 2, 3);
        gridPane8.add(DisButton6, 3, 3);
        button7.setOnAction(e -> stage.setScene(scene9));



        //  Exit
        button8.setOnAction(e -> {
            Platform.exit();
            System.exit(0);
        });


        Image icon = new Image("C:\\Users\\DELL\\IdeaProjects\\demo\\Zaid Fx\\src\\Images\\letter-z.png");
        stage.getIcons().add(icon);
        stage.setTitle("Airline Ticket Reservation System");
        stage.setScene(scene);
        stage.show();
    }

    public static LinkedList ReadData(File filename) {
        LinkedList lf = new LinkedList();
        try {
            Scanner input = new Scanner(filename);
            while (input.hasNext()) {
                String s = input.nextLine();
                String[] tokens = s.split(",");
                if (tokens.length == 3) {
                    int seatnum = Integer.parseInt(tokens[0]);
                    String branch = tokens[1];
                    double score = Double.parseDouble(tokens[2]);
                    lf.addFirst(new Student(seatnum, branch, score));


                }
            }

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return lf;
    }
    public static LinkedList ReaLitData(File filename, String Stream) {
        LinkedList lf = new LinkedList();
        try {
            Scanner input = new Scanner(filename);
            while (input.hasNext()) {
                String s = input.nextLine();
                String[] tokens = s.split(",");
                if (tokens.length == 3&& Stream.equals("Literary")) {
                    int seatnum = Integer.parseInt(tokens[0]);
                    String branch = tokens[1];
                    Stream=tokens[1];
                    double score = Double.parseDouble(tokens[2]);
                    if (Stream.equals("Literary"))
                        lf.addFirst(new Student(seatnum, branch, score));



                }
            }

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return lf;
    }
    public static LinkedList ReadSciData(File filename, String Stream) {
        LinkedList lf = new LinkedList();
        try {
            Scanner input = new Scanner(filename);
            while (input.hasNext()) {
                String s = input.nextLine();
                String[] tokens = s.split(",");
                if (tokens.length == 3) {
                    int seatnum = Integer.parseInt(tokens[0]);
                    String branch = tokens[1];
                    Stream=tokens[1];
                    double score = Double.parseDouble(tokens[2]);
                    if (Stream.equals("Scientific"))
                        lf.addFirst(new Student(seatnum, branch, score));


                }
            }

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return lf;
    }
    public static void sortList(LinkedList l, Node newnode) {

        // Node current will point to head
        Node current = l.front;
        if (l.front == null) {
            l.front=newnode;
            newnode.next=null;
        } else {
            while (current.next != null) {
                    if (current.average < newnode.average) {
                        newnode.next=current;
                        current.next=newnode;
                    }
                    current = current.next;
                }

            }
        }





    public static void main(String[] args) {
        launch();
    }

}