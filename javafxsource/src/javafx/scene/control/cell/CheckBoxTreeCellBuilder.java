/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javafx.scene.control.cell;

/**
Builder class for javafx.scene.control.cell.CheckBoxTreeCell
@see javafx.scene.control.cell.CheckBoxTreeCell
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.2
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class CheckBoxTreeCellBuilder<T, B extends javafx.scene.control.cell.CheckBoxTreeCellBuilder<T, B>> extends javafx.scene.control.TreeCellBuilder<T, B> {
    protected CheckBoxTreeCellBuilder() {
    }

    /** Creates a new instance of CheckBoxTreeCellBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static <T> javafx.scene.control.cell.CheckBoxTreeCellBuilder<T, ?> create() {
        return new javafx.scene.control.cell.CheckBoxTreeCellBuilder();
    }

    private int __set;
    public void applyTo(javafx.scene.control.cell.CheckBoxTreeCell<T> x) {
        super.applyTo(x);
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setConverter(this.converter);
        if ((set & (1 << 1)) != 0) x.setSelectedStateCallback(this.selectedStateCallback);
    }

    private javafx.util.StringConverter<javafx.scene.control.TreeItem<T>> converter;
    /**
    Set the value of the {@link javafx.scene.control.cell.CheckBoxTreeCell#getConverter() converter} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B converter(javafx.util.StringConverter<javafx.scene.control.TreeItem<T>> x) {
        this.converter = x;
        __set |= 1 << 0;
        return (B) this;
    }

    private javafx.util.Callback<javafx.scene.control.TreeItem<T>,javafx.beans.value.ObservableValue<java.lang.Boolean>> selectedStateCallback;
    /**
    Set the value of the {@link javafx.scene.control.cell.CheckBoxTreeCell#getSelectedStateCallback() selectedStateCallback} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B selectedStateCallback(javafx.util.Callback<javafx.scene.control.TreeItem<T>,javafx.beans.value.ObservableValue<java.lang.Boolean>> x) {
        this.selectedStateCallback = x;
        __set |= 1 << 1;
        return (B) this;
    }

    /**
    Make an instance of {@link javafx.scene.control.cell.CheckBoxTreeCell} based on the properties set on this builder.
    */
    public javafx.scene.control.cell.CheckBoxTreeCell<T> build() {
        javafx.scene.control.cell.CheckBoxTreeCell<T> x = new javafx.scene.control.cell.CheckBoxTreeCell<T>();
        applyTo(x);
        return x;
    }
}
