package edu.miu.shipment;

public sealed interface Shipment permits ExpressShipment, StandardShipment, OvernightShipment {
    String getTrackingDetails();
}
