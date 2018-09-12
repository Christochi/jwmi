package net.acomputerdog.jwmi.nat;

import com.sun.jna.Pointer;

/**
 * Superclass for any java implementation of a native WMI class
 */
public abstract class NativeObject {
    /**
     * Pointer to the native instance
     */
    private Pointer pointer;

    /**
     * Creates an instance of a NativeObject from a pointer to the native instance
     * @param pointer Pointer to native object
     */
    public NativeObject(Pointer pointer) {
        this.pointer = pointer;
    }

    /**
     * Gets the pointer to the native instance
     * @return Return pointer to native instance
     */
    public Pointer getPointer() {
        return pointer;
    }

    /**
     * Sets the underlying pointer to a different native instance.  Using this is probably wrong, you most likely want to
     * use one of the methods on the existing pointer instance.
     *
     * @param pointer Pointer to set to
     */
    public void setPointer(Pointer pointer) {
        this.pointer = pointer;
    }
}
