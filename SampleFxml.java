package project3;


<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.DatePicker?>
<?import javafx.scene.control.RadioButton?>
<?import javafx.scene.control.Tab?>
<?import javafx.scene.control.TabPane?>
<?import javafx.scene.control.TextArea?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.layout.BorderPane?>
<?import javafx.scene.text.Font?>
<?import javafx.scene.text.Text?>


<BorderPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="600.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/15.0.1" xmlns:fx="http://javafx.com/fxml/1">
 <center>
    <TabPane prefHeight="200.0" prefWidth="200.0" tabClosingPolicy="UNAVAILABLE" BorderPane.alignment="CENTER">
      <tabs>
        <Tab text="Employee Management">
          <content>
            <AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="342.0" prefWidth="470.0">
                   <children>
                      <RadioButton layoutX="200.0" layoutY="78.0" mnemonicParsing="false" text="CS" />
                      <RadioButton layoutX="307.0" layoutY="78.0" mnemonicParsing="false" text="IT" />
                      <RadioButton layoutX="399.0" layoutY="78.0" mnemonicParsing="false" text="ECE" />
                      <Text layoutX="71.0" layoutY="31.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Name:" wrappingWidth="54.803401947021484" />
                      <Text layoutX="75.0" layoutY="100.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Department" />
                      <TextField fx:id="name" layoutX="200.0" layoutY="14.0" prefHeight="25.0" prefWidth="219.0" />
                      <Text layoutX="78.0" layoutY="149.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Date Hired" />
                      <RadioButton layoutX="72.0" layoutY="188.0" mnemonicParsing="false" text="Full Time" />
                      <RadioButton layoutX="218.0" layoutY="188.0" mnemonicParsing="false" text="Part Time" />
                      <RadioButton layoutX="365.0" layoutY="188.0" mnemonicParsing="false" text="Management" />
                      <Text layoutX="71.0" layoutY="257.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Annual Salary" />
                      <TextField fx:id="annSal" layoutX="200.0" layoutY="227.0" prefHeight="25.0" prefWidth="219.0" />
                      <Text layoutX="69.0" layoutY="317.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Hours Worked" />
                      <TextField fx:id="hrsWorked" layoutX="199.0" layoutY="287.0" prefHeight="25.0" prefWidth="71.0" />
                      <Text layoutX="299.0" layoutY="317.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Rate" />
                      <TextField fx:id="rate" layoutX="345.0" layoutY="287.0" prefHeight="25.0" prefWidth="75.0" />
                      <RadioButton layoutX="50.0" layoutY="346.0" mnemonicParsing="false" text="Manager" />
                      <RadioButton layoutX="171.0" layoutY="346.0" mnemonicParsing="false" text="Department Head" />
                      <RadioButton layoutX="365.0" layoutY="346.0" mnemonicParsing="false" text="Director" />
                      <Button fx:id="clearButton" layoutX="25.0" layoutY="387.0" mnemonicParsing="false" text="Clear" />
                      <Button fx:id="addButton" layoutX="114.0" layoutY="386.0" mnemonicParsing="false" text="Add Employee" />
                      <Button fx:id="removeButton" layoutX="266.0" layoutY="386.0" mnemonicParsing="false" text="Remove Employee" />
                      <Button fx:id="sethrButton" layoutX="455.0" layoutY="386.0" mnemonicParsing="false" text="Set Hours" />
                      <TextArea fx:id="messageArea1" layoutX="-1.0" layoutY="448.0" prefHeight="200.0" prefWidth="600.0" />
                      <DatePicker fx:id="dateHired" layoutX="199.0" layoutY="132.0" prefHeight="25.0" prefWidth="218.0" />
                   </children>
                </AnchorPane>
          </content>
        </Tab>
        <Tab text="Employee Database">
          <content>
            <AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="180.0" prefWidth="200.0">
                   <children>
                      <Text layoutX="114.0" layoutY="58.0" strokeType="OUTSIDE" strokeWidth="0.0" text="SELECT COMMAND FROM THE MENU" wrappingWidth="337.99017333984375">
                         <font>
                            <Font size="18.0" />
                         </font>
                      </Text>
                      <Button layoutX="77.0" layoutY="117.0" mnemonicParsing="false" text="FILE" />
                      <Button layoutX="234.0" layoutY="117.0" mnemonicParsing="false" text="PRINT" />
                      <Button layoutX="402.0" layoutY="117.0" mnemonicParsing="false" text="PAYMENT" />
                      <TextArea fx:id="messageArea2" layoutX="-2.0" layoutY="285.0" prefHeight="287.0" prefWidth="606.0" />
                   </children>
                </AnchorPane>
          </content>
        </Tab>
      </tabs>
    </TabPane>
 </center>
</BorderPane>