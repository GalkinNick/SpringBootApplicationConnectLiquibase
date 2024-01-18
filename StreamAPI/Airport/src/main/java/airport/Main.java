package airport;

import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static long findCountAircraftWithModelAirbus(Airport airport, String model) {
        return airport.getAllAircrafts()
                .stream()
                .map(Aircraft::getModel)
                .filter(s -> s.contains(model)).count();
    }

    public static Map<String, Integer> findMapCountParkedAircraftByTerminalName(Airport airport) {
        Map <String, Integer> map = airport.getTerminals()
                .stream()
                .collect(Collectors.toMap(Terminal::getName, t -> t.getParkedAircrafts().size()));
        return map;
    }

    public static List<Flight> findFlightsLeavingInTheNextHours(Airport airport, int hours) {
        return airport.getTerminals().stream()
                .flatMap(t -> t.getFlights().stream())
                .filter(f -> f.getType().equals(Flight.Type.DEPARTURE))
                .filter(f -> f.getDate().isAfter(Instant.now()))
                .filter(f-> f.getDate().isBefore(Instant.now().plus(hours, ChronoUnit.HOURS)))
                .collect(Collectors.toList());
    }

    public static Optional<Flight> findFirstFlightArriveToTerminal(Airport airport, String terminalName) {
        Optional<Flight> tetminal = airport.getTerminals()
                .stream()
                .filter(t -> t.getName().equals(terminalName))
                .flatMap(t -> t.getFlights().stream())
                .filter(f -> f.getType().equals(Flight.Type.ARRIVAL))
                .min(Comparator.comparing(f -> f.getDate()));
        return tetminal;
    }
}