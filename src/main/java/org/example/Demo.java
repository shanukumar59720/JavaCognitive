package org.example;

import org.tensorflow.types.*;

public class Demo {
    public static void main(String[] args) {
        //        Float f = 3.14f;

        // Create a TFloat32 tensor with a single float value
        try (TFloat32 tFloat32 = TFloat32.scalarOf(3.14f)) {
            // Print the tensor's value
            System.out.println("TFloat32 Tensor: " + tFloat32.getFloat());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (TInt32 tInt32 = TInt32.scalarOf(246)) {
            // Print the tensor's value
            System.out.println("TInt32 Tensor: " + tInt32.getInt());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (TFloat64 tFloat64 = TFloat64.scalarOf(3.1456561)) {
            // Print the tensor's value
            System.out.println("TFloat64 Tensor: " + tFloat64.getDouble());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (TString tString = TString.scalarOf("Hello Developers!!")) {
            // Print the tensor's value
            System.out.println("TFloat64 Tensor: " + tString.getObject());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (TUint8 tUint8 = TUint8.scalarOf(4)) {
            // Print the tensor's value
            System.out.println("TUint Tensor: " + tUint8.getByte());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}