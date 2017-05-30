package JavaFXCalculatorMVC;

<?xml version="1.0" encoding="UTF-8"?>

<?import java.net.*?>
<?import java.lang.*?>
<?import java.util.*?>
<?import javafx.beans.property.*?>
<?import javafx.geometry.*?>
<?import javafx.scene.shape.*?>
<?import javafx.scene.control.*?>
<?import javafx.scene.image.*?>
<?import javafx.scene.layout.*?>
<?import javafx.scene.text.*?>
<?import javafx.scene.paint.Color?>

<VBox spacing="10" alignment="CENTER" prefWidth="300" prefHeight="300" fx:controller="com.almasb.calc.Controller" xmlns:fx="http://javafx.com/fxml">
    <fx:define>
        <Font fx:id="FONT" size="18" />
    </fx:define>
    
    <StackPane alignment="CENTER">
        <Rectangle fill="TRANSPARENT" stroke="GRAY" width="230" height="50" />
        <Text fx:id="output" font="$FONT" />
    </StackPane>

    <HBox spacing="10" alignment="CENTER">
        <Button text="7" prefWidth="50" font="$FONT" onAction="#processNumpad" />
        <Button text="8" prefWidth="50" font="$FONT" onAction="#processNumpad" />
        <Button text="9" prefWidth="50" font="$FONT" onAction="#processNumpad" />
        <Button text="/" prefWidth="50" font="$FONT" onAction="#processOperator" />
    </HBox>
    
    <HBox spacing="10" alignment="CENTER">
        <Button text="4" prefWidth="50" font="$FONT" onAction="#processNumpad" />
        <Button text="5" prefWidth="50" font="$FONT" onAction="#processNumpad" />
        <Button text="6" prefWidth="50" font="$FONT" onAction="#processNumpad" />
        <Button text="*" prefWidth="50" font="$FONT" onAction="#processOperator" />
    </HBox>
    
    <HBox spacing="10" alignment="CENTER">
        <Button text="1" prefWidth="50" font="$FONT" onAction="#processNumpad" />
        <Button text="2" prefWidth="50" font="$FONT" onAction="#processNumpad" />
        <Button text="3" prefWidth="50" font="$FONT" onAction="#processNumpad" />
        <Button text="-" prefWidth="50" font="$FONT" onAction="#processOperator" />
    </HBox>
    
    <HBox spacing="10" alignment="CENTER">
        <Button text="0" prefWidth="110" font="$FONT" onAction="#processNumpad" />
        <Button text="=" prefWidth="50" font="$FONT" onAction="#processOperator" />
        <Button text="+" prefWidth="50" font="$FONT" onAction="#processOperator" />
    </HBox>
    
</VBox>