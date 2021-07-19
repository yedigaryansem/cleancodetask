package Planes;

import java.util.Objects;

public class PassengerPlane extends Plane{

    //=================FIELDS=================
    private int passengersCapacity;

    //=================CONSTRUCTORS=================
    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }


    //=================METHODS=================
    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + passengersCapacity +
                '}');
    }

//    @Override
//    public String toString() {
//        return super.toString().replace("}",
//                ", passengersCapacity=" + passengersCapacity +
//                        '}');
//    }

    @Override
    public boolean isInstanceOfPlane(Object instanceOfPlane) {
        if (this == instanceOfPlane) return true;
        if (!(instanceOfPlane instanceof PassengerPlane)) return false;
        if (!super.isInstanceOfPlane(instanceOfPlane)) return false;
        PassengerPlane plane = (PassengerPlane) instanceOfPlane;
        return passengersCapacity == plane.passengersCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}
