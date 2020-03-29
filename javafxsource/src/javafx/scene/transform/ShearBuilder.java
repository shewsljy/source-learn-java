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

package javafx.scene.transform;

/**
Builder class for javafx.scene.transform.Shear
@see javafx.scene.transform.Shear
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class ShearBuilder<B extends javafx.scene.transform.ShearBuilder<B>> implements javafx.util.Builder<javafx.scene.transform.Shear> {
    protected ShearBuilder() {
    }

    /** Creates a new instance of ShearBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.scene.transform.ShearBuilder<?> create() {
        return new javafx.scene.transform.ShearBuilder();
    }

    private int __set;
    public void applyTo(javafx.scene.transform.Shear x) {
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setPivotX(this.pivotX);
        if ((set & (1 << 1)) != 0) x.setPivotY(this.pivotY);
        if ((set & (1 << 2)) != 0) x.setX(this.x);
        if ((set & (1 << 3)) != 0) x.setY(this.y);
    }

    private double pivotX;
    /**
    Set the value of the {@link javafx.scene.transform.Shear#getPivotX() pivotX} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B pivotX(double x) {
        this.pivotX = x;
        __set |= 1 << 0;
        return (B) this;
    }

    private double pivotY;
    /**
    Set the value of the {@link javafx.scene.transform.Shear#getPivotY() pivotY} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B pivotY(double x) {
        this.pivotY = x;
        __set |= 1 << 1;
        return (B) this;
    }

    private double x;
    /**
    Set the value of the {@link javafx.scene.transform.Shear#getX() x} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B x(double x) {
        this.x = x;
        __set |= 1 << 2;
        return (B) this;
    }

    private double y;
    /**
    Set the value of the {@link javafx.scene.transform.Shear#getY() y} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B y(double x) {
        this.y = x;
        __set |= 1 << 3;
        return (B) this;
    }

    /**
    Make an instance of {@link javafx.scene.transform.Shear} based on the properties set on this builder.
    */
    public javafx.scene.transform.Shear build() {
        javafx.scene.transform.Shear x = new javafx.scene.transform.Shear();
        applyTo(x);
        return x;
    }
}
