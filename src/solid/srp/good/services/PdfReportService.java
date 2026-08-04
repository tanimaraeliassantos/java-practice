package solid.srp.good.services;

import solid.srp.good.models.Flight;

public class PdfReportService {
    public void generatePdf(Flight flight, String userId) {
        System.out.println("PDF: generando factura en PDF para la reserva del vuelo " + flight.getFlightNumber()
                + " para usuario " + userId);
    }
}
