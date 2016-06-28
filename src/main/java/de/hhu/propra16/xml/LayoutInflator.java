package de.hhu.propra16.xml;

import javafx.scene.Node;
import javafx.scene.Parent;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Created by Tobias Witt on 28.06.16.
 */
public class LayoutInflator {

    private Map<String, Supplier<Node>> factories = new HashMap<>();

    public LayoutInflator() {
        factories.put("HBox", () -> /* Hier müssen sie ein entsprechendes Element erzeugen */);
        factories.put("Text", () -> /* Hier müssen sie ein entsprechendes Element erzeugen */);
        factories.put("TextField", () -> /* Hier müssen sie ein entsprechendes Element erzeugen */);
        factories.put("Label", () -> /* Hier müssen sie ein entsprechendes Element erzeugen */);
        factories.put("Button", () -> /* Hier müssen sie ein entsprechendes Element erzeugen */);
        factories.put("GridPane", () -> /* Hier müssen sie ein entsprechendes Element erzeugen */);
    }


    public Parent inflate(URL xmlFile) {
        // Diese methode müssen Sie implementieren!
    }
}
